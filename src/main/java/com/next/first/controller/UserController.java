package com.next.first.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.next.first.pojo.common.CommonResponseObject;
import com.next.first.pojo.dto.User;
import com.next.first.service.UserService;


@RequestMapping("/user")
@Controller
public class UserController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserService userService;
	@RequestMapping("/queryUserList")
	public String PageSearch(Model model){
		/*PageInfo<User> pageInfo = userService.pageSearch(pageNum,size);
		model.addAttribute("userInfo", pageInfo);*/
		return "user/userList";
		
	}
	
	@RequestMapping("/getUserList")
	@ResponseBody
	public CommonResponseObject<User> GetDepartment(@RequestParam(value="limit")int limit, @RequestParam(value="offset")int offset, @RequestParam(value="userName")String userName, @RequestParam(value="userId")Long userId)
    {
		logger.info("打印入参：limit["+limit+"]，offset["+offset+"]，userName["+userName+"]，userId["+userId+"]");
		CommonResponseObject<User> response = userService.pageSearch(offset, limit, userId, userName);
		
		
		return response;
    }
}
