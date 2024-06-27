package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_STBPRP_BExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_STBPRP_BExample() {
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

        public Criteria andSTNMIsNull() {
            addCriterion("STNM is null");
            return (Criteria) this;
        }

        public Criteria andSTNMIsNotNull() {
            addCriterion("STNM is not null");
            return (Criteria) this;
        }

        public Criteria andSTNMEqualTo(String value) {
            addCriterion("STNM =", value, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMNotEqualTo(String value) {
            addCriterion("STNM <>", value, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMGreaterThan(String value) {
            addCriterion("STNM >", value, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMGreaterThanOrEqualTo(String value) {
            addCriterion("STNM >=", value, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMLessThan(String value) {
            addCriterion("STNM <", value, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMLessThanOrEqualTo(String value) {
            addCriterion("STNM <=", value, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMLike(String value) {
            addCriterion("STNM like", value, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMNotLike(String value) {
            addCriterion("STNM not like", value, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMIn(List<String> values) {
            addCriterion("STNM in", values, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMNotIn(List<String> values) {
            addCriterion("STNM not in", values, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMBetween(String value1, String value2) {
            addCriterion("STNM between", value1, value2, "STNM");
            return (Criteria) this;
        }

        public Criteria andSTNMNotBetween(String value1, String value2) {
            addCriterion("STNM not between", value1, value2, "STNM");
            return (Criteria) this;
        }

        public Criteria andRVNMIsNull() {
            addCriterion("RVNM is null");
            return (Criteria) this;
        }

        public Criteria andRVNMIsNotNull() {
            addCriterion("RVNM is not null");
            return (Criteria) this;
        }

        public Criteria andRVNMEqualTo(String value) {
            addCriterion("RVNM =", value, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMNotEqualTo(String value) {
            addCriterion("RVNM <>", value, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMGreaterThan(String value) {
            addCriterion("RVNM >", value, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMGreaterThanOrEqualTo(String value) {
            addCriterion("RVNM >=", value, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMLessThan(String value) {
            addCriterion("RVNM <", value, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMLessThanOrEqualTo(String value) {
            addCriterion("RVNM <=", value, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMLike(String value) {
            addCriterion("RVNM like", value, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMNotLike(String value) {
            addCriterion("RVNM not like", value, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMIn(List<String> values) {
            addCriterion("RVNM in", values, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMNotIn(List<String> values) {
            addCriterion("RVNM not in", values, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMBetween(String value1, String value2) {
            addCriterion("RVNM between", value1, value2, "RVNM");
            return (Criteria) this;
        }

        public Criteria andRVNMNotBetween(String value1, String value2) {
            addCriterion("RVNM not between", value1, value2, "RVNM");
            return (Criteria) this;
        }

        public Criteria andHNNMIsNull() {
            addCriterion("HNNM is null");
            return (Criteria) this;
        }

        public Criteria andHNNMIsNotNull() {
            addCriterion("HNNM is not null");
            return (Criteria) this;
        }

        public Criteria andHNNMEqualTo(String value) {
            addCriterion("HNNM =", value, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMNotEqualTo(String value) {
            addCriterion("HNNM <>", value, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMGreaterThan(String value) {
            addCriterion("HNNM >", value, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMGreaterThanOrEqualTo(String value) {
            addCriterion("HNNM >=", value, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMLessThan(String value) {
            addCriterion("HNNM <", value, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMLessThanOrEqualTo(String value) {
            addCriterion("HNNM <=", value, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMLike(String value) {
            addCriterion("HNNM like", value, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMNotLike(String value) {
            addCriterion("HNNM not like", value, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMIn(List<String> values) {
            addCriterion("HNNM in", values, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMNotIn(List<String> values) {
            addCriterion("HNNM not in", values, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMBetween(String value1, String value2) {
            addCriterion("HNNM between", value1, value2, "HNNM");
            return (Criteria) this;
        }

        public Criteria andHNNMNotBetween(String value1, String value2) {
            addCriterion("HNNM not between", value1, value2, "HNNM");
            return (Criteria) this;
        }

        public Criteria andBSNMIsNull() {
            addCriterion("BSNM is null");
            return (Criteria) this;
        }

        public Criteria andBSNMIsNotNull() {
            addCriterion("BSNM is not null");
            return (Criteria) this;
        }

        public Criteria andBSNMEqualTo(String value) {
            addCriterion("BSNM =", value, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMNotEqualTo(String value) {
            addCriterion("BSNM <>", value, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMGreaterThan(String value) {
            addCriterion("BSNM >", value, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMGreaterThanOrEqualTo(String value) {
            addCriterion("BSNM >=", value, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMLessThan(String value) {
            addCriterion("BSNM <", value, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMLessThanOrEqualTo(String value) {
            addCriterion("BSNM <=", value, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMLike(String value) {
            addCriterion("BSNM like", value, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMNotLike(String value) {
            addCriterion("BSNM not like", value, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMIn(List<String> values) {
            addCriterion("BSNM in", values, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMNotIn(List<String> values) {
            addCriterion("BSNM not in", values, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMBetween(String value1, String value2) {
            addCriterion("BSNM between", value1, value2, "BSNM");
            return (Criteria) this;
        }

        public Criteria andBSNMNotBetween(String value1, String value2) {
            addCriterion("BSNM not between", value1, value2, "BSNM");
            return (Criteria) this;
        }

        public Criteria andLGTDIsNull() {
            addCriterion("LGTD is null");
            return (Criteria) this;
        }

        public Criteria andLGTDIsNotNull() {
            addCriterion("LGTD is not null");
            return (Criteria) this;
        }

        public Criteria andLGTDEqualTo(BigDecimal value) {
            addCriterion("LGTD =", value, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLGTDNotEqualTo(BigDecimal value) {
            addCriterion("LGTD <>", value, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLGTDGreaterThan(BigDecimal value) {
            addCriterion("LGTD >", value, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLGTDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LGTD >=", value, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLGTDLessThan(BigDecimal value) {
            addCriterion("LGTD <", value, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLGTDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LGTD <=", value, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLGTDIn(List<BigDecimal> values) {
            addCriterion("LGTD in", values, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLGTDNotIn(List<BigDecimal> values) {
            addCriterion("LGTD not in", values, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLGTDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LGTD between", value1, value2, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLGTDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LGTD not between", value1, value2, "LGTD");
            return (Criteria) this;
        }

        public Criteria andLTTDIsNull() {
            addCriterion("LTTD is null");
            return (Criteria) this;
        }

        public Criteria andLTTDIsNotNull() {
            addCriterion("LTTD is not null");
            return (Criteria) this;
        }

        public Criteria andLTTDEqualTo(BigDecimal value) {
            addCriterion("LTTD =", value, "LTTD");
            return (Criteria) this;
        }

        public Criteria andLTTDNotEqualTo(BigDecimal value) {
            addCriterion("LTTD <>", value, "LTTD");
            return (Criteria) this;
        }

        public Criteria andLTTDGreaterThan(BigDecimal value) {
            addCriterion("LTTD >", value, "LTTD");
            return (Criteria) this;
        }

        public Criteria andLTTDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LTTD >=", value, "LTTD");
            return (Criteria) this;
        }

        public Criteria andLTTDLessThan(BigDecimal value) {
            addCriterion("LTTD <", value, "LTTD");
            return (Criteria) this;
        }

        public Criteria andLTTDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LTTD <=", value, "LTTD");
            return (Criteria) this;
        }

        public Criteria andLTTDIn(List<BigDecimal> values) {
            addCriterion("LTTD in", values, "LTTD");
            return (Criteria) this;
        }

        public Criteria andLTTDNotIn(List<BigDecimal> values) {
            addCriterion("LTTD not in", values, "LTTD");
            return (Criteria) this;
        }

        public Criteria andLTTDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LTTD between", value1, value2, "LTTD");
            return (Criteria) this;
        }

        public Criteria andLTTDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LTTD not between", value1, value2, "LTTD");
            return (Criteria) this;
        }

        public Criteria andSTLCIsNull() {
            addCriterion("STLC is null");
            return (Criteria) this;
        }

        public Criteria andSTLCIsNotNull() {
            addCriterion("STLC is not null");
            return (Criteria) this;
        }

        public Criteria andSTLCEqualTo(String value) {
            addCriterion("STLC =", value, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCNotEqualTo(String value) {
            addCriterion("STLC <>", value, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCGreaterThan(String value) {
            addCriterion("STLC >", value, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCGreaterThanOrEqualTo(String value) {
            addCriterion("STLC >=", value, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCLessThan(String value) {
            addCriterion("STLC <", value, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCLessThanOrEqualTo(String value) {
            addCriterion("STLC <=", value, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCLike(String value) {
            addCriterion("STLC like", value, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCNotLike(String value) {
            addCriterion("STLC not like", value, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCIn(List<String> values) {
            addCriterion("STLC in", values, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCNotIn(List<String> values) {
            addCriterion("STLC not in", values, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCBetween(String value1, String value2) {
            addCriterion("STLC between", value1, value2, "STLC");
            return (Criteria) this;
        }

        public Criteria andSTLCNotBetween(String value1, String value2) {
            addCriterion("STLC not between", value1, value2, "STLC");
            return (Criteria) this;
        }

        public Criteria andADDVCDIsNull() {
            addCriterion("ADDVCD is null");
            return (Criteria) this;
        }

        public Criteria andADDVCDIsNotNull() {
            addCriterion("ADDVCD is not null");
            return (Criteria) this;
        }

        public Criteria andADDVCDEqualTo(String value) {
            addCriterion("ADDVCD =", value, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDNotEqualTo(String value) {
            addCriterion("ADDVCD <>", value, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDGreaterThan(String value) {
            addCriterion("ADDVCD >", value, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDGreaterThanOrEqualTo(String value) {
            addCriterion("ADDVCD >=", value, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDLessThan(String value) {
            addCriterion("ADDVCD <", value, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDLessThanOrEqualTo(String value) {
            addCriterion("ADDVCD <=", value, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDLike(String value) {
            addCriterion("ADDVCD like", value, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDNotLike(String value) {
            addCriterion("ADDVCD not like", value, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDIn(List<String> values) {
            addCriterion("ADDVCD in", values, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDNotIn(List<String> values) {
            addCriterion("ADDVCD not in", values, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDBetween(String value1, String value2) {
            addCriterion("ADDVCD between", value1, value2, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andADDVCDNotBetween(String value1, String value2) {
            addCriterion("ADDVCD not between", value1, value2, "ADDVCD");
            return (Criteria) this;
        }

        public Criteria andDTMNMIsNull() {
            addCriterion("DTMNM is null");
            return (Criteria) this;
        }

        public Criteria andDTMNMIsNotNull() {
            addCriterion("DTMNM is not null");
            return (Criteria) this;
        }

        public Criteria andDTMNMEqualTo(String value) {
            addCriterion("DTMNM =", value, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMNotEqualTo(String value) {
            addCriterion("DTMNM <>", value, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMGreaterThan(String value) {
            addCriterion("DTMNM >", value, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMGreaterThanOrEqualTo(String value) {
            addCriterion("DTMNM >=", value, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMLessThan(String value) {
            addCriterion("DTMNM <", value, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMLessThanOrEqualTo(String value) {
            addCriterion("DTMNM <=", value, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMLike(String value) {
            addCriterion("DTMNM like", value, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMNotLike(String value) {
            addCriterion("DTMNM not like", value, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMIn(List<String> values) {
            addCriterion("DTMNM in", values, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMNotIn(List<String> values) {
            addCriterion("DTMNM not in", values, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMBetween(String value1, String value2) {
            addCriterion("DTMNM between", value1, value2, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMNMNotBetween(String value1, String value2) {
            addCriterion("DTMNM not between", value1, value2, "DTMNM");
            return (Criteria) this;
        }

        public Criteria andDTMELIsNull() {
            addCriterion("DTMEL is null");
            return (Criteria) this;
        }

        public Criteria andDTMELIsNotNull() {
            addCriterion("DTMEL is not null");
            return (Criteria) this;
        }

        public Criteria andDTMELEqualTo(BigDecimal value) {
            addCriterion("DTMEL =", value, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTMELNotEqualTo(BigDecimal value) {
            addCriterion("DTMEL <>", value, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTMELGreaterThan(BigDecimal value) {
            addCriterion("DTMEL >", value, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTMELGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DTMEL >=", value, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTMELLessThan(BigDecimal value) {
            addCriterion("DTMEL <", value, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTMELLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DTMEL <=", value, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTMELIn(List<BigDecimal> values) {
            addCriterion("DTMEL in", values, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTMELNotIn(List<BigDecimal> values) {
            addCriterion("DTMEL not in", values, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTMELBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DTMEL between", value1, value2, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTMELNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DTMEL not between", value1, value2, "DTMEL");
            return (Criteria) this;
        }

        public Criteria andDTPRIsNull() {
            addCriterion("DTPR is null");
            return (Criteria) this;
        }

        public Criteria andDTPRIsNotNull() {
            addCriterion("DTPR is not null");
            return (Criteria) this;
        }

        public Criteria andDTPREqualTo(BigDecimal value) {
            addCriterion("DTPR =", value, "DTPR");
            return (Criteria) this;
        }

        public Criteria andDTPRNotEqualTo(BigDecimal value) {
            addCriterion("DTPR <>", value, "DTPR");
            return (Criteria) this;
        }

        public Criteria andDTPRGreaterThan(BigDecimal value) {
            addCriterion("DTPR >", value, "DTPR");
            return (Criteria) this;
        }

        public Criteria andDTPRGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DTPR >=", value, "DTPR");
            return (Criteria) this;
        }

        public Criteria andDTPRLessThan(BigDecimal value) {
            addCriterion("DTPR <", value, "DTPR");
            return (Criteria) this;
        }

        public Criteria andDTPRLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DTPR <=", value, "DTPR");
            return (Criteria) this;
        }

        public Criteria andDTPRIn(List<BigDecimal> values) {
            addCriterion("DTPR in", values, "DTPR");
            return (Criteria) this;
        }

        public Criteria andDTPRNotIn(List<BigDecimal> values) {
            addCriterion("DTPR not in", values, "DTPR");
            return (Criteria) this;
        }

        public Criteria andDTPRBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DTPR between", value1, value2, "DTPR");
            return (Criteria) this;
        }

        public Criteria andDTPRNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DTPR not between", value1, value2, "DTPR");
            return (Criteria) this;
        }

        public Criteria andSTTPIsNull() {
            addCriterion("STTP is null");
            return (Criteria) this;
        }

        public Criteria andSTTPIsNotNull() {
            addCriterion("STTP is not null");
            return (Criteria) this;
        }

        public Criteria andSTTPEqualTo(String value) {
            addCriterion("STTP =", value, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPNotEqualTo(String value) {
            addCriterion("STTP <>", value, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPGreaterThan(String value) {
            addCriterion("STTP >", value, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPGreaterThanOrEqualTo(String value) {
            addCriterion("STTP >=", value, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPLessThan(String value) {
            addCriterion("STTP <", value, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPLessThanOrEqualTo(String value) {
            addCriterion("STTP <=", value, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPLike(String value) {
            addCriterion("STTP like", value, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPNotLike(String value) {
            addCriterion("STTP not like", value, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPIn(List<String> values) {
            addCriterion("STTP in", values, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPNotIn(List<String> values) {
            addCriterion("STTP not in", values, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPBetween(String value1, String value2) {
            addCriterion("STTP between", value1, value2, "STTP");
            return (Criteria) this;
        }

        public Criteria andSTTPNotBetween(String value1, String value2) {
            addCriterion("STTP not between", value1, value2, "STTP");
            return (Criteria) this;
        }

        public Criteria andFRGRDIsNull() {
            addCriterion("FRGRD is null");
            return (Criteria) this;
        }

        public Criteria andFRGRDIsNotNull() {
            addCriterion("FRGRD is not null");
            return (Criteria) this;
        }

        public Criteria andFRGRDEqualTo(String value) {
            addCriterion("FRGRD =", value, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDNotEqualTo(String value) {
            addCriterion("FRGRD <>", value, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDGreaterThan(String value) {
            addCriterion("FRGRD >", value, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDGreaterThanOrEqualTo(String value) {
            addCriterion("FRGRD >=", value, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDLessThan(String value) {
            addCriterion("FRGRD <", value, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDLessThanOrEqualTo(String value) {
            addCriterion("FRGRD <=", value, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDLike(String value) {
            addCriterion("FRGRD like", value, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDNotLike(String value) {
            addCriterion("FRGRD not like", value, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDIn(List<String> values) {
            addCriterion("FRGRD in", values, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDNotIn(List<String> values) {
            addCriterion("FRGRD not in", values, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDBetween(String value1, String value2) {
            addCriterion("FRGRD between", value1, value2, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andFRGRDNotBetween(String value1, String value2) {
            addCriterion("FRGRD not between", value1, value2, "FRGRD");
            return (Criteria) this;
        }

        public Criteria andESSTYMIsNull() {
            addCriterion("ESSTYM is null");
            return (Criteria) this;
        }

        public Criteria andESSTYMIsNotNull() {
            addCriterion("ESSTYM is not null");
            return (Criteria) this;
        }

        public Criteria andESSTYMEqualTo(Date value) {
            addCriterion("ESSTYM =", value, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andESSTYMNotEqualTo(Date value) {
            addCriterion("ESSTYM <>", value, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andESSTYMGreaterThan(Date value) {
            addCriterion("ESSTYM >", value, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andESSTYMGreaterThanOrEqualTo(Date value) {
            addCriterion("ESSTYM >=", value, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andESSTYMLessThan(Date value) {
            addCriterion("ESSTYM <", value, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andESSTYMLessThanOrEqualTo(Date value) {
            addCriterion("ESSTYM <=", value, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andESSTYMIn(List<Date> values) {
            addCriterion("ESSTYM in", values, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andESSTYMNotIn(List<Date> values) {
            addCriterion("ESSTYM not in", values, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andESSTYMBetween(Date value1, Date value2) {
            addCriterion("ESSTYM between", value1, value2, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andESSTYMNotBetween(Date value1, Date value2) {
            addCriterion("ESSTYM not between", value1, value2, "ESSTYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMIsNull() {
            addCriterion("BGFRYM is null");
            return (Criteria) this;
        }

        public Criteria andBGFRYMIsNotNull() {
            addCriterion("BGFRYM is not null");
            return (Criteria) this;
        }

        public Criteria andBGFRYMEqualTo(Date value) {
            addCriterion("BGFRYM =", value, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMNotEqualTo(Date value) {
            addCriterion("BGFRYM <>", value, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMGreaterThan(Date value) {
            addCriterion("BGFRYM >", value, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMGreaterThanOrEqualTo(Date value) {
            addCriterion("BGFRYM >=", value, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMLessThan(Date value) {
            addCriterion("BGFRYM <", value, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMLessThanOrEqualTo(Date value) {
            addCriterion("BGFRYM <=", value, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMIn(List<Date> values) {
            addCriterion("BGFRYM in", values, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMNotIn(List<Date> values) {
            addCriterion("BGFRYM not in", values, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMBetween(Date value1, Date value2) {
            addCriterion("BGFRYM between", value1, value2, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andBGFRYMNotBetween(Date value1, Date value2) {
            addCriterion("BGFRYM not between", value1, value2, "BGFRYM");
            return (Criteria) this;
        }

        public Criteria andATCUNITIsNull() {
            addCriterion("ATCUNIT is null");
            return (Criteria) this;
        }

        public Criteria andATCUNITIsNotNull() {
            addCriterion("ATCUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andATCUNITEqualTo(String value) {
            addCriterion("ATCUNIT =", value, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITNotEqualTo(String value) {
            addCriterion("ATCUNIT <>", value, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITGreaterThan(String value) {
            addCriterion("ATCUNIT >", value, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITGreaterThanOrEqualTo(String value) {
            addCriterion("ATCUNIT >=", value, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITLessThan(String value) {
            addCriterion("ATCUNIT <", value, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITLessThanOrEqualTo(String value) {
            addCriterion("ATCUNIT <=", value, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITLike(String value) {
            addCriterion("ATCUNIT like", value, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITNotLike(String value) {
            addCriterion("ATCUNIT not like", value, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITIn(List<String> values) {
            addCriterion("ATCUNIT in", values, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITNotIn(List<String> values) {
            addCriterion("ATCUNIT not in", values, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITBetween(String value1, String value2) {
            addCriterion("ATCUNIT between", value1, value2, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andATCUNITNotBetween(String value1, String value2) {
            addCriterion("ATCUNIT not between", value1, value2, "ATCUNIT");
            return (Criteria) this;
        }

        public Criteria andADMAUTHIsNull() {
            addCriterion("ADMAUTH is null");
            return (Criteria) this;
        }

        public Criteria andADMAUTHIsNotNull() {
            addCriterion("ADMAUTH is not null");
            return (Criteria) this;
        }

        public Criteria andADMAUTHEqualTo(String value) {
            addCriterion("ADMAUTH =", value, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHNotEqualTo(String value) {
            addCriterion("ADMAUTH <>", value, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHGreaterThan(String value) {
            addCriterion("ADMAUTH >", value, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHGreaterThanOrEqualTo(String value) {
            addCriterion("ADMAUTH >=", value, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHLessThan(String value) {
            addCriterion("ADMAUTH <", value, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHLessThanOrEqualTo(String value) {
            addCriterion("ADMAUTH <=", value, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHLike(String value) {
            addCriterion("ADMAUTH like", value, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHNotLike(String value) {
            addCriterion("ADMAUTH not like", value, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHIn(List<String> values) {
            addCriterion("ADMAUTH in", values, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHNotIn(List<String> values) {
            addCriterion("ADMAUTH not in", values, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHBetween(String value1, String value2) {
            addCriterion("ADMAUTH between", value1, value2, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andADMAUTHNotBetween(String value1, String value2) {
            addCriterion("ADMAUTH not between", value1, value2, "ADMAUTH");
            return (Criteria) this;
        }

        public Criteria andLOCALITYIsNull() {
            addCriterion("LOCALITY is null");
            return (Criteria) this;
        }

        public Criteria andLOCALITYIsNotNull() {
            addCriterion("LOCALITY is not null");
            return (Criteria) this;
        }

        public Criteria andLOCALITYEqualTo(String value) {
            addCriterion("LOCALITY =", value, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYNotEqualTo(String value) {
            addCriterion("LOCALITY <>", value, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYGreaterThan(String value) {
            addCriterion("LOCALITY >", value, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALITY >=", value, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYLessThan(String value) {
            addCriterion("LOCALITY <", value, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYLessThanOrEqualTo(String value) {
            addCriterion("LOCALITY <=", value, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYLike(String value) {
            addCriterion("LOCALITY like", value, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYNotLike(String value) {
            addCriterion("LOCALITY not like", value, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYIn(List<String> values) {
            addCriterion("LOCALITY in", values, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYNotIn(List<String> values) {
            addCriterion("LOCALITY not in", values, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYBetween(String value1, String value2) {
            addCriterion("LOCALITY between", value1, value2, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andLOCALITYNotBetween(String value1, String value2) {
            addCriterion("LOCALITY not between", value1, value2, "LOCALITY");
            return (Criteria) this;
        }

        public Criteria andSTBKIsNull() {
            addCriterion("STBK is null");
            return (Criteria) this;
        }

        public Criteria andSTBKIsNotNull() {
            addCriterion("STBK is not null");
            return (Criteria) this;
        }

        public Criteria andSTBKEqualTo(String value) {
            addCriterion("STBK =", value, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKNotEqualTo(String value) {
            addCriterion("STBK <>", value, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKGreaterThan(String value) {
            addCriterion("STBK >", value, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKGreaterThanOrEqualTo(String value) {
            addCriterion("STBK >=", value, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKLessThan(String value) {
            addCriterion("STBK <", value, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKLessThanOrEqualTo(String value) {
            addCriterion("STBK <=", value, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKLike(String value) {
            addCriterion("STBK like", value, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKNotLike(String value) {
            addCriterion("STBK not like", value, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKIn(List<String> values) {
            addCriterion("STBK in", values, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKNotIn(List<String> values) {
            addCriterion("STBK not in", values, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKBetween(String value1, String value2) {
            addCriterion("STBK between", value1, value2, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTBKNotBetween(String value1, String value2) {
            addCriterion("STBK not between", value1, value2, "STBK");
            return (Criteria) this;
        }

        public Criteria andSTAZTIsNull() {
            addCriterion("STAZT is null");
            return (Criteria) this;
        }

        public Criteria andSTAZTIsNotNull() {
            addCriterion("STAZT is not null");
            return (Criteria) this;
        }

        public Criteria andSTAZTEqualTo(Short value) {
            addCriterion("STAZT =", value, "STAZT");
            return (Criteria) this;
        }

        public Criteria andSTAZTNotEqualTo(Short value) {
            addCriterion("STAZT <>", value, "STAZT");
            return (Criteria) this;
        }

        public Criteria andSTAZTGreaterThan(Short value) {
            addCriterion("STAZT >", value, "STAZT");
            return (Criteria) this;
        }

        public Criteria andSTAZTGreaterThanOrEqualTo(Short value) {
            addCriterion("STAZT >=", value, "STAZT");
            return (Criteria) this;
        }

        public Criteria andSTAZTLessThan(Short value) {
            addCriterion("STAZT <", value, "STAZT");
            return (Criteria) this;
        }

        public Criteria andSTAZTLessThanOrEqualTo(Short value) {
            addCriterion("STAZT <=", value, "STAZT");
            return (Criteria) this;
        }

        public Criteria andSTAZTIn(List<Short> values) {
            addCriterion("STAZT in", values, "STAZT");
            return (Criteria) this;
        }

        public Criteria andSTAZTNotIn(List<Short> values) {
            addCriterion("STAZT not in", values, "STAZT");
            return (Criteria) this;
        }

        public Criteria andSTAZTBetween(Short value1, Short value2) {
            addCriterion("STAZT between", value1, value2, "STAZT");
            return (Criteria) this;
        }

        public Criteria andSTAZTNotBetween(Short value1, Short value2) {
            addCriterion("STAZT not between", value1, value2, "STAZT");
            return (Criteria) this;
        }

        public Criteria andDSTRVMIsNull() {
            addCriterion("DSTRVM is null");
            return (Criteria) this;
        }

        public Criteria andDSTRVMIsNotNull() {
            addCriterion("DSTRVM is not null");
            return (Criteria) this;
        }

        public Criteria andDSTRVMEqualTo(BigDecimal value) {
            addCriterion("DSTRVM =", value, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDSTRVMNotEqualTo(BigDecimal value) {
            addCriterion("DSTRVM <>", value, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDSTRVMGreaterThan(BigDecimal value) {
            addCriterion("DSTRVM >", value, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDSTRVMGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DSTRVM >=", value, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDSTRVMLessThan(BigDecimal value) {
            addCriterion("DSTRVM <", value, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDSTRVMLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DSTRVM <=", value, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDSTRVMIn(List<BigDecimal> values) {
            addCriterion("DSTRVM in", values, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDSTRVMNotIn(List<BigDecimal> values) {
            addCriterion("DSTRVM not in", values, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDSTRVMBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DSTRVM between", value1, value2, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDSTRVMNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DSTRVM not between", value1, value2, "DSTRVM");
            return (Criteria) this;
        }

        public Criteria andDRNAIsNull() {
            addCriterion("DRNA is null");
            return (Criteria) this;
        }

        public Criteria andDRNAIsNotNull() {
            addCriterion("DRNA is not null");
            return (Criteria) this;
        }

        public Criteria andDRNAEqualTo(Integer value) {
            addCriterion("DRNA =", value, "DRNA");
            return (Criteria) this;
        }

        public Criteria andDRNANotEqualTo(Integer value) {
            addCriterion("DRNA <>", value, "DRNA");
            return (Criteria) this;
        }

        public Criteria andDRNAGreaterThan(Integer value) {
            addCriterion("DRNA >", value, "DRNA");
            return (Criteria) this;
        }

        public Criteria andDRNAGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRNA >=", value, "DRNA");
            return (Criteria) this;
        }

        public Criteria andDRNALessThan(Integer value) {
            addCriterion("DRNA <", value, "DRNA");
            return (Criteria) this;
        }

        public Criteria andDRNALessThanOrEqualTo(Integer value) {
            addCriterion("DRNA <=", value, "DRNA");
            return (Criteria) this;
        }

        public Criteria andDRNAIn(List<Integer> values) {
            addCriterion("DRNA in", values, "DRNA");
            return (Criteria) this;
        }

        public Criteria andDRNANotIn(List<Integer> values) {
            addCriterion("DRNA not in", values, "DRNA");
            return (Criteria) this;
        }

        public Criteria andDRNABetween(Integer value1, Integer value2) {
            addCriterion("DRNA between", value1, value2, "DRNA");
            return (Criteria) this;
        }

        public Criteria andDRNANotBetween(Integer value1, Integer value2) {
            addCriterion("DRNA not between", value1, value2, "DRNA");
            return (Criteria) this;
        }

        public Criteria andPHCDIsNull() {
            addCriterion("PHCD is null");
            return (Criteria) this;
        }

        public Criteria andPHCDIsNotNull() {
            addCriterion("PHCD is not null");
            return (Criteria) this;
        }

        public Criteria andPHCDEqualTo(String value) {
            addCriterion("PHCD =", value, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDNotEqualTo(String value) {
            addCriterion("PHCD <>", value, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDGreaterThan(String value) {
            addCriterion("PHCD >", value, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDGreaterThanOrEqualTo(String value) {
            addCriterion("PHCD >=", value, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDLessThan(String value) {
            addCriterion("PHCD <", value, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDLessThanOrEqualTo(String value) {
            addCriterion("PHCD <=", value, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDLike(String value) {
            addCriterion("PHCD like", value, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDNotLike(String value) {
            addCriterion("PHCD not like", value, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDIn(List<String> values) {
            addCriterion("PHCD in", values, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDNotIn(List<String> values) {
            addCriterion("PHCD not in", values, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDBetween(String value1, String value2) {
            addCriterion("PHCD between", value1, value2, "PHCD");
            return (Criteria) this;
        }

        public Criteria andPHCDNotBetween(String value1, String value2) {
            addCriterion("PHCD not between", value1, value2, "PHCD");
            return (Criteria) this;
        }

        public Criteria andUSFLIsNull() {
            addCriterion("USFL is null");
            return (Criteria) this;
        }

        public Criteria andUSFLIsNotNull() {
            addCriterion("USFL is not null");
            return (Criteria) this;
        }

        public Criteria andUSFLEqualTo(String value) {
            addCriterion("USFL =", value, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLNotEqualTo(String value) {
            addCriterion("USFL <>", value, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLGreaterThan(String value) {
            addCriterion("USFL >", value, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLGreaterThanOrEqualTo(String value) {
            addCriterion("USFL >=", value, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLLessThan(String value) {
            addCriterion("USFL <", value, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLLessThanOrEqualTo(String value) {
            addCriterion("USFL <=", value, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLLike(String value) {
            addCriterion("USFL like", value, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLNotLike(String value) {
            addCriterion("USFL not like", value, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLIn(List<String> values) {
            addCriterion("USFL in", values, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLNotIn(List<String> values) {
            addCriterion("USFL not in", values, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLBetween(String value1, String value2) {
            addCriterion("USFL between", value1, value2, "USFL");
            return (Criteria) this;
        }

        public Criteria andUSFLNotBetween(String value1, String value2) {
            addCriterion("USFL not between", value1, value2, "USFL");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSEqualTo(String value) {
            addCriterion("COMMENTS =", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSLessThan(String value) {
            addCriterion("COMMENTS <", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSLike(String value) {
            addCriterion("COMMENTS like", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotLike(String value) {
            addCriterion("COMMENTS not like", value, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSIn(List<String> values) {
            addCriterion("COMMENTS in", values, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andCOMMENTSNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "COMMENTS");
            return (Criteria) this;
        }

        public Criteria andMODITIMEIsNull() {
            addCriterion("MODITIME is null");
            return (Criteria) this;
        }

        public Criteria andMODITIMEIsNotNull() {
            addCriterion("MODITIME is not null");
            return (Criteria) this;
        }

        public Criteria andMODITIMEEqualTo(Date value) {
            addCriterion("MODITIME =", value, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andMODITIMENotEqualTo(Date value) {
            addCriterion("MODITIME <>", value, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andMODITIMEGreaterThan(Date value) {
            addCriterion("MODITIME >", value, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andMODITIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("MODITIME >=", value, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andMODITIMELessThan(Date value) {
            addCriterion("MODITIME <", value, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andMODITIMELessThanOrEqualTo(Date value) {
            addCriterion("MODITIME <=", value, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andMODITIMEIn(List<Date> values) {
            addCriterion("MODITIME in", values, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andMODITIMENotIn(List<Date> values) {
            addCriterion("MODITIME not in", values, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andMODITIMEBetween(Date value1, Date value2) {
            addCriterion("MODITIME between", value1, value2, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andMODITIMENotBetween(Date value1, Date value2) {
            addCriterion("MODITIME not between", value1, value2, "MODITIME");
            return (Criteria) this;
        }

        public Criteria andBDLGTDIsNull() {
            addCriterion("BDLGTD is null");
            return (Criteria) this;
        }

        public Criteria andBDLGTDIsNotNull() {
            addCriterion("BDLGTD is not null");
            return (Criteria) this;
        }

        public Criteria andBDLGTDEqualTo(BigDecimal value) {
            addCriterion("BDLGTD =", value, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLGTDNotEqualTo(BigDecimal value) {
            addCriterion("BDLGTD <>", value, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLGTDGreaterThan(BigDecimal value) {
            addCriterion("BDLGTD >", value, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLGTDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BDLGTD >=", value, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLGTDLessThan(BigDecimal value) {
            addCriterion("BDLGTD <", value, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLGTDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BDLGTD <=", value, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLGTDIn(List<BigDecimal> values) {
            addCriterion("BDLGTD in", values, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLGTDNotIn(List<BigDecimal> values) {
            addCriterion("BDLGTD not in", values, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLGTDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDLGTD between", value1, value2, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLGTDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDLGTD not between", value1, value2, "BDLGTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDIsNull() {
            addCriterion("BDLTTD is null");
            return (Criteria) this;
        }

        public Criteria andBDLTTDIsNotNull() {
            addCriterion("BDLTTD is not null");
            return (Criteria) this;
        }

        public Criteria andBDLTTDEqualTo(BigDecimal value) {
            addCriterion("BDLTTD =", value, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDNotEqualTo(BigDecimal value) {
            addCriterion("BDLTTD <>", value, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDGreaterThan(BigDecimal value) {
            addCriterion("BDLTTD >", value, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BDLTTD >=", value, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDLessThan(BigDecimal value) {
            addCriterion("BDLTTD <", value, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BDLTTD <=", value, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDIn(List<BigDecimal> values) {
            addCriterion("BDLTTD in", values, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDNotIn(List<BigDecimal> values) {
            addCriterion("BDLTTD not in", values, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDLTTD between", value1, value2, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andBDLTTDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDLTTD not between", value1, value2, "BDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDIsNull() {
            addCriterion("GDLGTD is null");
            return (Criteria) this;
        }

        public Criteria andGDLGTDIsNotNull() {
            addCriterion("GDLGTD is not null");
            return (Criteria) this;
        }

        public Criteria andGDLGTDEqualTo(BigDecimal value) {
            addCriterion("GDLGTD =", value, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDNotEqualTo(BigDecimal value) {
            addCriterion("GDLGTD <>", value, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDGreaterThan(BigDecimal value) {
            addCriterion("GDLGTD >", value, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GDLGTD >=", value, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDLessThan(BigDecimal value) {
            addCriterion("GDLGTD <", value, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GDLGTD <=", value, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDIn(List<BigDecimal> values) {
            addCriterion("GDLGTD in", values, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDNotIn(List<BigDecimal> values) {
            addCriterion("GDLGTD not in", values, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GDLGTD between", value1, value2, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLGTDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GDLGTD not between", value1, value2, "GDLGTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDIsNull() {
            addCriterion("GDLTTD is null");
            return (Criteria) this;
        }

        public Criteria andGDLTTDIsNotNull() {
            addCriterion("GDLTTD is not null");
            return (Criteria) this;
        }

        public Criteria andGDLTTDEqualTo(BigDecimal value) {
            addCriterion("GDLTTD =", value, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDNotEqualTo(BigDecimal value) {
            addCriterion("GDLTTD <>", value, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDGreaterThan(BigDecimal value) {
            addCriterion("GDLTTD >", value, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GDLTTD >=", value, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDLessThan(BigDecimal value) {
            addCriterion("GDLTTD <", value, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GDLTTD <=", value, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDIn(List<BigDecimal> values) {
            addCriterion("GDLTTD in", values, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDNotIn(List<BigDecimal> values) {
            addCriterion("GDLTTD not in", values, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GDLTTD between", value1, value2, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andGDLTTDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GDLTTD not between", value1, value2, "GDLTTD");
            return (Criteria) this;
        }

        public Criteria andElementTPIsNull() {
            addCriterion("ElementTP is null");
            return (Criteria) this;
        }

        public Criteria andElementTPIsNotNull() {
            addCriterion("ElementTP is not null");
            return (Criteria) this;
        }

        public Criteria andElementTPEqualTo(String value) {
            addCriterion("ElementTP =", value, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPNotEqualTo(String value) {
            addCriterion("ElementTP <>", value, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPGreaterThan(String value) {
            addCriterion("ElementTP >", value, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPGreaterThanOrEqualTo(String value) {
            addCriterion("ElementTP >=", value, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPLessThan(String value) {
            addCriterion("ElementTP <", value, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPLessThanOrEqualTo(String value) {
            addCriterion("ElementTP <=", value, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPLike(String value) {
            addCriterion("ElementTP like", value, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPNotLike(String value) {
            addCriterion("ElementTP not like", value, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPIn(List<String> values) {
            addCriterion("ElementTP in", values, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPNotIn(List<String> values) {
            addCriterion("ElementTP not in", values, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPBetween(String value1, String value2) {
            addCriterion("ElementTP between", value1, value2, "elementTP");
            return (Criteria) this;
        }

        public Criteria andElementTPNotBetween(String value1, String value2) {
            addCriterion("ElementTP not between", value1, value2, "elementTP");
            return (Criteria) this;
        }

        public Criteria andSTICOIsNull() {
            addCriterion("STICO is null");
            return (Criteria) this;
        }

        public Criteria andSTICOIsNotNull() {
            addCriterion("STICO is not null");
            return (Criteria) this;
        }

        public Criteria andSTICOEqualTo(String value) {
            addCriterion("STICO =", value, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICONotEqualTo(String value) {
            addCriterion("STICO <>", value, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICOGreaterThan(String value) {
            addCriterion("STICO >", value, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICOGreaterThanOrEqualTo(String value) {
            addCriterion("STICO >=", value, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICOLessThan(String value) {
            addCriterion("STICO <", value, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICOLessThanOrEqualTo(String value) {
            addCriterion("STICO <=", value, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICOLike(String value) {
            addCriterion("STICO like", value, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICONotLike(String value) {
            addCriterion("STICO not like", value, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICOIn(List<String> values) {
            addCriterion("STICO in", values, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICONotIn(List<String> values) {
            addCriterion("STICO not in", values, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICOBetween(String value1, String value2) {
            addCriterion("STICO between", value1, value2, "STICO");
            return (Criteria) this;
        }

        public Criteria andSTICONotBetween(String value1, String value2) {
            addCriterion("STICO not between", value1, value2, "STICO");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDIsNull() {
            addCriterion("RelationSTCD is null");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDIsNotNull() {
            addCriterion("RelationSTCD is not null");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDEqualTo(String value) {
            addCriterion("RelationSTCD =", value, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDNotEqualTo(String value) {
            addCriterion("RelationSTCD <>", value, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDGreaterThan(String value) {
            addCriterion("RelationSTCD >", value, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDGreaterThanOrEqualTo(String value) {
            addCriterion("RelationSTCD >=", value, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDLessThan(String value) {
            addCriterion("RelationSTCD <", value, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDLessThanOrEqualTo(String value) {
            addCriterion("RelationSTCD <=", value, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDLike(String value) {
            addCriterion("RelationSTCD like", value, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDNotLike(String value) {
            addCriterion("RelationSTCD not like", value, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDIn(List<String> values) {
            addCriterion("RelationSTCD in", values, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDNotIn(List<String> values) {
            addCriterion("RelationSTCD not in", values, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDBetween(String value1, String value2) {
            addCriterion("RelationSTCD between", value1, value2, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andRelationSTCDNotBetween(String value1, String value2) {
            addCriterion("RelationSTCD not between", value1, value2, "relationSTCD");
            return (Criteria) this;
        }

        public Criteria andMapZoomIsNull() {
            addCriterion("MapZoom is null");
            return (Criteria) this;
        }

        public Criteria andMapZoomIsNotNull() {
            addCriterion("MapZoom is not null");
            return (Criteria) this;
        }

        public Criteria andMapZoomEqualTo(Integer value) {
            addCriterion("MapZoom =", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomNotEqualTo(Integer value) {
            addCriterion("MapZoom <>", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomGreaterThan(Integer value) {
            addCriterion("MapZoom >", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("MapZoom >=", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomLessThan(Integer value) {
            addCriterion("MapZoom <", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomLessThanOrEqualTo(Integer value) {
            addCriterion("MapZoom <=", value, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomIn(List<Integer> values) {
            addCriterion("MapZoom in", values, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomNotIn(List<Integer> values) {
            addCriterion("MapZoom not in", values, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomBetween(Integer value1, Integer value2) {
            addCriterion("MapZoom between", value1, value2, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andMapZoomNotBetween(Integer value1, Integer value2) {
            addCriterion("MapZoom not between", value1, value2, "mapZoom");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("Sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("Sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("Sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("Sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("Sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("Sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("Sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("Sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("Sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("Sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("Sort not between", value1, value2, "sort");
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