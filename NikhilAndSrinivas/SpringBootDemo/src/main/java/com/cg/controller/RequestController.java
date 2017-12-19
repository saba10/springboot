package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class RequestController{
	
	
	@RequestMapping("/")
	public String requestMethod(){
		
		
		
		return "Hello Capgemini";
		
		
		
	}

	
	

}
