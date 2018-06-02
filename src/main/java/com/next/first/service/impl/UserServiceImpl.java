package com.next.first.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.next.first.mapper.UserMapper;
import com.next.first.pojo.dto.UserDto;
import com.next.first.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public Page<UserDto> pageSearch(int pageNum,int size) {
		PageHelper.startPage(pageNum, size);
		Page<UserDto> pageDto = userMapper.findByPage();
		return pageDto;
	}

}
