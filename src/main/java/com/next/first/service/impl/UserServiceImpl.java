package com.next.first.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.next.first.mapper.UserMapper;
import com.next.first.pojo.common.CommonResponseObject;
import com.next.first.pojo.dto.User;
import com.next.first.pojo.query.UserQuery;
import com.next.first.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	@Override
	public CommonResponseObject<User> pageSearch(Integer pageNum,Integer size,Long userId,String userName) {
		CommonResponseObject<User> response = new CommonResponseObject<>(CommonResponseObject.RESPONSE_OK, CommonResponseObject.RESPONSE_OK_MSG);
		if (pageNum == null) {
			pageNum = 1;
		}
		if (pageNum<0) {
			pageNum = 0;
		}
		if (size == null) {
			size = 10;
		}
		PageHelper.startPage(pageNum, size);
		UserQuery query = new UserQuery();
		query.setId(userId);
		query.setUserName(userName);
		Page<User> userList = userMapper.findByPage(query);
		PageInfo<User> pageInfoList = new PageInfo<>(userList);
		response.setTotal(Integer.valueOf((int) pageInfoList.getTotal()));
		response.setRows(userList);
		return response;
	}

}
