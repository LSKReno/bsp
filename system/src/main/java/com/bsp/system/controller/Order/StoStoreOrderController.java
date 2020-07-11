package com.bsp.system.controller.Order;

import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.StoStoreOrderDto;
import com.bsp.server.service.StoStoreOrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/StoStoreOrderController")
public class StoStoreOrderController {
    @Resource
    private StoStoreOrderService stoStoreOrderService;

    @PostMapping("/addStoStoreOrder")
    public ResponseDto addStoStoreOrder(@RequestBody StoStoreOrderDto stoStoreOrderDto){
        ResponseDto responseDto = new ResponseDto();
        int id = stoStoreOrderService.save(stoStoreOrderDto);
        stoStoreOrderDto.setStoId(id);
        responseDto.setContent(stoStoreOrderDto);
        return responseDto;
    }
}
