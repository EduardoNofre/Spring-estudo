package com.estudo.spring.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.estudo.spring.controller"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());

	}

    private ApiInfo apiInfo() {
	return new ApiInfo("API Finalidade Estudo iniciantes", " Estudo Java Spring ", "1.0.0", null, new Contact("Eduardo Nofre", null, "nofrereis@gmail.com"), "Proprietary Software: Nofre Reis S.A", null, Collections.emptyList());
    }
}
