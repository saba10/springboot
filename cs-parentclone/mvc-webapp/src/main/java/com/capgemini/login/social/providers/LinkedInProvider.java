package com.capgemini.login.social.providers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.social.linkedin.api.LinkedInProfileFull;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

import com.capgemini.bean.GiftCard;
import com.capgemini.bean.ProductCatalog;
import com.capgemini.constant.URLConstants;
import com.capgemini.serviceimpl.CartServiceimpl;
import com.capgemini.serviceimpl.CatalogServiceImpl;
import com.cg.userprofile.User;

/**
 * @author dimehta
 *
 */
@Service
public class LinkedInProvider {

	private static final String LINKED_IN = "linkedIn";

	private static final String REDIRECT_LOGIN = "redirect:/login-auth";

	@Autowired
	BaseProvider socialLoginBean;
	@Autowired
	public CartServiceimpl cartServiceimpl;
	@Autowired
	public CatalogServiceImpl catalogService;

	@Autowired
	RestTemplate restTemplate;

	public String getLinkedInUserData(Model model) {

		ConnectionRepository connectionRepository = socialLoginBean.getConnectionRepository();
		if (connectionRepository.findPrimaryConnection(LinkedIn.class) == null) {
			return REDIRECT_LOGIN;
		}
		User user = populateUserDetailsFromLinkedIn();
		List<ProductCatalog> list = catalogService.getProduct();
		model.addAttribute("catalog", list);
		model.addAttribute("name", user.getFirstName());
		model.addAttribute("userId", user.getUserId());
		return "index";
	}

	public User populateUserDetailsFromLinkedIn() {
		LinkedIn linkedIn = socialLoginBean.getLinkedIn();
		LinkedInProfileFull linkedInUser = linkedIn.profileOperations().getUserProfileFull();
		User user = new User();
		user.setUserName(linkedInUser.getEmailAddress());
		user.setFirstName(linkedInUser.getFirstName());
		user.setLastName(linkedInUser.getLastName());
		
		List<User> list = restTemplate
				.exchange("http://user-profile/users/findbyusername?userName=" + user.getUserName(), HttpMethod.GET,
						null, new ParameterizedTypeReference<List<User>>() {
						})
				.getBody();
		if (list.isEmpty()) {
			GiftCard gift=new GiftCard();
			gift.setGiftCardId(user.getUserId());
			gift.setGiftCardValue("10000");
			user.setBalance(10000L);
			user = restTemplate.postForObject("http://user-profile/users/add", user, User.class);
		} else {
			user.setUserId(list.get(0).getUserId());
			System.err.println("*******"+user.getBalance());
			
		}
		return user;
	}

}
