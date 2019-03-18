package com.yanxi.anim.sys.pojo;

import java.util.ArrayList;
import java.util.List;

public class AnimAttenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnimAttenceExample() {
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

        public Criteria andAttenceIdIsNull() {
            addCriterion("attence_id is null");
            return (Criteria) this;
        }

        public Criteria andAttenceIdIsNotNull() {
            addCriterion("attence_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttenceIdEqualTo(String value) {
            addCriterion("attence_id =", value, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdNotEqualTo(String value) {
            addCriterion("attence_id <>", value, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdGreaterThan(String value) {
            addCriterion("attence_id >", value, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("attence_id >=", value, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdLessThan(String value) {
            addCriterion("attence_id <", value, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdLessThanOrEqualTo(String value) {
            addCriterion("attence_id <=", value, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdLike(String value) {
            addCriterion("attence_id like", value, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdNotLike(String value) {
            addCriterion("attence_id not like", value, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdIn(List<String> values) {
            addCriterion("attence_id in", values, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdNotIn(List<String> values) {
            addCriterion("attence_id not in", values, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdBetween(String value1, String value2) {
            addCriterion("attence_id between", value1, value2, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceIdNotBetween(String value1, String value2) {
            addCriterion("attence_id not between", value1, value2, "attenceId");
            return (Criteria) this;
        }

        public Criteria andAttenceDateIsNull() {
            addCriterion("attence_date is null");
            return (Criteria) this;
        }

        public Criteria andAttenceDateIsNotNull() {
            addCriterion("attence_date is not null");
            return (Criteria) this;
        }

        public Criteria andAttenceDateEqualTo(String value) {
            addCriterion("attence_date =", value, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateNotEqualTo(String value) {
            addCriterion("attence_date <>", value, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateGreaterThan(String value) {
            addCriterion("attence_date >", value, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateGreaterThanOrEqualTo(String value) {
            addCriterion("attence_date >=", value, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateLessThan(String value) {
            addCriterion("attence_date <", value, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateLessThanOrEqualTo(String value) {
            addCriterion("attence_date <=", value, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateLike(String value) {
            addCriterion("attence_date like", value, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateNotLike(String value) {
            addCriterion("attence_date not like", value, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateIn(List<String> values) {
            addCriterion("attence_date in", values, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateNotIn(List<String> values) {
            addCriterion("attence_date not in", values, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateBetween(String value1, String value2) {
            addCriterion("attence_date between", value1, value2, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceDateNotBetween(String value1, String value2) {
            addCriterion("attence_date not between", value1, value2, "attenceDate");
            return (Criteria) this;
        }

        public Criteria andAttenceStartIsNull() {
            addCriterion("attence_start is null");
            return (Criteria) this;
        }

        public Criteria andAttenceStartIsNotNull() {
            addCriterion("attence_start is not null");
            return (Criteria) this;
        }

        public Criteria andAttenceStartEqualTo(String value) {
            addCriterion("attence_start =", value, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartNotEqualTo(String value) {
            addCriterion("attence_start <>", value, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartGreaterThan(String value) {
            addCriterion("attence_start >", value, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartGreaterThanOrEqualTo(String value) {
            addCriterion("attence_start >=", value, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartLessThan(String value) {
            addCriterion("attence_start <", value, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartLessThanOrEqualTo(String value) {
            addCriterion("attence_start <=", value, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartLike(String value) {
            addCriterion("attence_start like", value, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartNotLike(String value) {
            addCriterion("attence_start not like", value, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartIn(List<String> values) {
            addCriterion("attence_start in", values, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartNotIn(List<String> values) {
            addCriterion("attence_start not in", values, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartBetween(String value1, String value2) {
            addCriterion("attence_start between", value1, value2, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andAttenceStartNotBetween(String value1, String value2) {
            addCriterion("attence_start not between", value1, value2, "attenceStart");
            return (Criteria) this;
        }

        public Criteria andStartStatusIsNull() {
            addCriterion("start_status is null");
            return (Criteria) this;
        }

        public Criteria andStartStatusIsNotNull() {
            addCriterion("start_status is not null");
            return (Criteria) this;
        }

        public Criteria andStartStatusEqualTo(Integer value) {
            addCriterion("start_status =", value, "startStatus");
            return (Criteria) this;
        }

        public Criteria andStartStatusNotEqualTo(Integer value) {
            addCriterion("start_status <>", value, "startStatus");
            return (Criteria) this;
        }

        public Criteria andStartStatusGreaterThan(Integer value) {
            addCriterion("start_status >", value, "startStatus");
            return (Criteria) this;
        }

        public Criteria andStartStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_status >=", value, "startStatus");
            return (Criteria) this;
        }

        public Criteria andStartStatusLessThan(Integer value) {
            addCriterion("start_status <", value, "startStatus");
            return (Criteria) this;
        }

        public Criteria andStartStatusLessThanOrEqualTo(Integer value) {
            addCriterion("start_status <=", value, "startStatus");
            return (Criteria) this;
        }

        public Criteria andStartStatusIn(List<Integer> values) {
            addCriterion("start_status in", values, "startStatus");
            return (Criteria) this;
        }

        public Criteria andStartStatusNotIn(List<Integer> values) {
            addCriterion("start_status not in", values, "startStatus");
            return (Criteria) this;
        }

        public Criteria andStartStatusBetween(Integer value1, Integer value2) {
            addCriterion("start_status between", value1, value2, "startStatus");
            return (Criteria) this;
        }

        public Criteria andStartStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("start_status not between", value1, value2, "startStatus");
            return (Criteria) this;
        }

        public Criteria andAttenceEndIsNull() {
            addCriterion("attence_end is null");
            return (Criteria) this;
        }

        public Criteria andAttenceEndIsNotNull() {
            addCriterion("attence_end is not null");
            return (Criteria) this;
        }

        public Criteria andAttenceEndEqualTo(String value) {
            addCriterion("attence_end =", value, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndNotEqualTo(String value) {
            addCriterion("attence_end <>", value, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndGreaterThan(String value) {
            addCriterion("attence_end >", value, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndGreaterThanOrEqualTo(String value) {
            addCriterion("attence_end >=", value, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndLessThan(String value) {
            addCriterion("attence_end <", value, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndLessThanOrEqualTo(String value) {
            addCriterion("attence_end <=", value, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndLike(String value) {
            addCriterion("attence_end like", value, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndNotLike(String value) {
            addCriterion("attence_end not like", value, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndIn(List<String> values) {
            addCriterion("attence_end in", values, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndNotIn(List<String> values) {
            addCriterion("attence_end not in", values, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndBetween(String value1, String value2) {
            addCriterion("attence_end between", value1, value2, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andAttenceEndNotBetween(String value1, String value2) {
            addCriterion("attence_end not between", value1, value2, "attenceEnd");
            return (Criteria) this;
        }

        public Criteria andEndStatusIsNull() {
            addCriterion("end_status is null");
            return (Criteria) this;
        }

        public Criteria andEndStatusIsNotNull() {
            addCriterion("end_status is not null");
            return (Criteria) this;
        }

        public Criteria andEndStatusEqualTo(Integer value) {
            addCriterion("end_status =", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusNotEqualTo(Integer value) {
            addCriterion("end_status <>", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusGreaterThan(Integer value) {
            addCriterion("end_status >", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_status >=", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusLessThan(Integer value) {
            addCriterion("end_status <", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusLessThanOrEqualTo(Integer value) {
            addCriterion("end_status <=", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusIn(List<Integer> values) {
            addCriterion("end_status in", values, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusNotIn(List<Integer> values) {
            addCriterion("end_status not in", values, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusBetween(Integer value1, Integer value2) {
            addCriterion("end_status between", value1, value2, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("end_status not between", value1, value2, "endStatus");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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