package com.muzi.museum;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.cache.RedisCacheManager;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.logging.Logger;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.muzi.museum"})
@MapperScan({"com.muzi.museum.dao"})
@EnableCaching//启动缓存
public class CultureMuseumApplication {
    public static void main(String[] args) {
        SpringApplication.run(CultureMuseumApplication.class, args);
    }

}
