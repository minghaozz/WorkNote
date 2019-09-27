package com.zmh.note.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 张铭浩
 * @since 2019/8/22 13:55
 */

@Configuration
public class SwaggerConfig {
  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.zmh.note"))
        .paths(PathSelectors.any()).build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("zmh Manage Swagger RESTful APIs")
        .description("综合管理 Swagger API 服务")
        .termsOfServiceUrl("http://swagger.io/")
        .contact(new Contact("zmh", "127.0.0.1", "1095058962@qq.com"))
        .version("1.0")
        .build();

  }

}
