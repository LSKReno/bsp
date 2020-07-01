package com.bsp.business.controller;

import com.bsp.server.dto.SaoSalesOrderDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.SaoSalesOrderService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/saoSalesOrder")
public class SaoSalesOrderController {

    private static final Logger LOG = LoggerFactory.getLogger(SaoSalesOrderController.class);
    public static final String BUSINESS_NAME = "";

    @Resource
    private SaoSalesOrderService saoSalesOrderService;

    /**
     * 列表查询
     */
    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        saoSalesOrderService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    @PostMapping("/save")
    public ResponseDto save(@RequestBody SaoSalesOrderDto saoSalesOrderDto) {
        // 保存校验
        ValidatorUtil.require(saoSalesOrderDto.getSaoId(), "主键");
        ValidatorUtil.length(saoSalesOrderDto.getCreatedBy(), "创建人", 1, 50);
        ValidatorUtil.length(saoSalesOrderDto.getLastUpdateBy(), "更新人", 1, 20);
        ValidatorUtil.length(saoSalesOrderDto.getRemark(), "备注", 1, 50);
        ValidatorUtil.length(saoSalesOrderDto.getCustomerRemark(), "消费者备注", 1, 300);
        ValidatorUtil.length(saoSalesOrderDto.getOrderNo(), "订单编号, SO + 8位数字: 例如: SO00000001 , 当订单号多于一千万时，第一位变为由A到Z", 1, 45);
        ValidatorUtil.length(saoSalesOrderDto.getOrderSts(), "订单状态: 1. AwaitingPayment 2. AwaitingShipment 3. SHIPPED 已发货 4. Complete 已完成5. Canceled已取消", 1, 45);
        ValidatorUtil.length(saoSalesOrderDto.getRefundSts(), "退款状态 1. OPEN - 开启 2. CLOSE - 已完结", 1, 45);
        ValidatorUtil.length(saoSalesOrderDto.getDeliverySts(), "发货状态 1. SYNC - 已同步到仓库 2. STOCK_OUT - 已出库 3. SHIPPING - 发货中 4. FULFILLED - 已妥投", 1, 45);
        ValidatorUtil.length(saoSalesOrderDto.getAutoPayTime(), "订单自动支付时间", 1, 5);

        ResponseDto responseDto = new ResponseDto();
        saoSalesOrderService.save(saoSalesOrderDto);
        responseDto.setContent(saoSalesOrderDto);
        return responseDto;
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public ResponseDto delete(@PathVariable Integer id) {
        ResponseDto responseDto = new ResponseDto();
        saoSalesOrderService.delete(id);
        return responseDto;
    }
}
