package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarnLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarnLogExample() {
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

        public Criteria andWarnTimeIsNull() {
            addCriterion("WarnTime is null");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIsNotNull() {
            addCriterion("WarnTime is not null");
            return (Criteria) this;
        }

        public Criteria andWarnTimeEqualTo(Date value) {
            addCriterion("WarnTime =", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotEqualTo(Date value) {
            addCriterion("WarnTime <>", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeGreaterThan(Date value) {
            addCriterion("WarnTime >", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WarnTime >=", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeLessThan(Date value) {
            addCriterion("WarnTime <", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeLessThanOrEqualTo(Date value) {
            addCriterion("WarnTime <=", value, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeIn(List<Date> values) {
            addCriterion("WarnTime in", values, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotIn(List<Date> values) {
            addCriterion("WarnTime not in", values, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeBetween(Date value1, Date value2) {
            addCriterion("WarnTime between", value1, value2, "warnTime");
            return (Criteria) this;
        }

        public Criteria andWarnTimeNotBetween(Date value1, Date value2) {
            addCriterion("WarnTime not between", value1, value2, "warnTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeIsNull() {
            addCriterion("FreeTime is null");
            return (Criteria) this;
        }

        public Criteria andFreeTimeIsNotNull() {
            addCriterion("FreeTime is not null");
            return (Criteria) this;
        }

        public Criteria andFreeTimeEqualTo(Date value) {
            addCriterion("FreeTime =", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeNotEqualTo(Date value) {
            addCriterion("FreeTime <>", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeGreaterThan(Date value) {
            addCriterion("FreeTime >", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FreeTime >=", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeLessThan(Date value) {
            addCriterion("FreeTime <", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeLessThanOrEqualTo(Date value) {
            addCriterion("FreeTime <=", value, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeIn(List<Date> values) {
            addCriterion("FreeTime in", values, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeNotIn(List<Date> values) {
            addCriterion("FreeTime not in", values, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeBetween(Date value1, Date value2) {
            addCriterion("FreeTime between", value1, value2, "freeTime");
            return (Criteria) this;
        }

        public Criteria andFreeTimeNotBetween(Date value1, Date value2) {
            addCriterion("FreeTime not between", value1, value2, "freeTime");
            return (Criteria) this;
        }

        public Criteria andWarnStateIsNull() {
            addCriterion("WarnState is null");
            return (Criteria) this;
        }

        public Criteria andWarnStateIsNotNull() {
            addCriterion("WarnState is not null");
            return (Criteria) this;
        }

        public Criteria andWarnStateEqualTo(String value) {
            addCriterion("WarnState =", value, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateNotEqualTo(String value) {
            addCriterion("WarnState <>", value, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateGreaterThan(String value) {
            addCriterion("WarnState >", value, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateGreaterThanOrEqualTo(String value) {
            addCriterion("WarnState >=", value, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateLessThan(String value) {
            addCriterion("WarnState <", value, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateLessThanOrEqualTo(String value) {
            addCriterion("WarnState <=", value, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateLike(String value) {
            addCriterion("WarnState like", value, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateNotLike(String value) {
            addCriterion("WarnState not like", value, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateIn(List<String> values) {
            addCriterion("WarnState in", values, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateNotIn(List<String> values) {
            addCriterion("WarnState not in", values, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateBetween(String value1, String value2) {
            addCriterion("WarnState between", value1, value2, "warnState");
            return (Criteria) this;
        }

        public Criteria andWarnStateNotBetween(String value1, String value2) {
            addCriterion("WarnState not between", value1, value2, "warnState");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("Value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("Value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(BigDecimal value) {
            addCriterion("Value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(BigDecimal value) {
            addCriterion("Value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(BigDecimal value) {
            addCriterion("Value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(BigDecimal value) {
            addCriterion("Value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<BigDecimal> values) {
            addCriterion("Value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<BigDecimal> values) {
            addCriterion("Value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andWarnTypeIsNull() {
            addCriterion("WarnType is null");
            return (Criteria) this;
        }

        public Criteria andWarnTypeIsNotNull() {
            addCriterion("WarnType is not null");
            return (Criteria) this;
        }

        public Criteria andWarnTypeEqualTo(String value) {
            addCriterion("WarnType =", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotEqualTo(String value) {
            addCriterion("WarnType <>", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeGreaterThan(String value) {
            addCriterion("WarnType >", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WarnType >=", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeLessThan(String value) {
            addCriterion("WarnType <", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeLessThanOrEqualTo(String value) {
            addCriterion("WarnType <=", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeLike(String value) {
            addCriterion("WarnType like", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotLike(String value) {
            addCriterion("WarnType not like", value, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeIn(List<String> values) {
            addCriterion("WarnType in", values, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotIn(List<String> values) {
            addCriterion("WarnType not in", values, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeBetween(String value1, String value2) {
            addCriterion("WarnType between", value1, value2, "warnType");
            return (Criteria) this;
        }

        public Criteria andWarnTypeNotBetween(String value1, String value2) {
            addCriterion("WarnType not between", value1, value2, "warnType");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
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