package com.fxjd.info.pojo;

import java.util.ArrayList;
import java.util.List;

public class CameraEquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CameraEquipmentExample() {
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

        public Criteria andDeviceNameIsNull() {
            addCriterion("DeviceName is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("DeviceName is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("DeviceName =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("DeviceName <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("DeviceName >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceName >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("DeviceName <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("DeviceName <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("DeviceName like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("DeviceName not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("DeviceName in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("DeviceName not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("DeviceName between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("DeviceName not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("DeviceType is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("DeviceType is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("DeviceType =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("DeviceType <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("DeviceType >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DeviceType >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("DeviceType <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("DeviceType <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("DeviceType like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("DeviceType not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("DeviceType in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("DeviceType not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("DeviceType between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("DeviceType not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andIPIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIPIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIPEqualTo(String value) {
            addCriterion("IP =", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotEqualTo(String value) {
            addCriterion("IP <>", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThan(String value) {
            addCriterion("IP >", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThan(String value) {
            addCriterion("IP <", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLike(String value) {
            addCriterion("IP like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotLike(String value) {
            addCriterion("IP not like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPIn(List<String> values) {
            addCriterion("IP in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotIn(List<String> values) {
            addCriterion("IP not in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("Port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("Port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("Port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("Port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("Port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("Port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("Port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("Port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("Port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("Port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("Port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("Port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("Port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("Port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("Channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("Channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("Channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("Channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("Channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("Channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("Channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("Channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("Channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("Channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("Channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("Channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("Channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("Channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNull() {
            addCriterion("ServerPort is null");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNotNull() {
            addCriterion("ServerPort is not null");
            return (Criteria) this;
        }

        public Criteria andServerPortEqualTo(String value) {
            addCriterion("ServerPort =", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotEqualTo(String value) {
            addCriterion("ServerPort <>", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThan(String value) {
            addCriterion("ServerPort >", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThanOrEqualTo(String value) {
            addCriterion("ServerPort >=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThan(String value) {
            addCriterion("ServerPort <", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThanOrEqualTo(String value) {
            addCriterion("ServerPort <=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLike(String value) {
            addCriterion("ServerPort like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotLike(String value) {
            addCriterion("ServerPort not like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortIn(List<String> values) {
            addCriterion("ServerPort in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotIn(List<String> values) {
            addCriterion("ServerPort not in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortBetween(String value1, String value2) {
            addCriterion("ServerPort between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotBetween(String value1, String value2) {
            addCriterion("ServerPort not between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("UserName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("UserName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("UserName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("UserName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("UserName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("UserName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("UserPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("UserPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("UserPassword =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("UserPassword <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("UserPassword >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("UserPassword >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("UserPassword <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("UserPassword <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("UserPassword like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("UserPassword not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("UserPassword in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("UserPassword not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("UserPassword between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("UserPassword not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andNChannelIDIsNull() {
            addCriterion("nChannelID is null");
            return (Criteria) this;
        }

        public Criteria andNChannelIDIsNotNull() {
            addCriterion("nChannelID is not null");
            return (Criteria) this;
        }

        public Criteria andNChannelIDEqualTo(String value) {
            addCriterion("nChannelID =", value, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDNotEqualTo(String value) {
            addCriterion("nChannelID <>", value, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDGreaterThan(String value) {
            addCriterion("nChannelID >", value, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDGreaterThanOrEqualTo(String value) {
            addCriterion("nChannelID >=", value, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDLessThan(String value) {
            addCriterion("nChannelID <", value, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDLessThanOrEqualTo(String value) {
            addCriterion("nChannelID <=", value, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDLike(String value) {
            addCriterion("nChannelID like", value, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDNotLike(String value) {
            addCriterion("nChannelID not like", value, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDIn(List<String> values) {
            addCriterion("nChannelID in", values, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDNotIn(List<String> values) {
            addCriterion("nChannelID not in", values, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDBetween(String value1, String value2) {
            addCriterion("nChannelID between", value1, value2, "nChannelID");
            return (Criteria) this;
        }

        public Criteria andNChannelIDNotBetween(String value1, String value2) {
            addCriterion("nChannelID not between", value1, value2, "nChannelID");
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