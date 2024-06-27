package com.fxjd.info.pojo;

import java.util.ArrayList;
import java.util.List;

public class BroadcastTaskTempleteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BroadcastTaskTempleteExample() {
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

        public Criteria andTempleteIDIsNull() {
            addCriterion("TempleteID is null");
            return (Criteria) this;
        }

        public Criteria andTempleteIDIsNotNull() {
            addCriterion("TempleteID is not null");
            return (Criteria) this;
        }

        public Criteria andTempleteIDEqualTo(Integer value) {
            addCriterion("TempleteID =", value, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTempleteIDNotEqualTo(Integer value) {
            addCriterion("TempleteID <>", value, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTempleteIDGreaterThan(Integer value) {
            addCriterion("TempleteID >", value, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTempleteIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("TempleteID >=", value, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTempleteIDLessThan(Integer value) {
            addCriterion("TempleteID <", value, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTempleteIDLessThanOrEqualTo(Integer value) {
            addCriterion("TempleteID <=", value, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTempleteIDIn(List<Integer> values) {
            addCriterion("TempleteID in", values, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTempleteIDNotIn(List<Integer> values) {
            addCriterion("TempleteID not in", values, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTempleteIDBetween(Integer value1, Integer value2) {
            addCriterion("TempleteID between", value1, value2, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTempleteIDNotBetween(Integer value1, Integer value2) {
            addCriterion("TempleteID not between", value1, value2, "templeteID");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TaskName is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TaskName is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TaskName =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TaskName <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TaskName >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TaskName >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TaskName <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TaskName <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TaskName like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TaskName not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TaskName in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TaskName not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TaskName between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TaskName not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("Method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("Method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("Method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("Method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("Method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("Method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("Method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("Method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("Method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("Method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("Method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("Method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("Method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("Method not between", value1, value2, "method");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("State like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("State not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("Text is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("Text is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("Text =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("Text <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("Text >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("Text >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("Text <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("Text <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("Text like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("Text not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("Text in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("Text not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("Text between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("Text not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsIsNull() {
            addCriterion("BroadcastFileIDs is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsIsNotNull() {
            addCriterion("BroadcastFileIDs is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsEqualTo(String value) {
            addCriterion("BroadcastFileIDs =", value, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsNotEqualTo(String value) {
            addCriterion("BroadcastFileIDs <>", value, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsGreaterThan(String value) {
            addCriterion("BroadcastFileIDs >", value, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsGreaterThanOrEqualTo(String value) {
            addCriterion("BroadcastFileIDs >=", value, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsLessThan(String value) {
            addCriterion("BroadcastFileIDs <", value, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsLessThanOrEqualTo(String value) {
            addCriterion("BroadcastFileIDs <=", value, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsLike(String value) {
            addCriterion("BroadcastFileIDs like", value, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsNotLike(String value) {
            addCriterion("BroadcastFileIDs not like", value, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsIn(List<String> values) {
            addCriterion("BroadcastFileIDs in", values, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsNotIn(List<String> values) {
            addCriterion("BroadcastFileIDs not in", values, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsBetween(String value1, String value2) {
            addCriterion("BroadcastFileIDs between", value1, value2, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastFileIDsNotBetween(String value1, String value2) {
            addCriterion("BroadcastFileIDs not between", value1, value2, "broadcastFileIDs");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsIsNull() {
            addCriterion("BroadcastEndpoints is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsIsNotNull() {
            addCriterion("BroadcastEndpoints is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsEqualTo(String value) {
            addCriterion("BroadcastEndpoints =", value, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsNotEqualTo(String value) {
            addCriterion("BroadcastEndpoints <>", value, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsGreaterThan(String value) {
            addCriterion("BroadcastEndpoints >", value, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsGreaterThanOrEqualTo(String value) {
            addCriterion("BroadcastEndpoints >=", value, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsLessThan(String value) {
            addCriterion("BroadcastEndpoints <", value, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsLessThanOrEqualTo(String value) {
            addCriterion("BroadcastEndpoints <=", value, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsLike(String value) {
            addCriterion("BroadcastEndpoints like", value, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsNotLike(String value) {
            addCriterion("BroadcastEndpoints not like", value, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsIn(List<String> values) {
            addCriterion("BroadcastEndpoints in", values, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsNotIn(List<String> values) {
            addCriterion("BroadcastEndpoints not in", values, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsBetween(String value1, String value2) {
            addCriterion("BroadcastEndpoints between", value1, value2, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndpointsNotBetween(String value1, String value2) {
            addCriterion("BroadcastEndpoints not between", value1, value2, "broadcastEndpoints");
            return (Criteria) this;
        }

        public Criteria andPlay_modeIsNull() {
            addCriterion("play_mode is null");
            return (Criteria) this;
        }

        public Criteria andPlay_modeIsNotNull() {
            addCriterion("play_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_modeEqualTo(Integer value) {
            addCriterion("play_mode =", value, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_modeNotEqualTo(Integer value) {
            addCriterion("play_mode <>", value, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_modeGreaterThan(Integer value) {
            addCriterion("play_mode >", value, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_modeGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_mode >=", value, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_modeLessThan(Integer value) {
            addCriterion("play_mode <", value, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_modeLessThanOrEqualTo(Integer value) {
            addCriterion("play_mode <=", value, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_modeIn(List<Integer> values) {
            addCriterion("play_mode in", values, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_modeNotIn(List<Integer> values) {
            addCriterion("play_mode not in", values, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_modeBetween(Integer value1, Integer value2) {
            addCriterion("play_mode between", value1, value2, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_modeNotBetween(Integer value1, Integer value2) {
            addCriterion("play_mode not between", value1, value2, "play_mode");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeIsNull() {
            addCriterion("play_volume is null");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeIsNotNull() {
            addCriterion("play_volume is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeEqualTo(Integer value) {
            addCriterion("play_volume =", value, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeNotEqualTo(Integer value) {
            addCriterion("play_volume <>", value, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeGreaterThan(Integer value) {
            addCriterion("play_volume >", value, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_volume >=", value, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeLessThan(Integer value) {
            addCriterion("play_volume <", value, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeLessThanOrEqualTo(Integer value) {
            addCriterion("play_volume <=", value, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeIn(List<Integer> values) {
            addCriterion("play_volume in", values, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeNotIn(List<Integer> values) {
            addCriterion("play_volume not in", values, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeBetween(Integer value1, Integer value2) {
            addCriterion("play_volume between", value1, value2, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_volumeNotBetween(Integer value1, Integer value2) {
            addCriterion("play_volume not between", value1, value2, "play_volume");
            return (Criteria) this;
        }

        public Criteria andPlay_secondIsNull() {
            addCriterion("play_second is null");
            return (Criteria) this;
        }

        public Criteria andPlay_secondIsNotNull() {
            addCriterion("play_second is not null");
            return (Criteria) this;
        }

        public Criteria andPlay_secondEqualTo(Integer value) {
            addCriterion("play_second =", value, "play_second");
            return (Criteria) this;
        }

        public Criteria andPlay_secondNotEqualTo(Integer value) {
            addCriterion("play_second <>", value, "play_second");
            return (Criteria) this;
        }

        public Criteria andPlay_secondGreaterThan(Integer value) {
            addCriterion("play_second >", value, "play_second");
            return (Criteria) this;
        }

        public Criteria andPlay_secondGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_second >=", value, "play_second");
            return (Criteria) this;
        }

        public Criteria andPlay_secondLessThan(Integer value) {
            addCriterion("play_second <", value, "play_second");
            return (Criteria) this;
        }

        public Criteria andPlay_secondLessThanOrEqualTo(Integer value) {
            addCriterion("play_second <=", value, "play_second");
            return (Criteria) this;
        }

        public Criteria andPlay_secondIn(List<Integer> values) {
            addCriterion("play_second in", values, "play_second");
            return (Criteria) this;
        }

        public Criteria andPlay_secondNotIn(List<Integer> values) {
            addCriterion("play_second not in", values, "play_second");
            return (Criteria) this;
        }

        public Criteria andPlay_secondBetween(Integer value1, Integer value2) {
            addCriterion("play_second between", value1, value2, "play_second");
            return (Criteria) this;
        }

        public Criteria andPlay_secondNotBetween(Integer value1, Integer value2) {
            addCriterion("play_second not between", value1, value2, "play_second");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
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