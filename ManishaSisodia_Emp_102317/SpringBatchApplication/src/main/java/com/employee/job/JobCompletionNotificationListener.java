package com.employee.job;

import java.io.File;

import org.springframework.batch.core.JobExecution;

import org.springframework.batch.core.JobExecutionListener;

import org.springframework.web.client.RestTemplate;

public class JobCompletionNotificationListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {

	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("JOB - MYSQL to CSV Completed");
		System.out.println("++++++++++++++++++++++++++++++");
//		RestTemplate restTemplate = new RestTemplate();
//		File file = new File("employee.csv");
//		
//		
//		String path = file.getAbsolutePath();
//		
//		System.out.println("+++++++++++++++++++++++++++++++++ PATH+++++++ ");
//		String status = restTemplate.getForObject("http://localhost:8888/run?path="+path,
//				String.class);
//		System.out.println("Job Status: "+ status);
		
	}
}
