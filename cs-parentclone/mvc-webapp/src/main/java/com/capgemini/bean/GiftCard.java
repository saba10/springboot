package com.capgemini.bean;

import java.io.Serializable;

public class GiftCard implements Serializable{
	
	private Long giftCardId;
	private String giftCardValue;
	

	public Long getGiftCardId() {
		return giftCardId;
	}

	public void setGiftCardId(Long giftCardId) {
		this.giftCardId = giftCardId;
	}

	public String getGiftCardValue() {
		return giftCardValue;
	}

	public void setGiftCardValue(String giftCardValue) {
		this.giftCardValue = giftCardValue;
	}

}
