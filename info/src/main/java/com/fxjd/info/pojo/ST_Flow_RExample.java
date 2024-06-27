package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_Flow_RExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_Flow_RExample() {
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

        public Criteria andTMIsNull() {
            addCriterion("TM is null");
            return (Criteria) this;
        }

        public Criteria andTMIsNotNull() {
            addCriterion("TM is not null");
            return (Criteria) this;
        }

        public Criteria andTMEqualTo(Date value) {
            addCriterion("TM =", value, "TM");
            return (Criteria) this;
        }

        public Criteria andTMNotEqualTo(Date value) {
            addCriterion("TM <>", value, "TM");
            return (Criteria) this;
        }

        public Criteria andTMGreaterThan(Date value) {
            addCriterion("TM >", value, "TM");
            return (Criteria) this;
        }

        public Criteria andTMGreaterThanOrEqualTo(Date value) {
            addCriterion("TM >=", value, "TM");
            return (Criteria) this;
        }

        public Criteria andTMLessThan(Date value) {
            addCriterion("TM <", value, "TM");
            return (Criteria) this;
        }

        public Criteria andTMLessThanOrEqualTo(Date value) {
            addCriterion("TM <=", value, "TM");
            return (Criteria) this;
        }

        public Criteria andTMIn(List<Date> values) {
            addCriterion("TM in", values, "TM");
            return (Criteria) this;
        }

        public Criteria andTMNotIn(List<Date> values) {
            addCriterion("TM not in", values, "TM");
            return (Criteria) this;
        }

        public Criteria andTMBetween(Date value1, Date value2) {
            addCriterion("TM between", value1, value2, "TM");
            return (Criteria) this;
        }

        public Criteria andTMNotBetween(Date value1, Date value2) {
            addCriterion("TM not between", value1, value2, "TM");
            return (Criteria) this;
        }

        public Criteria andEQPNOIsNull() {
            addCriterion("EQPNO is null");
            return (Criteria) this;
        }

        public Criteria andEQPNOIsNotNull() {
            addCriterion("EQPNO is not null");
            return (Criteria) this;
        }

        public Criteria andEQPNOEqualTo(String value) {
            addCriterion("EQPNO =", value, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNONotEqualTo(String value) {
            addCriterion("EQPNO <>", value, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNOGreaterThan(String value) {
            addCriterion("EQPNO >", value, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNOGreaterThanOrEqualTo(String value) {
            addCriterion("EQPNO >=", value, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNOLessThan(String value) {
            addCriterion("EQPNO <", value, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNOLessThanOrEqualTo(String value) {
            addCriterion("EQPNO <=", value, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNOLike(String value) {
            addCriterion("EQPNO like", value, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNONotLike(String value) {
            addCriterion("EQPNO not like", value, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNOIn(List<String> values) {
            addCriterion("EQPNO in", values, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNONotIn(List<String> values) {
            addCriterion("EQPNO not in", values, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNOBetween(String value1, String value2) {
            addCriterion("EQPNO between", value1, value2, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andEQPNONotBetween(String value1, String value2) {
            addCriterion("EQPNO not between", value1, value2, "EQPNO");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowIsNull() {
            addCriterion("PipelineFlow is null");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowIsNotNull() {
            addCriterion("PipelineFlow is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow =", value, "pipelineFlow");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowNotEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow <>", value, "pipelineFlow");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowGreaterThan(BigDecimal value) {
            addCriterion("PipelineFlow >", value, "pipelineFlow");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow >=", value, "pipelineFlow");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowLessThan(BigDecimal value) {
            addCriterion("PipelineFlow <", value, "pipelineFlow");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow <=", value, "pipelineFlow");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowIn(List<BigDecimal> values) {
            addCriterion("PipelineFlow in", values, "pipelineFlow");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowNotIn(List<BigDecimal> values) {
            addCriterion("PipelineFlow not in", values, "pipelineFlow");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelineFlow between", value1, value2, "pipelineFlow");
            return (Criteria) this;
        }

        public Criteria andPipelineFlowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelineFlow not between", value1, value2, "pipelineFlow");
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