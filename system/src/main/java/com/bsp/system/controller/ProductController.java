package com.bsp.system.controller;

import com.bsp.server.dto.ManManufacturerDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.ProProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pro")
public class ProductController {
    @Resource
    private ProProductService proProductService;

    /**
     * 列表查询
     */
    @PostMapping("/listByManid")
    public ResponseDto listByManid(@RequestBody PageDto pageDto, @RequestBody ManManufacturerDto manManufacturerDto) {
        ResponseDto responseDto = new ResponseDto();
        proProductService.listByManid(pageDto,manManufacturerDto);
        if(pageDto.getTotal()==0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setCode("200");
        }
        responseDto.setContent(pageDto);
        return responseDto;
    }

}

