package com.muzi.museum.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DefaultView implements WebMvcConfigurer {
    protected static final Logger logger = LoggerFactory.getLogger(DefaultView.class);

    @Value("${upload.video-path}")
    private String videoPath;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/").setViewName("login2");
            registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
            logger.info("called default page index");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/video/**").addResourceLocations("file:"+videoPath);
        LoggerFactory.getLogger(this.getClass().getName()).info("file:"+videoPath);
    }

}
