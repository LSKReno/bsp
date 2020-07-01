package com.bsp.business.controller;

import com.bsp.server.dto.WafWalletAccountFundDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.WafWalletAccountFundService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/wafWalletAccountFund")
public class WafWalletAccountFundController {

    private static final Logger LOG = LoggerFactory.getLogger(WafWalletAccountFundController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private WafWalletAccountFundService wafWalletAccountFundService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        wafWalletAccountFundService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody WafWalletAccountFundDto wafWalletAccountFundDto) {
        // 保存校验
        ValidatorUtil.require(wafWalletAccountFundDto.getBuyerId(), "买家id");
        ValidatorUtil.length(wafWalletAccountFundDto.getCreateBy(), "创建人", 1, 20);
        ValidatorUtil.length(wafWalletAccountFundDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(wafWalletAccountFundDto.getCurrency(), "账户币种:USD,RMB", 1, 16);

        ResponseDto responseDto = new ResponseDto();
        wafWalletAccountFundService.save(wafWalletAccountFundDto);
        responseDto.setContent(wafWalletAccountFundDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        wafWalletAccountFundService.delete(id);
        return responseDto;
    }
}
