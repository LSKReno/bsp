package com.bsp.system.controller.Order;

import com.bsp.server.domain.SalSalesOrderLineItem;
import com.bsp.server.dto.*;
import com.bsp.server.service.ProProductService;
import com.bsp.server.service.SalSalesOrderLineItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/SalSalesOrderLineItemController")
public class SalSalesOrderLineItemController {
    @Resource
    private SalSalesOrderLineItemService salSalesOrderLineItemService;
    @Resource
    private ProProductService proProductService;
    @PostMapping("/getSalSalesOrderLineItemControllerList")
    public ResponseDto getSalSalesOrderLineItemControllerList(@RequestBody SaoSalesOrderDto saoSalesOrderDto){
        ResponseDto responseDto = new ResponseDto();
        List<SalSalesOrderLineItemDto> salSalesOrderLineItemDtoList = salSalesOrderLineItemService.selectBySaoId(saoSalesOrderDto.getSaoId());
        List<OrderItemWithProductDto> orderItemWithProductDtos = new ArrayList<>();
        for(int i=0; i < salSalesOrderLineItemDtoList.size();i++){
            SalSalesOrderLineItemDto salSalesOrderLineItemDto = salSalesOrderLineItemDtoList.get(i);
            ProProductDto proProductDto = proProductService.selectByPrimaryKey(salSalesOrderLineItemDto.getProId());
            OrderItemWithProductDto orderItemWithProductDto = new OrderItemWithProductDto();
            orderItemWithProductDto.setProProductDto(proProductDto);
            orderItemWithProductDto.setSalSalesOrderLineItemDto(salSalesOrderLineItemDto);
            orderItemWithProductDtos.add(orderItemWithProductDto);
        }
        responseDto.setSuccess(true);
        responseDto.setContent(orderItemWithProductDtos);
        return responseDto;
    }
    @PostMapping("/addItem")
    public ResponseDto addItem(@RequestBody SalSalesOrderLineItemDto salSalesOrderLineItemDto){
        ResponseDto responseDto = new ResponseDto();
        int id = salSalesOrderLineItemService.save(salSalesOrderLineItemDto);
        salSalesOrderLineItemDto.setSalId(id);
        responseDto.setContent(salSalesOrderLineItemDto);
        return responseDto;
    }
}
