package com.capgemini.usercart.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ComponentScan
@Document(collection = "CartDetails")
public class UserCartModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3715031506442555230L;
	@Id
	private String userId;
	
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
	private List<ProductCartModel> cartItemList;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserCartModel other = (UserCartModel) obj;
		if (cartItemList == null) {
			if (other.cartItemList != null)
				return false;
		} else if (!cartItemList.equals(other.cartItemList))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartItemList == null) ? 0 : cartItemList.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

}
