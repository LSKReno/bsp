package com.bsp.business.controller;

import com.bsp.server.dto.EbaEbayAuthorizationDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.EbaEbayAuthorizationService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ebaEbayAuthorization")
public class EbaEbayAuthorizationController {

    private static final Logger LOG = LoggerFactory.getLogger(EbaEbayAuthorizationController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private EbaEbayAuthorizationService ebaEbayAuthorizationService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        ebaEbayAuthorizationService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody EbaEbayAuthorizationDto ebaEbayAuthorizationDto) {
        // 保存校验
        ValidatorUtil.require(ebaEbayAuthorizationDto.getEbaId(), "主键");
        ValidatorUtil.length(ebaEbayAuthorizationDto.getAppId(), "ebay账号ID", 1, 255);
        ValidatorUtil.length(ebaEbayAuthorizationDto.getSecretKey(), "ebay密钥", 1, 255);
        ValidatorUtil.length(ebaEbayAuthorizationDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(ebaEbayAuthorizationDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(ebaEbayAuthorizationDto.getRemark(), "备注", 1, 50);
        ValidatorUtil.length(ebaEbayAuthorizationDto.getAccountId(), "用户id", 1, 32);

        ResponseDto responseDto = new ResponseDto();
        ebaEbayAuthorizationService.save(ebaEbayAuthorizationDto);
        responseDto.setContent(ebaEbayAuthorizationDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        ebaEbayAuthorizationService.delete(id);
        return responseDto;
    }
}
