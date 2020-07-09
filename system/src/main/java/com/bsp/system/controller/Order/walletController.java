package com.bsp.system.controller.Order;

import com.alibaba.fastjson.JSON;
import com.bsp.server.domain.WafWalletAccountFund;
import com.bsp.server.dto.*;
import com.bsp.server.service.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/wallerController")
public class walletController {
    @Resource
    private WaaWalletAccountService waaWalletAccountService;
    @Resource
    private WafWalletAccountFundService wafWalletAccountFundService;
    @Resource
    private WtaWalletTransactionAduitService wtaWalletTransactionAduitService;
    @Resource
    private WtrWalletTransactionRecordService wtrWalletTransactionRecordService;
    @Resource
    private SaoSalesOrderService saoSalesOrderService;
    @Resource
    private SysUserService sysUserService;
    @PostMapping("/pay")
    public ResponseDto pay(@RequestBody Map<String, Object> request){
        ResponseDto responseDto = new ResponseDto();
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        String passwd = JSON.parseObject(JSON.toJSONString(request.get("password")), String.class);
        SaoSalesOrderDto saoSalesOrderDto = JSON.parseObject(JSON.toJSONString("SaoSalesOrderDto"), SaoSalesOrderDto.class);
        WaaWalletAccountDto waaWalletAccountDto = waaWalletAccountService.selectByName(sysUserDto.getUsername());
        //check password
        if(waaWalletAccountDto.getPassword().equals(passwd)){
            WafWalletAccountFundDto wafWalletAccountFundDto = wafWalletAccountFundService.selectByPrimaryKey(waaWalletAccountDto.getBuyerId());
            //check if has enough money
            if(wafWalletAccountFundDto.getAvailableMoney().compareTo(saoSalesOrderDto.getProductAmount())>=0){
                wafWalletAccountFundDto.getAvailableMoney().subtract(saoSalesOrderDto.getProductAmount());
                if(wafWalletAccountFundService.save(wafWalletAccountFundDto)>0){
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    WtrWalletTransactionRecordDto wtrWalletTransactionRecordDto = new WtrWalletTransactionRecordDto();
                    wtrWalletTransactionRecordDto.setAccountName(waaWalletAccountDto.getAccountName());
                    wtrWalletTransactionRecordDto.setBuyerId(waaWalletAccountDto.getBuyerId());
                    wtrWalletTransactionRecordDto.setBankCardId(null); //unfinish
                    wtrWalletTransactionRecordDto.setTransactionNumber(null); //unfinish
                    wtrWalletTransactionRecordDto.setTransactionType(3);
                    wtrWalletTransactionRecordDto.setTransactionMoney(saoSalesOrderDto.getProductAmount());
                    wtrWalletTransactionRecordDto.setCommission(null); //unfinish
                    wtrWalletTransactionRecordDto.setDiscountCommission(null); //unfinish
                    wtrWalletTransactionRecordDto.setTransactionMethod(3); //unfinish
                    wtrWalletTransactionRecordDto.setCompleteTime(new Date());
                    wtrWalletTransactionRecordDto.setActualMoney(null); //unfinish
                    wtrWalletTransactionRecordDto.setActualCommission(null); //unfinish
                    wtrWalletTransactionRecordDto.setActualDiscountCommission(null); //unfinish
                    wtrWalletTransactionRecordDto.setBalance(wafWalletAccountFundDto.getAvailableMoney());
                    wtrWalletTransactionRecordDto.setBusinessId(saoSalesOrderDto.getSaoId());
                    wtrWalletTransactionRecordDto.setFinanceType(2);
                    wtrWalletTransactionRecordDto.setNote("none");
                    wtrWalletTransactionRecordDto.setOperatorName(sysUserDto.getName());
                    wtrWalletTransactionRecordDto.setOperatorIp(sysUserDto.getIp());
                    wtrWalletTransactionRecordDto.setCreateBy(sysUserDto.getName());
                    wtrWalletTransactionRecordDto.setCreateTime(simpleDateFormat.format(new Date()));
                    wtrWalletTransactionRecordDto.setLastUpdateBy(sysUserDto.getName());
                    wtrWalletTransactionRecordDto.setLastUpdateTime(simpleDateFormat.format(new Date()));
                    wtrWalletTransactionRecordDto.setBankReceiptUrl(null); //unfinish
                    wtrWalletTransactionRecordDto.setExchangeRate(null); //unfinish
                    wtrWalletTransactionRecordDto.setTransactionDesc(null); //unfinish
                    wtrWalletTransactionRecordDto.setForeignExchangeFee(null); //unfinish
                    wtrWalletTransactionRecordDto.setWithdrawFee(null); //unfinish
                    if(wtrWalletTransactionRecordService.save(wtrWalletTransactionRecordDto) >0){
                        WtaWalletTransactionAduitDto wtaWalletTransactionAduitDto = new WtaWalletTransactionAduitDto();
                        wtaWalletTransactionAduitDto.setBuyerId(waaWalletAccountDto.getBuyerId());
                        wtaWalletTransactionAduitDto.setTransactionId(wtrWalletTransactionRecordDto.getTransactionId());
                        wtaWalletTransactionAduitDto.setAvailableMoneyAfter(wafWalletAccountFundDto.getAvailableMoney());
                        wtaWalletTransactionAduitDto.setDepositingMoneyAfter(null); //unfinish
                        wtaWalletTransactionAduitDto.setWithdrawingMoneyAfter(null); //unfinish
                        wtaWalletTransactionAduitDto.setOperateMoney(saoSalesOrderDto.getProductAmount());
                        wtaWalletTransactionAduitDto.setOperateType(3);
                        wtaWalletTransactionAduitDto.setAvailableMoneyBefore(wafWalletAccountFundDto.getAvailableMoney().add(saoSalesOrderDto.getProductAmount()));
                        wtaWalletTransactionAduitDto.setDepositingMoneyBefore(null); //unfinish
                        wtaWalletTransactionAduitDto.setWithdrawingMoneyBefore(null); //unfinish
                        wtaWalletTransactionAduitDto.setOperateBy(sysUserDto.getName());
                        wtaWalletTransactionAduitDto.setStatus(4);
                        wtaWalletTransactionAduitDto.setCreateBy(sysUserDto.getName());
                        wtaWalletTransactionAduitDto.setCreateTime(simpleDateFormat.format(new Date()));
                        wtaWalletTransactionAduitDto.setLastUpdateBy(sysUserDto.getName());
                        wtaWalletTransactionAduitDto.setLastUpdateTime(simpleDateFormat.format(new Date()));
                        if(wtaWalletTransactionAduitService.save(wtaWalletTransactionAduitDto)>0){
                            if(saoSalesOrderService.changeToSHIPPED(saoSalesOrderDto.getSaoId())>0){
                                responseDto.setSuccess(true);
                                responseDto.setMessage("success");
                            }else {
                                responseDto.setSuccess(false);
                                responseDto.setMessage("update order error");
                            }
                        }else {
                            responseDto.setSuccess(false);
                            responseDto.setMessage("save TransactionAduit error");
                        }
                    }else{
                        responseDto.setSuccess(false);
                        responseDto.setMessage("save transaction record error");
                    }
                }
            }else{
                responseDto.setSuccess(false);
                responseDto.setMessage("don't have enough money");
            }
        }else{
            responseDto.setSuccess(false);
            responseDto.setMessage("password error");
        }

        return responseDto;
    }
}
