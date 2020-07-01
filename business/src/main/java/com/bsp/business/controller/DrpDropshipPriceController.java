package com.bsp.business.controller;

import com.bsp.server.dto.DrpDropshipPriceDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.DrpDropshipPriceService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/drpDropshipPrice")
public class DrpDropshipPriceController {

    private static final Logger LOG = LoggerFactory.getLogger(DrpDropshipPriceController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private DrpDropshipPriceService drpDropshipPriceService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        drpDropshipPriceService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody DrpDropshipPriceDto drpDropshipPriceDto) {
        // 保存校验
        ValidatorUtil.require(drpDropshipPriceDto.getDrpId(), "主键");
        ValidatorUtil.length(drpDropshipPriceDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(drpDropshipPriceDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(drpDropshipPriceDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        drpDropshipPriceService.save(drpDropshipPriceDto);
        responseDto.setContent(drpDropshipPriceDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        drpDropshipPriceService.delete(id);
        return responseDto;
    }
}
