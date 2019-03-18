package com.yanxi.anim.sys.pojo;

public class AnimAssessment {
    private String assessmentId;

    private Integer assessmentMonth;

    private String animProjName;

    private String animName;

    private String animLevel;

    private String animGroup;

    private String employeeName;

    private Integer editorAssessmentScore;

    private String editorAssessmentReason;

    private Integer animatorAssessemtScore;

    private String animatorAssessmentReason;

    private Integer designerAssessmentScore;

    private String designerAssessmentReason;

    private Integer animTotalScore;

    private Integer animTotalMoney;

    private String createTime;

    private String updateTime;

    private String deptName;

    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId == null ? null : assessmentId.trim();
    }

    public Integer getAssessmentMonth() {
        return assessmentMonth;
    }

    public void setAssessmentMonth(Integer assessmentMonth) {
        this.assessmentMonth = assessmentMonth;
    }

    public String getAnimProjName() {
        return animProjName;
    }

    public void setAnimProjName(String animProjName) {
        this.animProjName = animProjName == null ? null : animProjName.trim();
    }

    public String getAnimName() {
        return animName;
    }

    public void setAnimName(String animName) {
        this.animName = animName == null ? null : animName.trim();
    }

    public String getAnimLevel() {
        return animLevel;
    }

    public void setAnimLevel(String animLevel) {
        this.animLevel = animLevel == null ? null : animLevel.trim();
    }

    public String getAnimGroup() {
        return animGroup;
    }

    public void setAnimGroup(String animGroup) {
        this.animGroup = animGroup == null ? null : animGroup.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Integer getEditorAssessmentScore() {
        return editorAssessmentScore;
    }

    public void setEditorAssessmentScore(Integer editorAssessmentScore) {
        this.editorAssessmentScore = editorAssessmentScore;
    }

    public String getEditorAssessmentReason() {
        return editorAssessmentReason;
    }

    public void setEditorAssessmentReason(String editorAssessmentReason) {
        this.editorAssessmentReason = editorAssessmentReason == null ? null : editorAssessmentReason.trim();
    }

    public Integer getAnimatorAssessemtScore() {
        return animatorAssessemtScore;
    }

    public void setAnimatorAssessemtScore(Integer animatorAssessemtScore) {
        this.animatorAssessemtScore = animatorAssessemtScore;
    }

    public String getAnimatorAssessmentReason() {
        return animatorAssessmentReason;
    }

    public void setAnimatorAssessmentReason(String animatorAssessmentReason) {
        this.animatorAssessmentReason = animatorAssessmentReason == null ? null : animatorAssessmentReason.trim();
    }

    public Integer getDesignerAssessmentScore() {
        return designerAssessmentScore;
    }

    public void setDesignerAssessmentScore(Integer designerAssessmentScore) {
        this.designerAssessmentScore = designerAssessmentScore;
    }

    public String getDesignerAssessmentReason() {
        return designerAssessmentReason;
    }

    public void setDesignerAssessmentReason(String designerAssessmentReason) {
        this.designerAssessmentReason = designerAssessmentReason == null ? null : designerAssessmentReason.trim();
    }

    public Integer getAnimTotalScore() {
        return animTotalScore;
    }

    public void setAnimTotalScore(Integer animTotalScore) {
        this.animTotalScore = animTotalScore;
    }

    public Integer getAnimTotalMoney() {
        return animTotalMoney;
    }

    public void setAnimTotalMoney(Integer animTotalMoney) {
        this.animTotalMoney = animTotalMoney;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}