package org.bwf.study.model;

import java.util.ArrayList;
import java.util.List;

public class RegionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegionsExample() {
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

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNull() {
            addCriterion("region_name is null");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNotNull() {
            addCriterion("region_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNameEqualTo(String value) {
            addCriterion("region_name =", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotEqualTo(String value) {
            addCriterion("region_name <>", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThan(String value) {
            addCriterion("region_name >", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThanOrEqualTo(String value) {
            addCriterion("region_name >=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThan(String value) {
            addCriterion("region_name <", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThanOrEqualTo(String value) {
            addCriterion("region_name <=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLike(String value) {
            addCriterion("region_name like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotLike(String value) {
            addCriterion("region_name not like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameIn(List<String> values) {
            addCriterion("region_name in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotIn(List<String> values) {
            addCriterion("region_name not in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameBetween(String value1, String value2) {
            addCriterion("region_name between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotBetween(String value1, String value2) {
            addCriterion("region_name not between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionParentidIsNull() {
            addCriterion("region_parentid is null");
            return (Criteria) this;
        }

        public Criteria andRegionParentidIsNotNull() {
            addCriterion("region_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andRegionParentidEqualTo(Integer value) {
            addCriterion("region_parentid =", value, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionParentidNotEqualTo(Integer value) {
            addCriterion("region_parentid <>", value, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionParentidGreaterThan(Integer value) {
            addCriterion("region_parentid >", value, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_parentid >=", value, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionParentidLessThan(Integer value) {
            addCriterion("region_parentid <", value, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionParentidLessThanOrEqualTo(Integer value) {
            addCriterion("region_parentid <=", value, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionParentidIn(List<Integer> values) {
            addCriterion("region_parentid in", values, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionParentidNotIn(List<Integer> values) {
            addCriterion("region_parentid not in", values, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionParentidBetween(Integer value1, Integer value2) {
            addCriterion("region_parentid between", value1, value2, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("region_parentid not between", value1, value2, "regionParentid");
            return (Criteria) this;
        }

        public Criteria andRegionEnableIsNull() {
            addCriterion("region_enable is null");
            return (Criteria) this;
        }

        public Criteria andRegionEnableIsNotNull() {
            addCriterion("region_enable is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEnableEqualTo(Byte value) {
            addCriterion("region_enable =", value, "regionEnable");
            return (Criteria) this;
        }

        public Criteria andRegionEnableNotEqualTo(Byte value) {
            addCriterion("region_enable <>", value, "regionEnable");
            return (Criteria) this;
        }

        public Criteria andRegionEnableGreaterThan(Byte value) {
            addCriterion("region_enable >", value, "regionEnable");
            return (Criteria) this;
        }

        public Criteria andRegionEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("region_enable >=", value, "regionEnable");
            return (Criteria) this;
        }

        public Criteria andRegionEnableLessThan(Byte value) {
            addCriterion("region_enable <", value, "regionEnable");
            return (Criteria) this;
        }

        public Criteria andRegionEnableLessThanOrEqualTo(Byte value) {
            addCriterion("region_enable <=", value, "regionEnable");
            return (Criteria) this;
        }

        public Criteria andRegionEnableIn(List<Byte> values) {
            addCriterion("region_enable in", values, "regionEnable");
            return (Criteria) this;
        }

        public Criteria andRegionEnableNotIn(List<Byte> values) {
            addCriterion("region_enable not in", values, "regionEnable");
            return (Criteria) this;
        }

        public Criteria andRegionEnableBetween(Byte value1, Byte value2) {
            addCriterion("region_enable between", value1, value2, "regionEnable");
            return (Criteria) this;
        }

        public Criteria andRegionEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("region_enable not between", value1, value2, "regionEnable");
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