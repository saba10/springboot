package com.capgemini.serviceimpl;

import java.io.Serializable;
import java.util.List;
public class UserCartModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3715031506442555230L;
	private String userId;
	private List<ProductCartModel> cartItemList;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<ProductCartModel> getCartItemList() {
		return cartItemList;
	}
	public void setCartItemList(List<ProductCartModel> cartItemList) {
		this.cartItemList = cartItemList;
	}
	@Override
	public String toString() {
		return "UserCartModel [userId=" + userId + ", cartItemList=" + cartItemList + "]";
	}
	

}
