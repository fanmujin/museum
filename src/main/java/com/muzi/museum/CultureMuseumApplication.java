package com.muzi.museum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.muzi.museum"})
@MapperScan({"com.muzi.museum.dao"})
@EnableCaching//启动缓存

public class CultureMuseumApplication {
    public static void main(String[] args) {
        SpringApplication.run(CultureMuseumApplication.class, args);
    }

}
