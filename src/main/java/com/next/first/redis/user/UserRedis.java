package com.next.first.redis.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.stereotype.Service;

import com.next.first.common.RedisConstants;
import com.next.first.pojo.dto.User;
import com.next.first.redis.BaseRedisTemplate;

@Service
public class UserRedis extends BaseRedisTemplate<User> {
	
	@Autowired
	public UserRedis(RedisConnectionFactory connectionFactory) {
		super(connectionFactory);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param key 用户id
	 * @param user 实例
	 */
	public void addUser(String key,User user) {
		putMap(RedisConstants.USER,key,user);
	}
	/**
	 * 
	 * @param key  用户ID
	 * @return 存在true 不存在 false
	 */
	public boolean isExist(String key) {
		User sr = this.getUser(key);
		
		return sr==null?false:true;
	}
	
	/**
	 * 
	 * @param key 用户ID
	 * @return
	 */
	public User getUser(String key) {
		return getMap(RedisConstants.USER,key);
	}
	/**
	 * 
	 * @param table 表名
	 */
	public void delUserTable(String table) {
		delete(table);
	}

}
