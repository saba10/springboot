package com.employee.job;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;

import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
//	@Autowired
//	public TaskletStep taskletStep;
	@Autowired
	public JobBuilderFactory jobBuilderFactory;
	@Autowired
	public StepBuilderFactory stepBuilderFactory;
	@Autowired
	public DataSource dataSource;

	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/empdb");
		dataSource.setUsername("root");
		dataSource.setPassword("JadooMani@1555");

		return dataSource;

	}

	@Bean
	public JdbcCursorItemReader<Employee> reader() {
		JdbcCursorItemReader<Employee> reader = new JdbcCursorItemReader<Employee>();
		reader.setDataSource(dataSource);
		reader.setSql("SELECT id,name,address,email,gender,mobile FROM employee");
		reader.setRowMapper(new EmployeeRowMapper());
		return reader;
	}

	public class EmployeeRowMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setId(rs.getLong("id"));
			employee.setName(rs.getString("name"));
			employee.setAddress(rs.getString("address"));
			employee.setGender(rs.getString("gender"));
			employee.setEmail(rs.getString("email"));
			employee.setMobile(rs.getInt("mobile"));

			return employee;

		}

		@Bean
		public Step step1() {
			return stepBuilderFactory.get("step1").<Employee, Employee>chunk(10).reader(reader()).processor(processor())
					.writer(writer()).build();

		}
		
		
//		@Bean
//		public Step step1() {
//			return stepBuilderFactory.get("step1").tasklet(taskletStep).build();
//		}

		@Bean
		public FlatFileItemWriter<Employee> writer() {
//			File file = new File("employee.csv");
			FlatFileItemWriter<Employee> writer = new FlatFileItemWriter<Employee>();
			writer.setResource(new ClassPathResource("employee.csv"));
			writer.setLineAggregator(new DelimitedLineAggregator<Employee>() {
				{

					setDelimiter(",");
					setFieldExtractor(new BeanWrapperFieldExtractor<Employee>() {
						{
							setNames(new String[] { "id", "name", "address", "email", "gender", "mobile" });
						}
					});

				}
			});

			return writer;

		}

		public EmployeeItemProcessor processor() {
			return new EmployeeItemProcessor();

		}
		
		
		@Bean
	    public JobExecutionListener listener() {
	        return new JobCompletionNotificationListener();
	    }
		
//		@Bean
//	    public TaskletStep taskletStep() {
//			return new TaskletStep();
//	    }
		
		@Bean
		public Job exportEmployeeJob() {
			return jobBuilderFactory.get("exportEmployeeJob").start(step1()).listener(listener())
					.build();
		}
	}

}
