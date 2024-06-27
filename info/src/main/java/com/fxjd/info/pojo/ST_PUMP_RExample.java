package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_PUMP_RExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_PUMP_RExample() {
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

        public Criteria andSTATUSIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUSEqualTo(Integer value) {
            addCriterion("STATUS =", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThan(Integer value) {
            addCriterion("STATUS <", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSIn(List<Integer> values) {
            addCriterion("STATUS in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andAUTOIsNull() {
            addCriterion("AUTO is null");
            return (Criteria) this;
        }

        public Criteria andAUTOIsNotNull() {
            addCriterion("AUTO is not null");
            return (Criteria) this;
        }

        public Criteria andAUTOEqualTo(String value) {
            addCriterion("AUTO =", value, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTONotEqualTo(String value) {
            addCriterion("AUTO <>", value, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTOGreaterThan(String value) {
            addCriterion("AUTO >", value, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTOGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO >=", value, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTOLessThan(String value) {
            addCriterion("AUTO <", value, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTOLessThanOrEqualTo(String value) {
            addCriterion("AUTO <=", value, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTOLike(String value) {
            addCriterion("AUTO like", value, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTONotLike(String value) {
            addCriterion("AUTO not like", value, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTOIn(List<String> values) {
            addCriterion("AUTO in", values, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTONotIn(List<String> values) {
            addCriterion("AUTO not in", values, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTOBetween(String value1, String value2) {
            addCriterion("AUTO between", value1, value2, "AUTO");
            return (Criteria) this;
        }

        public Criteria andAUTONotBetween(String value1, String value2) {
            addCriterion("AUTO not between", value1, value2, "AUTO");
            return (Criteria) this;
        }

        public Criteria andUabIsNull() {
            addCriterion("Uab is null");
            return (Criteria) this;
        }

        public Criteria andUabIsNotNull() {
            addCriterion("Uab is not null");
            return (Criteria) this;
        }

        public Criteria andUabEqualTo(BigDecimal value) {
            addCriterion("Uab =", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabNotEqualTo(BigDecimal value) {
            addCriterion("Uab <>", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabGreaterThan(BigDecimal value) {
            addCriterion("Uab >", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Uab >=", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabLessThan(BigDecimal value) {
            addCriterion("Uab <", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Uab <=", value, "uab");
            return (Criteria) this;
        }

        public Criteria andUabIn(List<BigDecimal> values) {
            addCriterion("Uab in", values, "uab");
            return (Criteria) this;
        }

        public Criteria andUabNotIn(List<BigDecimal> values) {
            addCriterion("Uab not in", values, "uab");
            return (Criteria) this;
        }

        public Criteria andUabBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Uab between", value1, value2, "uab");
            return (Criteria) this;
        }

        public Criteria andUabNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Uab not between", value1, value2, "uab");
            return (Criteria) this;
        }

        public Criteria andUbcIsNull() {
            addCriterion("Ubc is null");
            return (Criteria) this;
        }

        public Criteria andUbcIsNotNull() {
            addCriterion("Ubc is not null");
            return (Criteria) this;
        }

        public Criteria andUbcEqualTo(BigDecimal value) {
            addCriterion("Ubc =", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcNotEqualTo(BigDecimal value) {
            addCriterion("Ubc <>", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcGreaterThan(BigDecimal value) {
            addCriterion("Ubc >", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Ubc >=", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcLessThan(BigDecimal value) {
            addCriterion("Ubc <", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Ubc <=", value, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcIn(List<BigDecimal> values) {
            addCriterion("Ubc in", values, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcNotIn(List<BigDecimal> values) {
            addCriterion("Ubc not in", values, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ubc between", value1, value2, "ubc");
            return (Criteria) this;
        }

        public Criteria andUbcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Ubc not between", value1, value2, "ubc");
            return (Criteria) this;
        }

        public Criteria andUcaIsNull() {
            addCriterion("Uca is null");
            return (Criteria) this;
        }

        public Criteria andUcaIsNotNull() {
            addCriterion("Uca is not null");
            return (Criteria) this;
        }

        public Criteria andUcaEqualTo(BigDecimal value) {
            addCriterion("Uca =", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaNotEqualTo(BigDecimal value) {
            addCriterion("Uca <>", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaGreaterThan(BigDecimal value) {
            addCriterion("Uca >", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Uca >=", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaLessThan(BigDecimal value) {
            addCriterion("Uca <", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Uca <=", value, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaIn(List<BigDecimal> values) {
            addCriterion("Uca in", values, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaNotIn(List<BigDecimal> values) {
            addCriterion("Uca not in", values, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Uca between", value1, value2, "uca");
            return (Criteria) this;
        }

        public Criteria andUcaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Uca not between", value1, value2, "uca");
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

        public Criteria andReactivePowerIsNull() {
            addCriterion("ReactivePower is null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerIsNotNull() {
            addCriterion("ReactivePower is not null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerEqualTo(BigDecimal value) {
            addCriterion("ReactivePower =", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerNotEqualTo(BigDecimal value) {
            addCriterion("ReactivePower <>", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerGreaterThan(BigDecimal value) {
            addCriterion("ReactivePower >", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ReactivePower >=", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerLessThan(BigDecimal value) {
            addCriterion("ReactivePower <", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ReactivePower <=", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerIn(List<BigDecimal> values) {
            addCriterion("ReactivePower in", values, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerNotIn(List<BigDecimal> values) {
            addCriterion("ReactivePower not in", values, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReactivePower between", value1, value2, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReactivePower not between", value1, value2, "reactivePower");
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

        public Criteria andFlowIsNull() {
            addCriterion("Flow is null");
            return (Criteria) this;
        }

        public Criteria andFlowIsNotNull() {
            addCriterion("Flow is not null");
            return (Criteria) this;
        }

        public Criteria andFlowEqualTo(BigDecimal value) {
            addCriterion("Flow =", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotEqualTo(BigDecimal value) {
            addCriterion("Flow <>", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThan(BigDecimal value) {
            addCriterion("Flow >", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Flow >=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThan(BigDecimal value) {
            addCriterion("Flow <", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Flow <=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowIn(List<BigDecimal> values) {
            addCriterion("Flow in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotIn(List<BigDecimal> values) {
            addCriterion("Flow not in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Flow between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Flow not between", value1, value2, "flow");
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