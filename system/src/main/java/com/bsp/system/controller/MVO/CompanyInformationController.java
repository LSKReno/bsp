package com.bsp.system.controller.MVO;

import com.alibaba.fastjson.JSON;
import com.bsp.server.domain.ManManufacturer;
import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.*;
import com.bsp.server.service.ManManufacturerService;
import com.bsp.server.service.SysUserService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

@RestController
@RequestMapping("/CompanyInformationController")
public class CompanyInformationController {
    @Resource
    private ManManufacturerService manManufacturerService;
    @Resource
    private SysUserService sysUserService;
    @PostMapping("/getCompanyInfo")
    public ResponseDto getCompanyInfo(@RequestBody SysUserDto sysUserDto){
        ResponseDto responseDto = new ResponseDto();
//        ManManufacturer manManufacturer = manManufacturerService.selectByPrimaryKey(manManufacturerDto);
        if (sysUserDto.getManBuyerId() == null){
            responseDto.setSuccess(false);
        }else{
            ManManufacturer manManufacturer = manManufacturerService.selectByPrimaryKey(sysUserDto.getManBuyerId());
            if(manManufacturer != null){
                responseDto.setSuccess(true);
                responseDto.setContent(manManufacturer);
            }else{
                responseDto.setSuccess(false);
            }

        }
        return responseDto;
    }
    @PostMapping("/saveCompanyInfo")
    public ResponseDto saveCompanyInfo(@RequestBody Map<String,Object> request) throws ParseException {
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        ManManufacturerDto manManufacturerDto = JSON.parseObject(JSON.toJSONString(request.get("ManManufacturerDto")), ManManufacturerDto.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ResponseDto responseDto = new ResponseDto();
        if(StringUtils.isEmpty(manManufacturerDto.getManId())){
            int result = manManufacturerService.save(manManufacturerDto); // save for the first time
            if(result == 0){
                responseDto.setSuccess(false);
            }else{
                sysUserDto.setManBuyerId(result); //update
                if(sysUserService.save(sysUserDto) != 0){
                    responseDto.setSuccess(true);
                    responseDto.setContent(sysUserDto);
                }else{
                    responseDto.setSuccess(false);
                }
            }
        }else{
            int result = manManufacturerService.save(manManufacturerDto);
            if(result == 0){
                responseDto.setSuccess(false);
                responseDto.setContent(sysUserDto);
            }else{
                responseDto.setSuccess(true);
            }
        }

        return responseDto;
    }
}
