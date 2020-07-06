package com.bsp.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.SysUserService;
import com.bsp.system.config.JwtConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by LSK.Reno on 2020/7/5 23:38.
 */
@RestController
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Resource
    private JwtConfig jwtConfig;

    @Resource
    private SysUserService sysUserService;

    /**
     * 登录
     */
    @PostMapping("/login")
    public ResponseDto login(@RequestBody SysUserDto sysUserDto, HttpServletRequest request) {
        LOG.info("用户登录开始");
        JSONObject json = new JSONObject();

        ResponseDto responseDto = new ResponseDto();

        SysUserDto loginSysUserDto = sysUserService.login(sysUserDto);

        json.put("username", loginSysUserDto.getUserId());
        json.put("userId", loginSysUserDto.getUsername());
        json.put("email", loginSysUserDto.getEmail());

        // 准备生成个 JWT 放进 传输对象
        String token = jwtConfig.createToken(String.valueOf(loginSysUserDto.getUserId()));

        if (!StringUtils.isEmpty(token)) {
            json.put("token", token);
        }

        responseDto.setContent(json);
        return responseDto;
    }

}
