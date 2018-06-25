package com.next.first.mapper;

import com.github.pagehelper.Page;
import com.next.first.pojo.dto.User;
import com.next.first.pojo.query.UserQuery;

public interface UserMapper {
	public Page<User> findByPage(UserQuery query);
}
