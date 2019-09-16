package com.demo.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
/**

 * @author YuxuanLi
 * @Description Swagger
 */

@Configuration

public class Swagger{



    @Bean

    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.demo.springdemo.controller"))
                .paths(PathSelectors.any())
                .build();

    }



    private ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档")
                .description("用户的增删改除")
                .version("1.0")
                .build();

    }

}
