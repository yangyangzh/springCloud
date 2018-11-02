package com.yyzhai.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNode1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNode1Application.class, args);
	}
}
