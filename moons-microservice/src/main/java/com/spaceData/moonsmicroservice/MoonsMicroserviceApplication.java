package com.spaceData.moonsmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class MoonsMicroserviceApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(MoonsMicroserviceApplication.class, args);
	}

}
