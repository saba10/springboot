package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.dao.OrderDetailsDao;

@RestController
public class ViewOrdersController {

	@Autowired
	OrderDetailsDao dao;

	@RequestMapping("/")
	public String orderMthod() {
		return "Inside order management";
	}

	@RequestMapping("/getOrders")
	public String getOrders() {

		dao = new OrderDetailsDao();
		return dao.getOrders(1);
		//return "Akshay";
	}

}
