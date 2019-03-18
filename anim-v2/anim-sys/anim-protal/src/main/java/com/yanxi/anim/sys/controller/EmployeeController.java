package com.yanxi.anim.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yanxi.anim.sys.pojo.AnimAccout;
import com.yanxi.anim.sys.pojo.AnimDept;
import com.yanxi.anim.sys.pojo.AnimEmployee;
import com.yanxi.anim.sys.pojo.AnimRole;
import com.yanxi.anim.sys.service.AccoutService;
import com.yanxi.anim.sys.service.AnimDeptService;
import com.yanxi.anim.sys.service.AnimEmployeeService;
import com.yanxi.anim.sys.service.AnimRoleService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private AnimEmployeeService employeeService;
	@Autowired
	private AnimDeptService deptService;
	@Autowired
	private AnimRoleService roleService;
	@Autowired
	private AccoutService accoutService;

	/**
	 * 显示用户信息
	 * 
	 * @param modelAndView
	 * @param employeeId
	 * @return
	 */
	@RequestMapping("/info")
	@ResponseBody
	public ModelAndView showList(ModelAndView modelAndView, String employeeId) {
		AnimEmployee animEmployee = employeeService.findById(employeeId);
		//
		AnimDept animDept = deptService.findById(animEmployee.getDeptId());
		animEmployee.setAnimDept(animDept);
		//
		AnimRole animRole = roleService.findById(animEmployee.getRoleId());
		animEmployee.setAnimRole(animRole);
		if (animEmployee != null) {
			modelAndView.addObject("employee", animEmployee);
		}
		modelAndView.setViewName("/info/empInfo");
		return modelAndView;
	}
	/**
	 * 跳转至修改页面
	 * @param modelAndView
	 * @param empId
	 * @return
	 */
	@RequestMapping("/info/{empId}")
	public ModelAndView editEmpInfo(ModelAndView modelAndView, @PathVariable String empId) {
		AnimEmployee animEmployee = employeeService.findById(empId);
		if (animEmployee != null) {
			modelAndView.addObject("employee", animEmployee);
		}
		modelAndView.setViewName("/info/empInfo_edit");
		return modelAndView;
	}
	/**
	 * 修改密码和现住址
	 * @param modelAndView
	 * @param request
	 * @return
	 */
	@RequestMapping("/info/edit")
	public ModelAndView edit(ModelAndView modelAndView, HttpServletRequest request) {
		String employeeId = (String) request.getParameter("employeeId");
		String password = (String) request.getParameter("password");
		String employeeNowAddress = (String) request.getParameter("employeeNowAddress");
		AnimEmployee animEmployee = employeeService.findById(employeeId);
		if (!StringUtils.isEmpty(employeeNowAddress)) {
			animEmployee.setEmployeeNowAddress(employeeNowAddress);
		}
		AnimAccout accout = accoutService.findByEmpId(employeeId);
		if (!StringUtils.isEmpty(password)) {
			accout.setPassword(DigestUtils.md5Hex(password));
		}
		employeeService.update(animEmployee);
		accoutService.update(accout);
		modelAndView.setViewName("redirect:/emp/info?employeeId=" + employeeId);
		return modelAndView;
	}
}
