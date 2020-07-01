package com.bsp.business.controller;

import com.bsp.server.dto.ManManufacturerDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.ManManufacturerService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/manManufacturer")
public class ManManufacturerController {

    private static final Logger LOG = LoggerFactory.getLogger(ManManufacturerController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private ManManufacturerService manManufacturerService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        manManufacturerService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ManManufacturerDto manManufacturerDto) {
        // 保存校验
        ValidatorUtil.require(manManufacturerDto.getManId(), "主键，制造商ID");
        ValidatorUtil.length(manManufacturerDto.getNameEn(), "制造商英文名", 1, 100);
        ValidatorUtil.length(manManufacturerDto.getNameCn(), "制造商中文名", 1, 100);
        ValidatorUtil.length(manManufacturerDto.getGmcReportType(), "品牌商认证类型 1-TÜV,2-UL", 1, 2);
        ValidatorUtil.length(manManufacturerDto.getGmcReportUrl(), "证书地址", 1, 255);
        ValidatorUtil.length(manManufacturerDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(manManufacturerDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(manManufacturerDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        manManufacturerService.save(manManufacturerDto);
        responseDto.setContent(manManufacturerDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        manManufacturerService.delete(id);
        return responseDto;
    }
}
