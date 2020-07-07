package com.bsp.system.controller.BVO;

import com.alibaba.fastjson.JSON;
import com.bsp.server.domain.DsrDropshipper;
import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.DsrDropshipperDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.DsrDropshipperService;
import com.bsp.server.service.SysUserService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/DsrDropshipperController")
public class DsrDropshipperController {
    @Resource
    private DsrDropshipperService dsrDropshipperService;
    @Resource
    private SysUserService sysUserService;
    @PostMapping("/getBVOInfo")
    public ResponseDto getBVOInfo(@RequestBody SysUserDto sysUserDto){
        ResponseDto responseDto = new ResponseDto();
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
        DsrDropshipper dsrDropshipper = dsrDropshipperService.selectByPrimaryKey(sysUserDto1.getManBuyerId());
        if(dsrDropshipper == null){
            responseDto.setSuccess(false);
        }else {
            responseDto.setSuccess(true);
            responseDto.setContent(dsrDropshipper);
        }
        return responseDto;
    }
    @PostMapping("/saveBVOInfo")
    public ResponseDto saveBVOInfo(@RequestBody Map<String, Object> request){
        DsrDropshipperDto dsrDropshipperDto = JSON.parseObject(JSON.toJSONString(request.get("DsrDropshipperDto")), DsrDropshipperDto.class);
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto1.getManBuyerId() == null){
            int result1 = dsrDropshipperService.save(dsrDropshipperDto);
            if(result1 == 0){
                responseDto.setSuccess(false);
            }else{
                sysUserDto1.setManBuyerId(result1);
                if(sysUserService.save(sysUserDto1) != 0){
                    responseDto.setSuccess(true);
                    responseDto.setContent(dsrDropshipperDto);
                }else{
                    responseDto.setSuccess(false);
                }
            }

        }else{
            int result = dsrDropshipperService.save(dsrDropshipperDto);
            if(result == 0){
                responseDto.setSuccess(false);
            }else{
                responseDto.setSuccess(true);
                responseDto.setContent(dsrDropshipperDto);
            }
        }

        return responseDto;
    }
}
