package com.fxjd.info.pojo;

import java.util.ArrayList;
import java.util.List;

public class BroadcastExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BroadcastExample() {
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

        public Criteria andBroadcastIDIsNull() {
            addCriterion("BroadcastID is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDIsNotNull() {
            addCriterion("BroadcastID is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDEqualTo(Integer value) {
            addCriterion("BroadcastID =", value, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDNotEqualTo(Integer value) {
            addCriterion("BroadcastID <>", value, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDGreaterThan(Integer value) {
            addCriterion("BroadcastID >", value, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("BroadcastID >=", value, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDLessThan(Integer value) {
            addCriterion("BroadcastID <", value, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDLessThanOrEqualTo(Integer value) {
            addCriterion("BroadcastID <=", value, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDIn(List<Integer> values) {
            addCriterion("BroadcastID in", values, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDNotIn(List<Integer> values) {
            addCriterion("BroadcastID not in", values, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDBetween(Integer value1, Integer value2) {
            addCriterion("BroadcastID between", value1, value2, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastIDNotBetween(Integer value1, Integer value2) {
            addCriterion("BroadcastID not between", value1, value2, "broadcastID");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointIsNull() {
            addCriterion("BroadcastEndpoint is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointIsNotNull() {
            addCriterion("BroadcastEndpoint is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointEqualTo(String value) {
            addCriterion("BroadcastEndpoint =", value, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointNotEqualTo(String value) {
            addCriterion("BroadcastEndpoint <>", value, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointGreaterThan(String value) {
            addCriterion("BroadcastEndpoint >", value, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointGreaterThanOrEqualTo(String value) {
            addCriterion("BroadcastEndpoint >=", value, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointLessThan(String value) {
            addCriterion("BroadcastEndpoint <", value, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointLessThanOrEqualTo(String value) {
            addCriterion("BroadcastEndpoint <=", value, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointLike(String value) {
            addCriterion("BroadcastEndpoint like", value, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointNotLike(String value) {
            addCriterion("BroadcastEndpoint not like", value, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointIn(List<String> values) {
            addCriterion("BroadcastEndpoint in", values, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointNotIn(List<String> values) {
            addCriterion("BroadcastEndpoint not in", values, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointBetween(String value1, String value2) {
            addCriterion("BroadcastEndpoint between", value1, value2, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointNotBetween(String value1, String value2) {
            addCriterion("BroadcastEndpoint not between", value1, value2, "broadcastEndpoint");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameIsNull() {
            addCriterion("BroadcastName is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameIsNotNull() {
            addCriterion("BroadcastName is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameEqualTo(String value) {
            addCriterion("BroadcastName =", value, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameNotEqualTo(String value) {
            addCriterion("BroadcastName <>", value, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameGreaterThan(String value) {
            addCriterion("BroadcastName >", value, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameGreaterThanOrEqualTo(String value) {
            addCriterion("BroadcastName >=", value, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameLessThan(String value) {
            addCriterion("BroadcastName <", value, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameLessThanOrEqualTo(String value) {
            addCriterion("BroadcastName <=", value, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameLike(String value) {
            addCriterion("BroadcastName like", value, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameNotLike(String value) {
            addCriterion("BroadcastName not like", value, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameIn(List<String> values) {
            addCriterion("BroadcastName in", values, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameNotIn(List<String> values) {
            addCriterion("BroadcastName not in", values, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameBetween(String value1, String value2) {
            addCriterion("BroadcastName between", value1, value2, "broadcastName");
            return (Criteria) this;
        }

        public Criteria andBroadcastNameNotBetween(String value1, String value2) {
            addCriterion("BroadcastName not between", value1, value2, "broadcastName");
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