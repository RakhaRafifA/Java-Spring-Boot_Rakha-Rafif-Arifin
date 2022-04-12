package com.rakharafifa.serviceuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceuserApplication.class, args);
	}

}
