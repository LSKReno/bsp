package com.bsp.system.controller.Order;

import com.alibaba.fastjson.JSON;
import com.bsp.server.domain.WafWalletAccountFund;
import com.bsp.server.dto.*;
import com.bsp.server.service.*;
import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/wallerController")
public class PayController {
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
    @Resource
    private TrackingNumberService trackingNumberService;
    @PostMapping("/pay")
    public ResponseDto pay(@RequestBody Map<String, Object> request){
        ResponseDto responseDto = new ResponseDto();
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
//        String account_name = JSON.parseObject(JSON.toJSONString(request.get("account_name")), String.class);
        String passwd = JSON.parseObject(JSON.toJSONString(request.get("password")), String.class);
        SaoSalesOrderDto saoSalesOrderDto1 = JSON.parseObject(JSON.toJSONString(request.get("SaoSalesOrderDto")), SaoSalesOrderDto.class);
        SaoSalesOrderDto saoSalesOrderDto = saoSalesOrderService.selectByPrimaryKey(saoSalesOrderDto1.getSaoId());
        WaaWalletAccountDto waaWalletAccountDto = waaWalletAccountService.selectByName(sysUserDto1.getUsername());
        //check password
        System.out.println(waaWalletAccountDto.toString());
        if(waaWalletAccountDto.getPassword().equals(passwd)){
            WafWalletAccountFundDto wafWalletAccountFundDto = wafWalletAccountFundService.selectByPrimaryKey(waaWalletAccountDto.getBuyerId());
            System.out.println(waaWalletAccountDto.toString());
            if(waaWalletAccountDto.getStatus().equals(7)){
                    //check if has enough money
                    if(wafWalletAccountFundDto.getAvailableMoney().compareTo(saoSalesOrderDto.getProductAmount())>=0){
                        wafWalletAccountFundDto.setAvailableMoney(wafWalletAccountFundDto.getAvailableMoney().subtract(saoSalesOrderDto.getProductAmount()));
                        wafWalletAccountFundDto.setLastUpdateBy(sysUserDto.getName());
                        if(wafWalletAccountFundService.save(wafWalletAccountFundDto)>0){
//                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            WtrWalletTransactionRecordDto wtrWalletTransactionRecordDto = new WtrWalletTransactionRecordDto();
                            wtrWalletTransactionRecordDto.setAccountName(waaWalletAccountDto.getAccountName());
                            wtrWalletTransactionRecordDto.setBuyerId(waaWalletAccountDto.getBuyerId());
                            wtrWalletTransactionRecordDto.setBankCardId(null);
                            wtrWalletTransactionRecordDto.setTransactionNumber(trackingNumberService.getId(FastDateFormat.getInstance("yyyy-MM-dd").format(new Date())));
                            wtrWalletTransactionRecordDto.setTransactionType(3);
                            wtrWalletTransactionRecordDto.setTransactionMoney(saoSalesOrderDto.getProductAmount());
                            wtrWalletTransactionRecordDto.setCommission(new BigDecimal(0));
                            wtrWalletTransactionRecordDto.setDiscountCommission(new BigDecimal(0));
                            wtrWalletTransactionRecordDto.setTransactionMethod(3);
                            wtrWalletTransactionRecordDto.setCompleteTime(new Date());
                            wtrWalletTransactionRecordDto.setActualMoney(saoSalesOrderDto.getProductAmount());
                            wtrWalletTransactionRecordDto.setActualCommission(new BigDecimal(0));
                            wtrWalletTransactionRecordDto.setActualDiscountCommission(new BigDecimal(0));
                            wtrWalletTransactionRecordDto.setBalance(wafWalletAccountFundDto.getAvailableMoney());
                            wtrWalletTransactionRecordDto.setBusinessId(saoSalesOrderDto.getSaoId());
                            wtrWalletTransactionRecordDto.setFinanceType(2);
                            wtrWalletTransactionRecordDto.setNote(null);
                            wtrWalletTransactionRecordDto.setOperatorName(sysUserDto1.getName());
                            wtrWalletTransactionRecordDto.setOperatorIp(sysUserDto1.getIp());
                            wtrWalletTransactionRecordDto.setCreateBy(sysUserDto1.getName());
//                            wtrWalletTransactionRecordDto.setCreateTime(simpleDateFormat.format(new Date()));
                            wtrWalletTransactionRecordDto.setLastUpdateBy(sysUserDto1.getName());
//                            wtrWalletTransactionRecordDto.setLastUpdateTime(simpleDateFormat.format(new Date()));
                            wtrWalletTransactionRecordDto.setBankReceiptUrl(null);
                            wtrWalletTransactionRecordDto.setExchangeRate(null);
                            wtrWalletTransactionRecordDto.setTransactionDesc(null);
                            wtrWalletTransactionRecordDto.setForeignExchangeFee(null);
                            wtrWalletTransactionRecordDto.setWithdrawFee(new BigDecimal(0));
                            wtrWalletTransactionRecordDto.setStatus(4);
                            int result = wtrWalletTransactionRecordService.save(wtrWalletTransactionRecordDto);
                            if(result >0){
                                wtrWalletTransactionRecordDto.setTransactionId(result);
                                WtaWalletTransactionAduitDto wtaWalletTransactionAduitDto = new WtaWalletTransactionAduitDto();
                                wtaWalletTransactionAduitDto.setBuyerId(waaWalletAccountDto.getBuyerId());
                                wtaWalletTransactionAduitDto.setTransactionId(wtrWalletTransactionRecordDto.getTransactionId());
                                wtaWalletTransactionAduitDto.setAvailableMoneyAfter(wafWalletAccountFundDto.getAvailableMoney());
                                wtaWalletTransactionAduitDto.setDepositingMoneyAfter(wafWalletAccountFundDto.getDepositingMoney());
                                wtaWalletTransactionAduitDto.setWithdrawingMoneyAfter(wafWalletAccountFundDto.getWithdrawingMoney());
                                wtaWalletTransactionAduitDto.setOperateMoney(saoSalesOrderDto.getProductAmount());
                                wtaWalletTransactionAduitDto.setOperateType(3);
                                wtaWalletTransactionAduitDto.setAvailableMoneyBefore(wafWalletAccountFundDto.getAvailableMoney().add(saoSalesOrderDto.getProductAmount()));
                                wtaWalletTransactionAduitDto.setDepositingMoneyBefore(wafWalletAccountFundDto.getDepositingMoney());
                                wtaWalletTransactionAduitDto.setWithdrawingMoneyBefore(wafWalletAccountFundDto.getWithdrawingMoney());
                                wtaWalletTransactionAduitDto.setOperateBy(sysUserDto1.getName());
                                wtaWalletTransactionAduitDto.setStatus(4);
                                wtaWalletTransactionAduitDto.setCreateBy(sysUserDto1.getName());
//                                wtaWalletTransactionAduitDto.setCreateTime(simpleDateFormat.format(new Date()));
                                wtaWalletTransactionAduitDto.setLastUpdateBy(sysUserDto1.getName());
//                                wtaWalletTransactionAduitDto.setLastUpdateTime(simpleDateFormat.format(new Date()));
                                if(wtaWalletTransactionAduitService.save(wtaWalletTransactionAduitDto)>0){
                                    if(saoSalesOrderService.changeToWattingSHIPPED(saoSalesOrderDto.getSaoId())>0){
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
                responseDto.setMessage("the account has been fronzen");
                }
        }else{
            responseDto.setSuccess(false);
            responseDto.setMessage("password error");
        }
        return responseDto;
    }
    @PostMapping("/cancel")
    public ResponseDto cancel(@RequestBody Map<String, Object> request){
        ResponseDto responseDto = new ResponseDto();
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
//        String account_name = JSON.parseObject(JSON.toJSONString(request.get("account_name")), String.class);
        String passwd = JSON.parseObject(JSON.toJSONString(request.get("password")), String.class);
        SaoSalesOrderDto saoSalesOrderDto1 = JSON.parseObject(JSON.toJSONString(request.get("SaoSalesOrderDto")), SaoSalesOrderDto.class);
        SaoSalesOrderDto saoSalesOrderDto = saoSalesOrderService.selectByPrimaryKey(saoSalesOrderDto1.getSaoId());
        WaaWalletAccountDto waaWalletAccountDto = waaWalletAccountService.selectByName(sysUserDto1.getUsername());
        //check password
        if(saoSalesOrderDto.getOrderSts().equals("SHIPPED")){
            if(waaWalletAccountDto.getPassword().equals(passwd)){
                WafWalletAccountFundDto wafWalletAccountFundDto = wafWalletAccountFundService.selectByPrimaryKey(waaWalletAccountDto.getBuyerId());
                System.out.println(waaWalletAccountDto.toString());
                if(waaWalletAccountDto.getStatus().equals(7)){
                    //check if has enough money
//                if(wafWalletAccountFundDto.getAvailableMoney().compareTo(saoSalesOrderDto.getProductAmount())>=0){
                    wafWalletAccountFundDto.setDepositingMoney(saoSalesOrderDto.getProductAmount());
//                    wafWalletAccountFundDto.setAvailableMoney(wafWalletAccountFundDto.getAvailableMoney().add(saoSalesOrderDto.getProductAmount()));
                    wafWalletAccountFundDto.setLastUpdateBy(sysUserDto.getName());
                    if(wafWalletAccountFundService.save(wafWalletAccountFundDto)>0){
//                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        WtrWalletTransactionRecordDto wtrWalletTransactionRecordDto = new WtrWalletTransactionRecordDto();
                        wtrWalletTransactionRecordDto.setAccountName(waaWalletAccountDto.getAccountName());
                        wtrWalletTransactionRecordDto.setBuyerId(waaWalletAccountDto.getBuyerId());
                        wtrWalletTransactionRecordDto.setBankCardId(null);
                        wtrWalletTransactionRecordDto.setTransactionNumber(trackingNumberService.getId(FastDateFormat.getInstance("yyyy-MM-dd").format(new Date())));
                        wtrWalletTransactionRecordDto.setTransactionType(4);
                        wtrWalletTransactionRecordDto.setTransactionMoney(saoSalesOrderDto.getProductAmount());
                        wtrWalletTransactionRecordDto.setCommission(new BigDecimal(0));
                        wtrWalletTransactionRecordDto.setDiscountCommission(new BigDecimal(0));
                        wtrWalletTransactionRecordDto.setTransactionMethod(3);
                        wtrWalletTransactionRecordDto.setCompleteTime(new Date());
                        wtrWalletTransactionRecordDto.setActualMoney(saoSalesOrderDto.getProductAmount());
                        wtrWalletTransactionRecordDto.setActualCommission(new BigDecimal(0));
                        wtrWalletTransactionRecordDto.setActualDiscountCommission(new BigDecimal(0));
                        wtrWalletTransactionRecordDto.setBalance(wafWalletAccountFundDto.getAvailableMoney());
                        wtrWalletTransactionRecordDto.setBusinessId(saoSalesOrderDto.getSaoId());
                        wtrWalletTransactionRecordDto.setFinanceType(1);
                        wtrWalletTransactionRecordDto.setNote(null);
                        wtrWalletTransactionRecordDto.setOperatorName(sysUserDto1.getName());
                        wtrWalletTransactionRecordDto.setOperatorIp(sysUserDto1.getIp());
                        wtrWalletTransactionRecordDto.setCreateBy(sysUserDto1.getName());
//                            wtrWalletTransactionRecordDto.setCreateTime(simpleDateFormat.format(new Date()));
                        wtrWalletTransactionRecordDto.setLastUpdateBy(sysUserDto1.getName());
//                            wtrWalletTransactionRecordDto.setLastUpdateTime(simpleDateFormat.format(new Date()));
                        wtrWalletTransactionRecordDto.setBankReceiptUrl(null);
                        wtrWalletTransactionRecordDto.setExchangeRate(null);
                        wtrWalletTransactionRecordDto.setTransactionDesc(null);
                        wtrWalletTransactionRecordDto.setForeignExchangeFee(null);
                        wtrWalletTransactionRecordDto.setWithdrawFee(new BigDecimal(0));
                        wtrWalletTransactionRecordDto.setStatus(2);
                        int result = wtrWalletTransactionRecordService.save(wtrWalletTransactionRecordDto);
                        if(result >0){
                            wtrWalletTransactionRecordDto.setTransactionId(result);
                            WtaWalletTransactionAduitDto wtaWalletTransactionAduitDto = new WtaWalletTransactionAduitDto();
                            wtaWalletTransactionAduitDto.setBuyerId(waaWalletAccountDto.getBuyerId());
                            wtaWalletTransactionAduitDto.setTransactionId(wtrWalletTransactionRecordDto.getTransactionId());
                            wtaWalletTransactionAduitDto.setAvailableMoneyAfter(wafWalletAccountFundDto.getAvailableMoney().add(saoSalesOrderDto.getProductAmount()));
                            wtaWalletTransactionAduitDto.setDepositingMoneyAfter(wafWalletAccountFundDto.getDepositingMoney());
                            wtaWalletTransactionAduitDto.setWithdrawingMoneyAfter(wafWalletAccountFundDto.getWithdrawingMoney());
                            wtaWalletTransactionAduitDto.setOperateMoney(saoSalesOrderDto.getProductAmount());
                            wtaWalletTransactionAduitDto.setOperateType(4);
                            wtaWalletTransactionAduitDto.setAvailableMoneyBefore(wafWalletAccountFundDto.getAvailableMoney());
                            wtaWalletTransactionAduitDto.setDepositingMoneyBefore(wafWalletAccountFundDto.getDepositingMoney());
                            wtaWalletTransactionAduitDto.setWithdrawingMoneyBefore(wafWalletAccountFundDto.getWithdrawingMoney());
                            wtaWalletTransactionAduitDto.setOperateBy(sysUserDto1.getName());
                            wtaWalletTransactionAduitDto.setStatus(2);
                            wtaWalletTransactionAduitDto.setCreateBy(sysUserDto1.getName());
//                                wtaWalletTransactionAduitDto.setCreateTime(simpleDateFormat.format(new Date()));
                            wtaWalletTransactionAduitDto.setLastUpdateBy(sysUserDto1.getName());
//                                wtaWalletTransactionAduitDto.setLastUpdateTime(simpleDateFormat.format(new Date()));
                            if(wtaWalletTransactionAduitService.save(wtaWalletTransactionAduitDto)>0){
                                if(saoSalesOrderService.cancelSHIPPED(saoSalesOrderDto.getSaoId())>0){
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
//                }else{
//                    responseDto.setSuccess(false);
//                    responseDto.setMessage("don't have enough money");
//                }
                }else{
                    responseDto.setSuccess(false);
                    responseDto.setMessage("the account has been fronzen");
                }
            }else{
                responseDto.setSuccess(false);
                responseDto.setMessage("password error");
            }
        }else{
            responseDto.setSuccess(false);
            responseDto.setMessage("the order state is not right");
        }

        return responseDto;
    }
}
