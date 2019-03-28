package com.xmwjyy.wxx.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTechnicalCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTechnicalCaseExample() {
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

        public Criteria andCaseidIsNull() {
            addCriterion("caseid is null");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNotNull() {
            addCriterion("caseid is not null");
            return (Criteria) this;
        }

        public Criteria andCaseidEqualTo(Long value) {
            addCriterion("caseid =", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotEqualTo(Long value) {
            addCriterion("caseid <>", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThan(Long value) {
            addCriterion("caseid >", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThanOrEqualTo(Long value) {
            addCriterion("caseid >=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThan(Long value) {
            addCriterion("caseid <", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThanOrEqualTo(Long value) {
            addCriterion("caseid <=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidIn(List<Long> values) {
            addCriterion("caseid in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotIn(List<Long> values) {
            addCriterion("caseid not in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidBetween(Long value1, Long value2) {
            addCriterion("caseid between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotBetween(Long value1, Long value2) {
            addCriterion("caseid not between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCasepicIsNull() {
            addCriterion("casepic is null");
            return (Criteria) this;
        }

        public Criteria andCasepicIsNotNull() {
            addCriterion("casepic is not null");
            return (Criteria) this;
        }

        public Criteria andCasepicEqualTo(String value) {
            addCriterion("casepic =", value, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicNotEqualTo(String value) {
            addCriterion("casepic <>", value, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicGreaterThan(String value) {
            addCriterion("casepic >", value, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicGreaterThanOrEqualTo(String value) {
            addCriterion("casepic >=", value, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicLessThan(String value) {
            addCriterion("casepic <", value, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicLessThanOrEqualTo(String value) {
            addCriterion("casepic <=", value, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicLike(String value) {
            addCriterion("casepic like", value, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicNotLike(String value) {
            addCriterion("casepic not like", value, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicIn(List<String> values) {
            addCriterion("casepic in", values, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicNotIn(List<String> values) {
            addCriterion("casepic not in", values, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicBetween(String value1, String value2) {
            addCriterion("casepic between", value1, value2, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasepicNotBetween(String value1, String value2) {
            addCriterion("casepic not between", value1, value2, "casepic");
            return (Criteria) this;
        }

        public Criteria andCasetitleIsNull() {
            addCriterion("casetitle is null");
            return (Criteria) this;
        }

        public Criteria andCasetitleIsNotNull() {
            addCriterion("casetitle is not null");
            return (Criteria) this;
        }

        public Criteria andCasetitleEqualTo(String value) {
            addCriterion("casetitle =", value, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleNotEqualTo(String value) {
            addCriterion("casetitle <>", value, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleGreaterThan(String value) {
            addCriterion("casetitle >", value, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleGreaterThanOrEqualTo(String value) {
            addCriterion("casetitle >=", value, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleLessThan(String value) {
            addCriterion("casetitle <", value, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleLessThanOrEqualTo(String value) {
            addCriterion("casetitle <=", value, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleLike(String value) {
            addCriterion("casetitle like", value, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleNotLike(String value) {
            addCriterion("casetitle not like", value, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleIn(List<String> values) {
            addCriterion("casetitle in", values, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleNotIn(List<String> values) {
            addCriterion("casetitle not in", values, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleBetween(String value1, String value2) {
            addCriterion("casetitle between", value1, value2, "casetitle");
            return (Criteria) this;
        }

        public Criteria andCasetitleNotBetween(String value1, String value2) {
            addCriterion("casetitle not between", value1, value2, "casetitle");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(String value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(String value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(String value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(String value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(String value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLike(String value) {
            addCriterion("recommend like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotLike(String value) {
            addCriterion("recommend not like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<String> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<String> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(String value1, String value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(String value1, String value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andTcidIsNull() {
            addCriterion("tcid is null");
            return (Criteria) this;
        }

        public Criteria andTcidIsNotNull() {
            addCriterion("tcid is not null");
            return (Criteria) this;
        }

        public Criteria andTcidEqualTo(Integer value) {
            addCriterion("tcid =", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotEqualTo(Integer value) {
            addCriterion("tcid <>", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThan(Integer value) {
            addCriterion("tcid >", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tcid >=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThan(Integer value) {
            addCriterion("tcid <", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidLessThanOrEqualTo(Integer value) {
            addCriterion("tcid <=", value, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidIn(List<Integer> values) {
            addCriterion("tcid in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotIn(List<Integer> values) {
            addCriterion("tcid not in", values, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidBetween(Integer value1, Integer value2) {
            addCriterion("tcid between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andTcidNotBetween(Integer value1, Integer value2) {
            addCriterion("tcid not between", value1, value2, "tcid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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