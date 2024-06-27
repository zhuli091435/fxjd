package com.fxjd.info.pojo;

import java.util.ArrayList;
import java.util.List;

public class ST_H_GATE_BExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_H_GATE_BExample() {
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

        public Criteria andGateTypeIsNull() {
            addCriterion("GateType is null");
            return (Criteria) this;
        }

        public Criteria andGateTypeIsNotNull() {
            addCriterion("GateType is not null");
            return (Criteria) this;
        }

        public Criteria andGateTypeEqualTo(String value) {
            addCriterion("GateType =", value, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeNotEqualTo(String value) {
            addCriterion("GateType <>", value, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeGreaterThan(String value) {
            addCriterion("GateType >", value, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GateType >=", value, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeLessThan(String value) {
            addCriterion("GateType <", value, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeLessThanOrEqualTo(String value) {
            addCriterion("GateType <=", value, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeLike(String value) {
            addCriterion("GateType like", value, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeNotLike(String value) {
            addCriterion("GateType not like", value, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeIn(List<String> values) {
            addCriterion("GateType in", values, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeNotIn(List<String> values) {
            addCriterion("GateType not in", values, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeBetween(String value1, String value2) {
            addCriterion("GateType between", value1, value2, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateTypeNotBetween(String value1, String value2) {
            addCriterion("GateType not between", value1, value2, "gateType");
            return (Criteria) this;
        }

        public Criteria andGateRemarkIsNull() {
            addCriterion("GateRemark is null");
            return (Criteria) this;
        }

        public Criteria andGateRemarkIsNotNull() {
            addCriterion("GateRemark is not null");
            return (Criteria) this;
        }

        public Criteria andGateRemarkEqualTo(String value) {
            addCriterion("GateRemark =", value, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkNotEqualTo(String value) {
            addCriterion("GateRemark <>", value, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkGreaterThan(String value) {
            addCriterion("GateRemark >", value, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("GateRemark >=", value, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkLessThan(String value) {
            addCriterion("GateRemark <", value, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkLessThanOrEqualTo(String value) {
            addCriterion("GateRemark <=", value, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkLike(String value) {
            addCriterion("GateRemark like", value, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkNotLike(String value) {
            addCriterion("GateRemark not like", value, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkIn(List<String> values) {
            addCriterion("GateRemark in", values, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkNotIn(List<String> values) {
            addCriterion("GateRemark not in", values, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkBetween(String value1, String value2) {
            addCriterion("GateRemark between", value1, value2, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andGateRemarkNotBetween(String value1, String value2) {
            addCriterion("GateRemark not between", value1, value2, "gateRemark");
            return (Criteria) this;
        }

        public Criteria andCameraIDIsNull() {
            addCriterion("CameraID is null");
            return (Criteria) this;
        }

        public Criteria andCameraIDIsNotNull() {
            addCriterion("CameraID is not null");
            return (Criteria) this;
        }

        public Criteria andCameraIDEqualTo(Integer value) {
            addCriterion("CameraID =", value, "cameraID");
            return (Criteria) this;
        }

        public Criteria andCameraIDNotEqualTo(Integer value) {
            addCriterion("CameraID <>", value, "cameraID");
            return (Criteria) this;
        }

        public Criteria andCameraIDGreaterThan(Integer value) {
            addCriterion("CameraID >", value, "cameraID");
            return (Criteria) this;
        }

        public Criteria andCameraIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CameraID >=", value, "cameraID");
            return (Criteria) this;
        }

        public Criteria andCameraIDLessThan(Integer value) {
            addCriterion("CameraID <", value, "cameraID");
            return (Criteria) this;
        }

        public Criteria andCameraIDLessThanOrEqualTo(Integer value) {
            addCriterion("CameraID <=", value, "cameraID");
            return (Criteria) this;
        }

        public Criteria andCameraIDIn(List<Integer> values) {
            addCriterion("CameraID in", values, "cameraID");
            return (Criteria) this;
        }

        public Criteria andCameraIDNotIn(List<Integer> values) {
            addCriterion("CameraID not in", values, "cameraID");
            return (Criteria) this;
        }

        public Criteria andCameraIDBetween(Integer value1, Integer value2) {
            addCriterion("CameraID between", value1, value2, "cameraID");
            return (Criteria) this;
        }

        public Criteria andCameraIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CameraID not between", value1, value2, "cameraID");
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