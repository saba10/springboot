package com.capgemini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.bean.OrderDetailsEntity;
import com.capgemini.bean.OrderStatus;

public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 2405172041950251807L;
	
	private Long orderId;

	private Long userId;

	private OrderStatus status;

	
	private List<OrderDetailsEntity> orderDetails = new ArrayList<>();

	public OrderEntity() {
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderDetailsEntity> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetailsEntity> orderDetails) {
		this.orderDetails = orderDetails;
	}

	}