package com.yanxi.anim.sys.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yanxi.anim.sys.pojo.AnimAccout;
import com.yanxi.anim.sys.service.AccoutService;
import com.yanxi.anim.sys.service.JedisService;
import com.yanxi.anim.sys.utils.JsonUtils;
import com.yanxi.anim.sys.utils.SessionUtils;

@Controller
public class LoginController {
	@Autowired
	private AccoutService accoutService;
	@Autowired
	private JedisService jedisService;
	private static Logger logger = Logger.getLogger(LoginController.class);

	/**
	 * 显示登录页面
	 * 
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("/showLogin")
	public ModelAndView showLogin(ModelAndView modelAndView, HttpServletRequest request) {
		logger.info("登录的ip:" + request.getRemoteAddr());
		String token = SessionUtils.getSessionValue(request, "username_token");
		if (!StringUtils.isEmpty(token)) {
			String jsonData = jedisService.get("musername:" + token);
			if (!StringUtils.isEmpty(jsonData)) {
				AnimAccout animAccout = JsonUtils.jsonToPojo(jsonData, AnimAccout.class);
				modelAndView.addObject("animAccout", animAccout);
				modelAndView.setViewName("redirect:/");
			} else {
				modelAndView.setViewName("/login");
			}
		} else {
			modelAndView.setViewName("/login");
		}
		return modelAndView;
	}

	/**
	 * 登录，返回json数据，并设置cookie
	 * 
	 * @param modelAndView
	 * @param accout
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public AnimAccout login(ModelAndView modelAndView, AnimAccout accout, HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("=====================login====================");
		String password = accout.getPassword();
		accout.setPassword(DigestUtils.md5Hex(password));
		AnimAccout animAccout = accoutService.findByUsernameAndPassword(accout);
		if (animAccout != null) {
			try {
				// 保存至redis
				String token = UUID.randomUUID().toString();
				String username_token = "musername:" + token;
				jedisService.set(username_token, JsonUtils.objectToJson(animAccout));
				SessionUtils.addSession(request, "username_token", token, Integer.MAX_VALUE);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			return null;
		}
		return animAccout;
	}

	/**
	 * 退出系统
	 * 
	 * @param modelAndView
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/logout")
	public ModelAndView logout(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response) {
		String token = SessionUtils.getSessionValue(request, "username_token");
		jedisService.delete("musername:" + token);
		//CookieUtils.deleteCookie(request, response, "USERNAME_TOKEN");
		SessionUtils.deleteSession(request, "username_token");
		modelAndView.setViewName("redirect:/showLogin");
		return modelAndView;
	}

}
