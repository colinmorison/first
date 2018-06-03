package com.next.first.service;

import com.github.pagehelper.Page;
import com.next.first.pojo.dto.User;

public interface UserService {
	Page<User> pageSearch(int pageNum,int size);
}
