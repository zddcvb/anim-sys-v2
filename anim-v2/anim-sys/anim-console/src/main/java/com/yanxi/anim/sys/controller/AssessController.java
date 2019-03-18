package com.yanxi.anim.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.yanxi.anim.sys.pojo.AnimAssessment;
import com.yanxi.anim.sys.pojo.AssessmentQuery;
import com.yanxi.anim.sys.service.AssessService;

@Controller
@RequestMapping("/assess")
public class AssessController {
	private AssessService assessService;

	@RequestMapping("/assesslist")
	public ModelAndView list(ModelAndView mav) {
		List<AnimAssessment> assessments = assessService.findAll();
		mav.addObject("assessments", assessments);
		mav.setViewName("/assess/assess_list");
		return mav;
	}

	@RequestMapping("/view/{id}")
	public ModelAndView view(ModelAndView modelAndView, @PathVariable String id, HttpServletRequest request,
			AssessmentQuery query) {
		addQueryAndPageNum(modelAndView, query, request);
		AnimAssessment assessment = assessService.findById(id);
		if (assessment != null) {
			modelAndView.addObject("assessment", assessment);
			modelAndView.setViewName("/assess/assess_view");
		}
		return modelAndView;
	}

	@RequestMapping("/save")
	public ModelAndView add(ModelAndView modelAndView, AssessmentQuery query, HttpServletRequest request) {
		addQueryAndPageNum(modelAndView, query, request);
		modelAndView.setViewName("/assess/assess_save");
		return modelAndView;
	}

	@RequestMapping("/add_assess")
	public ModelAndView addData(ModelAndView modelAndView, AnimAssessment animAssessment, AssessmentQuery query,
			HttpServletRequest request) {
		addQueryAndPageNum(modelAndView, query, request);
		int index = assessService.insert(animAssessment);
		if (index > 0) {
			modelAndView.setViewName("redirect:/assess/list");
		}
		return modelAndView;
	}

	private void addQueryAndPageNum(ModelAndView modelAndView, AssessmentQuery query, HttpServletRequest request) {
		String pageNum = request.getParameter("pageNum");
		modelAndView.addObject("query", query);
		modelAndView.addObject("pageNum", Integer.parseInt(pageNum));
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView edit(ModelAndView modelAndView, @PathVariable String id) {
		AnimAssessment assessment = assessService.findById(id);
		modelAndView.addObject("assessment", assessment);
		modelAndView.setViewName("/assess/assess_edit");
		return modelAndView;
	}

	@RequestMapping("/delete/{id}")
	public ModelAndView deleteById(ModelAndView modelAndView, @PathVariable String id) {
		int index = assessService.deleteById(id);
		if (index > 0) {
			modelAndView.setViewName("redirect:/assess/list");
		}
		return modelAndView;
	}

	@RequestMapping("/deleteAll")
	public ModelAndView delete(ModelAndView modelAndView) {
		int index = assessService.deleteAll();
		if (index > 0) {
			modelAndView.setViewName("redirect:/assess/list");
		}
		return modelAndView;
	}

	@RequestMapping("/list")
	public ModelAndView queryForList(ModelAndView modelAndView, AssessmentQuery query,
			@RequestParam(defaultValue = "1") int pageNum) {
		PageInfo<AnimAssessment> pageInfo = assessService.findAllByQuery(query, pageNum);
		if (pageInfo == null) {
			return null;
		}
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.addObject("query", query);
		modelAndView.setViewName("/assess/assess_list");
		return modelAndView;
	}

	@RequestMapping("/back")
	public ModelAndView backToList(ModelAndView modelAndView, HttpServletRequest request, AssessmentQuery query) {
		addQueryAndPageNum(modelAndView, query, request);
		modelAndView.setViewName("redirect:/assess/list");
		return modelAndView;
	}
}