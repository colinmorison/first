package com.next.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.next.first.pojo.dto.UserDto;
import com.next.first.service.UserService;


@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/queryUserList")
	@ResponseBody
	public PageInfo<UserDto> PageSearch(@RequestParam(value="pageNum",defaultValue="1")int pageNum,@RequestParam(value="size",defaultValue="5")int size){
		PageInfo<UserDto> pageInfo = new PageInfo<UserDto>();
		
		userService.pageSearch(pageNum,size);
		return pageInfo;
		
	}
}
