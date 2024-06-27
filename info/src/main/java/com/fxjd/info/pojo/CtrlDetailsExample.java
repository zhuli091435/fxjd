package com.fxjd.info.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtrlDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtrlDetailsExample() {
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

        public Criteria andCtrlRecordIDIsNull() {
            addCriterion("CtrlRecordID is null");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDIsNotNull() {
            addCriterion("CtrlRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDEqualTo(Integer value) {
            addCriterion("CtrlRecordID =", value, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDNotEqualTo(Integer value) {
            addCriterion("CtrlRecordID <>", value, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDGreaterThan(Integer value) {
            addCriterion("CtrlRecordID >", value, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CtrlRecordID >=", value, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDLessThan(Integer value) {
            addCriterion("CtrlRecordID <", value, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDLessThanOrEqualTo(Integer value) {
            addCriterion("CtrlRecordID <=", value, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDIn(List<Integer> values) {
            addCriterion("CtrlRecordID in", values, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDNotIn(List<Integer> values) {
            addCriterion("CtrlRecordID not in", values, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDBetween(Integer value1, Integer value2) {
            addCriterion("CtrlRecordID between", value1, value2, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andCtrlRecordIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CtrlRecordID not between", value1, value2, "ctrlRecordID");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("Time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("Time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("Time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("Time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("Time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("Time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("Time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("Time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("Time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("Time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("Time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("Record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("Record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(String value) {
            addCriterion("Record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(String value) {
            addCriterion("Record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(String value) {
            addCriterion("Record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(String value) {
            addCriterion("Record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(String value) {
            addCriterion("Record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(String value) {
            addCriterion("Record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLike(String value) {
            addCriterion("Record like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotLike(String value) {
            addCriterion("Record not like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<String> values) {
            addCriterion("Record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<String> values) {
            addCriterion("Record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(String value1, String value2) {
            addCriterion("Record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(String value1, String value2) {
            addCriterion("Record not between", value1, value2, "record");
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