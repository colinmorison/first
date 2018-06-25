package com.next.first.redis.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.next.first.mapper.UserMapper;
import com.next.first.pojo.dto.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRedisTest {
	@Autowired
	private UserRedis userRedis;
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void addUser() {
		User u = new User();
		u.setId((long) 1);
		u.setUserName("张三");
		userRedis.addUser("1", u);
	}
	@Test
	public void isExist() {
		boolean b = userRedis.isExist("1");
		System.out.println(b);
	}
	@Test
	public void getUser() {
		User user = userRedis.getUser("1");
		System.out.println(user.getUserName());
	}
	@Test
	public void delUserTable() {
		userRedis.delUserTable("user");
	}
}
