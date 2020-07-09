package com.bsp.system.controller;

import com.alibaba.fastjson.JSONArray;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysMenuDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.service.SysMenuService;
import com.bsp.server.util.ValidatorUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LSK.Reno on 2020/7/7 15:46.
 */
@RestController
public class MenuController {

    private static final Logger LOG = LoggerFactory.getLogger(MenuController.class);

    @Resource
    private SysMenuService sysMenuService;

    /**
     * 获取菜单
     */
    @PostMapping("/menu")
    public ResponseDto getMenu(@RequestBody SysUserDto sysUserDto) {
        // 保存校验
        ValidatorUtil.require(sysUserDto.getUserId(), "主键");

        ResponseDto responseDto = new ResponseDto();
        JSONArray sysMenuDtoList = sysMenuService.getMenuByRights(sysUserDto);

        responseDto.setContent(sysMenuDtoList);
        return responseDto;
    }


}
