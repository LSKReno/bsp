package com.bsp.business.controller;

import com.bsp.server.dto.WtaWalletTransactionAduitDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.WtaWalletTransactionAduitService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/wtaWalletTransactionAduit")
public class WtaWalletTransactionAduitController {

    private static final Logger LOG = LoggerFactory.getLogger(WtaWalletTransactionAduitController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private WtaWalletTransactionAduitService wtaWalletTransactionAduitService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        wtaWalletTransactionAduitService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody WtaWalletTransactionAduitDto wtaWalletTransactionAduitDto) {
        // 保存校验
        ValidatorUtil.require(wtaWalletTransactionAduitDto.getTransactionAuditId(), "主键");
        ValidatorUtil.length(wtaWalletTransactionAduitDto.getOperateBy(), "操作人", 1, 20);
        ValidatorUtil.length(wtaWalletTransactionAduitDto.getCreateBy(), "创建人", 1, 20);
        ValidatorUtil.length(wtaWalletTransactionAduitDto.getLastUpdateBy(), "更新人", 1, 20);

        ResponseDto responseDto = new ResponseDto();
        wtaWalletTransactionAduitService.save(wtaWalletTransactionAduitDto);
        responseDto.setContent(wtaWalletTransactionAduitDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        wtaWalletTransactionAduitService.delete(id);
        return responseDto;
    }
}
