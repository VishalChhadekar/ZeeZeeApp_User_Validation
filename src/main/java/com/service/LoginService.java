package com.service;

import org.springframework.stereotype.Service;

import com.bean.LoginBean;

@Service 
public class LoginService {

	// validate is userName equal to userPassword
	public boolean validate(LoginBean loginBean) {
		return loginBean.getUserName().equalsIgnoreCase(loginBean.getPassword());
	}

}
