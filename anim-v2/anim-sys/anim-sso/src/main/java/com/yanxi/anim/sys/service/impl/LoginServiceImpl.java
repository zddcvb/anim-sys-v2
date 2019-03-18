package com.yanxi.anim.sys.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.yanxi.anim.sys.pojo.AnimAccout;
import com.yanxi.anim.sys.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public AnimAccout login(HttpServletRequest request, HttpServletResponse response, String username,
			String password) {
		
		return null;
	}

}
