package com.yanxi.anim.sys.pojo;

import java.util.ArrayList;
import java.util.List;

public class AnimAssessmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimAssessmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAssessmentIdIsNull() {
            addCriterion("assessment_id is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdIsNotNull() {
            addCriterion("assessment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdEqualTo(String value) {
            addCriterion("assessment_id =", value, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdNotEqualTo(String value) {
            addCriterion("assessment_id <>", value, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdGreaterThan(String value) {
            addCriterion("assessment_id >", value, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("assessment_id >=", value, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdLessThan(String value) {
            addCriterion("assessment_id <", value, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdLessThanOrEqualTo(String value) {
            addCriterion("assessment_id <=", value, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdLike(String value) {
            addCriterion("assessment_id like", value, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdNotLike(String value) {
            addCriterion("assessment_id not like", value, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdIn(List<String> values) {
            addCriterion("assessment_id in", values, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdNotIn(List<String> values) {
            addCriterion("assessment_id not in", values, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdBetween(String value1, String value2) {
            addCriterion("assessment_id between", value1, value2, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdNotBetween(String value1, String value2) {
            addCriterion("assessment_id not between", value1, value2, "assessmentId");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthIsNull() {
            addCriterion("assessment_month is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthIsNotNull() {
            addCriterion("assessment_month is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthEqualTo(Integer value) {
            addCriterion("assessment_month =", value, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthNotEqualTo(Integer value) {
            addCriterion("assessment_month <>", value, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthGreaterThan(Integer value) {
            addCriterion("assessment_month >", value, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("assessment_month >=", value, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthLessThan(Integer value) {
            addCriterion("assessment_month <", value, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthLessThanOrEqualTo(Integer value) {
            addCriterion("assessment_month <=", value, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthIn(List<Integer> values) {
            addCriterion("assessment_month in", values, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthNotIn(List<Integer> values) {
            addCriterion("assessment_month not in", values, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthBetween(Integer value1, Integer value2) {
            addCriterion("assessment_month between", value1, value2, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAssessmentMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("assessment_month not between", value1, value2, "assessmentMonth");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameIsNull() {
            addCriterion("anim_proj_name is null");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameIsNotNull() {
            addCriterion("anim_proj_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameEqualTo(String value) {
            addCriterion("anim_proj_name =", value, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameNotEqualTo(String value) {
            addCriterion("anim_proj_name <>", value, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameGreaterThan(String value) {
            addCriterion("anim_proj_name >", value, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameGreaterThanOrEqualTo(String value) {
            addCriterion("anim_proj_name >=", value, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameLessThan(String value) {
            addCriterion("anim_proj_name <", value, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameLessThanOrEqualTo(String value) {
            addCriterion("anim_proj_name <=", value, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameLike(String value) {
            addCriterion("anim_proj_name like", value, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameNotLike(String value) {
            addCriterion("anim_proj_name not like", value, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameIn(List<String> values) {
            addCriterion("anim_proj_name in", values, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameNotIn(List<String> values) {
            addCriterion("anim_proj_name not in", values, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameBetween(String value1, String value2) {
            addCriterion("anim_proj_name between", value1, value2, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimProjNameNotBetween(String value1, String value2) {
            addCriterion("anim_proj_name not between", value1, value2, "animProjName");
            return (Criteria) this;
        }

        public Criteria andAnimNameIsNull() {
            addCriterion("anim_name is null");
            return (Criteria) this;
        }

        public Criteria andAnimNameIsNotNull() {
            addCriterion("anim_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnimNameEqualTo(String value) {
            addCriterion("anim_name =", value, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameNotEqualTo(String value) {
            addCriterion("anim_name <>", value, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameGreaterThan(String value) {
            addCriterion("anim_name >", value, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameGreaterThanOrEqualTo(String value) {
            addCriterion("anim_name >=", value, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameLessThan(String value) {
            addCriterion("anim_name <", value, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameLessThanOrEqualTo(String value) {
            addCriterion("anim_name <=", value, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameLike(String value) {
            addCriterion("anim_name like", value, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameNotLike(String value) {
            addCriterion("anim_name not like", value, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameIn(List<String> values) {
            addCriterion("anim_name in", values, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameNotIn(List<String> values) {
            addCriterion("anim_name not in", values, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameBetween(String value1, String value2) {
            addCriterion("anim_name between", value1, value2, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimNameNotBetween(String value1, String value2) {
            addCriterion("anim_name not between", value1, value2, "animName");
            return (Criteria) this;
        }

        public Criteria andAnimLevelIsNull() {
            addCriterion("anim_level is null");
            return (Criteria) this;
        }

        public Criteria andAnimLevelIsNotNull() {
            addCriterion("anim_level is not null");
            return (Criteria) this;
        }

        public Criteria andAnimLevelEqualTo(String value) {
            addCriterion("anim_level =", value, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelNotEqualTo(String value) {
            addCriterion("anim_level <>", value, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelGreaterThan(String value) {
            addCriterion("anim_level >", value, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelGreaterThanOrEqualTo(String value) {
            addCriterion("anim_level >=", value, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelLessThan(String value) {
            addCriterion("anim_level <", value, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelLessThanOrEqualTo(String value) {
            addCriterion("anim_level <=", value, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelLike(String value) {
            addCriterion("anim_level like", value, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelNotLike(String value) {
            addCriterion("anim_level not like", value, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelIn(List<String> values) {
            addCriterion("anim_level in", values, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelNotIn(List<String> values) {
            addCriterion("anim_level not in", values, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelBetween(String value1, String value2) {
            addCriterion("anim_level between", value1, value2, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimLevelNotBetween(String value1, String value2) {
            addCriterion("anim_level not between", value1, value2, "animLevel");
            return (Criteria) this;
        }

        public Criteria andAnimGroupIsNull() {
            addCriterion("anim_group is null");
            return (Criteria) this;
        }

        public Criteria andAnimGroupIsNotNull() {
            addCriterion("anim_group is not null");
            return (Criteria) this;
        }

        public Criteria andAnimGroupEqualTo(String value) {
            addCriterion("anim_group =", value, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupNotEqualTo(String value) {
            addCriterion("anim_group <>", value, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupGreaterThan(String value) {
            addCriterion("anim_group >", value, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupGreaterThanOrEqualTo(String value) {
            addCriterion("anim_group >=", value, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupLessThan(String value) {
            addCriterion("anim_group <", value, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupLessThanOrEqualTo(String value) {
            addCriterion("anim_group <=", value, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupLike(String value) {
            addCriterion("anim_group like", value, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupNotLike(String value) {
            addCriterion("anim_group not like", value, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupIn(List<String> values) {
            addCriterion("anim_group in", values, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupNotIn(List<String> values) {
            addCriterion("anim_group not in", values, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupBetween(String value1, String value2) {
            addCriterion("anim_group between", value1, value2, "animGroup");
            return (Criteria) this;
        }

        public Criteria andAnimGroupNotBetween(String value1, String value2) {
            addCriterion("anim_group not between", value1, value2, "animGroup");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("employee_name is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employee_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employee_name =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employee_name <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employee_name >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employee_name >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employee_name <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employee_name <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("employee_name like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("employee_name not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("employee_name in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("employee_name not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employee_name between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employee_name not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreIsNull() {
            addCriterion("editor_assessment_score is null");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreIsNotNull() {
            addCriterion("editor_assessment_score is not null");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreEqualTo(Integer value) {
            addCriterion("editor_assessment_score =", value, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreNotEqualTo(Integer value) {
            addCriterion("editor_assessment_score <>", value, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreGreaterThan(Integer value) {
            addCriterion("editor_assessment_score >", value, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("editor_assessment_score >=", value, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreLessThan(Integer value) {
            addCriterion("editor_assessment_score <", value, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreLessThanOrEqualTo(Integer value) {
            addCriterion("editor_assessment_score <=", value, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreIn(List<Integer> values) {
            addCriterion("editor_assessment_score in", values, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreNotIn(List<Integer> values) {
            addCriterion("editor_assessment_score not in", values, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreBetween(Integer value1, Integer value2) {
            addCriterion("editor_assessment_score between", value1, value2, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("editor_assessment_score not between", value1, value2, "editorAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonIsNull() {
            addCriterion("editor_assessment_reason is null");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonIsNotNull() {
            addCriterion("editor_assessment_reason is not null");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonEqualTo(String value) {
            addCriterion("editor_assessment_reason =", value, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonNotEqualTo(String value) {
            addCriterion("editor_assessment_reason <>", value, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonGreaterThan(String value) {
            addCriterion("editor_assessment_reason >", value, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonGreaterThanOrEqualTo(String value) {
            addCriterion("editor_assessment_reason >=", value, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonLessThan(String value) {
            addCriterion("editor_assessment_reason <", value, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonLessThanOrEqualTo(String value) {
            addCriterion("editor_assessment_reason <=", value, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonLike(String value) {
            addCriterion("editor_assessment_reason like", value, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonNotLike(String value) {
            addCriterion("editor_assessment_reason not like", value, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonIn(List<String> values) {
            addCriterion("editor_assessment_reason in", values, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonNotIn(List<String> values) {
            addCriterion("editor_assessment_reason not in", values, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonBetween(String value1, String value2) {
            addCriterion("editor_assessment_reason between", value1, value2, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andEditorAssessmentReasonNotBetween(String value1, String value2) {
            addCriterion("editor_assessment_reason not between", value1, value2, "editorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreIsNull() {
            addCriterion("animator_assessemt_score is null");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreIsNotNull() {
            addCriterion("animator_assessemt_score is not null");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreEqualTo(Integer value) {
            addCriterion("animator_assessemt_score =", value, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreNotEqualTo(Integer value) {
            addCriterion("animator_assessemt_score <>", value, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreGreaterThan(Integer value) {
            addCriterion("animator_assessemt_score >", value, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("animator_assessemt_score >=", value, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreLessThan(Integer value) {
            addCriterion("animator_assessemt_score <", value, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreLessThanOrEqualTo(Integer value) {
            addCriterion("animator_assessemt_score <=", value, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreIn(List<Integer> values) {
            addCriterion("animator_assessemt_score in", values, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreNotIn(List<Integer> values) {
            addCriterion("animator_assessemt_score not in", values, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreBetween(Integer value1, Integer value2) {
            addCriterion("animator_assessemt_score between", value1, value2, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessemtScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("animator_assessemt_score not between", value1, value2, "animatorAssessemtScore");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonIsNull() {
            addCriterion("animator_assessment_reason is null");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonIsNotNull() {
            addCriterion("animator_assessment_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonEqualTo(String value) {
            addCriterion("animator_assessment_reason =", value, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonNotEqualTo(String value) {
            addCriterion("animator_assessment_reason <>", value, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonGreaterThan(String value) {
            addCriterion("animator_assessment_reason >", value, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonGreaterThanOrEqualTo(String value) {
            addCriterion("animator_assessment_reason >=", value, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonLessThan(String value) {
            addCriterion("animator_assessment_reason <", value, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonLessThanOrEqualTo(String value) {
            addCriterion("animator_assessment_reason <=", value, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonLike(String value) {
            addCriterion("animator_assessment_reason like", value, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonNotLike(String value) {
            addCriterion("animator_assessment_reason not like", value, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonIn(List<String> values) {
            addCriterion("animator_assessment_reason in", values, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonNotIn(List<String> values) {
            addCriterion("animator_assessment_reason not in", values, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonBetween(String value1, String value2) {
            addCriterion("animator_assessment_reason between", value1, value2, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimatorAssessmentReasonNotBetween(String value1, String value2) {
            addCriterion("animator_assessment_reason not between", value1, value2, "animatorAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreIsNull() {
            addCriterion("designer_assessment_score is null");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreIsNotNull() {
            addCriterion("designer_assessment_score is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreEqualTo(Integer value) {
            addCriterion("designer_assessment_score =", value, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreNotEqualTo(Integer value) {
            addCriterion("designer_assessment_score <>", value, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreGreaterThan(Integer value) {
            addCriterion("designer_assessment_score >", value, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("designer_assessment_score >=", value, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreLessThan(Integer value) {
            addCriterion("designer_assessment_score <", value, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreLessThanOrEqualTo(Integer value) {
            addCriterion("designer_assessment_score <=", value, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreIn(List<Integer> values) {
            addCriterion("designer_assessment_score in", values, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreNotIn(List<Integer> values) {
            addCriterion("designer_assessment_score not in", values, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreBetween(Integer value1, Integer value2) {
            addCriterion("designer_assessment_score between", value1, value2, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("designer_assessment_score not between", value1, value2, "designerAssessmentScore");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonIsNull() {
            addCriterion("designer_assessment_reason is null");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonIsNotNull() {
            addCriterion("designer_assessment_reason is not null");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonEqualTo(String value) {
            addCriterion("designer_assessment_reason =", value, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonNotEqualTo(String value) {
            addCriterion("designer_assessment_reason <>", value, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonGreaterThan(String value) {
            addCriterion("designer_assessment_reason >", value, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonGreaterThanOrEqualTo(String value) {
            addCriterion("designer_assessment_reason >=", value, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonLessThan(String value) {
            addCriterion("designer_assessment_reason <", value, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonLessThanOrEqualTo(String value) {
            addCriterion("designer_assessment_reason <=", value, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonLike(String value) {
            addCriterion("designer_assessment_reason like", value, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonNotLike(String value) {
            addCriterion("designer_assessment_reason not like", value, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonIn(List<String> values) {
            addCriterion("designer_assessment_reason in", values, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonNotIn(List<String> values) {
            addCriterion("designer_assessment_reason not in", values, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonBetween(String value1, String value2) {
            addCriterion("designer_assessment_reason between", value1, value2, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andDesignerAssessmentReasonNotBetween(String value1, String value2) {
            addCriterion("designer_assessment_reason not between", value1, value2, "designerAssessmentReason");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreIsNull() {
            addCriterion("anim_total_score is null");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreIsNotNull() {
            addCriterion("anim_total_score is not null");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreEqualTo(Integer value) {
            addCriterion("anim_total_score =", value, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreNotEqualTo(Integer value) {
            addCriterion("anim_total_score <>", value, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreGreaterThan(Integer value) {
            addCriterion("anim_total_score >", value, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("anim_total_score >=", value, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreLessThan(Integer value) {
            addCriterion("anim_total_score <", value, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("anim_total_score <=", value, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreIn(List<Integer> values) {
            addCriterion("anim_total_score in", values, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreNotIn(List<Integer> values) {
            addCriterion("anim_total_score not in", values, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("anim_total_score between", value1, value2, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("anim_total_score not between", value1, value2, "animTotalScore");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyIsNull() {
            addCriterion("anim_total_money is null");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyIsNotNull() {
            addCriterion("anim_total_money is not null");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyEqualTo(Integer value) {
            addCriterion("anim_total_money =", value, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyNotEqualTo(Integer value) {
            addCriterion("anim_total_money <>", value, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyGreaterThan(Integer value) {
            addCriterion("anim_total_money >", value, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("anim_total_money >=", value, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyLessThan(Integer value) {
            addCriterion("anim_total_money <", value, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("anim_total_money <=", value, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyIn(List<Integer> values) {
            addCriterion("anim_total_money in", values, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyNotIn(List<Integer> values) {
            addCriterion("anim_total_money not in", values, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyBetween(Integer value1, Integer value2) {
            addCriterion("anim_total_money between", value1, value2, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andAnimTotalMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("anim_total_money not between", value1, value2, "animTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}