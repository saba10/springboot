package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.entity.OrderEntity;
import com.capgemini.entity.OrderStatus;
import com.capgemini.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderManagementController {

	@Autowired
	private OrderService orderService;

	
	
	@PostMapping
	public OrderEntity save(@RequestBody OrderEntity entity) {
		return orderService.saveOrder(entity);
	}

	@PutMapping
	public OrderEntity updateOrders(@RequestBody OrderEntity entity) {
		return orderService.updateOrders(entity);
	}

	@GetMapping(value = "findall")
	public List<OrderEntity> getAll() {
		return orderService.getAll();
	}

	@GetMapping("byoid/{orderId}")
	public OrderEntity getOrdersByOrderId(@PathVariable Long orderId) {
		return orderService.getOrdersByOrderId(orderId);

	}

	@GetMapping(value = "byuserid", params = { "userid" })
	public List<OrderEntity> getOrdersByUserId(@RequestParam(value = "userid", required = true) Long userId) {
		return orderService.getOrdersByUserId(userId);
	}

	@GetMapping(value = "getCompletedOrdersByUserId/{userId}")
	public List<OrderEntity> getOrdersByOkStatus(@PathVariable Long userId) {
		return orderService.getOrdersByStatus(userId, OrderStatus.cancelled);
	}

	@GetMapping(value = "getOpenOrdersByUserId/{userId}")
	public List<OrderEntity> getOrdersByProgStatus(@PathVariable Long userId) {
		return orderService.getOrdersByStatus(userId, OrderStatus.inprogress);
	}
	
	
}