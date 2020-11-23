package com.team3.musixapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;    


//configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning
//Spring boot application for the purpose of handling the favorites section
@SpringBootApplication
@EnableEurekaClient


public class FavouriteModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavouriteModuleApplication.class, args);
	}

}
