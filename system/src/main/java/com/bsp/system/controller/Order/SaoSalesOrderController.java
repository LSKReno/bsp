package com.bsp.system.controller.Order;

import com.alibaba.fastjson.JSON;
import com.bsp.server.domain.SaoSalesOrder;
import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SaoSalesOrderDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.SaoSalesOrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/SaOSalesOrderController")
public class SaoSalesOrderController {
    @Resource
    private SaoSalesOrderService saoSalesOrderService;

    @RequestMapping("/getSaoSalesOrderList")
    public ResponseDto getSaoSalesOrderList(@RequestBody Map<String, Object> request){
        ResponseDto responseDto = new ResponseDto();
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        String ORDER_STS = JSON.parseObject(JSON.toJSONString(request.get("ORDER_STS")), String.class);
        List<SaoSalesOrderDto> saoSalesOrderDtos = saoSalesOrderService.selectByManID(sysUserDto.getManBuyerId(), ORDER_STS);
        responseDto.setSuccess(true);
        responseDto.setContent(saoSalesOrderDtos);
        return responseDto;
    }
    @RequestMapping("/changeToSHIPPED")
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
        }
        return responseDto;
    }
}
