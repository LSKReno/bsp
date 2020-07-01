package com.bsp.business.controller;

import com.bsp.server.dto.StoStoreOrderDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.StoStoreOrderService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/stoStoreOrder")
public class StoStoreOrderController {

    private static final Logger LOG = LoggerFactory.getLogger(StoStoreOrderController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private StoStoreOrderService stoStoreOrderService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        stoStoreOrderService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody StoStoreOrderDto stoStoreOrderDto) {
        // 保存校验
        ValidatorUtil.require(stoStoreOrderDto.getStoId(), "主键");
        ValidatorUtil.length(stoStoreOrderDto.getOrderId(), "AMAZON / EBAY 平台的订单 ID 例如: AMAZON : 058-1233752-8214740 EBAY : 865826", 1, 45);
        ValidatorUtil.length(stoStoreOrderDto.getOrderCreatedTime(), "订单创建时间", 1, 45);
        ValidatorUtil.length(stoStoreOrderDto.getPaidTime(), "支付时间", 1, 45);
        ValidatorUtil.length(stoStoreOrderDto.getLastModifiedTime(), "订单更新时间", 1, 45);
        ValidatorUtil.length(stoStoreOrderDto.getCreatedBy(), "创建人", 1, 20);
        ValidatorUtil.length(stoStoreOrderDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(stoStoreOrderDto.getRemark(), "备注", 1, 50);
        ValidatorUtil.length(stoStoreOrderDto.getPlateformType(), "平台类别 1、amazon 2、ebay", 1, 2);
        ValidatorUtil.length(stoStoreOrderDto.getCancelCompleteDate(), "订单取消时间", 1, 45);

        ResponseDto responseDto = new ResponseDto();
        stoStoreOrderService.save(stoStoreOrderDto);
        responseDto.setContent(stoStoreOrderDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        stoStoreOrderService.delete(id);
        return responseDto;
    }
}
