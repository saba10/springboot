package com.capgemini.bean;

public class ProductCatalog {

	
	private String catagoryName;
	public String productName;
	private String productIdParent;
	private String productIdChild;
	private String price;
	private String imageUrl;

	public String getCatagoryName() {
		return catagoryName;
	}

	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductIdParent() {
		return productIdParent;
	}

	public void setProductIdParent(String productIdParent) {
		this.productIdParent = productIdParent;
	}

	public String getProductIdChild() {
		return productIdChild;
	}

	public void setProductIdChild(String productIdChild) {
		this.productIdChild = productIdChild;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


}