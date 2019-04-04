package com.muzi.museum.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置类
 * @Author: muzi
 * @Date: 2018/9/17 13:43
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig{

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //只有加了ApiOperation注解的类，才生成接口文档
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //包下的类，生成接口文档
                .apis(RequestHandlerSelectors.basePackage("com.muzi.museum.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Culture Museum")
                .description("Museum")
                .version("1.0.0")
                .license("木子")
                .build();
    }

}
