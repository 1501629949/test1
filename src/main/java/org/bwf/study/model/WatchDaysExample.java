package org.bwf.study.model;

import java.util.ArrayList;
import java.util.List;

public class WatchDaysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WatchDaysExample() {
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

        public Criteria andWdIdIsNull() {
            addCriterion("wd_id is null");
            return (Criteria) this;
        }

        public Criteria andWdIdIsNotNull() {
            addCriterion("wd_id is not null");
            return (Criteria) this;
        }

        public Criteria andWdIdEqualTo(Integer value) {
            addCriterion("wd_id =", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotEqualTo(Integer value) {
            addCriterion("wd_id <>", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdGreaterThan(Integer value) {
            addCriterion("wd_id >", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_id >=", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdLessThan(Integer value) {
            addCriterion("wd_id <", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdLessThanOrEqualTo(Integer value) {
            addCriterion("wd_id <=", value, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdIn(List<Integer> values) {
            addCriterion("wd_id in", values, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotIn(List<Integer> values) {
            addCriterion("wd_id not in", values, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdBetween(Integer value1, Integer value2) {
            addCriterion("wd_id between", value1, value2, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_id not between", value1, value2, "wdId");
            return (Criteria) this;
        }

        public Criteria andWdDateIsNull() {
            addCriterion("wd_date is null");
            return (Criteria) this;
        }

        public Criteria andWdDateIsNotNull() {
            addCriterion("wd_date is not null");
            return (Criteria) this;
        }

        public Criteria andWdDateEqualTo(String value) {
            addCriterion("wd_date =", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateNotEqualTo(String value) {
            addCriterion("wd_date <>", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateGreaterThan(String value) {
            addCriterion("wd_date >", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateGreaterThanOrEqualTo(String value) {
            addCriterion("wd_date >=", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateLessThan(String value) {
            addCriterion("wd_date <", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateLessThanOrEqualTo(String value) {
            addCriterion("wd_date <=", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateLike(String value) {
            addCriterion("wd_date like", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateNotLike(String value) {
            addCriterion("wd_date not like", value, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateIn(List<String> values) {
            addCriterion("wd_date in", values, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateNotIn(List<String> values) {
            addCriterion("wd_date not in", values, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateBetween(String value1, String value2) {
            addCriterion("wd_date between", value1, value2, "wdDate");
            return (Criteria) this;
        }

        public Criteria andWdDateNotBetween(String value1, String value2) {
            addCriterion("wd_date not between", value1, value2, "wdDate");
            return (Criteria) this;
        }

        public Criteria andCmaIdIsNull() {
            addCriterion("cma_id is null");
            return (Criteria) this;
        }

        public Criteria andCmaIdIsNotNull() {
            addCriterion("cma_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmaIdEqualTo(Integer value) {
            addCriterion("cma_id =", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdNotEqualTo(Integer value) {
            addCriterion("cma_id <>", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdGreaterThan(Integer value) {
            addCriterion("cma_id >", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cma_id >=", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdLessThan(Integer value) {
            addCriterion("cma_id <", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdLessThanOrEqualTo(Integer value) {
            addCriterion("cma_id <=", value, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdIn(List<Integer> values) {
            addCriterion("cma_id in", values, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdNotIn(List<Integer> values) {
            addCriterion("cma_id not in", values, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdBetween(Integer value1, Integer value2) {
            addCriterion("cma_id between", value1, value2, "cmaId");
            return (Criteria) this;
        }

        public Criteria andCmaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cma_id not between", value1, value2, "cmaId");
            return (Criteria) this;
        }

        public Criteria andFilmIdIsNull() {
            addCriterion("film_id is null");
            return (Criteria) this;
        }

        public Criteria andFilmIdIsNotNull() {
            addCriterion("film_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilmIdEqualTo(Integer value) {
            addCriterion("film_id =", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotEqualTo(Integer value) {
            addCriterion("film_id <>", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThan(Integer value) {
            addCriterion("film_id >", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("film_id >=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThan(Integer value) {
            addCriterion("film_id <", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThanOrEqualTo(Integer value) {
            addCriterion("film_id <=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdIn(List<Integer> values) {
            addCriterion("film_id in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotIn(List<Integer> values) {
            addCriterion("film_id not in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdBetween(Integer value1, Integer value2) {
            addCriterion("film_id between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("film_id not between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andWdEnableIsNull() {
            addCriterion("wd_enable is null");
            return (Criteria) this;
        }

        public Criteria andWdEnableIsNotNull() {
            addCriterion("wd_enable is not null");
            return (Criteria) this;
        }

        public Criteria andWdEnableEqualTo(Byte value) {
            addCriterion("wd_enable =", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableNotEqualTo(Byte value) {
            addCriterion("wd_enable <>", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableGreaterThan(Byte value) {
            addCriterion("wd_enable >", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("wd_enable >=", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableLessThan(Byte value) {
            addCriterion("wd_enable <", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableLessThanOrEqualTo(Byte value) {
            addCriterion("wd_enable <=", value, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableIn(List<Byte> values) {
            addCriterion("wd_enable in", values, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableNotIn(List<Byte> values) {
            addCriterion("wd_enable not in", values, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableBetween(Byte value1, Byte value2) {
            addCriterion("wd_enable between", value1, value2, "wdEnable");
            return (Criteria) this;
        }

        public Criteria andWdEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("wd_enable not between", value1, value2, "wdEnable");
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