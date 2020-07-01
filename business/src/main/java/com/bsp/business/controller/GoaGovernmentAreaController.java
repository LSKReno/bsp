package com.bsp.business.controller;

import com.bsp.server.dto.GoaGovernmentAreaDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.GoaGovernmentAreaService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goaGovernmentArea")
public class GoaGovernmentAreaController {

    private static final Logger LOG = LoggerFactory.getLogger(GoaGovernmentAreaController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private GoaGovernmentAreaService goaGovernmentAreaService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        goaGovernmentAreaService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody GoaGovernmentAreaDto goaGovernmentAreaDto) {
        // 保存校验
        ValidatorUtil.require(goaGovernmentAreaDto.getGoaId(), "主键id");
        ValidatorUtil.length(goaGovernmentAreaDto.getZipCode(), "邮编", 1, 16);
        ValidatorUtil.length(goaGovernmentAreaDto.getState(), "洲", 1, 255);
        ValidatorUtil.length(goaGovernmentAreaDto.getStateShorthand(), "洲简称", 1, 10);
        ValidatorUtil.length(goaGovernmentAreaDto.getCity(), "城市", 1, 255);
        ValidatorUtil.length(goaGovernmentAreaDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(goaGovernmentAreaDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(goaGovernmentAreaDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        goaGovernmentAreaService.save(goaGovernmentAreaDto);
        responseDto.setContent(goaGovernmentAreaDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        goaGovernmentAreaService.delete(id);
        return responseDto;
    }
}
