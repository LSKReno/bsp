package com.bsp.business.controller;

import com.bsp.server.dto.WtrWalletTransactionRecordDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.WtrWalletTransactionRecordService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/wtrWalletTransactionRecord")
public class WtrWalletTransactionRecordController {

    private static final Logger LOG = LoggerFactory.getLogger(WtrWalletTransactionRecordController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private WtrWalletTransactionRecordService wtrWalletTransactionRecordService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        wtrWalletTransactionRecordService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody WtrWalletTransactionRecordDto wtrWalletTransactionRecordDto) {
        // 保存校验
        ValidatorUtil.require(wtrWalletTransactionRecordDto.getTransactionId(), "主键");
        ValidatorUtil.length(wtrWalletTransactionRecordDto.getTransactionNumber(), "流水号，GM应用生成", 1, 255);
        ValidatorUtil.length(wtrWalletTransactionRecordDto.getAccountName(), "gmcp$account.account_name 账户名", 1, 50);
        ValidatorUtil.length(wtrWalletTransactionRecordDto.getNote(), "备注", 1, 1024);
        ValidatorUtil.length(wtrWalletTransactionRecordDto.getOperatorName(), "操作人", 1, 64);
        ValidatorUtil.length(wtrWalletTransactionRecordDto.getOperatorIp(), "操作人IP", 1, 32);
        ValidatorUtil.length(wtrWalletTransactionRecordDto.getCreateBy(), "创建人", 1, 20);
        ValidatorUtil.length(wtrWalletTransactionRecordDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(wtrWalletTransactionRecordDto.getBankReceiptUrl(), "银行请求地址", 1, 255);
        ValidatorUtil.length(wtrWalletTransactionRecordDto.getTransactionDesc(), "流水描述", 1, 255);

        ResponseDto responseDto = new ResponseDto();
        wtrWalletTransactionRecordService.save(wtrWalletTransactionRecordDto);
        responseDto.setContent(wtrWalletTransactionRecordDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        wtrWalletTransactionRecordService.delete(id);
        return responseDto;
    }
}
