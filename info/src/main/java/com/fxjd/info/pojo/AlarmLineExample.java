package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AlarmLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmLineExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Integer value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Integer value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Integer value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Integer> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andSTCDIsNull() {
            addCriterion("STCD is null");
            return (Criteria) this;
        }

        public Criteria andSTCDIsNotNull() {
            addCriterion("STCD is not null");
            return (Criteria) this;
        }

        public Criteria andSTCDEqualTo(String value) {
            addCriterion("STCD =", value, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDNotEqualTo(String value) {
            addCriterion("STCD <>", value, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDGreaterThan(String value) {
            addCriterion("STCD >", value, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDGreaterThanOrEqualTo(String value) {
            addCriterion("STCD >=", value, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDLessThan(String value) {
            addCriterion("STCD <", value, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDLessThanOrEqualTo(String value) {
            addCriterion("STCD <=", value, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDLike(String value) {
            addCriterion("STCD like", value, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDNotLike(String value) {
            addCriterion("STCD not like", value, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDIn(List<String> values) {
            addCriterion("STCD in", values, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDNotIn(List<String> values) {
            addCriterion("STCD not in", values, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDBetween(String value1, String value2) {
            addCriterion("STCD between", value1, value2, "STCD");
            return (Criteria) this;
        }

        public Criteria andSTCDNotBetween(String value1, String value2) {
            addCriterion("STCD not between", value1, value2, "STCD");
            return (Criteria) this;
        }

        public Criteria andItemIDIsNull() {
            addCriterion("ItemID is null");
            return (Criteria) this;
        }

        public Criteria andItemIDIsNotNull() {
            addCriterion("ItemID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIDEqualTo(String value) {
            addCriterion("ItemID =", value, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDNotEqualTo(String value) {
            addCriterion("ItemID <>", value, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDGreaterThan(String value) {
            addCriterion("ItemID >", value, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDGreaterThanOrEqualTo(String value) {
            addCriterion("ItemID >=", value, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDLessThan(String value) {
            addCriterion("ItemID <", value, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDLessThanOrEqualTo(String value) {
            addCriterion("ItemID <=", value, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDLike(String value) {
            addCriterion("ItemID like", value, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDNotLike(String value) {
            addCriterion("ItemID not like", value, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDIn(List<String> values) {
            addCriterion("ItemID in", values, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDNotIn(List<String> values) {
            addCriterion("ItemID not in", values, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDBetween(String value1, String value2) {
            addCriterion("ItemID between", value1, value2, "itemID");
            return (Criteria) this;
        }

        public Criteria andItemIDNotBetween(String value1, String value2) {
            addCriterion("ItemID not between", value1, value2, "itemID");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNull() {
            addCriterion("MinValue is null");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNotNull() {
            addCriterion("MinValue is not null");
            return (Criteria) this;
        }

        public Criteria andMinValueEqualTo(BigDecimal value) {
            addCriterion("MinValue =", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotEqualTo(BigDecimal value) {
            addCriterion("MinValue <>", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThan(BigDecimal value) {
            addCriterion("MinValue >", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MinValue >=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThan(BigDecimal value) {
            addCriterion("MinValue <", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MinValue <=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueIn(List<BigDecimal> values) {
            addCriterion("MinValue in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotIn(List<BigDecimal> values) {
            addCriterion("MinValue not in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinValue between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinValue not between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNull() {
            addCriterion("MaxValue is null");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNotNull() {
            addCriterion("MaxValue is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValueEqualTo(BigDecimal value) {
            addCriterion("MaxValue =", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotEqualTo(BigDecimal value) {
            addCriterion("MaxValue <>", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThan(BigDecimal value) {
            addCriterion("MaxValue >", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxValue >=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThan(BigDecimal value) {
            addCriterion("MaxValue <", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MaxValue <=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIn(List<BigDecimal> values) {
            addCriterion("MaxValue in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotIn(List<BigDecimal> values) {
            addCriterion("MaxValue not in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxValue between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MaxValue not between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueIsNull() {
            addCriterion("ComparedValue is null");
            return (Criteria) this;
        }

        public Criteria andComparedValueIsNotNull() {
            addCriterion("ComparedValue is not null");
            return (Criteria) this;
        }

        public Criteria andComparedValueEqualTo(BigDecimal value) {
            addCriterion("ComparedValue =", value, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueNotEqualTo(BigDecimal value) {
            addCriterion("ComparedValue <>", value, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueGreaterThan(BigDecimal value) {
            addCriterion("ComparedValue >", value, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ComparedValue >=", value, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueLessThan(BigDecimal value) {
            addCriterion("ComparedValue <", value, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ComparedValue <=", value, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueIn(List<BigDecimal> values) {
            addCriterion("ComparedValue in", values, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueNotIn(List<BigDecimal> values) {
            addCriterion("ComparedValue not in", values, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ComparedValue between", value1, value2, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andComparedValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ComparedValue not between", value1, value2, "comparedValue");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("Describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("Describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("Describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("Describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("Describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("Describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("Describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("Describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("Describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("Describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("Describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("Describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("Describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("Describe not between", value1, value2, "describe");
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