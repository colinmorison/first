package com.next.first.service;

import com.github.pagehelper.Page;
import com.next.first.pojo.dto.UserDto;

public interface UserService {
	Page<UserDto> pageSearch(int pageNum,int size);
}
