package com.rakharafifa.servicestock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServicestockApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicestockApplication.class, args);
	}

}
