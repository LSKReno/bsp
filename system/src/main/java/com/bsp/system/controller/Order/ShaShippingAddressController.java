package com.bsp.system.controller.Order;

import com.bsp.server.domain.SaoSalesOrder;
import com.bsp.server.domain.ShaShippingAddress;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SaoSalesOrderDto;
import com.bsp.server.dto.ShaShippingAddressDto;
import com.bsp.server.dto.StoStoreOrderDto;
import com.bsp.server.service.ShaShippingAddressService;
import com.bsp.server.service.StoStoreOrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/AddressController")
public class ShaShippingAddressController {
    @Resource
    private ShaShippingAddressService shaShippingAddressService;
    @Resource
    private StoStoreOrderService stoStoreOrderService;

    @PostMapping("/getAddress")
    public ResponseDto getAddress(@RequestBody SaoSalesOrderDto saoSalesOrderDto){
        ResponseDto responseDto = new ResponseDto();
        StoStoreOrderDto stoStoreOrderDto = stoStoreOrderService.selectByPrimaryKey(saoSalesOrderDto.getStoId());
        if(stoStoreOrderDto != null){
            ShaShippingAddressDto shaShippingAddressDto = shaShippingAddressService.selectByStoId(stoStoreOrderDto.getStoId());
            if(shaShippingAddressDto.getId() != null){
                responseDto.setSuccess(true);
                responseDto.setContent(shaShippingAddressDto);
            }else{
                responseDto.setSuccess(false);
            }
        }else{
            responseDto.setSuccess(false);
        }

        return responseDto;
    }
    @PostMapping("/addAddress")
    public ResponseDto addAddress(@RequestBody ShaShippingAddressDto shaShippingAddressDto){
        ResponseDto responseDto = new ResponseDto();
        int id = shaShippingAddressService.save(shaShippingAddressDto);
        shaShippingAddressDto.setId(id);
        responseDto.setContent(shaShippingAddressDto);
        return responseDto;
    }
}
