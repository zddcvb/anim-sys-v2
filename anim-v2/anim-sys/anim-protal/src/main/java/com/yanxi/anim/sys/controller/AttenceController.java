package com.yanxi.anim.sys.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yanxi.anim.sys.pojo.AnimAccout;
import com.yanxi.anim.sys.pojo.AnimAttence;
import com.yanxi.anim.sys.pojo.DateQuery;
import com.yanxi.anim.sys.service.AccoutService;
import com.yanxi.anim.sys.service.AttenceService;
import com.yanxi.anim.sys.utils.DateFormate;
import com.yanxi.anim.sys.utils.IdGeneratorUtils;

@Controller
@RequestMapping("/attence")
public class AttenceController {
	@Autowired
	private AccoutService accoutService;
	@Autowired
	private AttenceService attenceService;

	/**
	 * 显示打卡信息
	 * 
	 * @param modelAndView
	 * @param employeeId
	 * @return
	 */
	@RequestMapping("")
	public ModelAndView show(ModelAndView modelAndView, String employeeId) {
		AnimAccout animAccout = accoutService.findByEmpId(employeeId);
		System.out.println(animAccout.getUsername());
		modelAndView.addObject("username", animAccout.getUsername());
		AnimAttence attence = attenceService.findByDateAndUsername(DateFormate.formateDateToStr(new Date()),
				animAccout.getUsername());
		if (attence != null) {
			modelAndView.addObject("attence", attence);
		}
		modelAndView.setViewName("/attence/attence_info");
		return modelAndView;
	}

	/**
	 * 打卡
	 * 
	 * @param modelAndView
	 * @param request
	 * @param username
	 * @return
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(ModelAndView modelAndView, HttpServletRequest request, String username) {
		String attenceType = request.getParameter("attenceType");
		String date = DateFormate.formateDateToStr(new Date());
		String attenceDate = DateFormate.formateDateToString(new Date());
		AnimAttence attence = attenceService.findByDateAndUsername(date, username);
		if (attence != null) {
			if ("1".equals(attenceType)) {
				attence.setAttenceStart(attenceDate);
				attence.setStartStatus(1);
			} else {
				attence.setAttenceEnd(attenceDate);
				attence.setEndStatus(1);
			}
			attenceService.update(attence);
			modelAndView.addObject("attence", attence);
		} else {
			AnimAttence animAttence = new AnimAttence();
			animAttence.setAttenceDate(DateFormate.formateDateToStr(new Date()));
			animAttence.setAttenceId(IdGeneratorUtils.generatorUUID());
			if ("1".equals(attenceType)) {
				animAttence.setAttenceStart(attenceDate);
				animAttence.setStartStatus(1);
			} else {
				animAttence.setAttenceEnd(attenceDate);
				animAttence.setEndStatus(1);
			}
			animAttence.setUsername(username);
			attenceService.insert(animAttence);
			modelAndView.addObject("attence", animAttence);
		}

		modelAndView.addObject("username", username);
		modelAndView.setViewName("/attence/attence_info");
		return modelAndView;
	}

	/**
	 * 显示查询的考勤数据
	 * 
	 * @param modelAndView
	 * @param dateQuery
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView list(ModelAndView modelAndView, DateQuery dateQuery) {
		String username = dateQuery.getUsername();
		String startDate = dateQuery.getStartDate();
		String endDate = dateQuery.getEndDate();
		List<AnimAttence> attences = attenceService.findByDate(username, startDate, endDate);
		modelAndView.addObject("attences", attences);
		modelAndView.addObject("username", username);
		modelAndView.setViewName("/attence/attence_list");
		return modelAndView;
	}

}
