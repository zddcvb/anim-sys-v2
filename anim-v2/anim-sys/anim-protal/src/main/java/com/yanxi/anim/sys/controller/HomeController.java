package com.yanxi.anim.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yanxi.anim.sys.pojo.AnimAccout;
import com.yanxi.anim.sys.pojo.AnimResCatagorty;
import com.yanxi.anim.sys.service.AnimResCatagortyService;
import com.yanxi.anim.sys.service.JedisService;
import com.yanxi.anim.sys.utils.CookieUtils;
import com.yanxi.anim.sys.utils.JsonUtils;
import com.yanxi.anim.sys.utils.SessionUtils;

@Controller
public class HomeController {
	@Autowired
	private AnimResCatagortyService animResCatagortyService;
	private static Logger logger = Logger.getLogger(HomeController.class);
	@Autowired
	private JedisService jedisService;

	/**
	 * 跳转至index.jsp
	 * 
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("/")
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.setViewName("/index");
		return modelAndView;
	}

	/**
	 * 跳转是top.jsp
	 * 
	 * @param modelAndView
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/home_top")
	public ModelAndView top(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response) {
		AnimAccout animAccout = null;
		try {
			String token = SessionUtils.getSessionValue(request, "username_token");
			logger.info("session token:" + token);
			String jsonData = jedisService.get("musername:" + token);
			logger.info("jedis json:" + jsonData);
			if (!StringUtils.isEmpty(jsonData)) {
				animAccout = JsonUtils.jsonToPojo(jsonData, AnimAccout.class);
				logger.info("from redis:" + animAccout);
			}
		} catch (Exception exception) {
			animAccout = new AnimAccout();
			animAccout.setUsername("请登录");
		}
		modelAndView.addObject("animAccout", animAccout);
		modelAndView.setViewName("/home/top");
		return modelAndView;
	}

	/**
	 * 跳转至right.jsp
	 * 
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("/home_right")
	public ModelAndView right(ModelAndView modelAndView) {
		modelAndView.setViewName("/home/right");
		return modelAndView;
	}

	/**
	 * 跳转至left页面
	 * 
	 * @param modelAndView
	 * @param request
	 * @return
	 */
	@RequestMapping("/home_left")
	public ModelAndView left(ModelAndView modelAndView, HttpServletRequest request) {
		// 查询所有的分类信息
		List<AnimResCatagorty> catagorties = null;
		String jsonData = SessionUtils.getSessionValue(request, "catagorties");
		if (jsonData != null) {
			logger.info("session");
			catagorties = JsonUtils.jsonToList(jsonData, AnimResCatagorty.class);
		} else {
			logger.info("数据库");
			catagorties = animResCatagortyService.findByResCatagortyName();
			SessionUtils.addSession(request, "catagorties", JsonUtils.listToJson(catagorties), 3600 * 24);
		}
		if (catagorties != null) {
			modelAndView.addObject("resCatas", catagorties);
		}
		// 从redis中查找
		String token = SessionUtils.getSessionValue(request, "username_token");
		String json = jedisService.get("musername:" + token);
		if (json != null) {
			AnimAccout accout = JsonUtils.jsonToPojo(json, AnimAccout.class);
			modelAndView.addObject("accout_session", accout);
		}
		modelAndView.setViewName("/home/left");
		return modelAndView;
	}

	/**
	 * 跳转至bottom页面
	 * 
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping("/home_bottom")
	public ModelAndView bottom(ModelAndView modelAndView) {
		modelAndView.setViewName("/home/bottom");
		return modelAndView;
	}
}
