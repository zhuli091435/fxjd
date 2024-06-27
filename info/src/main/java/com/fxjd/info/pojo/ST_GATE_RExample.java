package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_GATE_RExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_GATE_RExample() {
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

        public Criteria andEXKEYIsNull() {
            addCriterion("EXKEY is null");
            return (Criteria) this;
        }

        public Criteria andEXKEYIsNotNull() {
            addCriterion("EXKEY is not null");
            return (Criteria) this;
        }

        public Criteria andEXKEYEqualTo(String value) {
            addCriterion("EXKEY =", value, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYNotEqualTo(String value) {
            addCriterion("EXKEY <>", value, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYGreaterThan(String value) {
            addCriterion("EXKEY >", value, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYGreaterThanOrEqualTo(String value) {
            addCriterion("EXKEY >=", value, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYLessThan(String value) {
            addCriterion("EXKEY <", value, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYLessThanOrEqualTo(String value) {
            addCriterion("EXKEY <=", value, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYLike(String value) {
            addCriterion("EXKEY like", value, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYNotLike(String value) {
            addCriterion("EXKEY not like", value, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYIn(List<String> values) {
            addCriterion("EXKEY in", values, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYNotIn(List<String> values) {
            addCriterion("EXKEY not in", values, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYBetween(String value1, String value2) {
            addCriterion("EXKEY between", value1, value2, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEXKEYNotBetween(String value1, String value2) {
            addCriterion("EXKEY not between", value1, value2, "EXKEY");
            return (Criteria) this;
        }

        public Criteria andEQPTPIsNull() {
            addCriterion("EQPTP is null");
            return (Criteria) this;
        }

        public Criteria andEQPTPIsNotNull() {
            addCriterion("EQPTP is not null");
            return (Criteria) this;
        }

        public Criteria andEQPTPEqualTo(String value) {
            addCriterion("EQPTP =", value, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPNotEqualTo(String value) {
            addCriterion("EQPTP <>", value, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPGreaterThan(String value) {
            addCriterion("EQPTP >", value, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPGreaterThanOrEqualTo(String value) {
            addCriterion("EQPTP >=", value, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPLessThan(String value) {
            addCriterion("EQPTP <", value, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPLessThanOrEqualTo(String value) {
            addCriterion("EQPTP <=", value, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPLike(String value) {
            addCriterion("EQPTP like", value, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPNotLike(String value) {
            addCriterion("EQPTP not like", value, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPIn(List<String> values) {
            addCriterion("EQPTP in", values, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPNotIn(List<String> values) {
            addCriterion("EQPTP not in", values, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPBetween(String value1, String value2) {
            addCriterion("EQPTP between", value1, value2, "EQPTP");
            return (Criteria) this;
        }

        public Criteria andEQPTPNotBetween(String value1, String value2) {
            addCriterion("EQPTP not between", value1, value2, "EQPTP");
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

        public Criteria andGTOPNUMIsNull() {
            addCriterion("GTOPNUM is null");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMIsNotNull() {
            addCriterion("GTOPNUM is not null");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMEqualTo(Short value) {
            addCriterion("GTOPNUM =", value, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMNotEqualTo(Short value) {
            addCriterion("GTOPNUM <>", value, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMGreaterThan(Short value) {
            addCriterion("GTOPNUM >", value, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMGreaterThanOrEqualTo(Short value) {
            addCriterion("GTOPNUM >=", value, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMLessThan(Short value) {
            addCriterion("GTOPNUM <", value, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMLessThanOrEqualTo(Short value) {
            addCriterion("GTOPNUM <=", value, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMIn(List<Short> values) {
            addCriterion("GTOPNUM in", values, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMNotIn(List<Short> values) {
            addCriterion("GTOPNUM not in", values, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMBetween(Short value1, Short value2) {
            addCriterion("GTOPNUM between", value1, value2, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPNUMNotBetween(Short value1, Short value2) {
            addCriterion("GTOPNUM not between", value1, value2, "GTOPNUM");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTIsNull() {
            addCriterion("GTOPHGT is null");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTIsNotNull() {
            addCriterion("GTOPHGT is not null");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTEqualTo(BigDecimal value) {
            addCriterion("GTOPHGT =", value, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTNotEqualTo(BigDecimal value) {
            addCriterion("GTOPHGT <>", value, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTGreaterThan(BigDecimal value) {
            addCriterion("GTOPHGT >", value, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GTOPHGT >=", value, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTLessThan(BigDecimal value) {
            addCriterion("GTOPHGT <", value, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GTOPHGT <=", value, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTIn(List<BigDecimal> values) {
            addCriterion("GTOPHGT in", values, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTNotIn(List<BigDecimal> values) {
            addCriterion("GTOPHGT not in", values, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GTOPHGT between", value1, value2, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTOPHGTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GTOPHGT not between", value1, value2, "GTOPHGT");
            return (Criteria) this;
        }

        public Criteria andGTQIsNull() {
            addCriterion("GTQ is null");
            return (Criteria) this;
        }

        public Criteria andGTQIsNotNull() {
            addCriterion("GTQ is not null");
            return (Criteria) this;
        }

        public Criteria andGTQEqualTo(BigDecimal value) {
            addCriterion("GTQ =", value, "GTQ");
            return (Criteria) this;
        }

        public Criteria andGTQNotEqualTo(BigDecimal value) {
            addCriterion("GTQ <>", value, "GTQ");
            return (Criteria) this;
        }

        public Criteria andGTQGreaterThan(BigDecimal value) {
            addCriterion("GTQ >", value, "GTQ");
            return (Criteria) this;
        }

        public Criteria andGTQGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GTQ >=", value, "GTQ");
            return (Criteria) this;
        }

        public Criteria andGTQLessThan(BigDecimal value) {
            addCriterion("GTQ <", value, "GTQ");
            return (Criteria) this;
        }

        public Criteria andGTQLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GTQ <=", value, "GTQ");
            return (Criteria) this;
        }

        public Criteria andGTQIn(List<BigDecimal> values) {
            addCriterion("GTQ in", values, "GTQ");
            return (Criteria) this;
        }

        public Criteria andGTQNotIn(List<BigDecimal> values) {
            addCriterion("GTQ not in", values, "GTQ");
            return (Criteria) this;
        }

        public Criteria andGTQBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GTQ between", value1, value2, "GTQ");
            return (Criteria) this;
        }

        public Criteria andGTQNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GTQ not between", value1, value2, "GTQ");
            return (Criteria) this;
        }

        public Criteria andMSQMTIsNull() {
            addCriterion("MSQMT is null");
            return (Criteria) this;
        }

        public Criteria andMSQMTIsNotNull() {
            addCriterion("MSQMT is not null");
            return (Criteria) this;
        }

        public Criteria andMSQMTEqualTo(String value) {
            addCriterion("MSQMT =", value, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTNotEqualTo(String value) {
            addCriterion("MSQMT <>", value, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTGreaterThan(String value) {
            addCriterion("MSQMT >", value, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTGreaterThanOrEqualTo(String value) {
            addCriterion("MSQMT >=", value, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTLessThan(String value) {
            addCriterion("MSQMT <", value, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTLessThanOrEqualTo(String value) {
            addCriterion("MSQMT <=", value, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTLike(String value) {
            addCriterion("MSQMT like", value, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTNotLike(String value) {
            addCriterion("MSQMT not like", value, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTIn(List<String> values) {
            addCriterion("MSQMT in", values, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTNotIn(List<String> values) {
            addCriterion("MSQMT not in", values, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTBetween(String value1, String value2) {
            addCriterion("MSQMT between", value1, value2, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andMSQMTNotBetween(String value1, String value2) {
            addCriterion("MSQMT not between", value1, value2, "MSQMT");
            return (Criteria) this;
        }

        public Criteria andRunStateIsNull() {
            addCriterion("RunState is null");
            return (Criteria) this;
        }

        public Criteria andRunStateIsNotNull() {
            addCriterion("RunState is not null");
            return (Criteria) this;
        }

        public Criteria andRunStateEqualTo(Integer value) {
            addCriterion("RunState =", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotEqualTo(Integer value) {
            addCriterion("RunState <>", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateGreaterThan(Integer value) {
            addCriterion("RunState >", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("RunState >=", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateLessThan(Integer value) {
            addCriterion("RunState <", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateLessThanOrEqualTo(Integer value) {
            addCriterion("RunState <=", value, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateIn(List<Integer> values) {
            addCriterion("RunState in", values, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotIn(List<Integer> values) {
            addCriterion("RunState not in", values, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateBetween(Integer value1, Integer value2) {
            addCriterion("RunState between", value1, value2, "runState");
            return (Criteria) this;
        }

        public Criteria andRunStateNotBetween(Integer value1, Integer value2) {
            addCriterion("RunState not between", value1, value2, "runState");
            return (Criteria) this;
        }

        public Criteria andUaIsNull() {
            addCriterion("Ua is null");
            return (Criteria) this;
        }

        public Criteria andUaIsNotNull() {
            addCriterion("Ua is not null");
            return (Criteria) this;
        }

        public Criteria andUaEqualTo(BigDecimal value) {
            addCriterion("Ua =", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotEqualTo(BigDecimal value) {
            addCriterion("Ua <>", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaGreaterThan(BigDecimal value) {
            addCriterion("Ua >", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Ua >=", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaLessThan(BigDecimal value) {
            addCriterion("Ua <", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Ua <=", value, "ua");
            return (Criteria) this;
        }

        public Criteria andUaIn(List<BigDecimal> values) {
            addCriterion("Ua in", values, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotIn(List<BigDecimal> values) {
            addCriterion("Ua not in", values, "ua");
            return (Criteria) this;
        }

        public Criteria andUaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ua between", value1, value2, "ua");
            return (Criteria) this;
        }

        public Criteria andUaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ua not between", value1, value2, "ua");
            return (Criteria) this;
        }

        public Criteria andUbIsNull() {
            addCriterion("Ub is null");
            return (Criteria) this;
        }

        public Criteria andUbIsNotNull() {
            addCriterion("Ub is not null");
            return (Criteria) this;
        }

        public Criteria andUbEqualTo(BigDecimal value) {
            addCriterion("Ub =", value, "ub");
            return (Criteria) this;
        }

        public Criteria andUbNotEqualTo(BigDecimal value) {
            addCriterion("Ub <>", value, "ub");
            return (Criteria) this;
        }

        public Criteria andUbGreaterThan(BigDecimal value) {
            addCriterion("Ub >", value, "ub");
            return (Criteria) this;
        }

        public Criteria andUbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Ub >=", value, "ub");
            return (Criteria) this;
        }

        public Criteria andUbLessThan(BigDecimal value) {
            addCriterion("Ub <", value, "ub");
            return (Criteria) this;
        }

        public Criteria andUbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Ub <=", value, "ub");
            return (Criteria) this;
        }

        public Criteria andUbIn(List<BigDecimal> values) {
            addCriterion("Ub in", values, "ub");
            return (Criteria) this;
        }

        public Criteria andUbNotIn(List<BigDecimal> values) {
            addCriterion("Ub not in", values, "ub");
            return (Criteria) this;
        }

        public Criteria andUbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ub between", value1, value2, "ub");
            return (Criteria) this;
        }

        public Criteria andUbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ub not between", value1, value2, "ub");
            return (Criteria) this;
        }

        public Criteria andUcIsNull() {
            addCriterion("Uc is null");
            return (Criteria) this;
        }

        public Criteria andUcIsNotNull() {
            addCriterion("Uc is not null");
            return (Criteria) this;
        }

        public Criteria andUcEqualTo(BigDecimal value) {
            addCriterion("Uc =", value, "uc");
            return (Criteria) this;
        }

        public Criteria andUcNotEqualTo(BigDecimal value) {
            addCriterion("Uc <>", value, "uc");
            return (Criteria) this;
        }

        public Criteria andUcGreaterThan(BigDecimal value) {
            addCriterion("Uc >", value, "uc");
            return (Criteria) this;
        }

        public Criteria andUcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Uc >=", value, "uc");
            return (Criteria) this;
        }

        public Criteria andUcLessThan(BigDecimal value) {
            addCriterion("Uc <", value, "uc");
            return (Criteria) this;
        }

        public Criteria andUcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Uc <=", value, "uc");
            return (Criteria) this;
        }

        public Criteria andUcIn(List<BigDecimal> values) {
            addCriterion("Uc in", values, "uc");
            return (Criteria) this;
        }

        public Criteria andUcNotIn(List<BigDecimal> values) {
            addCriterion("Uc not in", values, "uc");
            return (Criteria) this;
        }

        public Criteria andUcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Uc between", value1, value2, "uc");
            return (Criteria) this;
        }

        public Criteria andUcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Uc not between", value1, value2, "uc");
            return (Criteria) this;
        }

        public Criteria andIaIsNull() {
            addCriterion("Ia is null");
            return (Criteria) this;
        }

        public Criteria andIaIsNotNull() {
            addCriterion("Ia is not null");
            return (Criteria) this;
        }

        public Criteria andIaEqualTo(BigDecimal value) {
            addCriterion("Ia =", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaNotEqualTo(BigDecimal value) {
            addCriterion("Ia <>", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaGreaterThan(BigDecimal value) {
            addCriterion("Ia >", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Ia >=", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaLessThan(BigDecimal value) {
            addCriterion("Ia <", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Ia <=", value, "ia");
            return (Criteria) this;
        }

        public Criteria andIaIn(List<BigDecimal> values) {
            addCriterion("Ia in", values, "ia");
            return (Criteria) this;
        }

        public Criteria andIaNotIn(List<BigDecimal> values) {
            addCriterion("Ia not in", values, "ia");
            return (Criteria) this;
        }

        public Criteria andIaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ia between", value1, value2, "ia");
            return (Criteria) this;
        }

        public Criteria andIaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ia not between", value1, value2, "ia");
            return (Criteria) this;
        }

        public Criteria andIbIsNull() {
            addCriterion("Ib is null");
            return (Criteria) this;
        }

        public Criteria andIbIsNotNull() {
            addCriterion("Ib is not null");
            return (Criteria) this;
        }

        public Criteria andIbEqualTo(BigDecimal value) {
            addCriterion("Ib =", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbNotEqualTo(BigDecimal value) {
            addCriterion("Ib <>", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbGreaterThan(BigDecimal value) {
            addCriterion("Ib >", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Ib >=", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbLessThan(BigDecimal value) {
            addCriterion("Ib <", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Ib <=", value, "ib");
            return (Criteria) this;
        }

        public Criteria andIbIn(List<BigDecimal> values) {
            addCriterion("Ib in", values, "ib");
            return (Criteria) this;
        }

        public Criteria andIbNotIn(List<BigDecimal> values) {
            addCriterion("Ib not in", values, "ib");
            return (Criteria) this;
        }

        public Criteria andIbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ib between", value1, value2, "ib");
            return (Criteria) this;
        }

        public Criteria andIbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ib not between", value1, value2, "ib");
            return (Criteria) this;
        }

        public Criteria andIcIsNull() {
            addCriterion("Ic is null");
            return (Criteria) this;
        }

        public Criteria andIcIsNotNull() {
            addCriterion("Ic is not null");
            return (Criteria) this;
        }

        public Criteria andIcEqualTo(BigDecimal value) {
            addCriterion("Ic =", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotEqualTo(BigDecimal value) {
            addCriterion("Ic <>", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcGreaterThan(BigDecimal value) {
            addCriterion("Ic >", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Ic >=", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcLessThan(BigDecimal value) {
            addCriterion("Ic <", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Ic <=", value, "ic");
            return (Criteria) this;
        }

        public Criteria andIcIn(List<BigDecimal> values) {
            addCriterion("Ic in", values, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotIn(List<BigDecimal> values) {
            addCriterion("Ic not in", values, "ic");
            return (Criteria) this;
        }

        public Criteria andIcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ic between", value1, value2, "ic");
            return (Criteria) this;
        }

        public Criteria andIcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ic not between", value1, value2, "ic");
            return (Criteria) this;
        }

        public Criteria andActivePowerIsNull() {
            addCriterion("ActivePower is null");
            return (Criteria) this;
        }

        public Criteria andActivePowerIsNotNull() {
            addCriterion("ActivePower is not null");
            return (Criteria) this;
        }

        public Criteria andActivePowerEqualTo(BigDecimal value) {
            addCriterion("ActivePower =", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerNotEqualTo(BigDecimal value) {
            addCriterion("ActivePower <>", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerGreaterThan(BigDecimal value) {
            addCriterion("ActivePower >", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ActivePower >=", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerLessThan(BigDecimal value) {
            addCriterion("ActivePower <", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ActivePower <=", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerIn(List<BigDecimal> values) {
            addCriterion("ActivePower in", values, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerNotIn(List<BigDecimal> values) {
            addCriterion("ActivePower not in", values, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ActivePower between", value1, value2, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ActivePower not between", value1, value2, "activePower");
            return (Criteria) this;
        }

        public Criteria andPowerFactorIsNull() {
            addCriterion("PowerFactor is null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorIsNotNull() {
            addCriterion("PowerFactor is not null");
            return (Criteria) this;
        }

        public Criteria andPowerFactorEqualTo(BigDecimal value) {
            addCriterion("PowerFactor =", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotEqualTo(BigDecimal value) {
            addCriterion("PowerFactor <>", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorGreaterThan(BigDecimal value) {
            addCriterion("PowerFactor >", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PowerFactor >=", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorLessThan(BigDecimal value) {
            addCriterion("PowerFactor <", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PowerFactor <=", value, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorIn(List<BigDecimal> values) {
            addCriterion("PowerFactor in", values, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotIn(List<BigDecimal> values) {
            addCriterion("PowerFactor not in", values, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PowerFactor between", value1, value2, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andPowerFactorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PowerFactor not between", value1, value2, "powerFactor");
            return (Criteria) this;
        }

        public Criteria andIsRemoteIsNull() {
            addCriterion("IsRemote is null");
            return (Criteria) this;
        }

        public Criteria andIsRemoteIsNotNull() {
            addCriterion("IsRemote is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemoteEqualTo(String value) {
            addCriterion("IsRemote =", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotEqualTo(String value) {
            addCriterion("IsRemote <>", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteGreaterThan(String value) {
            addCriterion("IsRemote >", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteGreaterThanOrEqualTo(String value) {
            addCriterion("IsRemote >=", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteLessThan(String value) {
            addCriterion("IsRemote <", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteLessThanOrEqualTo(String value) {
            addCriterion("IsRemote <=", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteLike(String value) {
            addCriterion("IsRemote like", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotLike(String value) {
            addCriterion("IsRemote not like", value, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteIn(List<String> values) {
            addCriterion("IsRemote in", values, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotIn(List<String> values) {
            addCriterion("IsRemote not in", values, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteBetween(String value1, String value2) {
            addCriterion("IsRemote between", value1, value2, "isRemote");
            return (Criteria) this;
        }

        public Criteria andIsRemoteNotBetween(String value1, String value2) {
            addCriterion("IsRemote not between", value1, value2, "isRemote");
            return (Criteria) this;
        }

        public Criteria andFaultIsNull() {
            addCriterion("Fault is null");
            return (Criteria) this;
        }

        public Criteria andFaultIsNotNull() {
            addCriterion("Fault is not null");
            return (Criteria) this;
        }

        public Criteria andFaultEqualTo(String value) {
            addCriterion("Fault =", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotEqualTo(String value) {
            addCriterion("Fault <>", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultGreaterThan(String value) {
            addCriterion("Fault >", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultGreaterThanOrEqualTo(String value) {
            addCriterion("Fault >=", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLessThan(String value) {
            addCriterion("Fault <", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLessThanOrEqualTo(String value) {
            addCriterion("Fault <=", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLike(String value) {
            addCriterion("Fault like", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotLike(String value) {
            addCriterion("Fault not like", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultIn(List<String> values) {
            addCriterion("Fault in", values, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotIn(List<String> values) {
            addCriterion("Fault not in", values, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultBetween(String value1, String value2) {
            addCriterion("Fault between", value1, value2, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotBetween(String value1, String value2) {
            addCriterion("Fault not between", value1, value2, "fault");
            return (Criteria) this;
        }

        public Criteria andIsControlEleIsNull() {
            addCriterion("IsControlEle is null");
            return (Criteria) this;
        }

        public Criteria andIsControlEleIsNotNull() {
            addCriterion("IsControlEle is not null");
            return (Criteria) this;
        }

        public Criteria andIsControlEleEqualTo(String value) {
            addCriterion("IsControlEle =", value, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleNotEqualTo(String value) {
            addCriterion("IsControlEle <>", value, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleGreaterThan(String value) {
            addCriterion("IsControlEle >", value, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleGreaterThanOrEqualTo(String value) {
            addCriterion("IsControlEle >=", value, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleLessThan(String value) {
            addCriterion("IsControlEle <", value, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleLessThanOrEqualTo(String value) {
            addCriterion("IsControlEle <=", value, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleLike(String value) {
            addCriterion("IsControlEle like", value, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleNotLike(String value) {
            addCriterion("IsControlEle not like", value, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleIn(List<String> values) {
            addCriterion("IsControlEle in", values, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleNotIn(List<String> values) {
            addCriterion("IsControlEle not in", values, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleBetween(String value1, String value2) {
            addCriterion("IsControlEle between", value1, value2, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andIsControlEleNotBetween(String value1, String value2) {
            addCriterion("IsControlEle not between", value1, value2, "isControlEle");
            return (Criteria) this;
        }

        public Criteria andTopStateIsNull() {
            addCriterion("TopState is null");
            return (Criteria) this;
        }

        public Criteria andTopStateIsNotNull() {
            addCriterion("TopState is not null");
            return (Criteria) this;
        }

        public Criteria andTopStateEqualTo(String value) {
            addCriterion("TopState =", value, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateNotEqualTo(String value) {
            addCriterion("TopState <>", value, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateGreaterThan(String value) {
            addCriterion("TopState >", value, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateGreaterThanOrEqualTo(String value) {
            addCriterion("TopState >=", value, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateLessThan(String value) {
            addCriterion("TopState <", value, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateLessThanOrEqualTo(String value) {
            addCriterion("TopState <=", value, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateLike(String value) {
            addCriterion("TopState like", value, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateNotLike(String value) {
            addCriterion("TopState not like", value, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateIn(List<String> values) {
            addCriterion("TopState in", values, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateNotIn(List<String> values) {
            addCriterion("TopState not in", values, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateBetween(String value1, String value2) {
            addCriterion("TopState between", value1, value2, "topState");
            return (Criteria) this;
        }

        public Criteria andTopStateNotBetween(String value1, String value2) {
            addCriterion("TopState not between", value1, value2, "topState");
            return (Criteria) this;
        }

        public Criteria andBottomStateIsNull() {
            addCriterion("BottomState is null");
            return (Criteria) this;
        }

        public Criteria andBottomStateIsNotNull() {
            addCriterion("BottomState is not null");
            return (Criteria) this;
        }

        public Criteria andBottomStateEqualTo(String value) {
            addCriterion("BottomState =", value, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateNotEqualTo(String value) {
            addCriterion("BottomState <>", value, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateGreaterThan(String value) {
            addCriterion("BottomState >", value, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateGreaterThanOrEqualTo(String value) {
            addCriterion("BottomState >=", value, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateLessThan(String value) {
            addCriterion("BottomState <", value, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateLessThanOrEqualTo(String value) {
            addCriterion("BottomState <=", value, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateLike(String value) {
            addCriterion("BottomState like", value, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateNotLike(String value) {
            addCriterion("BottomState not like", value, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateIn(List<String> values) {
            addCriterion("BottomState in", values, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateNotIn(List<String> values) {
            addCriterion("BottomState not in", values, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateBetween(String value1, String value2) {
            addCriterion("BottomState between", value1, value2, "bottomState");
            return (Criteria) this;
        }

        public Criteria andBottomStateNotBetween(String value1, String value2) {
            addCriterion("BottomState not between", value1, value2, "bottomState");
            return (Criteria) this;
        }

        public Criteria andTopMaxIsNull() {
            addCriterion("TopMax is null");
            return (Criteria) this;
        }

        public Criteria andTopMaxIsNotNull() {
            addCriterion("TopMax is not null");
            return (Criteria) this;
        }

        public Criteria andTopMaxEqualTo(String value) {
            addCriterion("TopMax =", value, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxNotEqualTo(String value) {
            addCriterion("TopMax <>", value, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxGreaterThan(String value) {
            addCriterion("TopMax >", value, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxGreaterThanOrEqualTo(String value) {
            addCriterion("TopMax >=", value, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxLessThan(String value) {
            addCriterion("TopMax <", value, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxLessThanOrEqualTo(String value) {
            addCriterion("TopMax <=", value, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxLike(String value) {
            addCriterion("TopMax like", value, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxNotLike(String value) {
            addCriterion("TopMax not like", value, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxIn(List<String> values) {
            addCriterion("TopMax in", values, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxNotIn(List<String> values) {
            addCriterion("TopMax not in", values, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxBetween(String value1, String value2) {
            addCriterion("TopMax between", value1, value2, "topMax");
            return (Criteria) this;
        }

        public Criteria andTopMaxNotBetween(String value1, String value2) {
            addCriterion("TopMax not between", value1, value2, "topMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxIsNull() {
            addCriterion("BottomMax is null");
            return (Criteria) this;
        }

        public Criteria andBottomMaxIsNotNull() {
            addCriterion("BottomMax is not null");
            return (Criteria) this;
        }

        public Criteria andBottomMaxEqualTo(String value) {
            addCriterion("BottomMax =", value, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxNotEqualTo(String value) {
            addCriterion("BottomMax <>", value, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxGreaterThan(String value) {
            addCriterion("BottomMax >", value, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxGreaterThanOrEqualTo(String value) {
            addCriterion("BottomMax >=", value, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxLessThan(String value) {
            addCriterion("BottomMax <", value, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxLessThanOrEqualTo(String value) {
            addCriterion("BottomMax <=", value, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxLike(String value) {
            addCriterion("BottomMax like", value, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxNotLike(String value) {
            addCriterion("BottomMax not like", value, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxIn(List<String> values) {
            addCriterion("BottomMax in", values, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxNotIn(List<String> values) {
            addCriterion("BottomMax not in", values, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxBetween(String value1, String value2) {
            addCriterion("BottomMax between", value1, value2, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andBottomMaxNotBetween(String value1, String value2) {
            addCriterion("BottomMax not between", value1, value2, "bottomMax");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNull() {
            addCriterion("OpUser is null");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNotNull() {
            addCriterion("OpUser is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserEqualTo(String value) {
            addCriterion("OpUser =", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotEqualTo(String value) {
            addCriterion("OpUser <>", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThan(String value) {
            addCriterion("OpUser >", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThanOrEqualTo(String value) {
            addCriterion("OpUser >=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThan(String value) {
            addCriterion("OpUser <", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThanOrEqualTo(String value) {
            addCriterion("OpUser <=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLike(String value) {
            addCriterion("OpUser like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotLike(String value) {
            addCriterion("OpUser not like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserIn(List<String> values) {
            addCriterion("OpUser in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotIn(List<String> values) {
            addCriterion("OpUser not in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserBetween(String value1, String value2) {
            addCriterion("OpUser between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotBetween(String value1, String value2) {
            addCriterion("OpUser not between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andRUPIsNull() {
            addCriterion("RUP is null");
            return (Criteria) this;
        }

        public Criteria andRUPIsNotNull() {
            addCriterion("RUP is not null");
            return (Criteria) this;
        }

        public Criteria andRUPEqualTo(String value) {
            addCriterion("RUP =", value, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPNotEqualTo(String value) {
            addCriterion("RUP <>", value, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPGreaterThan(String value) {
            addCriterion("RUP >", value, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPGreaterThanOrEqualTo(String value) {
            addCriterion("RUP >=", value, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPLessThan(String value) {
            addCriterion("RUP <", value, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPLessThanOrEqualTo(String value) {
            addCriterion("RUP <=", value, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPLike(String value) {
            addCriterion("RUP like", value, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPNotLike(String value) {
            addCriterion("RUP not like", value, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPIn(List<String> values) {
            addCriterion("RUP in", values, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPNotIn(List<String> values) {
            addCriterion("RUP not in", values, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPBetween(String value1, String value2) {
            addCriterion("RUP between", value1, value2, "RUP");
            return (Criteria) this;
        }

        public Criteria andRUPNotBetween(String value1, String value2) {
            addCriterion("RUP not between", value1, value2, "RUP");
            return (Criteria) this;
        }

        public Criteria andRDWIsNull() {
            addCriterion("RDW is null");
            return (Criteria) this;
        }

        public Criteria andRDWIsNotNull() {
            addCriterion("RDW is not null");
            return (Criteria) this;
        }

        public Criteria andRDWEqualTo(String value) {
            addCriterion("RDW =", value, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWNotEqualTo(String value) {
            addCriterion("RDW <>", value, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWGreaterThan(String value) {
            addCriterion("RDW >", value, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWGreaterThanOrEqualTo(String value) {
            addCriterion("RDW >=", value, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWLessThan(String value) {
            addCriterion("RDW <", value, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWLessThanOrEqualTo(String value) {
            addCriterion("RDW <=", value, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWLike(String value) {
            addCriterion("RDW like", value, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWNotLike(String value) {
            addCriterion("RDW not like", value, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWIn(List<String> values) {
            addCriterion("RDW in", values, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWNotIn(List<String> values) {
            addCriterion("RDW not in", values, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWBetween(String value1, String value2) {
            addCriterion("RDW between", value1, value2, "RDW");
            return (Criteria) this;
        }

        public Criteria andRDWNotBetween(String value1, String value2) {
            addCriterion("RDW not between", value1, value2, "RDW");
            return (Criteria) this;
        }

        public Criteria andYUPIsNull() {
            addCriterion("YUP is null");
            return (Criteria) this;
        }

        public Criteria andYUPIsNotNull() {
            addCriterion("YUP is not null");
            return (Criteria) this;
        }

        public Criteria andYUPEqualTo(String value) {
            addCriterion("YUP =", value, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPNotEqualTo(String value) {
            addCriterion("YUP <>", value, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPGreaterThan(String value) {
            addCriterion("YUP >", value, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPGreaterThanOrEqualTo(String value) {
            addCriterion("YUP >=", value, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPLessThan(String value) {
            addCriterion("YUP <", value, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPLessThanOrEqualTo(String value) {
            addCriterion("YUP <=", value, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPLike(String value) {
            addCriterion("YUP like", value, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPNotLike(String value) {
            addCriterion("YUP not like", value, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPIn(List<String> values) {
            addCriterion("YUP in", values, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPNotIn(List<String> values) {
            addCriterion("YUP not in", values, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPBetween(String value1, String value2) {
            addCriterion("YUP between", value1, value2, "YUP");
            return (Criteria) this;
        }

        public Criteria andYUPNotBetween(String value1, String value2) {
            addCriterion("YUP not between", value1, value2, "YUP");
            return (Criteria) this;
        }

        public Criteria andYDWIsNull() {
            addCriterion("YDW is null");
            return (Criteria) this;
        }

        public Criteria andYDWIsNotNull() {
            addCriterion("YDW is not null");
            return (Criteria) this;
        }

        public Criteria andYDWEqualTo(String value) {
            addCriterion("YDW =", value, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWNotEqualTo(String value) {
            addCriterion("YDW <>", value, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWGreaterThan(String value) {
            addCriterion("YDW >", value, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWGreaterThanOrEqualTo(String value) {
            addCriterion("YDW >=", value, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWLessThan(String value) {
            addCriterion("YDW <", value, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWLessThanOrEqualTo(String value) {
            addCriterion("YDW <=", value, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWLike(String value) {
            addCriterion("YDW like", value, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWNotLike(String value) {
            addCriterion("YDW not like", value, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWIn(List<String> values) {
            addCriterion("YDW in", values, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWNotIn(List<String> values) {
            addCriterion("YDW not in", values, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWBetween(String value1, String value2) {
            addCriterion("YDW between", value1, value2, "YDW");
            return (Criteria) this;
        }

        public Criteria andYDWNotBetween(String value1, String value2) {
            addCriterion("YDW not between", value1, value2, "YDW");
            return (Criteria) this;
        }

        public Criteria andGUPIsNull() {
            addCriterion("GUP is null");
            return (Criteria) this;
        }

        public Criteria andGUPIsNotNull() {
            addCriterion("GUP is not null");
            return (Criteria) this;
        }

        public Criteria andGUPEqualTo(String value) {
            addCriterion("GUP =", value, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPNotEqualTo(String value) {
            addCriterion("GUP <>", value, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPGreaterThan(String value) {
            addCriterion("GUP >", value, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPGreaterThanOrEqualTo(String value) {
            addCriterion("GUP >=", value, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPLessThan(String value) {
            addCriterion("GUP <", value, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPLessThanOrEqualTo(String value) {
            addCriterion("GUP <=", value, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPLike(String value) {
            addCriterion("GUP like", value, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPNotLike(String value) {
            addCriterion("GUP not like", value, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPIn(List<String> values) {
            addCriterion("GUP in", values, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPNotIn(List<String> values) {
            addCriterion("GUP not in", values, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPBetween(String value1, String value2) {
            addCriterion("GUP between", value1, value2, "GUP");
            return (Criteria) this;
        }

        public Criteria andGUPNotBetween(String value1, String value2) {
            addCriterion("GUP not between", value1, value2, "GUP");
            return (Criteria) this;
        }

        public Criteria andGDWIsNull() {
            addCriterion("GDW is null");
            return (Criteria) this;
        }

        public Criteria andGDWIsNotNull() {
            addCriterion("GDW is not null");
            return (Criteria) this;
        }

        public Criteria andGDWEqualTo(String value) {
            addCriterion("GDW =", value, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWNotEqualTo(String value) {
            addCriterion("GDW <>", value, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWGreaterThan(String value) {
            addCriterion("GDW >", value, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWGreaterThanOrEqualTo(String value) {
            addCriterion("GDW >=", value, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWLessThan(String value) {
            addCriterion("GDW <", value, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWLessThanOrEqualTo(String value) {
            addCriterion("GDW <=", value, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWLike(String value) {
            addCriterion("GDW like", value, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWNotLike(String value) {
            addCriterion("GDW not like", value, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWIn(List<String> values) {
            addCriterion("GDW in", values, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWNotIn(List<String> values) {
            addCriterion("GDW not in", values, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWBetween(String value1, String value2) {
            addCriterion("GDW between", value1, value2, "GDW");
            return (Criteria) this;
        }

        public Criteria andGDWNotBetween(String value1, String value2) {
            addCriterion("GDW not between", value1, value2, "GDW");
            return (Criteria) this;
        }

        public Criteria andOverloadIsNull() {
            addCriterion("Overload is null");
            return (Criteria) this;
        }

        public Criteria andOverloadIsNotNull() {
            addCriterion("Overload is not null");
            return (Criteria) this;
        }

        public Criteria andOverloadEqualTo(Integer value) {
            addCriterion("Overload =", value, "overload");
            return (Criteria) this;
        }

        public Criteria andOverloadNotEqualTo(Integer value) {
            addCriterion("Overload <>", value, "overload");
            return (Criteria) this;
        }

        public Criteria andOverloadGreaterThan(Integer value) {
            addCriterion("Overload >", value, "overload");
            return (Criteria) this;
        }

        public Criteria andOverloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("Overload >=", value, "overload");
            return (Criteria) this;
        }

        public Criteria andOverloadLessThan(Integer value) {
            addCriterion("Overload <", value, "overload");
            return (Criteria) this;
        }

        public Criteria andOverloadLessThanOrEqualTo(Integer value) {
            addCriterion("Overload <=", value, "overload");
            return (Criteria) this;
        }

        public Criteria andOverloadIn(List<Integer> values) {
            addCriterion("Overload in", values, "overload");
            return (Criteria) this;
        }

        public Criteria andOverloadNotIn(List<Integer> values) {
            addCriterion("Overload not in", values, "overload");
            return (Criteria) this;
        }

        public Criteria andOverloadBetween(Integer value1, Integer value2) {
            addCriterion("Overload between", value1, value2, "overload");
            return (Criteria) this;
        }

        public Criteria andOverloadNotBetween(Integer value1, Integer value2) {
            addCriterion("Overload not between", value1, value2, "overload");
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