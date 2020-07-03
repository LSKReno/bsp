package com.bsp.system.controller.BVO;

import com.bsp.server.domain.DsrDropshipper;
import com.bsp.server.dto.DsrDropshipperDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.DsrDropshipperService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/DsrDropshipperController")
public class DsrDropshipperController {
    @Resource
    private DsrDropshipperService dsrDropshipperService;
    @RequestMapping("/getBVOInfo")
    public ResponseDto getBVOInfo(@RequestBody SysUserDto sysUserDto){
        ResponseDto responseDto = new ResponseDto();
        DsrDropshipper dsrDropshipper = dsrDropshipperService.selectByPrimaryKey(sysUserDto.getManBuyerId());
        if(dsrDropshipper == null){
            responseDto.setSuccess(false);
        }else {
            responseDto.setSuccess(true);
            responseDto.setContent(dsrDropshipper);
        }
        return responseDto;
    }
    @RequestMapping("/saveBVOInfo")
    public ResponseDto saveBVOInfo(@RequestBody DsrDropshipperDto dsrDropshipperDto){
        ResponseDto responseDto = new ResponseDto();
        int result = dsrDropshipperService.save(dsrDropshipperDto);
        if(result == 0){
            responseDto.setSuccess(false);
        }else{
            responseDto.setSuccess(true);
        }
        return responseDto;
    }
}
