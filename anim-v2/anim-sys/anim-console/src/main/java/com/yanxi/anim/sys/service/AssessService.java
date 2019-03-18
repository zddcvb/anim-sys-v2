package com.yanxi.anim.sys.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yanxi.anim.sys.pojo.AnimAssessment;
import com.yanxi.anim.sys.pojo.AssessmentQuery;

public interface AssessService {

	List<AnimAssessment> findAll();

	AnimAssessment findById(String id);

	int insert(AnimAssessment animAssessment);

	int deleteById(String id);

	int deleteAll();

	PageInfo<AnimAssessment> findAllByQuery(AssessmentQuery query, int pageNum);

}
