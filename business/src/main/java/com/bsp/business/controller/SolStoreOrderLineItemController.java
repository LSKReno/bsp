package com.bsp.business.controller;

import com.bsp.server.dto.SolStoreOrderLineItemDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SolStoreOrderLineItemService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/solStoreOrderLineItem")
public class SolStoreOrderLineItemController {

    private static final Logger LOG = LoggerFactory.getLogger(SolStoreOrderLineItemController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SolStoreOrderLineItemService solStoreOrderLineItemService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        solStoreOrderLineItemService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SolStoreOrderLineItemDto solStoreOrderLineItemDto) {
        // 保存校验
        ValidatorUtil.require(solStoreOrderLineItemDto.getSolId(), "主键");
        ValidatorUtil.length(solStoreOrderLineItemDto.getOrderItemId(), "第三方平台 LINE_ITEM_ID", 1, 45);
        ValidatorUtil.length(solStoreOrderLineItemDto.getSkuNo(), "商品SKU编号", 1, 45);
        ValidatorUtil.length(solStoreOrderLineItemDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(solStoreOrderLineItemDto.getLastUpdateBy(), "修改人", 1, 20);
        ValidatorUtil.length(solStoreOrderLineItemDto.getRemark(), "备注", 1, 50);

        ResponseDto responseDto = new ResponseDto();
        solStoreOrderLineItemService.save(solStoreOrderLineItemDto);
        responseDto.setContent(solStoreOrderLineItemDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        solStoreOrderLineItemService.delete(id);
        return responseDto;
    }
}
