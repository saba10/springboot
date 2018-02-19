package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.CustomerFeedback;
import com.cg.service.CustomerService;
import com.datastax.driver.core.utils.UUIDs;

@RestController
@RequestMapping("feedback")
public class FeedbackController {
	@Autowired
	CustomerService customerService;

	@PostMapping("create")
	public CustomerFeedback saveData(@RequestBody CustomerFeedback customer) {
		customer.setId(UUIDs.timeBased());
		return customerService.saveData(customer);
	}

	@GetMapping(value = "getbypid", params = { "productId" })
	public List<CustomerFeedback> getData(@RequestParam(value = "productId", required = true) String productId) {
		return customerService.getData(productId);
	}

}
