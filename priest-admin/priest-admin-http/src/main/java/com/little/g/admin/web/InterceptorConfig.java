package com.little.g.admin.web;

import com.little.g.admin.web.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by lengligang on 2019/3/25.
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/h_layout/**")
                .excludePathPatterns("/jsp/**")
                .excludePathPatterns("/error")
                .excludePathPatterns("/404")
                .excludePathPatterns("/images/**")
                .excludePathPatterns("/js/**")
                .excludePathPatterns("/css/**")
                .excludePathPatterns("/layui/**")
                .excludePathPatterns("/layer/**")
                .excludePathPatterns("/startbootstrap/**")
                .excludePathPatterns("/admin/login")
                .excludePathPatterns("/admin/login1")
                ;
    }
    @Bean
    public LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }

}
