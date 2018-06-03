package com.next.first.mapper;

import com.github.pagehelper.Page;
import com.next.first.pojo.dto.User;

public interface UserMapper {
	public Page<User> findByPage();
}
