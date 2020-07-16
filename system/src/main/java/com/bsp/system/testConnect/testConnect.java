package com.bsp.system.testConnect;

import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testConnect {
    @PostMapping("/testPost")
    public ResponseDto testPost(@RequestBody SysUserDto sysUserDto){
        System.out.println(sysUserDto.toString());
        return new ResponseDto();
    }
}
