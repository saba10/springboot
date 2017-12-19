package com.cg.controller.MySampleApplication;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/getData/{name}")
	String showData(@PathVariable("name") String name) {
		
		return "Hello "+name;
	}
	
}
