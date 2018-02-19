package com.capgemini.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.OrderEntity;
import com.capgemini.entity.OrderStatus;

public interface OrderRepo extends JpaRepository<OrderEntity, Long> {

	public List<OrderEntity> findByUserIdAndStatus(Long userId, OrderStatus status);
	
	public OrderEntity findByOrderId(Long orderId);
	
	public List<OrderEntity> findByUserId(Long userId);

}
