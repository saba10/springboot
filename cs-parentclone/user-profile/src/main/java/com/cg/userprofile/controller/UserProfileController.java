package com.cg.userprofile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.userprofile.User;
import com.cg.userprofile.repo.UserProfileRepo;

@RestController

@RequestMapping("users")
public class UserProfileController {

	@Autowired
	private UserProfileRepo profileRepo;

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		System.out.println("User from request : "+ user);
		Long userId = user.getUserId();
		if (userId != null && profileRepo.exists(userId)) {
			return profileRepo.findOne(userId);
		}
		return profileRepo.save(user);
	}
	
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<User> getAll() {
		return profileRepo.findAll();
	}

	@RequestMapping(value = "findbyid", method = RequestMethod.GET, params = { "userId" })
	public User getUserById(@RequestParam(value = "userId", required = true) String userId) {
		return profileRepo.findOne(Long.parseLong(userId));
	}

	@RequestMapping(value = "findbyusername", method = RequestMethod.GET, params = { "userName" })
	public List<User> getUserByUserName(@RequestParam(value = "userName", required = true) String userName) {
		return profileRepo.findByUserName(userName);
	}

	@RequestMapping(value = "credit", method = RequestMethod.POST, params = { "userId", "amount" })
	public User credit(@RequestParam(value = "userId", required = true) Long userId,
			@RequestParam(value = "amount", required = true) String amount) {
		User user = profileRepo.findOne(userId);
		user.setBalance(user.getBalance() + Long.parseLong(amount));
		return profileRepo.save(user);
	}

	@RequestMapping(value = "debit", method = RequestMethod.POST, params = { "userId", "amount" })
	public User debit(@RequestParam(value = "userId", required = true) Long userId,
			@RequestParam(value = "amount", required = true) String amount) {
		User user= profileRepo.findOne(userId);
		user.setBalance(user.getBalance() - Long.parseLong(amount));
		return profileRepo.save(user);
	}

}
