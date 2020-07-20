package com.bsp.system.controller.Order;

import com.alibaba.fastjson.JSON;
import com.bsp.server.domain.SaoSalesOrder;
import com.bsp.server.domain.StrStore;
import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.*;
import com.bsp.server.service.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/SaOSalesOrderController")
public class SaoSalesOrderController {
    @Resource
    private SaoSalesOrderService saoSalesOrderService;
    @Resource
    private DsrDropshipperService dsrDropshipperService;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private StrStoreService strStoreService;
    @Resource
        private StoStoreOrderService stoStoreOrderService;

    @PostMapping("/getSaoSalesOrderList")
    public ResponseDto getSaoSalesOrderList(@RequestBody Map<String, Object> request){
        ResponseDto responseDto = new ResponseDto();
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
        String ORDER_STS = JSON.parseObject(JSON.toJSONString(request.get("ORDER_STS")), String.class);
        List<SaoSalesOrderDto> saoSalesOrderDtos = saoSalesOrderService.selectByManID(sysUserDto1.getManBuyerId(), ORDER_STS);
        responseDto.setSuccess(true);
        responseDto.setContent(saoSalesOrderDtos);
        return responseDto;
    }
    @PostMapping("/changeToSHIPPED")
    public ResponseDto changeToSHIPPED(@RequestBody SaoSalesOrderDto saoSalesOrderDto){
        ResponseDto responseDto = new ResponseDto();
        SaoSalesOrderDto saoSalesOrderDto1 = saoSalesOrderService.selectByPrimaryKey(saoSalesOrderDto.getSaoId());
        if(saoSalesOrderDto1.getOrderSts().equals("AwaitingShipment")){
            if(saoSalesOrderService.changeToSHIPPED(saoSalesOrderDto1.getSaoId()) != 0){
                responseDto.setSuccess(true);
            }else{
                responseDto.setSuccess(false);
            }
        }else{
            responseDto.setSuccess(false);
            responseDto.setMessage("the sao sales order is not in awaiting shipment state");
        }
        return responseDto;
    }
    @PostMapping("/cancelSHIPPED")
    public ResponseDto cancelSHIPPED(@RequestBody SaoSalesOrderDto saoSalesOrderDto){
        ResponseDto responseDto = new ResponseDto();
        SaoSalesOrderDto saoSalesOrderDto1 = saoSalesOrderService.selectByPrimaryKey(saoSalesOrderDto.getSaoId());
        if(saoSalesOrderDto1.getOrderSts().equals("SHIPPED")){
            if(saoSalesOrderService.cancelSHIPPED(saoSalesOrderDto1.getSaoId()) != 0){
                responseDto.setSuccess(true);
            }else{
                responseDto.setSuccess(false);
            }
        }else{
            responseDto.setSuccess(false);
            responseDto.setMessage("the sao sales order is not in awaiting shipment state");
        }
        return responseDto;
    }
    @PostMapping("/getBVOOrderList")
    public ResponseDto getBVOOrderList(@RequestBody Map<String,Object> request){
        ResponseDto responseDto = new ResponseDto();
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        String ORDER_STS = JSON.parseObject(JSON.toJSONString(request.get("ORDER_STS")), String.class);
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
        DsrDropshipperDto dsrDropshipperDto = dsrDropshipperService.selectByPrimaryKey(sysUserDto1.getManBuyerId());
        if(dsrDropshipperDto == null){
            responseDto.setSuccess(false);
        }else {
            List<StrStoreDto> strStoreDtos = strStoreService.selectByDSRId(dsrDropshipperDto.getDsrId());
            List<StrWithOrderDto> strWithOrderDtos = new ArrayList<>();
            for(int i=0; i< strStoreDtos.size();i++){
                StrStoreDto strStoreDto = strStoreDtos.get(i);
                List<StoStoreOrderDto> stoStoreOrderDtos = stoStoreOrderService.selectByStrId(strStoreDto.getStrId());
                List<SaoSalesOrderDto> saoSalesOrderDtoList = new ArrayList<>();
                for(int j=0; j<stoStoreOrderDtos.size();j++){
                    List<SaoSalesOrderDto> saoSalesOrderDtos = saoSalesOrderService.selectByStoId(stoStoreOrderDtos.get(j).getStoId(), ORDER_STS); // order_no can be update
                    saoSalesOrderDtoList.addAll(saoSalesOrderDtos);
                }
                StrWithOrderDto strWithOrderDto = new StrWithOrderDto();
                strWithOrderDto.setStrStoreDto(strStoreDto);
                strWithOrderDto.setSaoSalesOrderDtos(saoSalesOrderDtoList);
                strWithOrderDtos.add(strWithOrderDto);
            }
            responseDto.setSuccess(true);
            responseDto.setContent(strWithOrderDtos);
        }
        return responseDto;
    }
    @PostMapping("/addSaoSalesOrder")
    public ResponseDto addSaoSalesOrder(@RequestBody SaoSalesOrderDto saoSalesOrderDto){
        ResponseDto responseDto = new ResponseDto();
        int saoId = saoSalesOrderService.save(saoSalesOrderDto);
        saoSalesOrderDto.setSaoId(saoId);
        responseDto.setContent(saoSalesOrderDto);
        return responseDto;
    }
}
