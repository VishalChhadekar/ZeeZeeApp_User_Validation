package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.LoginBean;
import com.service.LoginService;

@Controller
public class LoginController {
	@Autowired//bean name of LoginService will be created by spring automatically
	private LoginService loginService;

	@RequestMapping("/login")//default getMethod
	public String showLoginPage(@ModelAttribute("login") LoginBean loginBean) {
		return "login";

	}

	@RequestMapping(value = "submitlogin", method = RequestMethod.POST)
	public String checkLoginDetails(@ModelAttribute("login") LoginBean loginBean, BindingResult result) {
		return loginService.validate(loginBean) ? "success" : "invalid";// used of ternary Operator

	}
}
