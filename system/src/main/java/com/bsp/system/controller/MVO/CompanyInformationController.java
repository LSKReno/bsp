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
import java.util.Date;
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
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
        if (sysUserDto1.getManBuyerId() == null){
            responseDto.setSuccess(false);
        }else{
            ManManufacturerDto manManufacturerDto = manManufacturerService.selectByPrimaryKey(sysUserDto1.getManBuyerId());
            if(manManufacturerDto != null){
                responseDto.setSuccess(true);
                responseDto.setContent(manManufacturerDto);
            }else{
                responseDto.setSuccess(false);
            }

        }
        return responseDto;
    }
    @PostMapping("/saveCompanyInfo")
    public ResponseDto saveCompanyInfo(@RequestBody Map<String,Object> request) throws ParseException {
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
        ManManufacturerDto manManufacturerDto = JSON.parseObject(JSON.toJSONString(request.get("ManManufacturerDto")), ManManufacturerDto.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto1.getManBuyerId() == null){
            manManufacturerDto.setCreatedBy(sysUserDto1.getName());
            manManufacturerDto.setCreationDate(simpleDateFormat.format(new Date()));
            manManufacturerDto.setLastUpdateBy(sysUserDto1.getName());
            manManufacturerDto.setLastUpdateDate(simpleDateFormat.format(new Date()));
            manManufacturerDto.setCallCnt(0);
            manManufacturerDto.setStsCd("0");
            int result = manManufacturerService.save(manManufacturerDto); // save for the first time
            if(result == 0){
                responseDto.setSuccess(false);
            }else{
                sysUserDto1.setManBuyerId(result); //update
                if(sysUserService.save(sysUserDto1) != 0){
                    responseDto.setSuccess(true);
                    responseDto.setContent(sysUserDto1);
                }else{
                    responseDto.setSuccess(false);
                }
            }
        }else{
            ManManufacturerDto manManufacturerDto1 = manManufacturerService.selectByPrimaryKey(sysUserDto1.getManBuyerId());
            manManufacturerDto.setManId(manManufacturerDto1.getManId());
            System.out.println(manManufacturerDto.toString());
            manManufacturerDto.setLastUpdateBy(sysUserDto1.getName());
            manManufacturerDto.setLastUpdateDate(simpleDateFormat.format(new Date()));
            int result = manManufacturerService.save(manManufacturerDto);
            if(result == 0){
                responseDto.setSuccess(false);
                responseDto.setContent(sysUserDto1);
            }else{
                responseDto.setSuccess(true);
            }
        }

        return responseDto;
    }
}
