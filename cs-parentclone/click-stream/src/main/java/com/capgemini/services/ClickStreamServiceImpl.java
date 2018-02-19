package com.capgemini.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.capgemini.config.RedisTemplateConnection;
import com.capgemini.config.UserUrl;

/**
 * @author dimehta
 *
 */
@Service
public class ClickStreamServiceImpl implements ClickStreamService {

	@Autowired
	@Qualifier("redisTemplate")
	private StringRedisTemplate redisTemplate1;
	private StringRedisTemplate redisTemplate=RedisTemplateConnection.getConnection();

	@Override
	public void saveUrl(String userId, String userUrl) {
		System.out.println("******************"+ redisTemplate);
		HashOperations<String, String, String> hash = redisTemplate.opsForHash();

		Map<String, String> searchKye = new HashMap<>();
		Date date = new Date();
		long tim = date.getTime();
		String key = userId + "-" + tim;
		System.out.println("save Url"+hash.toString());
		searchKye.put("userId", userId);
		searchKye.put("userUrl", userUrl);
		searchKye.put("timestam", date.toString());
		hash.putAll(key, searchKye);
	}

	@Override
	public List<UserUrl> getByUserId(String userId) {
		List<UserUrl> uselist = new ArrayList<UserUrl>();

		Set<String> names = redisTemplate.keys(userId + "*");

		java.util.Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			UserUrl userUrl = new UserUrl();
			String s = it.next();
			Set<Object> sd = redisTemplate.opsForHash().keys(s);
			List<Object> obj = redisTemplate.opsForHash().multiGet(s, sd);
			List<String> str = new ArrayList<String>();
			for (Iterator iterator = obj.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				str.add(string);
			}
			userUrl.setUserId(str.get(0));
			userUrl.setTimestam(str.get(1));
			userUrl.setUserUrl(str.get(2));

			uselist.add(userUrl);
		}
		System.out.println(uselist);
		return uselist;

	}

	public static void main(String[] args) {
		new ClickStreamServiceImpl().getByUserId("dd");
	}

	@Override
	public List<UserUrl> getAllUser() {

		return null;
	}

}
