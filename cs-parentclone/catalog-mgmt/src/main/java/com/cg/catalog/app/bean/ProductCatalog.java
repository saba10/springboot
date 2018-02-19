package com.cg.catalog.app.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Catalog_Products")
public class ProductCatalog {

	@Id
	private String Id;

	private String catagoryName;
	private String productName;
	private String productIdParent;
	private String productIdChild;
	private String price;
	private String imageUrl;

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productIdParent
	 */
	public String getProductIdParent() {
		return productIdParent;
	}

	/**
	 * @param productIdParent
	 *            the productIdParent to set
	 */
	public void setProductIdParent(String productIdParent) {
		this.productIdParent = productIdParent;
	}

	/**
	 * @return the productIdChild
	 */
	public String getProductIdChild() {
		return productIdChild;
	}

	/**
	 * @param productIdChild
	 *            the productIdChild to set
	 */
	public void setProductIdChild(String productIdChild) {
		this.productIdChild = productIdChild;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl
	 *            the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the catagoryName
	 */
	public String getCatagoryName() {
		return catagoryName;
	}

	/**
	 * @param catagoryName
	 *            the catagoryName to set
	 */
	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}

	@Override
	public String toString() {
		return "{\"product_id_parent\":" + "\"" + productIdParent + "\"" + ", \"product_id_child\":" + "\""
				+ productIdChild + "\"" + ", \"catagory_name\":" + "\"" + catagoryName + "\"" + ", \"product_name\":"
				+ "\"" + productName + "\"" + ", \"image_url\":" + "\"" + imageUrl + "\"" + ", \"price\":" + "\""
				+ price + "\"" + "}";
	}
}
