package com.bsp.system.controller.Parameter;

import com.bsp.server.dto.ParParameterDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.ParParameterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/parameterController")
public class ParParameterController {
    @Resource
    private ParParameterService parParameterService;
    @PostMapping("/getParameterList")
    public ResponseDto getParameterList(@RequestBody SysUserDto sysUserDto){
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto.getRights().equals("1")){
            List<ParParameterDto> parParameterDtoList = parParameterService.selectAll();
            responseDto.setSuccess(true);
            responseDto.setContent(parParameterDtoList);
        }else{
            responseDto.setSuccess(false);
        }
        return responseDto;
    }
    @PostMapping("/saveParameter")
    public ResponseDto saveParameter(@RequestBody ParParameterDto parParameterDto){
        ResponseDto responseDto = new ResponseDto();
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
