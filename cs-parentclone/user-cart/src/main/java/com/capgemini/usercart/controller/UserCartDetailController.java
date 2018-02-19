package com.capgemini.usercart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.usercart.model.UserCartModel;
import com.capgemini.usercart.services.UserCartDetailService;

@RestController
@RequestMapping("/cart")
public class UserCartDetailController {

	@Autowired
	UserCartDetailService userCartDetailService;

	@RequestMapping(value = "/detail", method = RequestMethod.GET)

	public UserCartModel getData(@RequestParam("userId") String userID) {

	 UserCartModel userCartModel = userCartDetailService.getData(userID);
	 
	 return userCartModel;

	}

}