package com.team3.musixapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEurekaClient
@PropertySource("classpath:dbconfig.properties")
public class UserModule {
	
	public static void main(String[] args) {
		SpringApplication.run(UserModule.class, args);
	}

}


