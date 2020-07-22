package com.bsp.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysRoleDto;
import com.bsp.server.service.SysRoleService;
import com.bsp.server.util.ValidatorUtil;
import com.bsp.system.config.JwtConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by LSK.Reno on 2020/7/22 12:03.
 */
@RestController
public class RoleController {
    private static final Logger LOG = LoggerFactory.getLogger(RoleController.class);

    @Resource
    private JwtConfig jwtConfig;

    @Resource
    private SysRoleService sysRoleService;

    /**
     * 用户角色查询
     */
    @PostMapping("/role")
    public ResponseDto getRole() {
        ResponseDto responseDto = new ResponseDto();
        JSONObject resObject = new JSONObject();
        sysRoleService.list(resObject);
        responseDto.setContent(resObject);
        return responseDto;
    }

    /**
     * 用户角色更新
     */
    @PostMapping("/role/update")
    public ResponseDto updateRole(SysRoleDto sysRoleDto) {
        // 保存校验
        ValidatorUtil.require(sysRoleDto.getId(), "角色ID");
        ValidatorUtil.length(sysRoleDto.getRoleName(), "角色名称", 1, 255);

        ResponseDto responseDto = new ResponseDto();
        sysRoleService.save(sysRoleDto);
        responseDto.setContent(sysRoleDto);
        return responseDto;
    }

    /**
     * 用户权限更新
     */
    @PostMapping("/permission/update")
    public ResponseDto updatePermission(@RequestBody Map<String, String> params) {
        ResponseDto responseDto = new ResponseDto();
        System.out.println("=============");
        System.out.println(params);

        responseDto.setContent("success");
        return responseDto;
    }
}
