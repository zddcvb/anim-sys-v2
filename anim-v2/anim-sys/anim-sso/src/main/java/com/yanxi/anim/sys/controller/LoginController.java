package com.yanxi.anim.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yanxi.anim.sys.pojo.AnimAccout;
import com.yanxi.anim.sys.service.LoginService;

@Controller
@RequestMapping("/accout")
public class LoginController {
	@Autowired
	private LoginService loginSerivce;

	@RequestMapping("/login")
	@ResponseBody
	public AnimAccout login(HttpServletRequest request, HttpServletResponse response, String username,
			String password) {
		AnimAccout accout = loginSerivce.login(request, response, username, password);
		return null;
	}
}
