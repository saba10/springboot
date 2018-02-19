package com.cg.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NotificationManagement {

	public static void main(String[] args) {
		SpringApplication.run(NotificationManagement.class, args);
	}
}
