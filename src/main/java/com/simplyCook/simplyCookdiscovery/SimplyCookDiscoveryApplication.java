package com.simplyCook.simplyCookdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SimplyCookDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplyCookDiscoveryApplication.class, args);
	}

}
