package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.constant.URLConstant;
import com.capgemini.entity.OrderDetailsEntity;
import com.capgemini.entity.OrderEntity;
import com.capgemini.entity.OrderStatus;
import com.capgemini.repo.OrderRepo;
import com.cg.notification.Notification;
import com.cg.notification.NotificationType;
import com.cg.notification.RecipientType;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public OrderEntity saveOrder(OrderEntity entity) {

		List<OrderDetailsEntity> od = entity.getOrderDetails();
		OrderEntity oe = new OrderEntity(entity.getOrderId(), entity.getUserId(), entity.getStatus(),
				new ArrayList<>());
		od.forEach(item -> {
			System.err.println(item);
			oe.getOrderDetails().add(item);
		});
		orderRepo.save(oe);
		Notification body = new Notification();
		body.setComment("Order placed");
		body.setRecipientId(String.valueOf(oe.getUserId()));
		body.setRecipientType(RecipientType.EMAIL);
		body.setNotificationType(NotificationType.SUCCESS);
		HttpEntity<Notification> httpEntity = new HttpEntity<Notification>(body);
		ResponseEntity<Notification> r = restTemplate.postForEntity(URLConstant.GET_Notification, httpEntity, Notification.class);
		return oe;
	}


	@Override
	public OrderEntity updateOrders(OrderEntity entity) {
		return orderRepo.save(entity);
	}

	@Override
	public List<OrderEntity> getAll() {
		return orderRepo.findAll();
	}

	@Override
	public OrderEntity getOrdersByOrderId(Long orderId) {
		return orderRepo.findByOrderId(orderId);
	}

	@Override
	public List<OrderEntity> getOrdersByUserId(Long userId) {
		return orderRepo.findByUserId(userId);
	}

	@Override
	public List<OrderEntity> getOrdersByStatus(Long userId, OrderStatus status) {
		return orderRepo.findByUserIdAndStatus(userId, status);
	}

}
