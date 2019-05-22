package com.muzi.museum.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/**
 * Package:com.muzi.museum.config
 * Description:配置MVC默认访问路径拦截器，配置Spring Boot的映射
 * Author:MUZI
 * Date:Create int 2019/5/19 8:33
 * Company:帆行
 * Copyright:Copyright(c)2019
 * Version：1.0.0
 * Modified By:MUZI
 */
@Configuration
public class DefaultView implements WebMvcConfigurer {
    //从配置文件中获取到上传文件的保存地址
    @Value("${upload.video-path}")
    private String videoPath;
    //设置默认的访问路径，如http://Localhost:8080 直接访问的是Login2的页面
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/").setViewName("login2");
            registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }


    /**
     * @param registry
     * 访问/static/** 对应的是/static/文件夹下面的静态资源文件
     * 访问/video/** 对应的是/F:video/文件夹下面的静态资源文件
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/video/**").addResourceLocations("file:"+videoPath);
    }

}
