package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cg.entity.CustomerFeedback;
import com.cg.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public CustomerFeedback saveData(CustomerFeedback customer) {
		return customerRepository.save(customer);
	}

	public List<CustomerFeedback> getData(String productId) {
		return customerRepository.findByProductId(productId);
	}

}
