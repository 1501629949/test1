package org.bwf.study.model;

import java.util.ArrayList;
import java.util.List;

public class SpicalCinemaRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpicalCinemaRelExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNull() {
            addCriterion("special_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNotNull() {
            addCriterion("special_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdEqualTo(Integer value) {
            addCriterion("special_id =", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotEqualTo(Integer value) {
            addCriterion("special_id <>", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThan(Integer value) {
            addCriterion("special_id >", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_id >=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThan(Integer value) {
            addCriterion("special_id <", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThanOrEqualTo(Integer value) {
            addCriterion("special_id <=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIn(List<Integer> values) {
            addCriterion("special_id in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotIn(List<Integer> values) {
            addCriterion("special_id not in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdBetween(Integer value1, Integer value2) {
            addCriterion("special_id between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("special_id not between", value1, value2, "specialId");
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