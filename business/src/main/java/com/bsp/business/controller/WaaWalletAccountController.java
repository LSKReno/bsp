package com.bsp.business.controller;

import com.bsp.server.dto.WaaWalletAccountDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.WaaWalletAccountService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/waaWalletAccount")
public class WaaWalletAccountController {

    private static final Logger LOG = LoggerFactory.getLogger(WaaWalletAccountController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private WaaWalletAccountService waaWalletAccountService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        waaWalletAccountService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody WaaWalletAccountDto waaWalletAccountDto) {
        // 保存校验
        ValidatorUtil.require(waaWalletAccountDto.getBuyerId(), "主键");
        ValidatorUtil.length(waaWalletAccountDto.getAccountName(), "账户名", 1, 50);
        ValidatorUtil.length(waaWalletAccountDto.getEmail(), "邮箱", 1, 50);
        ValidatorUtil.length(waaWalletAccountDto.getPassword(), "支付密码, 加密串", 1, 256);
        ValidatorUtil.length(waaWalletAccountDto.getCreateBy(), "创建人", 1, 20);
        ValidatorUtil.length(waaWalletAccountDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(waaWalletAccountDto.getAutoPayStatus(), "0-FALSE 1-TRUE", 1, 2);

        ResponseDto responseDto = new ResponseDto();
        waaWalletAccountService.save(waaWalletAccountDto);
        responseDto.setContent(waaWalletAccountDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        waaWalletAccountService.delete(id);
        return responseDto;
    }
}
