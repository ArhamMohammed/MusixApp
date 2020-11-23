package com.project.musix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.project.musixauth.config.JWTFilter;

@SpringBootApplication
@EnableEurekaClient
public class UserauthServiceApplication {

	@Bean
	public FilterRegistrationBean jwtFilter() {
		
		FilterRegistrationBean registrationbean = new FilterRegistrationBean();
		registrationbean.setFilter(new JWTFilter());
		registrationbean.addUrlPatterns("/api/auth/pro/*");
		return registrationbean;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(UserauthServiceApplication.class, args);
	}

}
