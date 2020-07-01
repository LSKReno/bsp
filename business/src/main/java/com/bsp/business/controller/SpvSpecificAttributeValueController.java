package com.bsp.business.controller;

import com.bsp.server.dto.SpvSpecificAttributeValueDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SpvSpecificAttributeValueService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/spvSpecificAttributeValue")
public class SpvSpecificAttributeValueController {

    private static final Logger LOG = LoggerFactory.getLogger(SpvSpecificAttributeValueController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SpvSpecificAttributeValueService spvSpecificAttributeValueService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        spvSpecificAttributeValueService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SpvSpecificAttributeValueDto spvSpecificAttributeValueDto) {
        // 保存校验
        ValidatorUtil.require(spvSpecificAttributeValueDto.getSpvId(), "主键id");
        ValidatorUtil.length(spvSpecificAttributeValueDto.getNameEn(), "英文属性描述", 1, 100);
        ValidatorUtil.length(spvSpecificAttributeValueDto.getNameCn(), "中文属性描述", 1, 100);
        ValidatorUtil.length(spvSpecificAttributeValueDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(spvSpecificAttributeValueDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(spvSpecificAttributeValueDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        spvSpecificAttributeValueService.save(spvSpecificAttributeValueDto);
        responseDto.setContent(spvSpecificAttributeValueDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        spvSpecificAttributeValueService.delete(id);
        return responseDto;
    }
}
