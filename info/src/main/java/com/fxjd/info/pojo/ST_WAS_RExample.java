package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_WAS_RExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_WAS_RExample() {
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

        public Criteria andUPZIsNull() {
            addCriterion("UPZ is null");
            return (Criteria) this;
        }

        public Criteria andUPZIsNotNull() {
            addCriterion("UPZ is not null");
            return (Criteria) this;
        }

        public Criteria andUPZEqualTo(BigDecimal value) {
            addCriterion("UPZ =", value, "UPZ");
            return (Criteria) this;
        }

        public Criteria andUPZNotEqualTo(BigDecimal value) {
            addCriterion("UPZ <>", value, "UPZ");
            return (Criteria) this;
        }

        public Criteria andUPZGreaterThan(BigDecimal value) {
            addCriterion("UPZ >", value, "UPZ");
            return (Criteria) this;
        }

        public Criteria andUPZGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPZ >=", value, "UPZ");
            return (Criteria) this;
        }

        public Criteria andUPZLessThan(BigDecimal value) {
            addCriterion("UPZ <", value, "UPZ");
            return (Criteria) this;
        }

        public Criteria andUPZLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPZ <=", value, "UPZ");
            return (Criteria) this;
        }

        public Criteria andUPZIn(List<BigDecimal> values) {
            addCriterion("UPZ in", values, "UPZ");
            return (Criteria) this;
        }

        public Criteria andUPZNotIn(List<BigDecimal> values) {
            addCriterion("UPZ not in", values, "UPZ");
            return (Criteria) this;
        }

        public Criteria andUPZBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPZ between", value1, value2, "UPZ");
            return (Criteria) this;
        }

        public Criteria andUPZNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPZ not between", value1, value2, "UPZ");
            return (Criteria) this;
        }

        public Criteria andDWZIsNull() {
            addCriterion("DWZ is null");
            return (Criteria) this;
        }

        public Criteria andDWZIsNotNull() {
            addCriterion("DWZ is not null");
            return (Criteria) this;
        }

        public Criteria andDWZEqualTo(BigDecimal value) {
            addCriterion("DWZ =", value, "DWZ");
            return (Criteria) this;
        }

        public Criteria andDWZNotEqualTo(BigDecimal value) {
            addCriterion("DWZ <>", value, "DWZ");
            return (Criteria) this;
        }

        public Criteria andDWZGreaterThan(BigDecimal value) {
            addCriterion("DWZ >", value, "DWZ");
            return (Criteria) this;
        }

        public Criteria andDWZGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DWZ >=", value, "DWZ");
            return (Criteria) this;
        }

        public Criteria andDWZLessThan(BigDecimal value) {
            addCriterion("DWZ <", value, "DWZ");
            return (Criteria) this;
        }

        public Criteria andDWZLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DWZ <=", value, "DWZ");
            return (Criteria) this;
        }

        public Criteria andDWZIn(List<BigDecimal> values) {
            addCriterion("DWZ in", values, "DWZ");
            return (Criteria) this;
        }

        public Criteria andDWZNotIn(List<BigDecimal> values) {
            addCriterion("DWZ not in", values, "DWZ");
            return (Criteria) this;
        }

        public Criteria andDWZBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DWZ between", value1, value2, "DWZ");
            return (Criteria) this;
        }

        public Criteria andDWZNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DWZ not between", value1, value2, "DWZ");
            return (Criteria) this;
        }

        public Criteria andTGTZIsNull() {
            addCriterion("TGTZ is null");
            return (Criteria) this;
        }

        public Criteria andTGTZIsNotNull() {
            addCriterion("TGTZ is not null");
            return (Criteria) this;
        }

        public Criteria andTGTZEqualTo(BigDecimal value) {
            addCriterion("TGTZ =", value, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andTGTZNotEqualTo(BigDecimal value) {
            addCriterion("TGTZ <>", value, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andTGTZGreaterThan(BigDecimal value) {
            addCriterion("TGTZ >", value, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andTGTZGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TGTZ >=", value, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andTGTZLessThan(BigDecimal value) {
            addCriterion("TGTZ <", value, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andTGTZLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TGTZ <=", value, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andTGTZIn(List<BigDecimal> values) {
            addCriterion("TGTZ in", values, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andTGTZNotIn(List<BigDecimal> values) {
            addCriterion("TGTZ not in", values, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andTGTZBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TGTZ between", value1, value2, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andTGTZNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TGTZ not between", value1, value2, "TGTZ");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDIsNull() {
            addCriterion("SWCHRCD is null");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDIsNotNull() {
            addCriterion("SWCHRCD is not null");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDEqualTo(String value) {
            addCriterion("SWCHRCD =", value, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDNotEqualTo(String value) {
            addCriterion("SWCHRCD <>", value, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDGreaterThan(String value) {
            addCriterion("SWCHRCD >", value, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDGreaterThanOrEqualTo(String value) {
            addCriterion("SWCHRCD >=", value, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDLessThan(String value) {
            addCriterion("SWCHRCD <", value, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDLessThanOrEqualTo(String value) {
            addCriterion("SWCHRCD <=", value, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDLike(String value) {
            addCriterion("SWCHRCD like", value, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDNotLike(String value) {
            addCriterion("SWCHRCD not like", value, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDIn(List<String> values) {
            addCriterion("SWCHRCD in", values, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDNotIn(List<String> values) {
            addCriterion("SWCHRCD not in", values, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDBetween(String value1, String value2) {
            addCriterion("SWCHRCD between", value1, value2, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSWCHRCDNotBetween(String value1, String value2) {
            addCriterion("SWCHRCD not between", value1, value2, "SWCHRCD");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNIsNull() {
            addCriterion("SUPWPTN is null");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNIsNotNull() {
            addCriterion("SUPWPTN is not null");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNEqualTo(String value) {
            addCriterion("SUPWPTN =", value, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNNotEqualTo(String value) {
            addCriterion("SUPWPTN <>", value, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNGreaterThan(String value) {
            addCriterion("SUPWPTN >", value, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNGreaterThanOrEqualTo(String value) {
            addCriterion("SUPWPTN >=", value, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNLessThan(String value) {
            addCriterion("SUPWPTN <", value, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNLessThanOrEqualTo(String value) {
            addCriterion("SUPWPTN <=", value, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNLike(String value) {
            addCriterion("SUPWPTN like", value, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNNotLike(String value) {
            addCriterion("SUPWPTN not like", value, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNIn(List<String> values) {
            addCriterion("SUPWPTN in", values, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNNotIn(List<String> values) {
            addCriterion("SUPWPTN not in", values, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNBetween(String value1, String value2) {
            addCriterion("SUPWPTN between", value1, value2, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSUPWPTNNotBetween(String value1, String value2) {
            addCriterion("SUPWPTN not between", value1, value2, "SUPWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNIsNull() {
            addCriterion("SDWWPTN is null");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNIsNotNull() {
            addCriterion("SDWWPTN is not null");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNEqualTo(String value) {
            addCriterion("SDWWPTN =", value, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNNotEqualTo(String value) {
            addCriterion("SDWWPTN <>", value, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNGreaterThan(String value) {
            addCriterion("SDWWPTN >", value, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNGreaterThanOrEqualTo(String value) {
            addCriterion("SDWWPTN >=", value, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNLessThan(String value) {
            addCriterion("SDWWPTN <", value, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNLessThanOrEqualTo(String value) {
            addCriterion("SDWWPTN <=", value, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNLike(String value) {
            addCriterion("SDWWPTN like", value, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNNotLike(String value) {
            addCriterion("SDWWPTN not like", value, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNIn(List<String> values) {
            addCriterion("SDWWPTN in", values, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNNotIn(List<String> values) {
            addCriterion("SDWWPTN not in", values, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNBetween(String value1, String value2) {
            addCriterion("SDWWPTN between", value1, value2, "SDWWPTN");
            return (Criteria) this;
        }

        public Criteria andSDWWPTNNotBetween(String value1, String value2) {
            addCriterion("SDWWPTN not between", value1, value2, "SDWWPTN");
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