package com.wwx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wwx.bean.User;
import com.wwx.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService iUserService;
	User users = new User();
	@RequestMapping("/userLogin")
	public ModelAndView UserLogin(HttpServletRequest httpServletRequest,User user){
		users=iUserService.queryUserByLoginUser(user);
		ModelAndView modelAndView = new ModelAndView();
		if (users==null) {
			modelAndView.setViewName("loginfail");
			String url = "index.jsp";
			modelAndView.addObject("url", url);
			return modelAndView;
		}
		else {
			modelAndView.addObject("users",users);
			System.out.println(users);
			modelAndView.setViewName("loginsuccess");
			System.out.println("登录成功");
			return modelAndView;
		}
		
	}
	
}
