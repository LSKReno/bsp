package com.bsp.system.controller.parameter;

import com.bsp.server.domain.ParParameter;
import com.bsp.server.dto.ParParameterDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.ParParameterService;
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
    @RequestMapping("/getParameterList")
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
    @RequestMapping("/saveParameter")
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
    @RequestMapping("/removeParameter")
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
