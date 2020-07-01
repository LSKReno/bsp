package com.bsp.business.controller;

import com.bsp.server.dto.SpaSpecificAttributeDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SpaSpecificAttributeService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/spaSpecificAttribute")
public class SpaSpecificAttributeController {

    private static final Logger LOG = LoggerFactory.getLogger(SpaSpecificAttributeController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SpaSpecificAttributeService spaSpecificAttributeService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        spaSpecificAttributeService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SpaSpecificAttributeDto spaSpecificAttributeDto) {
        // 保存校验
        ValidatorUtil.require(spaSpecificAttributeDto.getSpaId(), "主键id");
        ValidatorUtil.length(spaSpecificAttributeDto.getNameEn(), "属性中文", 1, 45);
        ValidatorUtil.length(spaSpecificAttributeDto.getNameCn(), "属性英文", 1, 45);
        ValidatorUtil.length(spaSpecificAttributeDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(spaSpecificAttributeDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(spaSpecificAttributeDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        spaSpecificAttributeService.save(spaSpecificAttributeDto);
        responseDto.setContent(spaSpecificAttributeDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        spaSpecificAttributeService.delete(id);
        return responseDto;
    }
}
