package com.yanxi.anim.test;

import java.util.Map;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest {
	@Test
	@SuppressWarnings("resource")
	public void test_jedis() {
		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
		JedisPool pool = new JedisPool(jedisPoolConfig, "192.168.145.128", 6379);
		Jedis jedis = pool.getResource();
		String name = jedis.get("musername:cb226148-4a78-44f1-8649-48cd8e1bb5be");
		System.out.println(name);
		
		Map<String, String> map = jedis.hgetAll("myset");
		String value = map.get("name");
		System.out.println(value);
	}
}
