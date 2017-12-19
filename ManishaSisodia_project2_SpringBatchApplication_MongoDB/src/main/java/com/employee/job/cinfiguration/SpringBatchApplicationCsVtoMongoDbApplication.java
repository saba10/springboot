package com.employee.job.cinfiguration;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication

public class SpringBatchApplicationCsVtoMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchApplicationCsVtoMongoDbApplication.class, args);
	}
	
}
