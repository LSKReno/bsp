package com.bsp.system.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.domain.WafWalletAccountFund;
import com.bsp.server.domain.WafWalletAccountFundExample;
import com.bsp.server.domain.WtaWalletTransactionAduit;
import com.bsp.server.domain.WtrWalletTransactionRecord;
import com.bsp.server.dto.*;
import com.bsp.server.mapper.WafWalletAccountFundMapper;
import com.bsp.server.service.WafWalletAccountFundService;
import com.bsp.server.service.WtaWalletTransactionAduitService;
import com.bsp.server.service.WtrWalletTransactionRecordService;
import com.bsp.server.util.CopyUtil;
import com.bsp.server.util.ValidatorUtil;
import com.bsp.system.config.JwtConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

/**
 * Created by LSK.Reno on 2020/7/19 22:59.
 */

@RestController
public class TransactionAuditController {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionAuditController.class);

    @Resource
    private JwtConfig jwtConfig;

    @Resource
    private WafWalletAccountFundService wafWalletAccountFundService;

    @Resource
    private WafWalletAccountFundMapper wafWalletAccountFundMapper;

    @Resource
    private WtaWalletTransactionAduitService wtaWalletTransactionAduitService;

    @Resource
    private WtrWalletTransactionRecordService wtrWalletTransactionRecordService;

    /**
     * 获取审核流水
     */
    @PostMapping("/transactionAudit/list")
    public ResponseDto getTransactionAudit(HttpServletRequest request) {
        PageDto pageDto = new PageDto();
        String token = request.getHeader(jwtConfig.getHeader());
        String tokenJSONString = jwtConfig.getSubjectFromToken(token);
        JSONObject userInfo = JSONObject.parseObject(tokenJSONString);
        Integer userId = (Integer) userInfo.get("userId");

        ResponseDto responseDto = new ResponseDto();
        wtaWalletTransactionAduitService.getTransactionAudit(pageDto);

        responseDto.setContent(pageDto);
        return responseDto;
    }


    /**
     * 通过审核
     */
    @PostMapping("/transactionAudit/pass")
    public ResponseDto passTransactionAudit(WtaWalletTransactionAduitDto wtaWalletTransactionAduitDto) {
        // 保存校验
        ValidatorUtil.require(wtaWalletTransactionAduitDto.getTransactionAuditId(), "主键");
        ValidatorUtil.length(wtaWalletTransactionAduitDto.getOperateBy(), "操作人", 1, 20);
        ValidatorUtil.length(wtaWalletTransactionAduitDto.getCreateBy(), "创建人", 1, 20);
        ValidatorUtil.length(wtaWalletTransactionAduitDto.getLastUpdateBy(), "更新人", 1, 20);

        Integer buyerId = wtaWalletTransactionAduitDto.getBuyerId();

        // 更新waf
        WafWalletAccountFundExample wafExample = new WafWalletAccountFundExample();
        wafExample.createCriteria().andBuyerIdEqualTo(buyerId);
        WafWalletAccountFund waf = wafWalletAccountFundMapper.selectOneByExample(wafExample);

        BigDecimal availableMoney = BigDecimal.valueOf(0);
        if (waf.getDepositingMoney().compareTo(BigDecimal.valueOf(0)) > 0) {
            availableMoney = waf.getAvailableMoney().add(waf.getDepositingMoney());
        }
        if (waf.getWithdrawingMoney().compareTo(BigDecimal.valueOf(0)) > 0) {
            availableMoney = waf.getAvailableMoney().add(waf.getDepositingMoney());
        }

        waf.setAvailableMoney(availableMoney);
        waf.setDepositingMoney(BigDecimal.valueOf(0));
        waf.setWithdrawingMoney(BigDecimal.valueOf(0));

        WtaWalletTransactionAduit wtaWalletTransactionAduit = CopyUtil.copy(wtaWalletTransactionAduitDto,WtaWalletTransactionAduit.class);

        // 更新wta
        // 更改变更后充值中金额、变更后提现中金额
        wtaWalletTransactionAduit.setDepositingMoneyAfter(BigDecimal.valueOf(0));
        wtaWalletTransactionAduit.setWithdrawingMoneyAfter(BigDecimal.valueOf(0));
        // 更改状态为 成功
        wtaWalletTransactionAduit.setStatus(new Integer(4).byteValue());

        // 更新wtr
        WtrWalletTransactionRecord wtr = new WtrWalletTransactionRecord();
        wtr.setTransactionId(wtaWalletTransactionAduit.getTransactionId());
        wtr.setStatus(new Integer(4).byteValue());

        wafWalletAccountFundService.saveWafWalletAccountFund(waf);
        wtrWalletTransactionRecordService.saveWtrWalletTransactionRecord(wtr);
        wtaWalletTransactionAduitService.saveWtaWalletTransactionAduit(wtaWalletTransactionAduit);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setContent("success");
        return responseDto;
    }

    /**
     * 未通过审核
     */
    @PostMapping("/transactionAudit/fail")
    public ResponseDto failTransactionAudit(WtaWalletTransactionAduitDto wtaWalletTransactionAduitDto) {
        // 保存校验
        ValidatorUtil.require(wtaWalletTransactionAduitDto.getTransactionAuditId(), "主键");
        ValidatorUtil.length(wtaWalletTransactionAduitDto.getOperateBy(), "操作人", 1, 20);
        ValidatorUtil.length(wtaWalletTransactionAduitDto.getCreateBy(), "创建人", 1, 20);
        ValidatorUtil.length(wtaWalletTransactionAduitDto.getLastUpdateBy(), "更新人", 1, 20);

        Integer buyerId = wtaWalletTransactionAduitDto.getBuyerId();

        // 更新waf
        WafWalletAccountFundExample wafExample = new WafWalletAccountFundExample();
        wafExample.createCriteria().andBuyerIdEqualTo(buyerId);
        WafWalletAccountFund waf = wafWalletAccountFundMapper.selectOneByExample(wafExample);

        BigDecimal availableMoney = BigDecimal.valueOf(0);
        if (waf.getDepositingMoney().compareTo(BigDecimal.valueOf(0)) > 0) {
            availableMoney = waf.getAvailableMoney().add(waf.getDepositingMoney());
        }
        if (waf.getWithdrawingMoney().compareTo(BigDecimal.valueOf(0)) > 0) {
            availableMoney = waf.getAvailableMoney().add(waf.getDepositingMoney());
        }

        waf.setAvailableMoney(availableMoney);
        waf.setDepositingMoney(BigDecimal.valueOf(0));
        waf.setWithdrawingMoney(BigDecimal.valueOf(0));

        WtaWalletTransactionAduit wtaWalletTransactionAduit = CopyUtil.copy(wtaWalletTransactionAduitDto,WtaWalletTransactionAduit.class);

        // 更新wta
        // 更改变更后充值中金额、变更后提现中金额
        wtaWalletTransactionAduit.setDepositingMoneyAfter(BigDecimal.valueOf(0));
        wtaWalletTransactionAduit.setWithdrawingMoneyAfter(BigDecimal.valueOf(0));
        // 更改状态为 失败
        wtaWalletTransactionAduit.setStatus(new Integer(-1).byteValue());

        // 更新wtr
        WtrWalletTransactionRecord wtr = new WtrWalletTransactionRecord();
        wtr.setTransactionId(wtaWalletTransactionAduit.getTransactionId());
        wtr.setStatus(new Integer(-1).byteValue());

        wafWalletAccountFundService.saveWafWalletAccountFund(waf);
        wtrWalletTransactionRecordService.saveWtrWalletTransactionRecord(wtr);
        wtaWalletTransactionAduitService.saveWtaWalletTransactionAduit(wtaWalletTransactionAduit);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setContent("success");
        return responseDto;
    }

}
