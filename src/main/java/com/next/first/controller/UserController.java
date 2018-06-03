package com.next.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.next.first.pojo.dto.User;
import com.next.first.service.UserService;


@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/queryUserList")
	@ResponseBody
	public PageInfo<User> PageSearch(@RequestParam(value="pageNum",defaultValue="1")int pageNum,@RequestParam(value="size",defaultValue="5")int size){
		PageInfo<User> pageInfo = new PageInfo<User>();
		
		userService.pageSearch(pageNum,size);
		return pageInfo;
		
	}
}
