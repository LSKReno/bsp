package com.bsp.system.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bsp.server.dto.ResponseDto;
import com.bsp.server.dto.SysUserDto;
import com.bsp.server.dto.UllUserLoginLogoutLogDto;
import com.bsp.server.service.SysUserService;
import com.bsp.server.service.UllUserLoginLogoutLogService;
import com.bsp.server.util.ValidatorUtil;
import com.bsp.system.config.JwtConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

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

    @Resource
    private UllUserLoginLogoutLogService ullUserLoginLogoutLogService;

    /**
     * 注册
     */
    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SysUserDto sysUserDto) {
        LOG.info("用户注册开始");
        // 保存校验
        ValidatorUtil.length(sysUserDto.getUsername(), "用户名，唯一", 1, 255);
        ValidatorUtil.length(sysUserDto.getPassword(), "密码", 1, 255);
        ValidatorUtil.require(sysUserDto.getRoleId(), "角色ID");
        ValidatorUtil.length(sysUserDto.getRoleId(), "角色ID", 1, 100);

        ResponseDto responseDto = new ResponseDto();
        SysUserDto signUpSysUserDto = sysUserService.signup(sysUserDto);

        responseDto.setContent(signUpSysUserDto);
        return responseDto;
    }

    /**
     * 登录
     */
    @PostMapping("/login")
    public ResponseDto login(@RequestBody SysUserDto sysUserDto, HttpServletRequest request) {
        LOG.info("用户登录开始");
        // 保存校验
        ValidatorUtil.length(sysUserDto.getUsername(), "用户名，唯一", 1, 255);
        ValidatorUtil.length(sysUserDto.getPassword(), "密码", 1, 255);
        ResponseDto responseDto = new ResponseDto();
        SysUserDto loginSysUserDto = sysUserService.login(sysUserDto);

        JSONObject json = (JSONObject) JSONObject.toJSON(loginSysUserDto);
        json.remove("password");

        JSONObject tokenPayload = new JSONObject();
        tokenPayload.put("userId", loginSysUserDto.getUserId());
        tokenPayload.put("username", loginSysUserDto.getUsername());
        tokenPayload.put("roleId", loginSysUserDto.getRoleId());

        // 准备生成个 JWT 放进 传输对象
        String token = jwtConfig.createToken(JSON.toJSONString(tokenPayload));

        // 记录
        ullUserLoginLog(loginSysUserDto, token);

        if (!StringUtils.isEmpty(token)) {
            json.put("token", token);
        }

        responseDto.setContent(json);
        return responseDto;
    }

    /**
     * 登出(必须有token)
     */
    @PostMapping("/logout")
    public ResponseDto logout(@RequestBody SysUserDto sysUserDto, HttpServletRequest request) {
        LOG.info("用户登出开始");
        ResponseDto responseDto = new ResponseDto();
        // 记录
        ullUserLogoutLog(request);

        responseDto.setContent("logout successfully");
        return responseDto;
    }

    // 记录login
    private void ullUserLoginLog(SysUserDto sysUserDto, String token){
        //  登录log记录, 由于token的生成位置，只能将记录放在controller
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        UllUserLoginLogoutLogDto ullUserLoginLogoutLogDto = new UllUserLoginLogoutLogDto();
        ullUserLoginLogoutLogDto.setUsiId(String.valueOf(sysUserDto.getUserId()));
        ullUserLoginLogoutLogDto.setToken(token);
        ullUserLoginLogoutLogDto.setTerminalType("2"); //终端版本类别 1-APP 2-web
        ullUserLoginLogoutLogDto.setOperatingType("1"); //1-login 2-logout
        ullUserLoginLogoutLogDto.setOperatingDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(currentTime));
        ullUserLoginLogoutLogDto.setCreatedBy(String.valueOf(sysUserDto.getUserId()));
        ullUserLoginLogoutLogDto.setCreationDate(currentTime);
        ullUserLoginLogoutLogDto.setLastUpdateBy(String.valueOf(sysUserDto.getUserId()));
        ullUserLoginLogoutLogDto.setLastUpdateDate(currentTime);
        ullUserLoginLogoutLogDto.setDeleted(0);

        ullUserLoginLogoutLogService.save(ullUserLoginLogoutLogDto);
    }

    // 记录logout
    private void ullUserLogoutLog(HttpServletRequest request){
        String token = request.getHeader(jwtConfig.getHeader());
        String jsonStringToken = jwtConfig.getSubjectFromToken(token);
        JSONObject jsonToken = JSON.parseObject(jsonStringToken);
        //  登录log记录, 由于token的生成位置，只能将记录放在controller
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        UllUserLoginLogoutLogDto ullUserLoginLogoutLogDto = new UllUserLoginLogoutLogDto();
        ullUserLoginLogoutLogDto.setUsiId(jsonToken.getString("userId"));
        ullUserLoginLogoutLogDto.setToken(token);
        ullUserLoginLogoutLogDto.setTerminalType("2"); //终端版本类别 1-APP 2-web
        ullUserLoginLogoutLogDto.setOperatingType("2"); //1-login 2-logout
        ullUserLoginLogoutLogDto.setOperatingDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(currentTime));
        ullUserLoginLogoutLogDto.setCreatedBy(jsonToken.getString("userId"));
        ullUserLoginLogoutLogDto.setCreationDate(currentTime);
        ullUserLoginLogoutLogDto.setLastUpdateBy(jsonToken.getString("userId"));
        ullUserLoginLogoutLogDto.setLastUpdateDate(currentTime);
        ullUserLoginLogoutLogDto.setDeleted(0);

        ullUserLoginLogoutLogService.save(ullUserLoginLogoutLogDto);
    }

}
