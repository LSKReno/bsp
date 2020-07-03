package com.bsp.system.controller.BVO;

import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.PageDto;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.StrStoreDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.StrStoreService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/StrStoreController")
public class StrStoreController {
    @Resource
    private StrStoreService strStoreService;
    @RequestMapping("/getOnlineStores")
    public ResponseDto getOnlineStores(@RequestBody SysUserDto sysUserDto){
        ResponseDto responseDto = new ResponseDto();
        if(sysUserDto.getManBuyerId() == null){
            responseDto.setSuccess(false);
        }else{
            List<StrStoreDto> strStoreDtoList = strStoreService.selectByDSRId(sysUserDto.getManBuyerId());
        }
        return responseDto;
    }
}
