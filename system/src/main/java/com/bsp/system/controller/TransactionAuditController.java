package com.bsp.system.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.domain.WafWalletAccountFund;
import com.bsp.server.domain.WafWalletAccountFundExample;
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
    public ResponseDto passTransactionAudit(@RequestBody WtaWalletTransactionAduitDto wtaWalletTransactionAduitDto) {
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


        // 更新wta
        // 更改变更后充值中金额、变更后提现中金额
        wtaWalletTransactionAduitDto.setDepositingMoneyAfter(BigDecimal.valueOf(0));
        wtaWalletTransactionAduitDto.setWithdrawingMoneyAfter(BigDecimal.valueOf(0));
        // 更改状态为 成功
        wtaWalletTransactionAduitDto.setStatus(4);

        // 更新wtr
        WtrWalletTransactionRecordDto wtr = new WtrWalletTransactionRecordDto();
        wtr.setTransactionId(wtaWalletTransactionAduitDto.getTransactionId());
        wtr.setStatus(4);

        wafWalletAccountFundService.save(CopyUtil.copy(waf, WafWalletAccountFundDto.class));
        wtrWalletTransactionRecordService.save(wtr);
        wtaWalletTransactionAduitService.save(wtaWalletTransactionAduitDto);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setContent("success");
        return responseDto;
    }

    /**
     * 未通过审核
     */
    @PostMapping("/transactionAudit/fail")
    public ResponseDto failTransactionAudit(@RequestBody WtaWalletTransactionAduitDto wtaWalletTransactionAduitDto) {
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


        // 更新wta
        // 更改变更后充值中金额、变更后提现中金额
        wtaWalletTransactionAduitDto.setDepositingMoneyAfter(BigDecimal.valueOf(0));
        wtaWalletTransactionAduitDto.setWithdrawingMoneyAfter(BigDecimal.valueOf(0));
        // 更改状态为 失败
        wtaWalletTransactionAduitDto.setStatus(-1);

        // 更新wtr
        WtrWalletTransactionRecordDto wtr = new WtrWalletTransactionRecordDto();
        wtr.setTransactionId(wtaWalletTransactionAduitDto.getTransactionId());
        wtr.setStatus(-1);

        wafWalletAccountFundService.save(CopyUtil.copy(waf, WafWalletAccountFundDto.class));
        wtrWalletTransactionRecordService.save(wtr);
        wtaWalletTransactionAduitService.save(wtaWalletTransactionAduitDto);

        ResponseDto responseDto = new ResponseDto();
        responseDto.setContent("success");
        return responseDto;
    }

}
