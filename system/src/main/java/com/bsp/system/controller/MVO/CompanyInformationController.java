package com.bsp.system.controller.MVO;

import com.bsp.server.domain.ManManufacturer;
import com.bsp.server.dto.ManManufacturerDto;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.service.ManManufacturerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/CompanyInformationController")
public class CompanyInformationController {
    @Resource
    private ManManufacturerService manManufacturerService;
    @PostMapping("/getCompanyInfo")
    public ResponseDto getCompanyInfo(@RequestBody PageDto pageDto){
        ResponseDto responseDto = new ResponseDto();
        manManufacturerService.list(pageDto);
        return responseDto;
    }
}
