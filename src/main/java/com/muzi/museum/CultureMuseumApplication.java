package com.muzi.museum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan({"com.muzi.museum.dao"})
@EnableCaching//启动缓存
@EnableJpaAuditing

public class CultureMuseumApplication {
    public static void main(String[] args) {
        SpringApplication.run(CultureMuseumApplication.class, args);
    }

}
