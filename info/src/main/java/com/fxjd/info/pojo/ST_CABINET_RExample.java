package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_CABINET_RExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_CABINET_RExample() {
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