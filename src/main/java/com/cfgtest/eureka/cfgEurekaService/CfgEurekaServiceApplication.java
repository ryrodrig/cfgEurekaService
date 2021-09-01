package com.cfgtest.eureka.cfgEurekaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// Starts a Eureka service registry and discovery service.
// Standup a Eureka registry with which other services can register
@EnableEurekaServer
@SpringBootApplication
public class CfgEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfgEurekaServiceApplication.class, args);
	}

}
