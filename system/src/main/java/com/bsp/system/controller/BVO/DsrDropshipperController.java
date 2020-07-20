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
//        DsrDropshipperDto dsrDropshipperDto = dsrDropshipperService.selectByPrimaryKey(sysUserDto1.getManBuyerId());

        if(sysUserDto1 == null){
            responseDto.setSuccess(false);
        }else {
            responseDto.setSuccess(true);
            responseDto.setContent(sysUserDto1);
        }
        return responseDto;
    }
    @PostMapping("/saveBVOInfo")
    public ResponseDto saveBVOInfo(@RequestBody Map<String, Object> request){
//        DsrDropshipperDto dsrDropshipperDto = JSON.parseObject(JSON.toJSONString(request.get("DsrDropshipperDto")), DsrDropshipperDto.class);
        System.out.println(request.toString());
        SysUserDto sysUserDto = JSON.parseObject(JSON.toJSONString(request.get("SysUserDto")), SysUserDto.class);
        String userId = JSON.parseObject(JSON.toJSONString(request.get("userId")), String.class);
        SysUserDto sysUserDto1 = sysUserService.selectByPrimaryKey(sysUserDto.getUserId());
        System.out.println(sysUserDto.toString());
        System.out.println(userId);
        ResponseDto responseDto = new ResponseDto();
//        if(sysUserDto1.getManBuyerId() == null){
//            DsrDropshipperDto dsrDropshipperDto = new DsrDropshipperDto();
//            dsrDropshipperDto.setName(sysUserDto.getName());
//            dsrDropshipperDto.setRemark(null);
//            dsrDropshipperDto.setStsCd("0");
//            dsrDropshipperDto.setCallCnt(0);
//            dsrDropshipperDto.setDeleted(0);
//            dsrDropshipperDto.setLastUpdateBy(sysUserDto.getName());
//            dsrDropshipperDto.setCreatedBy(sysUserDto.getName());
//            int result1 = dsrDropshipperService.save(dsrDropshipperDto);
//            if(result1 == 0){
//                responseDto.setSuccess(false);
//            }else{
//                sysUserDto.setManBuyerId(result1);
                if(sysUserService.save(sysUserDto) != 0){ //update sysuser
                    responseDto.setSuccess(true);
                    responseDto.setContent(sysUserDto);
                }else{
                    responseDto.setSuccess(false);
                }
//            }

//        }else{
//            DsrDropshipperDto dsrDropshipperDto = dsrDropshipperService.selectByPrimaryKey(sysUserDto.getManBuyerId());
//            dsrDropshipperDto.setName(sysUserDto.getUsername());
//            int result = dsrDropshipperService.save(dsrDropshipperDto);
//            if(result == 0){
//                responseDto.setSuccess(false);
//            }else{
//                if(sysUserService.save(sysUserDto) != 0){ //update sysuser
//                    responseDto.setSuccess(true);
//                    responseDto.setContent(sysUserDto);
//                }else{
//                    responseDto.setSuccess(false);
//                }
//            }
//        }
        return responseDto;
    }
}
