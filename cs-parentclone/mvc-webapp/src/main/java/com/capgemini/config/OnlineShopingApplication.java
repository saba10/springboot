package com.capgemini.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author dimehta
 *
 */
@EnableDiscoveryClient
@EnableZuulProxy
@ComponentScan({"com.capgemini.serviceimpl","com.capgemini.config","com.capgemini.login.social.providers"})
@SpringBootApplication(scanBasePackages={"com.capgemini.config.WebRequestController"})
public class OnlineShopingApplication extends SpringBootServletInitializer {
	private static final Logger logger = LoggerFactory.getLogger(OnlineShopingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(OnlineShopingApplication.class, args);
		logger.info("Main call");
		
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		   RestTemplate rt = new RestTemplate();
			
	        rt.setRequestFactory( new HttpComponentsClientHttpRequestFactory() );
	        return rt;
	}
}
