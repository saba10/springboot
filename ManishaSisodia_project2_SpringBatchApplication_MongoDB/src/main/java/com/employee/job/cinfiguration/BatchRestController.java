package com.employee.job.cinfiguration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchRestController {
	
	@Autowired
	JobLauncher jobLauncher;
	
	@Autowired
	Job job;

	@GetMapping("/run")
	public String startBatch(@RequestParam String path) throws Exception{
		System.out.println("Path: "+path);
		
JobParameters jobParameters = new JobParametersBuilder().addString("path", path).toJobParameters();
//		JobParameters jobParameters =
//				  new JobParametersBuilder()
//				  .addLong("time",System.currentTimeMillis()).toJobParameters();
//
				JobExecution execution = jobLauncher.run(job, jobParameters);
//jobLauncher.run(job, jobParameters);
		System.out.println("Exit Status : " + execution.getStatus());
		
		return "started";
	}
//
////	  try {
//		JobParameters jobParameters =
//		  new JobParametersBuilder()
//		  .addLong("time",System.currentTimeMillis()).toJobParameters();
//
//		JobExecution execution = jobLauncher.run(job, jobParameters);
//		System.out.println("Exit Status : " + execution.getStatus());
////
////	  } catch (Exception e) {
////		e.printStackTrace();
////	  }

}
