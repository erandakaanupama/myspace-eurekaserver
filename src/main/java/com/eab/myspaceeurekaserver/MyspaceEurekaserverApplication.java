package com.eab.myspaceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyspaceEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspaceEurekaserverApplication.class, args);
	}

}
