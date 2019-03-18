package com.yanxi.anim.sys.pojo;

public class AssessmentQuery {
	private String employeeName;
	private String animName;
	private String animGroup;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAnimName() {
		return animName;
	}

	public void setAnimName(String animName) {
		this.animName = animName;
	}

	public String getAnimGroup() {
		return animGroup;
	}

	public void setAnimGroup(String animGroup) {
		this.animGroup = animGroup;
	}

	@Override
	public String toString() {
		return "AssessmentQuery [employeeName=" + employeeName + ", animName=" + animName + ", animGroup=" + animGroup
				+ "]";
	}

}
