package com.yanxi.anim.sys.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanxi.anim.sys.mapper.AnimAttenceMapper;
import com.yanxi.anim.sys.pojo.AnimAttence;
import com.yanxi.anim.sys.pojo.AnimAttenceExample;
import com.yanxi.anim.sys.service.AttenceService;

@Service
public class AttenceServiceImpl implements AttenceService {
	@Autowired
	private AnimAttenceMapper attenceMapper;

	@Override
	public void insert(AnimAttence attence) {
		attenceMapper.insert(attence);
	}

	@Override
	public AnimAttence findByDate(String date) {
		AnimAttenceExample example = new AnimAttenceExample();
		example.createCriteria().andAttenceDateEqualTo(date);
		List<AnimAttence> list = attenceMapper.selectByExample(example);
		return list != null && list.size() > 0 ? list.get(0) : null;
	}

	@Override
	public void update(AnimAttence attence) {
		attenceMapper.updateByPrimaryKey(attence);
	}

	@Override
	public List<AnimAttence> findByUserName(String username) {
		AnimAttenceExample example = new AnimAttenceExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<AnimAttence> list = attenceMapper.selectByExample(example);
		System.out.println(list);
		return list == null ? null : list;
	}

	/**
	 * 通过日期查询username的考勤记录
	 */
	@Override
	public List<AnimAttence> findByDate(String username, String startDate, String endDate) {
		List<AnimAttence> list = null;
		if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
			list = findByUserName(username);
		} else {
			AnimAttenceExample example = new AnimAttenceExample();
			if (!StringUtils.isEmpty(endDate)) {
				example.createCriteria().andUsernameEqualTo(username).andAttenceDateBetween(startDate, endDate);
			} else if (StringUtils.isEmpty(endDate)) {
				example.createCriteria().andUsernameEqualTo(username).andAttenceDateGreaterThanOrEqualTo(startDate);
			}
			list = attenceMapper.selectByExample(example);
		}
		return list;
	}

	@Override
	public AnimAttence findByDateAndUsername(String formateDateToStr, String username) {
		AnimAttenceExample example = new AnimAttenceExample();
		example.createCriteria().andUsernameEqualTo(username).andAttenceDateEqualTo(formateDateToStr);
		List<AnimAttence> list = attenceMapper.selectByExample(example);
		return list != null && list.size() > 0 ? list.get(0) : null;
	}

}
