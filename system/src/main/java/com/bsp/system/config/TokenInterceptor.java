package com.bsp.system.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.SignatureException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LSK.Reno on 2020/7/6 8:26.
 */
@Component
public class TokenInterceptor extends HandlerInterceptorAdapter {

    @Resource
    private JwtConfig jwtConfig;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws SignatureException {
        /** 地址过滤 */
        String uri = request.getRequestURI();
        if (uri.contains("/login") || uri.contains("/signup") || uri.contains("/kaptcha/image-code")) {
            return true;
        }

        /** Token 验证 */
        String token = request.getHeader(jwtConfig.getHeader());
        if (StringUtils.isEmpty(token)) {
            token = request.getParameter(jwtConfig.getHeader());
        }
        if (StringUtils.isEmpty(token)) {
            throw new SignatureException(jwtConfig.getHeader() + "不能为空");
        }

        Claims claims = null;
        try {
            claims = jwtConfig.getTokenClaim(token);
            if (claims == null || jwtConfig.isTokenExpired(claims.getExpiration())) {
                throw new SignatureException(jwtConfig.getHeader() + "失效，请重新登录。");
            }
        } catch (Exception e) {
            throw new SignatureException(jwtConfig.getHeader() + "失效，请重新登录。");
        }
        //该token可用，放行
        return true;
    }
}
