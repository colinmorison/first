package com.next.first.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.next.first.mapper.UserMapper;
import com.next.first.pojo.dto.User;
import com.next.first.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public PageInfo<User> pageSearch(int pageNum,int size) {
		PageHelper.startPage(pageNum, size);
		Page<User> pageDto = userMapper.findByPage();
		PageInfo<User> pageInfo = new PageInfo<User>(pageDto);
		return pageInfo;
	}

}
