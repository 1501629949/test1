package org.bwf.study.model;

import java.util.ArrayList;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandExample() {
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandSortIsNull() {
            addCriterion("brand_sort is null");
            return (Criteria) this;
        }

        public Criteria andBrandSortIsNotNull() {
            addCriterion("brand_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBrandSortEqualTo(Integer value) {
            addCriterion("brand_sort =", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortNotEqualTo(Integer value) {
            addCriterion("brand_sort <>", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortGreaterThan(Integer value) {
            addCriterion("brand_sort >", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_sort >=", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortLessThan(Integer value) {
            addCriterion("brand_sort <", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortLessThanOrEqualTo(Integer value) {
            addCriterion("brand_sort <=", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortIn(List<Integer> values) {
            addCriterion("brand_sort in", values, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortNotIn(List<Integer> values) {
            addCriterion("brand_sort not in", values, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortBetween(Integer value1, Integer value2) {
            addCriterion("brand_sort between", value1, value2, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_sort not between", value1, value2, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandEnableIsNull() {
            addCriterion("brand_enable is null");
            return (Criteria) this;
        }

        public Criteria andBrandEnableIsNotNull() {
            addCriterion("brand_enable is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEnableEqualTo(Byte value) {
            addCriterion("brand_enable =", value, "brandEnable");
            return (Criteria) this;
        }

        public Criteria andBrandEnableNotEqualTo(Byte value) {
            addCriterion("brand_enable <>", value, "brandEnable");
            return (Criteria) this;
        }

        public Criteria andBrandEnableGreaterThan(Byte value) {
            addCriterion("brand_enable >", value, "brandEnable");
            return (Criteria) this;
        }

        public Criteria andBrandEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("brand_enable >=", value, "brandEnable");
            return (Criteria) this;
        }

        public Criteria andBrandEnableLessThan(Byte value) {
            addCriterion("brand_enable <", value, "brandEnable");
            return (Criteria) this;
        }

        public Criteria andBrandEnableLessThanOrEqualTo(Byte value) {
            addCriterion("brand_enable <=", value, "brandEnable");
            return (Criteria) this;
        }

        public Criteria andBrandEnableIn(List<Byte> values) {
            addCriterion("brand_enable in", values, "brandEnable");
            return (Criteria) this;
        }

        public Criteria andBrandEnableNotIn(List<Byte> values) {
            addCriterion("brand_enable not in", values, "brandEnable");
            return (Criteria) this;
        }

        public Criteria andBrandEnableBetween(Byte value1, Byte value2) {
            addCriterion("brand_enable between", value1, value2, "brandEnable");
            return (Criteria) this;
        }

        public Criteria andBrandEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("brand_enable not between", value1, value2, "brandEnable");
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