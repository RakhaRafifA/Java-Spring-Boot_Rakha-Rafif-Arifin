package com.rakharafifa.serviceproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceproductApplication.class, args);
	}

}
