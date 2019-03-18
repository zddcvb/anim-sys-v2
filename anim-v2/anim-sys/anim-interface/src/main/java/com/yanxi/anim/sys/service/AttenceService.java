package com.yanxi.anim.sys.service;

import java.util.List;

import com.yanxi.anim.sys.pojo.AnimAttence;

public interface AttenceService {

	void insert(AnimAttence attence);

	AnimAttence findByDate(String date);

	void update(AnimAttence attence);

	/**
	 * 通过用户名查找所有的考勤信息
	 * 
	 * @param username
	 *            考勤人
	 * @return list集合
	 */
	List<AnimAttence> findByUserName(String username);

	/**
	 * 查询一定范围的考勤记录
	 * 
	 * @param username
	 *            考勤人
	 * @param startDate
	 *            开始日期
	 * @param endDate
	 *            结束日期
	 * @return list集合
	 */
	List<AnimAttence> findByDate(String username, String startDate, String endDate);

	AnimAttence findByDateAndUsername(String formateDateToStr, String username);

}
