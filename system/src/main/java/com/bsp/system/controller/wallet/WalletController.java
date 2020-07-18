package com.bsp.system.controller.wallet;

import com.bsp.server.domain.WaaWalletAccount;
import com.bsp.server.domain.WafWalletAccountFund;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.WaaWalletAccountDto;
import com.bsp.server.dto.WafWalletAccountFundDto;
import com.bsp.server.service.*;
import com.bsp.server.util.CopyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    private static final Logger LOG = LoggerFactory.getLogger(WalletController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private WaaWalletAccountService waaWalletAccountService;
    @Resource
    private WafWalletAccountFundService wafWalletAccountFundService;
    @Resource
    private WtaWalletTransactionAduitService wtaWalletTransactionAduitService;
    @Resource
    private WtrWalletTransactionRecordService wtrWalletTransactionRecordService;
    @Resource
    private TrackingNumberService trackingNumberService;

    /**
     *判断该用户名有没有钱包
     * 若有，直接跳转到账户信息
     * 否则显示注册页面
     */
    @RequestMapping("/querylist")
    public ResponseDto queryList(@RequestBody WaaWalletAccountDto waaWalletAccountdto){
        ResponseDto responseDto = new ResponseDto();
        WaaWalletAccount waaWalletAccount=waaWalletAccountService.find(waaWalletAccountdto.getAccountName(),null);
        if(waaWalletAccount!=null){
            WafWalletAccountFund wafWalletAccountFund=wafWalletAccountFundService.list(waaWalletAccount.getBuyerId());
            WafWalletAccountFundDto wafWalletAccountFundDto=CopyUtil.copy(wafWalletAccountFund, WafWalletAccountFundDto.class);
            responseDto.setContent(wafWalletAccountFundDto);
        }else{
            responseDto.setMessage("Account Not Found");
            responseDto.setSuccess(false);
        }
        return responseDto;

    }

    /**
     *钱包注册
     */
    @RequestMapping("/register")
    public ResponseDto register(@RequestBody WaaWalletAccountDto waaWalletAccountdto){
        ResponseDto responseDto = new ResponseDto();
        WaaWalletAccount waaWalletAccount=CopyUtil.copy(waaWalletAccountdto,WaaWalletAccount.class);
        Date dt=new Date();
        waaWalletAccount.setCreateTime(dt);
        waaWalletAccount.setDeleted(false);
        waaWalletAccount.setStatus(new Byte("7")); //状态：正常
        waaWalletAccount.setIsActive("1");
        waaWalletAccount.setCreateBy(waaWalletAccountdto.getAccountName());
        int f1=waaWalletAccountService.insertSelective(waaWalletAccount);
        WafWalletAccountFund wafWalletAccountFund=new WafWalletAccountFund();
        wafWalletAccountFund.setBuyerId(waaWalletAccount.getBuyerId());
        wafWalletAccountFund.setCreateBy(waaWalletAccount.getCreateBy());
        wafWalletAccountFund.setCreateTime(dt);
        wafWalletAccountFund.setDeleted(false);
        wafWalletAccountFund.setAvailableMoney(new BigDecimal(0));
        wafWalletAccountFund.setDepositingMoney(new BigDecimal(0));
        wafWalletAccountFund.setWithdrawingMoney(new BigDecimal(0));
        int f2=wafWalletAccountFundService.insertSelective(wafWalletAccountFund);
        if(f1==0||f2==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    /**
     *充值
     * 改变的只是充值中金额，有效金额需要在管理员审核之后才能改
     */
    @RequestMapping("/deposit")
    public ResponseDto deposit(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        WaaWalletAccount waaWalletAccount=waaWalletAccountService.find(mp.get("accountName").toString(),mp.get("password").toString());
        if(waaWalletAccount==null){ //密码校验
            responseDto.setSuccess(false);
            responseDto.setMessage("Invalid Password");
            return responseDto;
        }
        Date dt=new Date();
        mp.put("buyerId",waaWalletAccount.getBuyerId());
        Map<String,Object> helper=wafWalletAccountFundService.getBeforeValue(mp);
        mp.put("availableMoneyBefore",helper.get("AVAILABLE_MONEY"));
        mp.put("depositingMoneyBefore",helper.get("DEPOSITING_MONEY"));
        mp.put("withDrawingMoneyBefore",helper.get("WITHDRAWING_MONEY"));
        mp.put("lastUpdateTime",dt);
        mp.put("lastUpdateBy",mp.get("accountName"));
        int f1=wafWalletAccountFundService.updateByPrimaryKeySelective(mp);
        mp.remove("lastUpdateTime");
        mp.remove("lastUpdateBy");
        mp.put("transactionMoney",mp.get("depositingMoney"));
        mp.put("createTime",dt);
        mp.put("createBy",mp.get("accountName"));
        mp.put("deleted","0");
        mp.put("status",2); //状态：申请
        mp.put("financeType",1); //入款
        mp.put("transactionType",1); //业务类型：充值
        mp.put("transactionNumber", trackingNumberService.getId(new SimpleDateFormat("yyyyMMdd").format(dt))); // reids生成流水号
        int f2=wtrWalletTransactionRecordService.insertSelective(mp); //获取transaction_id
        int f3=wtaWalletTransactionAduitService.insertSelective(mp);
        if(f1==0||f2==0||f3==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    /**
     *提现
     * 改变的只是提现中金额，有效金额需要在管理员审核之后才能改
     */
    @RequestMapping("/withdraw")
    public ResponseDto withdraw(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        WaaWalletAccount waaWalletAccount=waaWalletAccountService.find(mp.get("accountName").toString(),mp.get("password").toString());
        if(waaWalletAccount==null){ //密码校验
            responseDto.setSuccess(false);
            responseDto.setMessage("Invalid Password");
            return responseDto;
        }
        WafWalletAccountFund wafWalletAccountFund=wafWalletAccountFundService.list(waaWalletAccount.getBuyerId());
        //实际金额小于提现金额，报错
        if(wafWalletAccountFund.getAvailableMoney().compareTo(new BigDecimal(mp.get("withdrawingMoney").toString()))<0){
            responseDto.setSuccess(false);
            responseDto.setMessage("Insufficient Money");
            return responseDto;
        }
        Date dt=new Date();
        mp.put("buyerId",waaWalletAccount.getBuyerId());
        mp.put("lastUpdateTime",dt);
        Map<String,Object> helper=wafWalletAccountFundService.getBeforeValue(mp);
        mp.put("availableMoneyBefore",helper.get("AVAILABLE_MONEY"));
        mp.put("depositingMoneyBefore",helper.get("DEPOSITING_MONEY"));
        mp.put("withdrawingMoneyBefore",helper.get("WITHDRAWING_MONEY"));
        mp.put("lastUpdateTime",dt);
        mp.put("lastUpdateBy",mp.get("accountName"));
        int f1=wafWalletAccountFundService.updateByPrimaryKeySelective(mp);
        mp.remove("lastUpdateTime");
        mp.remove("lastUpdateBy");
        mp.put("transactionMoney",mp.get("withdrawingMoney"));
        mp.put("createTime",dt);
        mp.put("createBy",mp.get("accountName"));
        mp.put("deleted","0");
        mp.put("status",2); //状态：申请
        mp.put("financeType",2); //出款
        mp.put("transactionType",2); //业务类型：提现

        int f2=wtrWalletTransactionRecordService.insertSelective(mp); //获取transaction_id
        int f3=wtaWalletTransactionAduitService.insertSelective(mp);
        if(f1>0&&f2>0&&f3>0){
            responseDto.setCode("200");
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    /**
     *修改密码
     */
    @RequestMapping("/changepwd")
    public ResponseDto changePassword(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        int f=waaWalletAccountService.changePassword(mp);
        if(f==0){
            responseDto.setSuccess(false);
        }
        return responseDto;
    }

    @RequestMapping("/queryrecord")
    public ResponseDto queryRecord(@RequestBody Map<String,Object> mp){
        ResponseDto responseDto = new ResponseDto();
        PageDto pageDto=new PageDto();
        pageDto.setPage((int)mp.get("page"));
        pageDto.setSize((int)mp.get("size"));
        WaaWalletAccount waaWalletAccount=waaWalletAccountService.find(mp.get("accountName").toString(),null);
        wtrWalletTransactionRecordService.list(pageDto, waaWalletAccount.getBuyerId());
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }
        responseDto.setContent(pageDto);
        return responseDto;
    }

}
