package com.next.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.next.first.pojo.dto.User;
import com.next.first.service.UserService;


@RequestMapping("/user")
@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/queryUserList")
	public String PageSearch(@RequestParam(value="pageNum",defaultValue="1")int pageNum,@RequestParam(value="size",defaultValue="10")int size,Model model){
		PageInfo<User> pageInfo = userService.pageSearch(pageNum,size);
		model.addAttribute("userInfo", pageInfo);
		return "user/userList";
		
	}
}
