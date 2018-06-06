package org.dfgg.common;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * jedis池使用
 * @author jinyingfei - 835317619@qq.com
 * @create 2018-06-06
 */
public class RedisPool {

	private static JedisPool jedisPool;
	
	// 初始化池配置
	static {
		// 创建jedis池配置实例
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		// 设置默认链接数为默认值的5倍
		poolConfig.setMaxTotal(GenericObjectPoolConfig.DEFAULT_MAX_TOTAL * 5);
		// 设置最大空闲连接数为默认值的 3 倍
		poolConfig.setMaxIdle(GenericObjectPoolConfig.DEFAULT_MAX_IDLE * 3);
		// 设置最小空闲连接数为默认值的 2 倍
		poolConfig.setMinIdle(GenericObjectPoolConfig.DEFAULT_MIN_IDLE * 2);
		// 设置开启 jmx 功能
		poolConfig.setJmxEnabled(true);
		// 设置连接池没有连接后客户端的最大等待时间 ( 单位为毫秒 )
		poolConfig.setMaxWaitMillis(3000);
		
		jedisPool = new JedisPool(poolConfig, "localhost", 6379, 10000, "936047ZXmn.");
		
	}
	
	public static Jedis getResource() {
		return jedisPool.getResource();
	}
	
	
	/**
	 * @author jinyingfei - 835317619@qq.com
	 */
	public static void main(String[] args) {
		Jedis jedis = RedisPool.jedisPool.getResource();
		
		jedis.set("key1", "value1");
		
		System.out.println(jedis.get("key1"));
	}

}
