package com.capgemini.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 2405172041950251807L;
	@Id
	@GeneratedValue
	private Long orderId;

	private Long userId;

	private OrderStatus status;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "order_id")
	private List<OrderDetailsEntity> orderDetails = new ArrayList<>();

	public OrderEntity() {
	}

	public OrderEntity(Long orderId, Long userId, OrderStatus status, List<OrderDetailsEntity> orderDetails) {
		this.orderId = orderId;
		this.userId = userId;
		this.status = status;
		this.orderDetails = orderDetails;
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