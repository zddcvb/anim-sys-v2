package com.yanxi.anim.sys.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yanxi.anim.sys.pojo.AnimAccout;

public interface LoginService {

	AnimAccout login(HttpServletRequest request, HttpServletResponse response, String username, String password);
	
}
