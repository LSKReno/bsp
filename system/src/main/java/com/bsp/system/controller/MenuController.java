package com.bsp.system.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.domain.SysUser;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysMenuDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.SysMenuService;
import com.bsp.server.util.ValidatorUtil;
import com.bsp.system.config.JwtConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by LSK.Reno on 2020/7/7 15:46.
 */
@RestController
@RequestMapping("/auth")
public class MenuController {

    private static final Logger LOG = LoggerFactory.getLogger(MenuController.class);

    @Resource
    private JwtConfig jwtConfig;

    @Resource
    private SysMenuService sysMenuService;

    /**
     * 获取菜单
     */
    @PostMapping("/menu")
    public ResponseDto getMenu(HttpServletRequest request) {
        String token = request.getHeader(jwtConfig.getHeader());
        String tokenJSONString = jwtConfig.getSubjectFromToken(token);

        JSONObject userInfo = JSONObject.parseObject(tokenJSONString);

        Integer userId = (Integer) userInfo.get("userId");

        ResponseDto responseDto = new ResponseDto();
        JSONArray sysMenuDtoList = sysMenuService.getMenuByRights(userId);

        responseDto.setContent(sysMenuDtoList);
        return responseDto;
    }


}
