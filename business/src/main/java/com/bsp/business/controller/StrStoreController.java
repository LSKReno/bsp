package com.bsp.business.controller;

import com.bsp.server.dto.StrStoreDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.StrStoreService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/strStore")
public class StrStoreController {

    private static final Logger LOG = LoggerFactory.getLogger(StrStoreController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private StrStoreService strStoreService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        strStoreService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody StrStoreDto strStoreDto) {
        // 保存校验
        ValidatorUtil.require(strStoreDto.getStrId(), "主键");
        ValidatorUtil.length(strStoreDto.getPlataeformType(), "平台类别,1:Amazon;2:ebay", 1, 2);
        ValidatorUtil.length(strStoreDto.getStoreName(), "网店名 - 从api中取得", 1, 45);
        ValidatorUtil.length(strStoreDto.getStoreStsCd(), "API 对接状态 1. INI - 刚授权 2. WIP - 正常对接 3. EXP - token 过期 4. ERR - token 出错 5. CLS - 网店关闭", 1, 45);
        ValidatorUtil.length(strStoreDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(strStoreDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(strStoreDto.getRemark(), "状态", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        strStoreService.save(strStoreDto);
        responseDto.setContent(strStoreDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        strStoreService.delete(id);
        return responseDto;
    }
}
