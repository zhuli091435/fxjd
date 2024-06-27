package com.fxjd.info.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CtrlOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtrlOrderExample() {
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

        public Criteria andUserIDIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(String value) {
            addCriterion("UserID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(String value) {
            addCriterion("UserID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(String value) {
            addCriterion("UserID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLike(String value) {
            addCriterion("UserID like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotLike(String value) {
            addCriterion("UserID not like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<String> values) {
            addCriterion("UserID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andStationIDIsNull() {
            addCriterion("StationID is null");
            return (Criteria) this;
        }

        public Criteria andStationIDIsNotNull() {
            addCriterion("StationID is not null");
            return (Criteria) this;
        }

        public Criteria andStationIDEqualTo(String value) {
            addCriterion("StationID =", value, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDNotEqualTo(String value) {
            addCriterion("StationID <>", value, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDGreaterThan(String value) {
            addCriterion("StationID >", value, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDGreaterThanOrEqualTo(String value) {
            addCriterion("StationID >=", value, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDLessThan(String value) {
            addCriterion("StationID <", value, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDLessThanOrEqualTo(String value) {
            addCriterion("StationID <=", value, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDLike(String value) {
            addCriterion("StationID like", value, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDNotLike(String value) {
            addCriterion("StationID not like", value, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDIn(List<String> values) {
            addCriterion("StationID in", values, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDNotIn(List<String> values) {
            addCriterion("StationID not in", values, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDBetween(String value1, String value2) {
            addCriterion("StationID between", value1, value2, "stationID");
            return (Criteria) this;
        }

        public Criteria andStationIDNotBetween(String value1, String value2) {
            addCriterion("StationID not between", value1, value2, "stationID");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("OrderCode is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("OrderCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("OrderCode =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("OrderCode <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("OrderCode >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderCode >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("OrderCode <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("OrderCode <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("OrderCode like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("OrderCode not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("OrderCode in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("OrderCode not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("OrderCode between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("OrderCode not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderParamIsNull() {
            addCriterion("OrderParam is null");
            return (Criteria) this;
        }

        public Criteria andOrderParamIsNotNull() {
            addCriterion("OrderParam is not null");
            return (Criteria) this;
        }

        public Criteria andOrderParamEqualTo(String value) {
            addCriterion("OrderParam =", value, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamNotEqualTo(String value) {
            addCriterion("OrderParam <>", value, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamGreaterThan(String value) {
            addCriterion("OrderParam >", value, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamGreaterThanOrEqualTo(String value) {
            addCriterion("OrderParam >=", value, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamLessThan(String value) {
            addCriterion("OrderParam <", value, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamLessThanOrEqualTo(String value) {
            addCriterion("OrderParam <=", value, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamLike(String value) {
            addCriterion("OrderParam like", value, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamNotLike(String value) {
            addCriterion("OrderParam not like", value, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamIn(List<String> values) {
            addCriterion("OrderParam in", values, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamNotIn(List<String> values) {
            addCriterion("OrderParam not in", values, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamBetween(String value1, String value2) {
            addCriterion("OrderParam between", value1, value2, "orderParam");
            return (Criteria) this;
        }

        public Criteria andOrderParamNotBetween(String value1, String value2) {
            addCriterion("OrderParam not between", value1, value2, "orderParam");
            return (Criteria) this;
        }

        public Criteria andDeviceIDIsNull() {
            addCriterion("DeviceID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIDIsNotNull() {
            addCriterion("DeviceID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIDEqualTo(String value) {
            addCriterion("DeviceID =", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotEqualTo(String value) {
            addCriterion("DeviceID <>", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDGreaterThan(String value) {
            addCriterion("DeviceID >", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceID >=", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDLessThan(String value) {
            addCriterion("DeviceID <", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDLessThanOrEqualTo(String value) {
            addCriterion("DeviceID <=", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDLike(String value) {
            addCriterion("DeviceID like", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotLike(String value) {
            addCriterion("DeviceID not like", value, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDIn(List<String> values) {
            addCriterion("DeviceID in", values, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotIn(List<String> values) {
            addCriterion("DeviceID not in", values, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDBetween(String value1, String value2) {
            addCriterion("DeviceID between", value1, value2, "deviceID");
            return (Criteria) this;
        }

        public Criteria andDeviceIDNotBetween(String value1, String value2) {
            addCriterion("DeviceID not between", value1, value2, "deviceID");
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