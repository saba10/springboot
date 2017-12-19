package com.employee.job.cinfiguration;

import java.io.File;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.data.MongoItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.employee.model.Employee;




@Configuration
@EnableBatchProcessing
public class CsvToMongoJob {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Bean
	public Job readCSVFile() {
		return jobBuilderFactory.get("readCSVFile").start(step1())
				.listener(jobCompletionNotificationListener()).build();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<Employee, Employee>chunk(10).reader(reader()).writer(writer()).build();
	}
	
	@Bean
	JobExecutionListener jobCompletionNotificationListener(){
		return new JobCompletionNotificationListener();
	}

	@Bean
	public FlatFileItemReader<Employee> reader() {
//		//Access -> String path = jobParameters.getString("path");
//		String path = "C:\\Users\\msisodia\\Documents\\Workspace(new)\\SpringBatchApplicationMySQLtoCSV";
//		Resource resource = new FileSystemResource(new File(path));
		FlatFileItemReader<Employee> reader = new FlatFileItemReader<>();
		reader.setResource(new ClassPathResource("employee.csv"));
//		reader.setResource(resource);
		reader.setLineMapper(new DefaultLineMapper<Employee>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames(new String[] { "id", "name", "address", "email", "gender", "mobile" });

					}
				});
				setFieldSetMapper(new BeanWrapperFieldSetMapper<Employee>() {
					{
						setTargetType(Employee.class);
					}
				});
			}
		});
		return reader;
	}

	@Bean
	public MongoItemWriter<Employee> writer() {
		MongoItemWriter<Employee> writer = new MongoItemWriter<Employee>();
		writer.setTemplate(mongoTemplate);
		writer.setCollection("employee");
		return writer;
	}

}
