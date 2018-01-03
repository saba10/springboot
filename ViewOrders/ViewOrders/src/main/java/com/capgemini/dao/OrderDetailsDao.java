package com.capgemini.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import com.capgemini.entity.Order1;

@Component
public class OrderDetailsDao {
	
	public String getOrders(int id) {
		
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();		
		session.beginTransaction();
		//Order order=(Order)session.get(Order.class, id);
		Order1 order=session.load(Order1.class, id);
		System.out.println("Order obj: "+ order);
		return order.toString();
	}
}
