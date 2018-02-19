package com.capgemini.services;

import java.util.List;

import com.capgemini.config.UserUrl;

/**
 * @author dimehta
 *
 */
public interface ClickStreamService {
	public void saveUrl(String userId,String UserUrl);
	public List<UserUrl> getByUserId(String userId);
	public List<UserUrl> getAllUser();
	
}
