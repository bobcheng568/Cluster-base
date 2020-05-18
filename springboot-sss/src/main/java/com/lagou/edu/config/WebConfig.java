package com.lagou.edu.config;

import com.lagou.edu.interceptor.LoginInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author bobcheng
 * @date 2020/5/18
 */
@Slf4j
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public LoginInterceptor loginInterceptor() {
        return new LoginInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /* 登录拦截器； */
        registry.addInterceptor(loginInterceptor()).excludePathPatterns(getExcludedUrlsForLogin());
    }

    /**
     * 登录拦截器，不需要拦截的请求地址；
     */
    private String[] getExcludedUrlsForLogin() {
        return new String[]{
                /* 过滤监控请求 */
                "/login/*"
        };
    }

}
