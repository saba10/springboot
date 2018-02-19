package com.capgemini.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.services.ClickStreamServiceImpl;

/**
 * @author dimehta
 *
 */
@RestController
public class RedisController {
	
	@Autowired
	ClickStreamServiceImpl clickStreamServiceImpl;
	@RequestMapping(value = "/saveUrl", method = RequestMethod.POST, produces = "application/json")
	public void saveUrl(@RequestParam (value="userId",required=false) String userId,@RequestParam (value="userUrl",required=false) String userUrl) {
		clickStreamServiceImpl.saveUrl(userId, userUrl);
		System.out.println("userId"+userId);
		System.out.println("URl"+userUrl);

	}
	@RequestMapping(value = "/getById", method = RequestMethod.GET, produces = "application/json",consumes = "application/*")
	public List<UserUrl> getByUserId(@RequestParam (value="userId") String userId) {
		System.out.println(userId);
		return clickStreamServiceImpl.getByUserId(userId);

	}
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json",consumes = "application/json")
	public String getAllUser() {
		System.out.println("hello");
		System.out.println("hello");
		return null;
	}
		
}
