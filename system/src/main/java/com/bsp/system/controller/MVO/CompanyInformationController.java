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
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/CompanyInformationController")
public class CompanyInformationController {
    @Resource
    private ManManufacturerService manManufacturerService;
    @PostMapping("/getCompanyInfo")
    public ResponseDto getCompanyInfo(@RequestBody ManManufacturerDto manManufacturerDto){
        ResponseDto responseDto = new ResponseDto();
        ManManufacturer manManufacturer = manManufacturerService.selectByPrimaryKey(manManufacturerDto);
        if (manManufacturer != null){
            responseDto.setSuccess(false);
        }else{
            responseDto.setSuccess(true);
            responseDto.setContent(manManufacturer);
        }
        return responseDto;
    }
    @PostMapping("/saveCompanyInfo")
    public ResponseDto saveCompanyInfo(@RequestBody ManManufacturerDto manManufacturerDto) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ResponseDto responseDto = new ResponseDto();

        int result = manManufacturerService.save(manManufacturerDto);
        if(result == 0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setSuccess(true);
        }
        return responseDto;
    }
}
