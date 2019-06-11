package com.jiraiya.agecategoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class AgeCategoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgeCategoryServiceApplication.class, args);
	}

}
