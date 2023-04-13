package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan(basePackages="com.project.*")
@EntityScan(basePackages="com.project.*")
@EnableJpaRepositories(basePackages="com.project.*")
@Configuration
@EnableWebMvc
public class ComputerseekhoApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(ComputerseekhoApplication.class, args);
		
	}

//@Configuration
//@EnableWebMvc
// class CorsConfiguration implements WebMvcConfigurer {
//
//  @Override
//  public void addCorsMappings(CorsRegistry registry) {
//    registry.addMapping("/**")
//      .allowedOrigins("http://localhost:3007")
//      .allowedMethods("*")
//      .allowedHeaders("*")
//      .allowCredentials(true);
//  }
}




