package com.next.first.service;

import com.github.pagehelper.PageInfo;
import com.next.first.pojo.dto.User;

public interface UserService {
	PageInfo<User> pageSearch(int pageNum,int size);
}
