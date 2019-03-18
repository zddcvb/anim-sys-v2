package com.yanxi.anim.sys.pojo;

public class DateQuery {
	private String startDate;
	private String endDate;
	private String username;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "DateQuery [startDate=" + startDate + ", endDate=" + endDate + ", username=" + username + "]";
	}
	
}
