package com.next.first.service;

import com.next.first.pojo.common.CommonResponseObject;
import com.next.first.pojo.dto.User;

public interface UserService {
	CommonResponseObject<User> pageSearch(Integer pageNum,Integer size,Long userId,String userName);
}
