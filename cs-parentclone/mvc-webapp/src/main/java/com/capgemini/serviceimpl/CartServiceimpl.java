package com.capgemini.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bean.Cart;
import com.capgemini.bean.GiftCard;
import com.capgemini.bean.Order;
import com.capgemini.bean.OrderEntity;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.constant.URLConstants;
import com.capgemini.service.CartService;
import com.capgemini.service.CatalogService;
import com.cg.catalog.GiftCardCatalog;
import com.cg.feedback.CustomerFeedback;
import com.cg.userprofile.User;

/**
 * @author dimehta
 *
 */
@Service
public class CartServiceimpl implements CartService {

	private static final Logger logger = LoggerFactory.getLogger(CartServiceimpl.class);
	
	@Autowired
	RestTemplate restTemplate;
	
	//RestTemplate restTemplate=new RestTemplate();
	
	@Autowired
	CatalogService catalogService;

	@Override
	public List<OrderEntity> getAllOrder(Long userId) {

		ResponseEntity<OrderEntity[]> orderlists = restTemplate.getForEntity(URLConstants.GET_ORDER_BY_USERID,
				OrderEntity[].class, userId);
		List<OrderEntity> list = new ArrayList<OrderEntity>();

		for (int i = 0; i < orderlists.getBody().length; i++) {
			list.add(orderlists.getBody()[i]);
		}

		return list;
	}

	@Override
	public String addToCart(String productId, Long long1) {
		Cart cart=new Cart();
		cart.setProductId(productId);
		cart.setUserId(long1);
		
		restTemplate.postForObject
				("http://usercart/cart/add?userId="+cart.getUserId()+"&productId="+cart.getProductId()+"&quantity=1",
						Cart.class, String.class, cart);
		return null;
	}

	@Override
	public void deleteFromCart(String productId, Long long1) {
		Cart cart=new Cart();
		cart.setProductId(productId);
		cart.setUserId(long1);
		
		restTemplate.postForObject
				("http://usercart/cart/deleteProduct?userId="+cart.getUserId()+"&productId="+cart.getProductId()+"",
						Cart.class, String.class, cart);

	}

	@Override
	public void emptyCart(Long userId) {
		restTemplate.postForObject
				("http://usercart/cart/empty?userId="+userId, Long.class, String.class, userId);
	}

	public UserCartModel getCardDetails(Long userId) {
		
		ResponseEntity<UserCartModel> cartLists = restTemplate.getForEntity
				("http://usercart/cart/detail?userId="+userId, UserCartModel.class,userId);
		return cartLists.getBody();
	}

	@Override
	public String getProductPrice(String productId) {
		List<ProductCatalog> list = catalogService.getProduct();
		for (ProductCatalog productCatalog : list) {
			if ((productCatalog.getProductIdChild()).equalsIgnoreCase(productId)) {
				return productCatalog.getPrice();
			}
		}
		return null;
	}

	@Override
	public UserCartModel setProductPrice(UserCartModel user) {
		List<ProductCartModel> list = user.getCartItemList();
		String s;
		if(list != null)
		{
			for (ProductCartModel prod : list) {
				String price = getProductPrice(prod.getProductId());
				prod.setPrice(price);
			}
			return user;
		}
		return user;
	}

	/*@Override
	public void addUserGiftCard(GiftCardCatalog giftCard) {
		List<GiftCardCatalog> list1=new ArrayList<GiftCardCatalog>();
		list1.add(giftCard);
		List<GiftCardCatalog> list = (List<GiftCardCatalog>) restTemplate.postForObject("http://catalog-mgmt/addAllGifts", GiftCardCatalog.class, GiftCardCatalog.class, list1);
	}
*/
	@Override
	public GiftCard getUserGiftCard(Long long1) {
		GiftCard[] gift = restTemplate.getForObject(URLConstants.GET_GIFT_CARD, GiftCard[].class);
		for (int i = 0; i < gift.length; i++) {
			if (gift[i].getGiftCardId() == (long1)) {
				return gift[i];
			}
		}
		return null;

	}
	
	@Override
	public List<GiftCardCatalog> getAllGiftCards() {
		GiftCardCatalog[] giftCards = restTemplate.getForObject("http://catalog-mgmt/getGiftCards", GiftCardCatalog[].class);
		List<GiftCardCatalog> list = new ArrayList<GiftCardCatalog>();
		for (int i = 0; i < giftCards.length; i++) {
			list.add(giftCards[i]);
		}
		return list;
	}

	@Override
	public void creditGiftCard(Long id, String value) {
		restTemplate.postForObject("http://user-profile/users/credit?userId="+id+"&amount="+value, null, User.class);
	}

	@Override
	public User getUserInfo(Long userId) {
		User user= restTemplate.getForObject("http://user-profile/users/findbyid?userId="+userId, User.class);
		return user;
	}
	
	@Override
	public void debitGiftCard(Long id, String value) {
		restTemplate.postForObject("http://user-profile/users/debit?userId="+id+"&amount="+value, null, User.class);
	}

	public void feedbackStoring(CustomerFeedback customer) {
		restTemplate.postForObject("http://feedback-rating/feedback/create", null, CustomerFeedback.class, customer);
	}
}
