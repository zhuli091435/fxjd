package com.fxjd.info.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BroadcastFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BroadcastFileExample() {
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

        public Criteria andBroadcastFileIDIsNull() {
            addCriterion("BroadcastFileID is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDIsNotNull() {
            addCriterion("BroadcastFileID is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDEqualTo(Integer value) {
            addCriterion("BroadcastFileID =", value, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDNotEqualTo(Integer value) {
            addCriterion("BroadcastFileID <>", value, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDGreaterThan(Integer value) {
            addCriterion("BroadcastFileID >", value, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("BroadcastFileID >=", value, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDLessThan(Integer value) {
            addCriterion("BroadcastFileID <", value, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDLessThanOrEqualTo(Integer value) {
            addCriterion("BroadcastFileID <=", value, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDIn(List<Integer> values) {
            addCriterion("BroadcastFileID in", values, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDNotIn(List<Integer> values) {
            addCriterion("BroadcastFileID not in", values, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDBetween(Integer value1, Integer value2) {
            addCriterion("BroadcastFileID between", value1, value2, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDNotBetween(Integer value1, Integer value2) {
            addCriterion("BroadcastFileID not between", value1, value2, "broadcastFileID");
            return (Criteria) this;
        }

        public Criteria andRealFileNameIsNull() {
            addCriterion("RealFileName is null");
            return (Criteria) this;
        }

        public Criteria andRealFileNameIsNotNull() {
            addCriterion("RealFileName is not null");
            return (Criteria) this;
        }

        public Criteria andRealFileNameEqualTo(String value) {
            addCriterion("RealFileName =", value, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameNotEqualTo(String value) {
            addCriterion("RealFileName <>", value, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameGreaterThan(String value) {
            addCriterion("RealFileName >", value, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("RealFileName >=", value, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameLessThan(String value) {
            addCriterion("RealFileName <", value, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameLessThanOrEqualTo(String value) {
            addCriterion("RealFileName <=", value, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameLike(String value) {
            addCriterion("RealFileName like", value, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameNotLike(String value) {
            addCriterion("RealFileName not like", value, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameIn(List<String> values) {
            addCriterion("RealFileName in", values, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameNotIn(List<String> values) {
            addCriterion("RealFileName not in", values, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameBetween(String value1, String value2) {
            addCriterion("RealFileName between", value1, value2, "realFileName");
            return (Criteria) this;
        }

        public Criteria andRealFileNameNotBetween(String value1, String value2) {
            addCriterion("RealFileName not between", value1, value2, "realFileName");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("FilePath is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("FilePath is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("FilePath =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("FilePath <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("FilePath >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("FilePath >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("FilePath <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("FilePath <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("FilePath like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("FilePath not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("FilePath in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("FilePath not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("FilePath between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("FilePath not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathIsNull() {
            addCriterion("FullFilePath is null");
            return (Criteria) this;
        }

        public Criteria andFullFilePathIsNotNull() {
            addCriterion("FullFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andFullFilePathEqualTo(String value) {
            addCriterion("FullFilePath =", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathNotEqualTo(String value) {
            addCriterion("FullFilePath <>", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathGreaterThan(String value) {
            addCriterion("FullFilePath >", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("FullFilePath >=", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathLessThan(String value) {
            addCriterion("FullFilePath <", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathLessThanOrEqualTo(String value) {
            addCriterion("FullFilePath <=", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathLike(String value) {
            addCriterion("FullFilePath like", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathNotLike(String value) {
            addCriterion("FullFilePath not like", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathIn(List<String> values) {
            addCriterion("FullFilePath in", values, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathNotIn(List<String> values) {
            addCriterion("FullFilePath not in", values, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathBetween(String value1, String value2) {
            addCriterion("FullFilePath between", value1, value2, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathNotBetween(String value1, String value2) {
            addCriterion("FullFilePath not between", value1, value2, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("FileSize is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("FileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(String value) {
            addCriterion("FileSize =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(String value) {
            addCriterion("FileSize <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(String value) {
            addCriterion("FileSize >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(String value) {
            addCriterion("FileSize >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(String value) {
            addCriterion("FileSize <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(String value) {
            addCriterion("FileSize <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLike(String value) {
            addCriterion("FileSize like", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotLike(String value) {
            addCriterion("FileSize not like", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<String> values) {
            addCriterion("FileSize in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<String> values) {
            addCriterion("FileSize not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(String value1, String value2) {
            addCriterion("FileSize between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(String value1, String value2) {
            addCriterion("FileSize not between", value1, value2, "fileSize");
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

        public Criteria andUserIDEqualTo(Integer value) {
            addCriterion("UserID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(Integer value) {
            addCriterion("UserID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<Integer> values) {
            addCriterion("UserID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("FileType is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("FileType is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("FileType =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("FileType <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("FileType >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FileType >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("FileType <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("FileType <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("FileType like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("FileType not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("FileType in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("FileType not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("FileType between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("FileType not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameIsNull() {
            addCriterion("CustomFileName is null");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameIsNotNull() {
            addCriterion("CustomFileName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameEqualTo(String value) {
            addCriterion("CustomFileName =", value, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameNotEqualTo(String value) {
            addCriterion("CustomFileName <>", value, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameGreaterThan(String value) {
            addCriterion("CustomFileName >", value, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomFileName >=", value, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameLessThan(String value) {
            addCriterion("CustomFileName <", value, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameLessThanOrEqualTo(String value) {
            addCriterion("CustomFileName <=", value, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameLike(String value) {
            addCriterion("CustomFileName like", value, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameNotLike(String value) {
            addCriterion("CustomFileName not like", value, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameIn(List<String> values) {
            addCriterion("CustomFileName in", values, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameNotIn(List<String> values) {
            addCriterion("CustomFileName not in", values, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameBetween(String value1, String value2) {
            addCriterion("CustomFileName between", value1, value2, "customFileName");
            return (Criteria) this;
        }

        public Criteria andCustomFileNameNotBetween(String value1, String value2) {
            addCriterion("CustomFileName not between", value1, value2, "customFileName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
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