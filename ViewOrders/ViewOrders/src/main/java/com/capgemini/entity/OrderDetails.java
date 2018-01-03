package com.capgemini.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails implements Serializable{
	
	@Id()	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private int productid;
	private int quantity;
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order1 order1;
	
	
	
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrderDetails(int id, int productid, int quantity, Order1 order1) {
		super();
		this.id = id;
		this.productid = productid;
		this.quantity = quantity;
		this.order1 = order1;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}

	public Order1 getOrder1() {
		return order1;
	}

	public void setOrder1(Order1 order1) {
		this.order1 = order1;
	}
	
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", productid=" + productid + ", quantity=" + quantity + ", order1=" + order1
				+ "]";
	}

	
	

}
