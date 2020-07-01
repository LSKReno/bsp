package com.bsp.business.controller;

import com.bsp.server.dto.SalSalesOrderLineItemDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SalSalesOrderLineItemService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/salSalesOrderLineItem")
public class SalSalesOrderLineItemController {

    private static final Logger LOG = LoggerFactory.getLogger(SalSalesOrderLineItemController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SalSalesOrderLineItemService salSalesOrderLineItemService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        salSalesOrderLineItemService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SalSalesOrderLineItemDto salSalesOrderLineItemDto) {
        // 保存校验
        ValidatorUtil.require(salSalesOrderLineItemDto.getSalId(), "主键");
        ValidatorUtil.length(salSalesOrderLineItemDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(salSalesOrderLineItemDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(salSalesOrderLineItemDto.getRemark(), "备注", 1, 50);
        ValidatorUtil.length(salSalesOrderLineItemDto.getTrackingNo(), "物流跟踪号", 1, 45);
        ValidatorUtil.length(salSalesOrderLineItemDto.getWspName(), "快递公司", 1, 45);

        ResponseDto responseDto = new ResponseDto();
        salSalesOrderLineItemService.save(salSalesOrderLineItemDto);
        responseDto.setContent(salSalesOrderLineItemDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        salSalesOrderLineItemService.delete(id);
        return responseDto;
    }
}
