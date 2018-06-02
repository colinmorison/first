package com.next.first.mapper;

import com.github.pagehelper.Page;
import com.next.first.pojo.dto.UserDto;

public interface UserMapper {
	public Page<UserDto> findByPage();
}
