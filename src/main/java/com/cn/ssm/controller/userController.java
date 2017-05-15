package com.cn.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.ssm.pojo.user;
import com.cn.ssm.service.userService;;

@Controller
@RequestMapping("/user")
public class userController {
	@Resource
	private userService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		user user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}