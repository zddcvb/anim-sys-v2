package com.yanxi.anim.sys.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.request.QueryRequest;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yanxi.anim.sys.mapper.AnimAssessmentMapper;
import com.yanxi.anim.sys.pojo.AnimAssessment;
import com.yanxi.anim.sys.pojo.AnimAssessmentExample;
import com.yanxi.anim.sys.pojo.AnimAssessmentExample.Criteria;
import com.yanxi.anim.sys.pojo.AssessmentQuery;
import com.yanxi.anim.sys.service.AssessService;

@Service
public class AssessServiceImpl implements AssessService {
	private AnimAssessmentMapper aaMapper;

	@Override
	public List<AnimAssessment> findAll() {
		AnimAssessmentExample example = new AnimAssessmentExample();
		example.createCriteria();
		List<AnimAssessment> assessments = aaMapper.selectByExample(example);
		return assessments;
	}

	@Override
	public AnimAssessment findById(String id) {
		AnimAssessment assessment = aaMapper.selectByPrimaryKey(id);
		return assessment;
	}

	@Override
	public int insert(AnimAssessment animAssessment) {
		int index = aaMapper.insert(animAssessment);
		return index;
	}

	@Override
	public int deleteById(String id) {
		int index = aaMapper.deleteByPrimaryKey(id);
		return index;
	}

	@Override
	public int deleteAll() {
		AnimAssessmentExample example = new AnimAssessmentExample();
		example.createCriteria();
		int index = aaMapper.deleteByExample(example);
		return index;
	}

	@Override
	public PageInfo<AnimAssessment> findAllByQuery(AssessmentQuery query, int pageNum) {
		PageHelper.startPage(pageNum, 40);
		AnimAssessmentExample example = new AnimAssessmentExample();
		Criteria criteria = example.createCriteria();
		if (query != null) {
			String employeeName = query.getEmployeeName();
			if (!StringUtils.isEmpty(employeeName)) {
				criteria.andEmployeeNameEqualTo(employeeName);
			}
			String animName = query.getAnimName();
			if (!StringUtils.isEmpty(animName)) {
				criteria.andAnimNameEqualTo(animName);
			}
			String animGroup = query.getAnimGroup();
			if (!StringUtils.isEmpty(animGroup)) {
				criteria.andAnimGroupEqualTo(animGroup);
			}
			List<AnimAssessment> assessments = aaMapper.selectByExample(example);
			if (assessments.size() > 0) {
				PageInfo<AnimAssessment> pageInfo = new PageInfo<>(assessments);
				return pageInfo;
			}
		}
		return null;
	}

}