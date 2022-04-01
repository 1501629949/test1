package org.bwf.study.model;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCmmtIdIsNull() {
            addCriterion("cmmt_id is null");
            return (Criteria) this;
        }

        public Criteria andCmmtIdIsNotNull() {
            addCriterion("cmmt_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmmtIdEqualTo(Integer value) {
            addCriterion("cmmt_id =", value, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtIdNotEqualTo(Integer value) {
            addCriterion("cmmt_id <>", value, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtIdGreaterThan(Integer value) {
            addCriterion("cmmt_id >", value, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmmt_id >=", value, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtIdLessThan(Integer value) {
            addCriterion("cmmt_id <", value, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtIdLessThanOrEqualTo(Integer value) {
            addCriterion("cmmt_id <=", value, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtIdIn(List<Integer> values) {
            addCriterion("cmmt_id in", values, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtIdNotIn(List<Integer> values) {
            addCriterion("cmmt_id not in", values, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtIdBetween(Integer value1, Integer value2) {
            addCriterion("cmmt_id between", value1, value2, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cmmt_id not between", value1, value2, "cmmtId");
            return (Criteria) this;
        }

        public Criteria andCmmtDescIsNull() {
            addCriterion("cmmt_desc is null");
            return (Criteria) this;
        }

        public Criteria andCmmtDescIsNotNull() {
            addCriterion("cmmt_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCmmtDescEqualTo(String value) {
            addCriterion("cmmt_desc =", value, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescNotEqualTo(String value) {
            addCriterion("cmmt_desc <>", value, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescGreaterThan(String value) {
            addCriterion("cmmt_desc >", value, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescGreaterThanOrEqualTo(String value) {
            addCriterion("cmmt_desc >=", value, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescLessThan(String value) {
            addCriterion("cmmt_desc <", value, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescLessThanOrEqualTo(String value) {
            addCriterion("cmmt_desc <=", value, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescLike(String value) {
            addCriterion("cmmt_desc like", value, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescNotLike(String value) {
            addCriterion("cmmt_desc not like", value, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescIn(List<String> values) {
            addCriterion("cmmt_desc in", values, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescNotIn(List<String> values) {
            addCriterion("cmmt_desc not in", values, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescBetween(String value1, String value2) {
            addCriterion("cmmt_desc between", value1, value2, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtDescNotBetween(String value1, String value2) {
            addCriterion("cmmt_desc not between", value1, value2, "cmmtDesc");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreIsNull() {
            addCriterion("cmmt_score is null");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreIsNotNull() {
            addCriterion("cmmt_score is not null");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreEqualTo(Byte value) {
            addCriterion("cmmt_score =", value, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreNotEqualTo(Byte value) {
            addCriterion("cmmt_score <>", value, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreGreaterThan(Byte value) {
            addCriterion("cmmt_score >", value, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("cmmt_score >=", value, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreLessThan(Byte value) {
            addCriterion("cmmt_score <", value, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreLessThanOrEqualTo(Byte value) {
            addCriterion("cmmt_score <=", value, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreIn(List<Byte> values) {
            addCriterion("cmmt_score in", values, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreNotIn(List<Byte> values) {
            addCriterion("cmmt_score not in", values, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreBetween(Byte value1, Byte value2) {
            addCriterion("cmmt_score between", value1, value2, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtScoreNotBetween(Byte value1, Byte value2) {
            addCriterion("cmmt_score not between", value1, value2, "cmmtScore");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeIsNull() {
            addCriterion("cmmt_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeIsNotNull() {
            addCriterion("cmmt_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeEqualTo(String value) {
            addCriterion("cmmt_createtime =", value, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeNotEqualTo(String value) {
            addCriterion("cmmt_createtime <>", value, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeGreaterThan(String value) {
            addCriterion("cmmt_createtime >", value, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("cmmt_createtime >=", value, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeLessThan(String value) {
            addCriterion("cmmt_createtime <", value, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("cmmt_createtime <=", value, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeLike(String value) {
            addCriterion("cmmt_createtime like", value, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeNotLike(String value) {
            addCriterion("cmmt_createtime not like", value, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeIn(List<String> values) {
            addCriterion("cmmt_createtime in", values, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeNotIn(List<String> values) {
            addCriterion("cmmt_createtime not in", values, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeBetween(String value1, String value2) {
            addCriterion("cmmt_createtime between", value1, value2, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtCreatetimeNotBetween(String value1, String value2) {
            addCriterion("cmmt_createtime not between", value1, value2, "cmmtCreatetime");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodIsNull() {
            addCriterion("cmmt_good is null");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodIsNotNull() {
            addCriterion("cmmt_good is not null");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodEqualTo(Integer value) {
            addCriterion("cmmt_good =", value, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodNotEqualTo(Integer value) {
            addCriterion("cmmt_good <>", value, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodGreaterThan(Integer value) {
            addCriterion("cmmt_good >", value, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmmt_good >=", value, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodLessThan(Integer value) {
            addCriterion("cmmt_good <", value, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodLessThanOrEqualTo(Integer value) {
            addCriterion("cmmt_good <=", value, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodIn(List<Integer> values) {
            addCriterion("cmmt_good in", values, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodNotIn(List<Integer> values) {
            addCriterion("cmmt_good not in", values, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodBetween(Integer value1, Integer value2) {
            addCriterion("cmmt_good between", value1, value2, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCmmtGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("cmmt_good not between", value1, value2, "cmmtGood");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustAvatIsNull() {
            addCriterion("cust_avat is null");
            return (Criteria) this;
        }

        public Criteria andCustAvatIsNotNull() {
            addCriterion("cust_avat is not null");
            return (Criteria) this;
        }

        public Criteria andCustAvatEqualTo(String value) {
            addCriterion("cust_avat =", value, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatNotEqualTo(String value) {
            addCriterion("cust_avat <>", value, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatGreaterThan(String value) {
            addCriterion("cust_avat >", value, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatGreaterThanOrEqualTo(String value) {
            addCriterion("cust_avat >=", value, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatLessThan(String value) {
            addCriterion("cust_avat <", value, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatLessThanOrEqualTo(String value) {
            addCriterion("cust_avat <=", value, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatLike(String value) {
            addCriterion("cust_avat like", value, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatNotLike(String value) {
            addCriterion("cust_avat not like", value, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatIn(List<String> values) {
            addCriterion("cust_avat in", values, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatNotIn(List<String> values) {
            addCriterion("cust_avat not in", values, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatBetween(String value1, String value2) {
            addCriterion("cust_avat between", value1, value2, "custAvat");
            return (Criteria) this;
        }

        public Criteria andCustAvatNotBetween(String value1, String value2) {
            addCriterion("cust_avat not between", value1, value2, "custAvat");
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