package com.employee.job.cinfiguration;

import org.springframework.batch.core.JobExecution;

import org.springframework.batch.core.JobExecutionListener;

import org.springframework.web.client.RestTemplate;

import com.employee.model.Employee;

public class JobCompletionNotificationListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {

	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("CSV to MONGO Job Completed....!");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
}
