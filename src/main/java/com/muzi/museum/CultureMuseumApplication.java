package com.muzi.museum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.muzi.museum"})
public class CultureMuseumApplication {

    public static void main(String[] args) {
        SpringApplication.run(CultureMuseumApplication.class, args);
    }

}
