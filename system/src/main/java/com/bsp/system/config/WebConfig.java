package com.bsp.system.config;

import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

import javax.annotation.Resource;

/**
 * Created by LSK.Reno on 2020/7/6 8:30.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Resource
    private TokenInterceptor tokenInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenInterceptor).addPathPatterns("/**");
    }


    // 使用springboot开发接口，版本——2.1.3.RELEASE，需要接收json格式的字符串数据，
    // json串中只有大括号时还正常，没有400，
    // 但是在传json数组时，带有中括号[]，拦截器都不进就直接400，
    // 经过一阵排查，json格式等都没有问题。
    // 最后得知Tomcat的高版本（具体从哪个版本开始没有具体了解）中增加了一个新特性，
    // 就是严格按照 RFC 3986规范进行访问解析，而 RFC 3986规范规定Url中
    // 只允许包含英文字母（a-zA-Z）、数字（0-9）、-_.~4个特殊字符
    // 以及所有保留字符(RFC3986中指定了以下字符为保留字符：! * ’ ( ) ; : @ & = + $ , / ? # [ ])。
    //那解决办法有两种，转义和配置Tomcat
    @Bean
    public ServletWebServerFactory webServerFactory() {
        TomcatServletWebServerFactory fa = new TomcatServletWebServerFactory();
        fa.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> connector.setProperty("relaxedQueryChars", "[]{}"));
        return fa;
    }

}
