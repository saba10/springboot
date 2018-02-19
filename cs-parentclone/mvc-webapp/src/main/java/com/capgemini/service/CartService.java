package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.GiftCard;
import com.capgemini.bean.OrderEntity;
import com.capgemini.serviceimpl.UserCartModel;
import com.cg.catalog.GiftCardCatalog;
import com.cg.feedback.CustomerFeedback;
import com.cg.userprofile.User;

public interface CartService {

	
	public String addToCart(String productName, Long long1);
	public void deleteFromCart(String productId, Long userId);
	public UserCartModel getCardDetails(Long userId);
	public void emptyCart(Long userId);

	public List<OrderEntity> getAllOrder(Long userId);
	String getProductPrice(String productId);
	UserCartModel setProductPrice(UserCartModel user);
	//public void addUserGiftCard(GiftCardCatalog giftCard);
	public GiftCard getUserGiftCard(Long long1);
	public List<GiftCardCatalog> getAllGiftCards();
	public void creditGiftCard(Long id, String value);
	public User getUserInfo(Long userId);
	public void debitGiftCard(Long id, String value);
}
