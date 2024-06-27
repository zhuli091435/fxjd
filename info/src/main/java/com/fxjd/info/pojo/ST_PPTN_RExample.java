package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_PPTN_RExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_PPTN_RExample() {
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

        public Criteria andDRPIsNull() {
            addCriterion("DRP is null");
            return (Criteria) this;
        }

        public Criteria andDRPIsNotNull() {
            addCriterion("DRP is not null");
            return (Criteria) this;
        }

        public Criteria andDRPEqualTo(BigDecimal value) {
            addCriterion("DRP =", value, "DRP");
            return (Criteria) this;
        }

        public Criteria andDRPNotEqualTo(BigDecimal value) {
            addCriterion("DRP <>", value, "DRP");
            return (Criteria) this;
        }

        public Criteria andDRPGreaterThan(BigDecimal value) {
            addCriterion("DRP >", value, "DRP");
            return (Criteria) this;
        }

        public Criteria andDRPGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRP >=", value, "DRP");
            return (Criteria) this;
        }

        public Criteria andDRPLessThan(BigDecimal value) {
            addCriterion("DRP <", value, "DRP");
            return (Criteria) this;
        }

        public Criteria andDRPLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRP <=", value, "DRP");
            return (Criteria) this;
        }

        public Criteria andDRPIn(List<BigDecimal> values) {
            addCriterion("DRP in", values, "DRP");
            return (Criteria) this;
        }

        public Criteria andDRPNotIn(List<BigDecimal> values) {
            addCriterion("DRP not in", values, "DRP");
            return (Criteria) this;
        }

        public Criteria andDRPBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRP between", value1, value2, "DRP");
            return (Criteria) this;
        }

        public Criteria andDRPNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRP not between", value1, value2, "DRP");
            return (Criteria) this;
        }

        public Criteria andINTVIsNull() {
            addCriterion("INTV is null");
            return (Criteria) this;
        }

        public Criteria andINTVIsNotNull() {
            addCriterion("INTV is not null");
            return (Criteria) this;
        }

        public Criteria andINTVEqualTo(BigDecimal value) {
            addCriterion("INTV =", value, "INTV");
            return (Criteria) this;
        }

        public Criteria andINTVNotEqualTo(BigDecimal value) {
            addCriterion("INTV <>", value, "INTV");
            return (Criteria) this;
        }

        public Criteria andINTVGreaterThan(BigDecimal value) {
            addCriterion("INTV >", value, "INTV");
            return (Criteria) this;
        }

        public Criteria andINTVGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTV >=", value, "INTV");
            return (Criteria) this;
        }

        public Criteria andINTVLessThan(BigDecimal value) {
            addCriterion("INTV <", value, "INTV");
            return (Criteria) this;
        }

        public Criteria andINTVLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTV <=", value, "INTV");
            return (Criteria) this;
        }

        public Criteria andINTVIn(List<BigDecimal> values) {
            addCriterion("INTV in", values, "INTV");
            return (Criteria) this;
        }

        public Criteria andINTVNotIn(List<BigDecimal> values) {
            addCriterion("INTV not in", values, "INTV");
            return (Criteria) this;
        }

        public Criteria andINTVBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTV between", value1, value2, "INTV");
            return (Criteria) this;
        }

        public Criteria andINTVNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTV not between", value1, value2, "INTV");
            return (Criteria) this;
        }

        public Criteria andPDRIsNull() {
            addCriterion("PDR is null");
            return (Criteria) this;
        }

        public Criteria andPDRIsNotNull() {
            addCriterion("PDR is not null");
            return (Criteria) this;
        }

        public Criteria andPDREqualTo(BigDecimal value) {
            addCriterion("PDR =", value, "PDR");
            return (Criteria) this;
        }

        public Criteria andPDRNotEqualTo(BigDecimal value) {
            addCriterion("PDR <>", value, "PDR");
            return (Criteria) this;
        }

        public Criteria andPDRGreaterThan(BigDecimal value) {
            addCriterion("PDR >", value, "PDR");
            return (Criteria) this;
        }

        public Criteria andPDRGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PDR >=", value, "PDR");
            return (Criteria) this;
        }

        public Criteria andPDRLessThan(BigDecimal value) {
            addCriterion("PDR <", value, "PDR");
            return (Criteria) this;
        }

        public Criteria andPDRLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PDR <=", value, "PDR");
            return (Criteria) this;
        }

        public Criteria andPDRIn(List<BigDecimal> values) {
            addCriterion("PDR in", values, "PDR");
            return (Criteria) this;
        }

        public Criteria andPDRNotIn(List<BigDecimal> values) {
            addCriterion("PDR not in", values, "PDR");
            return (Criteria) this;
        }

        public Criteria andPDRBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PDR between", value1, value2, "PDR");
            return (Criteria) this;
        }

        public Criteria andPDRNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PDR not between", value1, value2, "PDR");
            return (Criteria) this;
        }

        public Criteria andDYPIsNull() {
            addCriterion("DYP is null");
            return (Criteria) this;
        }

        public Criteria andDYPIsNotNull() {
            addCriterion("DYP is not null");
            return (Criteria) this;
        }

        public Criteria andDYPEqualTo(BigDecimal value) {
            addCriterion("DYP =", value, "DYP");
            return (Criteria) this;
        }

        public Criteria andDYPNotEqualTo(BigDecimal value) {
            addCriterion("DYP <>", value, "DYP");
            return (Criteria) this;
        }

        public Criteria andDYPGreaterThan(BigDecimal value) {
            addCriterion("DYP >", value, "DYP");
            return (Criteria) this;
        }

        public Criteria andDYPGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DYP >=", value, "DYP");
            return (Criteria) this;
        }

        public Criteria andDYPLessThan(BigDecimal value) {
            addCriterion("DYP <", value, "DYP");
            return (Criteria) this;
        }

        public Criteria andDYPLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DYP <=", value, "DYP");
            return (Criteria) this;
        }

        public Criteria andDYPIn(List<BigDecimal> values) {
            addCriterion("DYP in", values, "DYP");
            return (Criteria) this;
        }

        public Criteria andDYPNotIn(List<BigDecimal> values) {
            addCriterion("DYP not in", values, "DYP");
            return (Criteria) this;
        }

        public Criteria andDYPBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DYP between", value1, value2, "DYP");
            return (Criteria) this;
        }

        public Criteria andDYPNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DYP not between", value1, value2, "DYP");
            return (Criteria) this;
        }

        public Criteria andWTHIsNull() {
            addCriterion("WTH is null");
            return (Criteria) this;
        }

        public Criteria andWTHIsNotNull() {
            addCriterion("WTH is not null");
            return (Criteria) this;
        }

        public Criteria andWTHEqualTo(String value) {
            addCriterion("WTH =", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHNotEqualTo(String value) {
            addCriterion("WTH <>", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHGreaterThan(String value) {
            addCriterion("WTH >", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHGreaterThanOrEqualTo(String value) {
            addCriterion("WTH >=", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHLessThan(String value) {
            addCriterion("WTH <", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHLessThanOrEqualTo(String value) {
            addCriterion("WTH <=", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHLike(String value) {
            addCriterion("WTH like", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHNotLike(String value) {
            addCriterion("WTH not like", value, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHIn(List<String> values) {
            addCriterion("WTH in", values, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHNotIn(List<String> values) {
            addCriterion("WTH not in", values, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHBetween(String value1, String value2) {
            addCriterion("WTH between", value1, value2, "WTH");
            return (Criteria) this;
        }

        public Criteria andWTHNotBetween(String value1, String value2) {
            addCriterion("WTH not between", value1, value2, "WTH");
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