package com.bsp.system.controller.Order;

import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SolStoreOrderLineItemDto;
import com.bsp.server.service.SolStoreOrderLineItemService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/SolStoreOrderItem")
public class SolStoreOrderLineItemController {
    @Resource
    private SolStoreOrderLineItemService solStoreOrderLineItemService;
    @PostMapping("/addItem")
    public ResponseDto addItem(@RequestBody SolStoreOrderLineItemDto solStoreOrderLineItemDto){
        ResponseDto responseDto = new ResponseDto();
        int id = solStoreOrderLineItemService.save(solStoreOrderLineItemDto);
        solStoreOrderLineItemDto.setSolId(id);
        responseDto.setContent(solStoreOrderLineItemDto);
        return responseDto;
    }
}
