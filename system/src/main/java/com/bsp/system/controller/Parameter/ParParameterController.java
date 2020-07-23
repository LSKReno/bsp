package com.bsp.system.controller.Parameter;

import com.alibaba.fastjson.JSON;
import com.bsp.server.dto.ParParameterDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.ParParameterService;
import com.bsp.server.service.SysUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/parameterController")
public class ParParameterController {
    @Resource
    private ParParameterService parParameterService;
    @Resource
    private SysUserService sysUserService;
    @PostMapping("/getParameterList")
    public ResponseDto getParameterList(@RequestBody SysUserDto sysUserDto){
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto.getRights().equals("1")){
            List<ParParameterDto> parParameterDtoList = parParameterService.selectAll();
            System.out.println(parParameterDtoList.toString());
            responseDto.setSuccess(true);
            responseDto.setContent(parParameterDtoList);
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
    @PostMapping("/saveParameter")
    public ResponseDto saveParameter(@RequestBody Map<String, Object> request){
        ResponseDto responseDto = new ResponseDto();
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
        ParParameterDto parParameterDto = JSON.parseObject(JSON.toJSONString(request.get("ParParameterDto")), ParParameterDto.class);
        parParameterDto.setLastUpdateBy(sysUserDto1.getUsername());
        if(parParameterDto.getParId() == null){
            parParameterDto.setCreatedBy(sysUserDto1.getUsername());
        }
        parParameterDto.setCallCnt(0);
        parParameterDto.setDeleted(0);
        parParameterDto.setStsCd("0");
        System.out.println(parParameterDto.toString());
        int result = parParameterService.save(parParameterDto);
        if(result >0){
            responseDto.setSuccess(true);
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
    @PostMapping("/removeParameter")
    public ResponseDto removeParameter(@RequestBody ParParameterDto parParameterDto){
        ResponseDto responseDto = new ResponseDto();
        int result = parParameterService.delete(parParameterDto.getParId());
        if(result >0){
            responseDto.setSuccess(true);
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
}
