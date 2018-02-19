package com.capgemini.bean;

public class Order {
	
		private String productId;
		private String productName;
		private String productPrice;
		private int quantity;
		private int orderNumber;
		private String orderDate;

		public String getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public int getOrderNumber() {
			return orderNumber;
		}

		public void setOrderNumber(int i) {
			this.orderNumber = i;
		}

		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(String productPrice) {
			this.productPrice = productPrice;
		}
	}