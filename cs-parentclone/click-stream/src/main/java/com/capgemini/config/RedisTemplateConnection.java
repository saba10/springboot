package com.capgemini.config;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisTemplateConnection {
	public static StringRedisTemplate redisTemplate;
	public static StringRedisTemplate getConnection() {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRedisConfig.class);
		redisTemplate = (StringRedisTemplate) ctx.getBean("strRedisTemplate");
		return redisTemplate;
	}
}
