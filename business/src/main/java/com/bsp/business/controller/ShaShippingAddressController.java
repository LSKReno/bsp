package com.bsp.business.controller;

import com.bsp.server.dto.ShaShippingAddressDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.ShaShippingAddressService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/shaShippingAddress")
public class ShaShippingAddressController {

    private static final Logger LOG = LoggerFactory.getLogger(ShaShippingAddressController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private ShaShippingAddressService shaShippingAddressService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        shaShippingAddressService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody ShaShippingAddressDto shaShippingAddressDto) {
        // 保存校验
        ValidatorUtil.length(shaShippingAddressDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(shaShippingAddressDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(shaShippingAddressDto.getRemark(), "备注", 1, 50);
        ValidatorUtil.length(shaShippingAddressDto.getFamilyName(), "姓", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getGivenName(), "名字", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getCountryName(), "国家", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getCountryIsoCd(), "国家编码", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getStateOrProvinceName(), "省份或洲名称", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getStateOrProvinceCd(), "省份或洲编码", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getCityName(), "城市名", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getAddressLine1(), "地址1", 1, 64);
        ValidatorUtil.length(shaShippingAddressDto.getAddressLine2(), "地址2", 1, 64);
        ValidatorUtil.length(shaShippingAddressDto.getAddressLine3(), "地址3", 1, 64);
        ValidatorUtil.length(shaShippingAddressDto.getPostalCd(), "邮编", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getContactPhoneNo(), "联系电话", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getEmail(), "邮箱", 1, 45);
        ValidatorUtil.length(shaShippingAddressDto.getCarrierName(), "快递公司名称", 1, 100);

        ResponseDto responseDto = new ResponseDto();
        shaShippingAddressService.save(shaShippingAddressDto);
        responseDto.setContent(shaShippingAddressDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        shaShippingAddressService.delete(id);
        return responseDto;
    }
}
