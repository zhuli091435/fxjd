package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_WaveMaker_RExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_WaveMaker_RExample() {
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

        public Criteria andWorkmanshipIsNull() {
            addCriterion("Workmanship is null");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipIsNotNull() {
            addCriterion("Workmanship is not null");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipEqualTo(String value) {
            addCriterion("Workmanship =", value, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipNotEqualTo(String value) {
            addCriterion("Workmanship <>", value, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipGreaterThan(String value) {
            addCriterion("Workmanship >", value, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipGreaterThanOrEqualTo(String value) {
            addCriterion("Workmanship >=", value, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipLessThan(String value) {
            addCriterion("Workmanship <", value, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipLessThanOrEqualTo(String value) {
            addCriterion("Workmanship <=", value, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipLike(String value) {
            addCriterion("Workmanship like", value, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipNotLike(String value) {
            addCriterion("Workmanship not like", value, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipIn(List<String> values) {
            addCriterion("Workmanship in", values, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipNotIn(List<String> values) {
            addCriterion("Workmanship not in", values, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipBetween(String value1, String value2) {
            addCriterion("Workmanship between", value1, value2, "workmanship");
            return (Criteria) this;
        }

        public Criteria andWorkmanshipNotBetween(String value1, String value2) {
            addCriterion("Workmanship not between", value1, value2, "workmanship");
            return (Criteria) this;
        }

        public Criteria andCycleCountIsNull() {
            addCriterion("CycleCount is null");
            return (Criteria) this;
        }

        public Criteria andCycleCountIsNotNull() {
            addCriterion("CycleCount is not null");
            return (Criteria) this;
        }

        public Criteria andCycleCountEqualTo(Integer value) {
            addCriterion("CycleCount =", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountNotEqualTo(Integer value) {
            addCriterion("CycleCount <>", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountGreaterThan(Integer value) {
            addCriterion("CycleCount >", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CycleCount >=", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountLessThan(Integer value) {
            addCriterion("CycleCount <", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountLessThanOrEqualTo(Integer value) {
            addCriterion("CycleCount <=", value, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountIn(List<Integer> values) {
            addCriterion("CycleCount in", values, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountNotIn(List<Integer> values) {
            addCriterion("CycleCount not in", values, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountBetween(Integer value1, Integer value2) {
            addCriterion("CycleCount between", value1, value2, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andCycleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("CycleCount not between", value1, value2, "cycleCount");
            return (Criteria) this;
        }

        public Criteria andEquipStatusIsNull() {
            addCriterion("EquipStatus is null");
            return (Criteria) this;
        }

        public Criteria andEquipStatusIsNotNull() {
            addCriterion("EquipStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEquipStatusEqualTo(String value) {
            addCriterion("EquipStatus =", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusNotEqualTo(String value) {
            addCriterion("EquipStatus <>", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusGreaterThan(String value) {
            addCriterion("EquipStatus >", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusGreaterThanOrEqualTo(String value) {
            addCriterion("EquipStatus >=", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusLessThan(String value) {
            addCriterion("EquipStatus <", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusLessThanOrEqualTo(String value) {
            addCriterion("EquipStatus <=", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusLike(String value) {
            addCriterion("EquipStatus like", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusNotLike(String value) {
            addCriterion("EquipStatus not like", value, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusIn(List<String> values) {
            addCriterion("EquipStatus in", values, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusNotIn(List<String> values) {
            addCriterion("EquipStatus not in", values, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusBetween(String value1, String value2) {
            addCriterion("EquipStatus between", value1, value2, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andEquipStatusNotBetween(String value1, String value2) {
            addCriterion("EquipStatus not between", value1, value2, "equipStatus");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1IsNull() {
            addCriterion("PositioningCompleted1 is null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1IsNotNull() {
            addCriterion("PositioningCompleted1 is not null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1EqualTo(String value) {
            addCriterion("PositioningCompleted1 =", value, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1NotEqualTo(String value) {
            addCriterion("PositioningCompleted1 <>", value, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1GreaterThan(String value) {
            addCriterion("PositioningCompleted1 >", value, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1GreaterThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted1 >=", value, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1LessThan(String value) {
            addCriterion("PositioningCompleted1 <", value, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1LessThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted1 <=", value, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1Like(String value) {
            addCriterion("PositioningCompleted1 like", value, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1NotLike(String value) {
            addCriterion("PositioningCompleted1 not like", value, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1In(List<String> values) {
            addCriterion("PositioningCompleted1 in", values, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1NotIn(List<String> values) {
            addCriterion("PositioningCompleted1 not in", values, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1Between(String value1, String value2) {
            addCriterion("PositioningCompleted1 between", value1, value2, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted1NotBetween(String value1, String value2) {
            addCriterion("PositioningCompleted1 not between", value1, value2, "positioningCompleted1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1IsNull() {
            addCriterion("DriverFault1 is null");
            return (Criteria) this;
        }

        public Criteria andDriverFault1IsNotNull() {
            addCriterion("DriverFault1 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverFault1EqualTo(String value) {
            addCriterion("DriverFault1 =", value, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1NotEqualTo(String value) {
            addCriterion("DriverFault1 <>", value, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1GreaterThan(String value) {
            addCriterion("DriverFault1 >", value, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1GreaterThanOrEqualTo(String value) {
            addCriterion("DriverFault1 >=", value, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1LessThan(String value) {
            addCriterion("DriverFault1 <", value, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1LessThanOrEqualTo(String value) {
            addCriterion("DriverFault1 <=", value, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1Like(String value) {
            addCriterion("DriverFault1 like", value, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1NotLike(String value) {
            addCriterion("DriverFault1 not like", value, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1In(List<String> values) {
            addCriterion("DriverFault1 in", values, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1NotIn(List<String> values) {
            addCriterion("DriverFault1 not in", values, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1Between(String value1, String value2) {
            addCriterion("DriverFault1 between", value1, value2, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverFault1NotBetween(String value1, String value2) {
            addCriterion("DriverFault1 not between", value1, value2, "driverFault1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1IsNull() {
            addCriterion("DriverEnable1 is null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1IsNotNull() {
            addCriterion("DriverEnable1 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1EqualTo(String value) {
            addCriterion("DriverEnable1 =", value, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1NotEqualTo(String value) {
            addCriterion("DriverEnable1 <>", value, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1GreaterThan(String value) {
            addCriterion("DriverEnable1 >", value, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1GreaterThanOrEqualTo(String value) {
            addCriterion("DriverEnable1 >=", value, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1LessThan(String value) {
            addCriterion("DriverEnable1 <", value, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1LessThanOrEqualTo(String value) {
            addCriterion("DriverEnable1 <=", value, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1Like(String value) {
            addCriterion("DriverEnable1 like", value, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1NotLike(String value) {
            addCriterion("DriverEnable1 not like", value, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1In(List<String> values) {
            addCriterion("DriverEnable1 in", values, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1NotIn(List<String> values) {
            addCriterion("DriverEnable1 not in", values, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1Between(String value1, String value2) {
            addCriterion("DriverEnable1 between", value1, value2, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andDriverEnable1NotBetween(String value1, String value2) {
            addCriterion("DriverEnable1 not between", value1, value2, "driverEnable1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1IsNull() {
            addCriterion("ReachLimit1 is null");
            return (Criteria) this;
        }

        public Criteria andReachLimit1IsNotNull() {
            addCriterion("ReachLimit1 is not null");
            return (Criteria) this;
        }

        public Criteria andReachLimit1EqualTo(String value) {
            addCriterion("ReachLimit1 =", value, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1NotEqualTo(String value) {
            addCriterion("ReachLimit1 <>", value, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1GreaterThan(String value) {
            addCriterion("ReachLimit1 >", value, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1GreaterThanOrEqualTo(String value) {
            addCriterion("ReachLimit1 >=", value, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1LessThan(String value) {
            addCriterion("ReachLimit1 <", value, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1LessThanOrEqualTo(String value) {
            addCriterion("ReachLimit1 <=", value, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1Like(String value) {
            addCriterion("ReachLimit1 like", value, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1NotLike(String value) {
            addCriterion("ReachLimit1 not like", value, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1In(List<String> values) {
            addCriterion("ReachLimit1 in", values, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1NotIn(List<String> values) {
            addCriterion("ReachLimit1 not in", values, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1Between(String value1, String value2) {
            addCriterion("ReachLimit1 between", value1, value2, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andReachLimit1NotBetween(String value1, String value2) {
            addCriterion("ReachLimit1 not between", value1, value2, "reachLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1IsNull() {
            addCriterion("RetractLimit1 is null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1IsNotNull() {
            addCriterion("RetractLimit1 is not null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1EqualTo(String value) {
            addCriterion("RetractLimit1 =", value, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1NotEqualTo(String value) {
            addCriterion("RetractLimit1 <>", value, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1GreaterThan(String value) {
            addCriterion("RetractLimit1 >", value, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1GreaterThanOrEqualTo(String value) {
            addCriterion("RetractLimit1 >=", value, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1LessThan(String value) {
            addCriterion("RetractLimit1 <", value, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1LessThanOrEqualTo(String value) {
            addCriterion("RetractLimit1 <=", value, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1Like(String value) {
            addCriterion("RetractLimit1 like", value, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1NotLike(String value) {
            addCriterion("RetractLimit1 not like", value, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1In(List<String> values) {
            addCriterion("RetractLimit1 in", values, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1NotIn(List<String> values) {
            addCriterion("RetractLimit1 not in", values, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1Between(String value1, String value2) {
            addCriterion("RetractLimit1 between", value1, value2, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andRetractLimit1NotBetween(String value1, String value2) {
            addCriterion("RetractLimit1 not between", value1, value2, "retractLimit1");
            return (Criteria) this;
        }

        public Criteria andFault1IsNull() {
            addCriterion("Fault1 is null");
            return (Criteria) this;
        }

        public Criteria andFault1IsNotNull() {
            addCriterion("Fault1 is not null");
            return (Criteria) this;
        }

        public Criteria andFault1EqualTo(String value) {
            addCriterion("Fault1 =", value, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1NotEqualTo(String value) {
            addCriterion("Fault1 <>", value, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1GreaterThan(String value) {
            addCriterion("Fault1 >", value, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1GreaterThanOrEqualTo(String value) {
            addCriterion("Fault1 >=", value, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1LessThan(String value) {
            addCriterion("Fault1 <", value, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1LessThanOrEqualTo(String value) {
            addCriterion("Fault1 <=", value, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1Like(String value) {
            addCriterion("Fault1 like", value, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1NotLike(String value) {
            addCriterion("Fault1 not like", value, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1In(List<String> values) {
            addCriterion("Fault1 in", values, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1NotIn(List<String> values) {
            addCriterion("Fault1 not in", values, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1Between(String value1, String value2) {
            addCriterion("Fault1 between", value1, value2, "fault1");
            return (Criteria) this;
        }

        public Criteria andFault1NotBetween(String value1, String value2) {
            addCriterion("Fault1 not between", value1, value2, "fault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1IsNull() {
            addCriterion("StopFault1 is null");
            return (Criteria) this;
        }

        public Criteria andStopFault1IsNotNull() {
            addCriterion("StopFault1 is not null");
            return (Criteria) this;
        }

        public Criteria andStopFault1EqualTo(String value) {
            addCriterion("StopFault1 =", value, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1NotEqualTo(String value) {
            addCriterion("StopFault1 <>", value, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1GreaterThan(String value) {
            addCriterion("StopFault1 >", value, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1GreaterThanOrEqualTo(String value) {
            addCriterion("StopFault1 >=", value, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1LessThan(String value) {
            addCriterion("StopFault1 <", value, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1LessThanOrEqualTo(String value) {
            addCriterion("StopFault1 <=", value, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1Like(String value) {
            addCriterion("StopFault1 like", value, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1NotLike(String value) {
            addCriterion("StopFault1 not like", value, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1In(List<String> values) {
            addCriterion("StopFault1 in", values, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1NotIn(List<String> values) {
            addCriterion("StopFault1 not in", values, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1Between(String value1, String value2) {
            addCriterion("StopFault1 between", value1, value2, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andStopFault1NotBetween(String value1, String value2) {
            addCriterion("StopFault1 not between", value1, value2, "stopFault1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1IsNull() {
            addCriterion("OverTorque1 is null");
            return (Criteria) this;
        }

        public Criteria andOverTorque1IsNotNull() {
            addCriterion("OverTorque1 is not null");
            return (Criteria) this;
        }

        public Criteria andOverTorque1EqualTo(String value) {
            addCriterion("OverTorque1 =", value, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1NotEqualTo(String value) {
            addCriterion("OverTorque1 <>", value, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1GreaterThan(String value) {
            addCriterion("OverTorque1 >", value, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1GreaterThanOrEqualTo(String value) {
            addCriterion("OverTorque1 >=", value, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1LessThan(String value) {
            addCriterion("OverTorque1 <", value, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1LessThanOrEqualTo(String value) {
            addCriterion("OverTorque1 <=", value, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1Like(String value) {
            addCriterion("OverTorque1 like", value, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1NotLike(String value) {
            addCriterion("OverTorque1 not like", value, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1In(List<String> values) {
            addCriterion("OverTorque1 in", values, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1NotIn(List<String> values) {
            addCriterion("OverTorque1 not in", values, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1Between(String value1, String value2) {
            addCriterion("OverTorque1 between", value1, value2, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andOverTorque1NotBetween(String value1, String value2) {
            addCriterion("OverTorque1 not between", value1, value2, "overTorque1");
            return (Criteria) this;
        }

        public Criteria andPosition1IsNull() {
            addCriterion("Position1 is null");
            return (Criteria) this;
        }

        public Criteria andPosition1IsNotNull() {
            addCriterion("Position1 is not null");
            return (Criteria) this;
        }

        public Criteria andPosition1EqualTo(BigDecimal value) {
            addCriterion("Position1 =", value, "position1");
            return (Criteria) this;
        }

        public Criteria andPosition1NotEqualTo(BigDecimal value) {
            addCriterion("Position1 <>", value, "position1");
            return (Criteria) this;
        }

        public Criteria andPosition1GreaterThan(BigDecimal value) {
            addCriterion("Position1 >", value, "position1");
            return (Criteria) this;
        }

        public Criteria andPosition1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Position1 >=", value, "position1");
            return (Criteria) this;
        }

        public Criteria andPosition1LessThan(BigDecimal value) {
            addCriterion("Position1 <", value, "position1");
            return (Criteria) this;
        }

        public Criteria andPosition1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Position1 <=", value, "position1");
            return (Criteria) this;
        }

        public Criteria andPosition1In(List<BigDecimal> values) {
            addCriterion("Position1 in", values, "position1");
            return (Criteria) this;
        }

        public Criteria andPosition1NotIn(List<BigDecimal> values) {
            addCriterion("Position1 not in", values, "position1");
            return (Criteria) this;
        }

        public Criteria andPosition1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position1 between", value1, value2, "position1");
            return (Criteria) this;
        }

        public Criteria andPosition1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position1 not between", value1, value2, "position1");
            return (Criteria) this;
        }

        public Criteria andTorque1IsNull() {
            addCriterion("Torque1 is null");
            return (Criteria) this;
        }

        public Criteria andTorque1IsNotNull() {
            addCriterion("Torque1 is not null");
            return (Criteria) this;
        }

        public Criteria andTorque1EqualTo(BigDecimal value) {
            addCriterion("Torque1 =", value, "torque1");
            return (Criteria) this;
        }

        public Criteria andTorque1NotEqualTo(BigDecimal value) {
            addCriterion("Torque1 <>", value, "torque1");
            return (Criteria) this;
        }

        public Criteria andTorque1GreaterThan(BigDecimal value) {
            addCriterion("Torque1 >", value, "torque1");
            return (Criteria) this;
        }

        public Criteria andTorque1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque1 >=", value, "torque1");
            return (Criteria) this;
        }

        public Criteria andTorque1LessThan(BigDecimal value) {
            addCriterion("Torque1 <", value, "torque1");
            return (Criteria) this;
        }

        public Criteria andTorque1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque1 <=", value, "torque1");
            return (Criteria) this;
        }

        public Criteria andTorque1In(List<BigDecimal> values) {
            addCriterion("Torque1 in", values, "torque1");
            return (Criteria) this;
        }

        public Criteria andTorque1NotIn(List<BigDecimal> values) {
            addCriterion("Torque1 not in", values, "torque1");
            return (Criteria) this;
        }

        public Criteria andTorque1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque1 between", value1, value2, "torque1");
            return (Criteria) this;
        }

        public Criteria andTorque1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque1 not between", value1, value2, "torque1");
            return (Criteria) this;
        }

        public Criteria andSpeed1IsNull() {
            addCriterion("Speed1 is null");
            return (Criteria) this;
        }

        public Criteria andSpeed1IsNotNull() {
            addCriterion("Speed1 is not null");
            return (Criteria) this;
        }

        public Criteria andSpeed1EqualTo(BigDecimal value) {
            addCriterion("Speed1 =", value, "speed1");
            return (Criteria) this;
        }

        public Criteria andSpeed1NotEqualTo(BigDecimal value) {
            addCriterion("Speed1 <>", value, "speed1");
            return (Criteria) this;
        }

        public Criteria andSpeed1GreaterThan(BigDecimal value) {
            addCriterion("Speed1 >", value, "speed1");
            return (Criteria) this;
        }

        public Criteria andSpeed1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed1 >=", value, "speed1");
            return (Criteria) this;
        }

        public Criteria andSpeed1LessThan(BigDecimal value) {
            addCriterion("Speed1 <", value, "speed1");
            return (Criteria) this;
        }

        public Criteria andSpeed1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed1 <=", value, "speed1");
            return (Criteria) this;
        }

        public Criteria andSpeed1In(List<BigDecimal> values) {
            addCriterion("Speed1 in", values, "speed1");
            return (Criteria) this;
        }

        public Criteria andSpeed1NotIn(List<BigDecimal> values) {
            addCriterion("Speed1 not in", values, "speed1");
            return (Criteria) this;
        }

        public Criteria andSpeed1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed1 between", value1, value2, "speed1");
            return (Criteria) this;
        }

        public Criteria andSpeed1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed1 not between", value1, value2, "speed1");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2IsNull() {
            addCriterion("PositioningCompleted2 is null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2IsNotNull() {
            addCriterion("PositioningCompleted2 is not null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2EqualTo(String value) {
            addCriterion("PositioningCompleted2 =", value, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2NotEqualTo(String value) {
            addCriterion("PositioningCompleted2 <>", value, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2GreaterThan(String value) {
            addCriterion("PositioningCompleted2 >", value, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2GreaterThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted2 >=", value, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2LessThan(String value) {
            addCriterion("PositioningCompleted2 <", value, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2LessThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted2 <=", value, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2Like(String value) {
            addCriterion("PositioningCompleted2 like", value, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2NotLike(String value) {
            addCriterion("PositioningCompleted2 not like", value, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2In(List<String> values) {
            addCriterion("PositioningCompleted2 in", values, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2NotIn(List<String> values) {
            addCriterion("PositioningCompleted2 not in", values, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2Between(String value1, String value2) {
            addCriterion("PositioningCompleted2 between", value1, value2, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted2NotBetween(String value1, String value2) {
            addCriterion("PositioningCompleted2 not between", value1, value2, "positioningCompleted2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2IsNull() {
            addCriterion("DriverFault2 is null");
            return (Criteria) this;
        }

        public Criteria andDriverFault2IsNotNull() {
            addCriterion("DriverFault2 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverFault2EqualTo(String value) {
            addCriterion("DriverFault2 =", value, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2NotEqualTo(String value) {
            addCriterion("DriverFault2 <>", value, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2GreaterThan(String value) {
            addCriterion("DriverFault2 >", value, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2GreaterThanOrEqualTo(String value) {
            addCriterion("DriverFault2 >=", value, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2LessThan(String value) {
            addCriterion("DriverFault2 <", value, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2LessThanOrEqualTo(String value) {
            addCriterion("DriverFault2 <=", value, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2Like(String value) {
            addCriterion("DriverFault2 like", value, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2NotLike(String value) {
            addCriterion("DriverFault2 not like", value, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2In(List<String> values) {
            addCriterion("DriverFault2 in", values, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2NotIn(List<String> values) {
            addCriterion("DriverFault2 not in", values, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2Between(String value1, String value2) {
            addCriterion("DriverFault2 between", value1, value2, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverFault2NotBetween(String value1, String value2) {
            addCriterion("DriverFault2 not between", value1, value2, "driverFault2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2IsNull() {
            addCriterion("DriverEnable2 is null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2IsNotNull() {
            addCriterion("DriverEnable2 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2EqualTo(String value) {
            addCriterion("DriverEnable2 =", value, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2NotEqualTo(String value) {
            addCriterion("DriverEnable2 <>", value, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2GreaterThan(String value) {
            addCriterion("DriverEnable2 >", value, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2GreaterThanOrEqualTo(String value) {
            addCriterion("DriverEnable2 >=", value, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2LessThan(String value) {
            addCriterion("DriverEnable2 <", value, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2LessThanOrEqualTo(String value) {
            addCriterion("DriverEnable2 <=", value, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2Like(String value) {
            addCriterion("DriverEnable2 like", value, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2NotLike(String value) {
            addCriterion("DriverEnable2 not like", value, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2In(List<String> values) {
            addCriterion("DriverEnable2 in", values, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2NotIn(List<String> values) {
            addCriterion("DriverEnable2 not in", values, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2Between(String value1, String value2) {
            addCriterion("DriverEnable2 between", value1, value2, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andDriverEnable2NotBetween(String value1, String value2) {
            addCriterion("DriverEnable2 not between", value1, value2, "driverEnable2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2IsNull() {
            addCriterion("ReachLimit2 is null");
            return (Criteria) this;
        }

        public Criteria andReachLimit2IsNotNull() {
            addCriterion("ReachLimit2 is not null");
            return (Criteria) this;
        }

        public Criteria andReachLimit2EqualTo(String value) {
            addCriterion("ReachLimit2 =", value, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2NotEqualTo(String value) {
            addCriterion("ReachLimit2 <>", value, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2GreaterThan(String value) {
            addCriterion("ReachLimit2 >", value, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2GreaterThanOrEqualTo(String value) {
            addCriterion("ReachLimit2 >=", value, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2LessThan(String value) {
            addCriterion("ReachLimit2 <", value, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2LessThanOrEqualTo(String value) {
            addCriterion("ReachLimit2 <=", value, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2Like(String value) {
            addCriterion("ReachLimit2 like", value, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2NotLike(String value) {
            addCriterion("ReachLimit2 not like", value, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2In(List<String> values) {
            addCriterion("ReachLimit2 in", values, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2NotIn(List<String> values) {
            addCriterion("ReachLimit2 not in", values, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2Between(String value1, String value2) {
            addCriterion("ReachLimit2 between", value1, value2, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andReachLimit2NotBetween(String value1, String value2) {
            addCriterion("ReachLimit2 not between", value1, value2, "reachLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2IsNull() {
            addCriterion("RetractLimit2 is null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2IsNotNull() {
            addCriterion("RetractLimit2 is not null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2EqualTo(String value) {
            addCriterion("RetractLimit2 =", value, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2NotEqualTo(String value) {
            addCriterion("RetractLimit2 <>", value, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2GreaterThan(String value) {
            addCriterion("RetractLimit2 >", value, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2GreaterThanOrEqualTo(String value) {
            addCriterion("RetractLimit2 >=", value, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2LessThan(String value) {
            addCriterion("RetractLimit2 <", value, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2LessThanOrEqualTo(String value) {
            addCriterion("RetractLimit2 <=", value, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2Like(String value) {
            addCriterion("RetractLimit2 like", value, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2NotLike(String value) {
            addCriterion("RetractLimit2 not like", value, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2In(List<String> values) {
            addCriterion("RetractLimit2 in", values, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2NotIn(List<String> values) {
            addCriterion("RetractLimit2 not in", values, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2Between(String value1, String value2) {
            addCriterion("RetractLimit2 between", value1, value2, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andRetractLimit2NotBetween(String value1, String value2) {
            addCriterion("RetractLimit2 not between", value1, value2, "retractLimit2");
            return (Criteria) this;
        }

        public Criteria andFault2IsNull() {
            addCriterion("Fault2 is null");
            return (Criteria) this;
        }

        public Criteria andFault2IsNotNull() {
            addCriterion("Fault2 is not null");
            return (Criteria) this;
        }

        public Criteria andFault2EqualTo(String value) {
            addCriterion("Fault2 =", value, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2NotEqualTo(String value) {
            addCriterion("Fault2 <>", value, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2GreaterThan(String value) {
            addCriterion("Fault2 >", value, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2GreaterThanOrEqualTo(String value) {
            addCriterion("Fault2 >=", value, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2LessThan(String value) {
            addCriterion("Fault2 <", value, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2LessThanOrEqualTo(String value) {
            addCriterion("Fault2 <=", value, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2Like(String value) {
            addCriterion("Fault2 like", value, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2NotLike(String value) {
            addCriterion("Fault2 not like", value, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2In(List<String> values) {
            addCriterion("Fault2 in", values, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2NotIn(List<String> values) {
            addCriterion("Fault2 not in", values, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2Between(String value1, String value2) {
            addCriterion("Fault2 between", value1, value2, "fault2");
            return (Criteria) this;
        }

        public Criteria andFault2NotBetween(String value1, String value2) {
            addCriterion("Fault2 not between", value1, value2, "fault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2IsNull() {
            addCriterion("StopFault2 is null");
            return (Criteria) this;
        }

        public Criteria andStopFault2IsNotNull() {
            addCriterion("StopFault2 is not null");
            return (Criteria) this;
        }

        public Criteria andStopFault2EqualTo(String value) {
            addCriterion("StopFault2 =", value, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2NotEqualTo(String value) {
            addCriterion("StopFault2 <>", value, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2GreaterThan(String value) {
            addCriterion("StopFault2 >", value, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2GreaterThanOrEqualTo(String value) {
            addCriterion("StopFault2 >=", value, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2LessThan(String value) {
            addCriterion("StopFault2 <", value, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2LessThanOrEqualTo(String value) {
            addCriterion("StopFault2 <=", value, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2Like(String value) {
            addCriterion("StopFault2 like", value, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2NotLike(String value) {
            addCriterion("StopFault2 not like", value, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2In(List<String> values) {
            addCriterion("StopFault2 in", values, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2NotIn(List<String> values) {
            addCriterion("StopFault2 not in", values, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2Between(String value1, String value2) {
            addCriterion("StopFault2 between", value1, value2, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andStopFault2NotBetween(String value1, String value2) {
            addCriterion("StopFault2 not between", value1, value2, "stopFault2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2IsNull() {
            addCriterion("OverTorque2 is null");
            return (Criteria) this;
        }

        public Criteria andOverTorque2IsNotNull() {
            addCriterion("OverTorque2 is not null");
            return (Criteria) this;
        }

        public Criteria andOverTorque2EqualTo(String value) {
            addCriterion("OverTorque2 =", value, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2NotEqualTo(String value) {
            addCriterion("OverTorque2 <>", value, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2GreaterThan(String value) {
            addCriterion("OverTorque2 >", value, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2GreaterThanOrEqualTo(String value) {
            addCriterion("OverTorque2 >=", value, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2LessThan(String value) {
            addCriterion("OverTorque2 <", value, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2LessThanOrEqualTo(String value) {
            addCriterion("OverTorque2 <=", value, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2Like(String value) {
            addCriterion("OverTorque2 like", value, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2NotLike(String value) {
            addCriterion("OverTorque2 not like", value, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2In(List<String> values) {
            addCriterion("OverTorque2 in", values, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2NotIn(List<String> values) {
            addCriterion("OverTorque2 not in", values, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2Between(String value1, String value2) {
            addCriterion("OverTorque2 between", value1, value2, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andOverTorque2NotBetween(String value1, String value2) {
            addCriterion("OverTorque2 not between", value1, value2, "overTorque2");
            return (Criteria) this;
        }

        public Criteria andPosition2IsNull() {
            addCriterion("Position2 is null");
            return (Criteria) this;
        }

        public Criteria andPosition2IsNotNull() {
            addCriterion("Position2 is not null");
            return (Criteria) this;
        }

        public Criteria andPosition2EqualTo(BigDecimal value) {
            addCriterion("Position2 =", value, "position2");
            return (Criteria) this;
        }

        public Criteria andPosition2NotEqualTo(BigDecimal value) {
            addCriterion("Position2 <>", value, "position2");
            return (Criteria) this;
        }

        public Criteria andPosition2GreaterThan(BigDecimal value) {
            addCriterion("Position2 >", value, "position2");
            return (Criteria) this;
        }

        public Criteria andPosition2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Position2 >=", value, "position2");
            return (Criteria) this;
        }

        public Criteria andPosition2LessThan(BigDecimal value) {
            addCriterion("Position2 <", value, "position2");
            return (Criteria) this;
        }

        public Criteria andPosition2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Position2 <=", value, "position2");
            return (Criteria) this;
        }

        public Criteria andPosition2In(List<BigDecimal> values) {
            addCriterion("Position2 in", values, "position2");
            return (Criteria) this;
        }

        public Criteria andPosition2NotIn(List<BigDecimal> values) {
            addCriterion("Position2 not in", values, "position2");
            return (Criteria) this;
        }

        public Criteria andPosition2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position2 between", value1, value2, "position2");
            return (Criteria) this;
        }

        public Criteria andPosition2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position2 not between", value1, value2, "position2");
            return (Criteria) this;
        }

        public Criteria andTorque2IsNull() {
            addCriterion("Torque2 is null");
            return (Criteria) this;
        }

        public Criteria andTorque2IsNotNull() {
            addCriterion("Torque2 is not null");
            return (Criteria) this;
        }

        public Criteria andTorque2EqualTo(BigDecimal value) {
            addCriterion("Torque2 =", value, "torque2");
            return (Criteria) this;
        }

        public Criteria andTorque2NotEqualTo(BigDecimal value) {
            addCriterion("Torque2 <>", value, "torque2");
            return (Criteria) this;
        }

        public Criteria andTorque2GreaterThan(BigDecimal value) {
            addCriterion("Torque2 >", value, "torque2");
            return (Criteria) this;
        }

        public Criteria andTorque2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque2 >=", value, "torque2");
            return (Criteria) this;
        }

        public Criteria andTorque2LessThan(BigDecimal value) {
            addCriterion("Torque2 <", value, "torque2");
            return (Criteria) this;
        }

        public Criteria andTorque2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque2 <=", value, "torque2");
            return (Criteria) this;
        }

        public Criteria andTorque2In(List<BigDecimal> values) {
            addCriterion("Torque2 in", values, "torque2");
            return (Criteria) this;
        }

        public Criteria andTorque2NotIn(List<BigDecimal> values) {
            addCriterion("Torque2 not in", values, "torque2");
            return (Criteria) this;
        }

        public Criteria andTorque2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque2 between", value1, value2, "torque2");
            return (Criteria) this;
        }

        public Criteria andTorque2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque2 not between", value1, value2, "torque2");
            return (Criteria) this;
        }

        public Criteria andSpeed2IsNull() {
            addCriterion("Speed2 is null");
            return (Criteria) this;
        }

        public Criteria andSpeed2IsNotNull() {
            addCriterion("Speed2 is not null");
            return (Criteria) this;
        }

        public Criteria andSpeed2EqualTo(BigDecimal value) {
            addCriterion("Speed2 =", value, "speed2");
            return (Criteria) this;
        }

        public Criteria andSpeed2NotEqualTo(BigDecimal value) {
            addCriterion("Speed2 <>", value, "speed2");
            return (Criteria) this;
        }

        public Criteria andSpeed2GreaterThan(BigDecimal value) {
            addCriterion("Speed2 >", value, "speed2");
            return (Criteria) this;
        }

        public Criteria andSpeed2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed2 >=", value, "speed2");
            return (Criteria) this;
        }

        public Criteria andSpeed2LessThan(BigDecimal value) {
            addCriterion("Speed2 <", value, "speed2");
            return (Criteria) this;
        }

        public Criteria andSpeed2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed2 <=", value, "speed2");
            return (Criteria) this;
        }

        public Criteria andSpeed2In(List<BigDecimal> values) {
            addCriterion("Speed2 in", values, "speed2");
            return (Criteria) this;
        }

        public Criteria andSpeed2NotIn(List<BigDecimal> values) {
            addCriterion("Speed2 not in", values, "speed2");
            return (Criteria) this;
        }

        public Criteria andSpeed2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed2 between", value1, value2, "speed2");
            return (Criteria) this;
        }

        public Criteria andSpeed2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed2 not between", value1, value2, "speed2");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3IsNull() {
            addCriterion("PositioningCompleted3 is null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3IsNotNull() {
            addCriterion("PositioningCompleted3 is not null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3EqualTo(String value) {
            addCriterion("PositioningCompleted3 =", value, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3NotEqualTo(String value) {
            addCriterion("PositioningCompleted3 <>", value, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3GreaterThan(String value) {
            addCriterion("PositioningCompleted3 >", value, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3GreaterThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted3 >=", value, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3LessThan(String value) {
            addCriterion("PositioningCompleted3 <", value, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3LessThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted3 <=", value, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3Like(String value) {
            addCriterion("PositioningCompleted3 like", value, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3NotLike(String value) {
            addCriterion("PositioningCompleted3 not like", value, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3In(List<String> values) {
            addCriterion("PositioningCompleted3 in", values, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3NotIn(List<String> values) {
            addCriterion("PositioningCompleted3 not in", values, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3Between(String value1, String value2) {
            addCriterion("PositioningCompleted3 between", value1, value2, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted3NotBetween(String value1, String value2) {
            addCriterion("PositioningCompleted3 not between", value1, value2, "positioningCompleted3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3IsNull() {
            addCriterion("DriverFault3 is null");
            return (Criteria) this;
        }

        public Criteria andDriverFault3IsNotNull() {
            addCriterion("DriverFault3 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverFault3EqualTo(String value) {
            addCriterion("DriverFault3 =", value, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3NotEqualTo(String value) {
            addCriterion("DriverFault3 <>", value, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3GreaterThan(String value) {
            addCriterion("DriverFault3 >", value, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3GreaterThanOrEqualTo(String value) {
            addCriterion("DriverFault3 >=", value, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3LessThan(String value) {
            addCriterion("DriverFault3 <", value, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3LessThanOrEqualTo(String value) {
            addCriterion("DriverFault3 <=", value, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3Like(String value) {
            addCriterion("DriverFault3 like", value, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3NotLike(String value) {
            addCriterion("DriverFault3 not like", value, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3In(List<String> values) {
            addCriterion("DriverFault3 in", values, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3NotIn(List<String> values) {
            addCriterion("DriverFault3 not in", values, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3Between(String value1, String value2) {
            addCriterion("DriverFault3 between", value1, value2, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverFault3NotBetween(String value1, String value2) {
            addCriterion("DriverFault3 not between", value1, value2, "driverFault3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3IsNull() {
            addCriterion("DriverEnable3 is null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3IsNotNull() {
            addCriterion("DriverEnable3 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3EqualTo(String value) {
            addCriterion("DriverEnable3 =", value, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3NotEqualTo(String value) {
            addCriterion("DriverEnable3 <>", value, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3GreaterThan(String value) {
            addCriterion("DriverEnable3 >", value, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3GreaterThanOrEqualTo(String value) {
            addCriterion("DriverEnable3 >=", value, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3LessThan(String value) {
            addCriterion("DriverEnable3 <", value, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3LessThanOrEqualTo(String value) {
            addCriterion("DriverEnable3 <=", value, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3Like(String value) {
            addCriterion("DriverEnable3 like", value, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3NotLike(String value) {
            addCriterion("DriverEnable3 not like", value, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3In(List<String> values) {
            addCriterion("DriverEnable3 in", values, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3NotIn(List<String> values) {
            addCriterion("DriverEnable3 not in", values, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3Between(String value1, String value2) {
            addCriterion("DriverEnable3 between", value1, value2, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andDriverEnable3NotBetween(String value1, String value2) {
            addCriterion("DriverEnable3 not between", value1, value2, "driverEnable3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3IsNull() {
            addCriterion("ReachLimit3 is null");
            return (Criteria) this;
        }

        public Criteria andReachLimit3IsNotNull() {
            addCriterion("ReachLimit3 is not null");
            return (Criteria) this;
        }

        public Criteria andReachLimit3EqualTo(String value) {
            addCriterion("ReachLimit3 =", value, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3NotEqualTo(String value) {
            addCriterion("ReachLimit3 <>", value, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3GreaterThan(String value) {
            addCriterion("ReachLimit3 >", value, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3GreaterThanOrEqualTo(String value) {
            addCriterion("ReachLimit3 >=", value, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3LessThan(String value) {
            addCriterion("ReachLimit3 <", value, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3LessThanOrEqualTo(String value) {
            addCriterion("ReachLimit3 <=", value, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3Like(String value) {
            addCriterion("ReachLimit3 like", value, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3NotLike(String value) {
            addCriterion("ReachLimit3 not like", value, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3In(List<String> values) {
            addCriterion("ReachLimit3 in", values, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3NotIn(List<String> values) {
            addCriterion("ReachLimit3 not in", values, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3Between(String value1, String value2) {
            addCriterion("ReachLimit3 between", value1, value2, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andReachLimit3NotBetween(String value1, String value2) {
            addCriterion("ReachLimit3 not between", value1, value2, "reachLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3IsNull() {
            addCriterion("RetractLimit3 is null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3IsNotNull() {
            addCriterion("RetractLimit3 is not null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3EqualTo(String value) {
            addCriterion("RetractLimit3 =", value, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3NotEqualTo(String value) {
            addCriterion("RetractLimit3 <>", value, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3GreaterThan(String value) {
            addCriterion("RetractLimit3 >", value, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3GreaterThanOrEqualTo(String value) {
            addCriterion("RetractLimit3 >=", value, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3LessThan(String value) {
            addCriterion("RetractLimit3 <", value, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3LessThanOrEqualTo(String value) {
            addCriterion("RetractLimit3 <=", value, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3Like(String value) {
            addCriterion("RetractLimit3 like", value, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3NotLike(String value) {
            addCriterion("RetractLimit3 not like", value, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3In(List<String> values) {
            addCriterion("RetractLimit3 in", values, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3NotIn(List<String> values) {
            addCriterion("RetractLimit3 not in", values, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3Between(String value1, String value2) {
            addCriterion("RetractLimit3 between", value1, value2, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andRetractLimit3NotBetween(String value1, String value2) {
            addCriterion("RetractLimit3 not between", value1, value2, "retractLimit3");
            return (Criteria) this;
        }

        public Criteria andFault3IsNull() {
            addCriterion("Fault3 is null");
            return (Criteria) this;
        }

        public Criteria andFault3IsNotNull() {
            addCriterion("Fault3 is not null");
            return (Criteria) this;
        }

        public Criteria andFault3EqualTo(String value) {
            addCriterion("Fault3 =", value, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3NotEqualTo(String value) {
            addCriterion("Fault3 <>", value, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3GreaterThan(String value) {
            addCriterion("Fault3 >", value, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3GreaterThanOrEqualTo(String value) {
            addCriterion("Fault3 >=", value, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3LessThan(String value) {
            addCriterion("Fault3 <", value, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3LessThanOrEqualTo(String value) {
            addCriterion("Fault3 <=", value, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3Like(String value) {
            addCriterion("Fault3 like", value, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3NotLike(String value) {
            addCriterion("Fault3 not like", value, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3In(List<String> values) {
            addCriterion("Fault3 in", values, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3NotIn(List<String> values) {
            addCriterion("Fault3 not in", values, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3Between(String value1, String value2) {
            addCriterion("Fault3 between", value1, value2, "fault3");
            return (Criteria) this;
        }

        public Criteria andFault3NotBetween(String value1, String value2) {
            addCriterion("Fault3 not between", value1, value2, "fault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3IsNull() {
            addCriterion("StopFault3 is null");
            return (Criteria) this;
        }

        public Criteria andStopFault3IsNotNull() {
            addCriterion("StopFault3 is not null");
            return (Criteria) this;
        }

        public Criteria andStopFault3EqualTo(String value) {
            addCriterion("StopFault3 =", value, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3NotEqualTo(String value) {
            addCriterion("StopFault3 <>", value, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3GreaterThan(String value) {
            addCriterion("StopFault3 >", value, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3GreaterThanOrEqualTo(String value) {
            addCriterion("StopFault3 >=", value, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3LessThan(String value) {
            addCriterion("StopFault3 <", value, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3LessThanOrEqualTo(String value) {
            addCriterion("StopFault3 <=", value, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3Like(String value) {
            addCriterion("StopFault3 like", value, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3NotLike(String value) {
            addCriterion("StopFault3 not like", value, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3In(List<String> values) {
            addCriterion("StopFault3 in", values, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3NotIn(List<String> values) {
            addCriterion("StopFault3 not in", values, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3Between(String value1, String value2) {
            addCriterion("StopFault3 between", value1, value2, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andStopFault3NotBetween(String value1, String value2) {
            addCriterion("StopFault3 not between", value1, value2, "stopFault3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3IsNull() {
            addCriterion("OverTorque3 is null");
            return (Criteria) this;
        }

        public Criteria andOverTorque3IsNotNull() {
            addCriterion("OverTorque3 is not null");
            return (Criteria) this;
        }

        public Criteria andOverTorque3EqualTo(String value) {
            addCriterion("OverTorque3 =", value, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3NotEqualTo(String value) {
            addCriterion("OverTorque3 <>", value, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3GreaterThan(String value) {
            addCriterion("OverTorque3 >", value, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3GreaterThanOrEqualTo(String value) {
            addCriterion("OverTorque3 >=", value, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3LessThan(String value) {
            addCriterion("OverTorque3 <", value, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3LessThanOrEqualTo(String value) {
            addCriterion("OverTorque3 <=", value, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3Like(String value) {
            addCriterion("OverTorque3 like", value, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3NotLike(String value) {
            addCriterion("OverTorque3 not like", value, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3In(List<String> values) {
            addCriterion("OverTorque3 in", values, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3NotIn(List<String> values) {
            addCriterion("OverTorque3 not in", values, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3Between(String value1, String value2) {
            addCriterion("OverTorque3 between", value1, value2, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andOverTorque3NotBetween(String value1, String value2) {
            addCriterion("OverTorque3 not between", value1, value2, "overTorque3");
            return (Criteria) this;
        }

        public Criteria andPosition3IsNull() {
            addCriterion("Position3 is null");
            return (Criteria) this;
        }

        public Criteria andPosition3IsNotNull() {
            addCriterion("Position3 is not null");
            return (Criteria) this;
        }

        public Criteria andPosition3EqualTo(BigDecimal value) {
            addCriterion("Position3 =", value, "position3");
            return (Criteria) this;
        }

        public Criteria andPosition3NotEqualTo(BigDecimal value) {
            addCriterion("Position3 <>", value, "position3");
            return (Criteria) this;
        }

        public Criteria andPosition3GreaterThan(BigDecimal value) {
            addCriterion("Position3 >", value, "position3");
            return (Criteria) this;
        }

        public Criteria andPosition3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Position3 >=", value, "position3");
            return (Criteria) this;
        }

        public Criteria andPosition3LessThan(BigDecimal value) {
            addCriterion("Position3 <", value, "position3");
            return (Criteria) this;
        }

        public Criteria andPosition3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Position3 <=", value, "position3");
            return (Criteria) this;
        }

        public Criteria andPosition3In(List<BigDecimal> values) {
            addCriterion("Position3 in", values, "position3");
            return (Criteria) this;
        }

        public Criteria andPosition3NotIn(List<BigDecimal> values) {
            addCriterion("Position3 not in", values, "position3");
            return (Criteria) this;
        }

        public Criteria andPosition3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position3 between", value1, value2, "position3");
            return (Criteria) this;
        }

        public Criteria andPosition3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position3 not between", value1, value2, "position3");
            return (Criteria) this;
        }

        public Criteria andTorque3IsNull() {
            addCriterion("Torque3 is null");
            return (Criteria) this;
        }

        public Criteria andTorque3IsNotNull() {
            addCriterion("Torque3 is not null");
            return (Criteria) this;
        }

        public Criteria andTorque3EqualTo(BigDecimal value) {
            addCriterion("Torque3 =", value, "torque3");
            return (Criteria) this;
        }

        public Criteria andTorque3NotEqualTo(BigDecimal value) {
            addCriterion("Torque3 <>", value, "torque3");
            return (Criteria) this;
        }

        public Criteria andTorque3GreaterThan(BigDecimal value) {
            addCriterion("Torque3 >", value, "torque3");
            return (Criteria) this;
        }

        public Criteria andTorque3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque3 >=", value, "torque3");
            return (Criteria) this;
        }

        public Criteria andTorque3LessThan(BigDecimal value) {
            addCriterion("Torque3 <", value, "torque3");
            return (Criteria) this;
        }

        public Criteria andTorque3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque3 <=", value, "torque3");
            return (Criteria) this;
        }

        public Criteria andTorque3In(List<BigDecimal> values) {
            addCriterion("Torque3 in", values, "torque3");
            return (Criteria) this;
        }

        public Criteria andTorque3NotIn(List<BigDecimal> values) {
            addCriterion("Torque3 not in", values, "torque3");
            return (Criteria) this;
        }

        public Criteria andTorque3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque3 between", value1, value2, "torque3");
            return (Criteria) this;
        }

        public Criteria andTorque3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque3 not between", value1, value2, "torque3");
            return (Criteria) this;
        }

        public Criteria andSpeed3IsNull() {
            addCriterion("Speed3 is null");
            return (Criteria) this;
        }

        public Criteria andSpeed3IsNotNull() {
            addCriterion("Speed3 is not null");
            return (Criteria) this;
        }

        public Criteria andSpeed3EqualTo(BigDecimal value) {
            addCriterion("Speed3 =", value, "speed3");
            return (Criteria) this;
        }

        public Criteria andSpeed3NotEqualTo(BigDecimal value) {
            addCriterion("Speed3 <>", value, "speed3");
            return (Criteria) this;
        }

        public Criteria andSpeed3GreaterThan(BigDecimal value) {
            addCriterion("Speed3 >", value, "speed3");
            return (Criteria) this;
        }

        public Criteria andSpeed3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed3 >=", value, "speed3");
            return (Criteria) this;
        }

        public Criteria andSpeed3LessThan(BigDecimal value) {
            addCriterion("Speed3 <", value, "speed3");
            return (Criteria) this;
        }

        public Criteria andSpeed3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed3 <=", value, "speed3");
            return (Criteria) this;
        }

        public Criteria andSpeed3In(List<BigDecimal> values) {
            addCriterion("Speed3 in", values, "speed3");
            return (Criteria) this;
        }

        public Criteria andSpeed3NotIn(List<BigDecimal> values) {
            addCriterion("Speed3 not in", values, "speed3");
            return (Criteria) this;
        }

        public Criteria andSpeed3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed3 between", value1, value2, "speed3");
            return (Criteria) this;
        }

        public Criteria andSpeed3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed3 not between", value1, value2, "speed3");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4IsNull() {
            addCriterion("PositioningCompleted4 is null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4IsNotNull() {
            addCriterion("PositioningCompleted4 is not null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4EqualTo(String value) {
            addCriterion("PositioningCompleted4 =", value, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4NotEqualTo(String value) {
            addCriterion("PositioningCompleted4 <>", value, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4GreaterThan(String value) {
            addCriterion("PositioningCompleted4 >", value, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4GreaterThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted4 >=", value, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4LessThan(String value) {
            addCriterion("PositioningCompleted4 <", value, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4LessThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted4 <=", value, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4Like(String value) {
            addCriterion("PositioningCompleted4 like", value, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4NotLike(String value) {
            addCriterion("PositioningCompleted4 not like", value, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4In(List<String> values) {
            addCriterion("PositioningCompleted4 in", values, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4NotIn(List<String> values) {
            addCriterion("PositioningCompleted4 not in", values, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4Between(String value1, String value2) {
            addCriterion("PositioningCompleted4 between", value1, value2, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted4NotBetween(String value1, String value2) {
            addCriterion("PositioningCompleted4 not between", value1, value2, "positioningCompleted4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4IsNull() {
            addCriterion("DriverFault4 is null");
            return (Criteria) this;
        }

        public Criteria andDriverFault4IsNotNull() {
            addCriterion("DriverFault4 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverFault4EqualTo(String value) {
            addCriterion("DriverFault4 =", value, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4NotEqualTo(String value) {
            addCriterion("DriverFault4 <>", value, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4GreaterThan(String value) {
            addCriterion("DriverFault4 >", value, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4GreaterThanOrEqualTo(String value) {
            addCriterion("DriverFault4 >=", value, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4LessThan(String value) {
            addCriterion("DriverFault4 <", value, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4LessThanOrEqualTo(String value) {
            addCriterion("DriverFault4 <=", value, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4Like(String value) {
            addCriterion("DriverFault4 like", value, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4NotLike(String value) {
            addCriterion("DriverFault4 not like", value, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4In(List<String> values) {
            addCriterion("DriverFault4 in", values, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4NotIn(List<String> values) {
            addCriterion("DriverFault4 not in", values, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4Between(String value1, String value2) {
            addCriterion("DriverFault4 between", value1, value2, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverFault4NotBetween(String value1, String value2) {
            addCriterion("DriverFault4 not between", value1, value2, "driverFault4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4IsNull() {
            addCriterion("DriverEnable4 is null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4IsNotNull() {
            addCriterion("DriverEnable4 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4EqualTo(String value) {
            addCriterion("DriverEnable4 =", value, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4NotEqualTo(String value) {
            addCriterion("DriverEnable4 <>", value, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4GreaterThan(String value) {
            addCriterion("DriverEnable4 >", value, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4GreaterThanOrEqualTo(String value) {
            addCriterion("DriverEnable4 >=", value, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4LessThan(String value) {
            addCriterion("DriverEnable4 <", value, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4LessThanOrEqualTo(String value) {
            addCriterion("DriverEnable4 <=", value, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4Like(String value) {
            addCriterion("DriverEnable4 like", value, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4NotLike(String value) {
            addCriterion("DriverEnable4 not like", value, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4In(List<String> values) {
            addCriterion("DriverEnable4 in", values, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4NotIn(List<String> values) {
            addCriterion("DriverEnable4 not in", values, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4Between(String value1, String value2) {
            addCriterion("DriverEnable4 between", value1, value2, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andDriverEnable4NotBetween(String value1, String value2) {
            addCriterion("DriverEnable4 not between", value1, value2, "driverEnable4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4IsNull() {
            addCriterion("ReachLimit4 is null");
            return (Criteria) this;
        }

        public Criteria andReachLimit4IsNotNull() {
            addCriterion("ReachLimit4 is not null");
            return (Criteria) this;
        }

        public Criteria andReachLimit4EqualTo(String value) {
            addCriterion("ReachLimit4 =", value, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4NotEqualTo(String value) {
            addCriterion("ReachLimit4 <>", value, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4GreaterThan(String value) {
            addCriterion("ReachLimit4 >", value, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4GreaterThanOrEqualTo(String value) {
            addCriterion("ReachLimit4 >=", value, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4LessThan(String value) {
            addCriterion("ReachLimit4 <", value, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4LessThanOrEqualTo(String value) {
            addCriterion("ReachLimit4 <=", value, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4Like(String value) {
            addCriterion("ReachLimit4 like", value, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4NotLike(String value) {
            addCriterion("ReachLimit4 not like", value, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4In(List<String> values) {
            addCriterion("ReachLimit4 in", values, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4NotIn(List<String> values) {
            addCriterion("ReachLimit4 not in", values, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4Between(String value1, String value2) {
            addCriterion("ReachLimit4 between", value1, value2, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andReachLimit4NotBetween(String value1, String value2) {
            addCriterion("ReachLimit4 not between", value1, value2, "reachLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4IsNull() {
            addCriterion("RetractLimit4 is null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4IsNotNull() {
            addCriterion("RetractLimit4 is not null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4EqualTo(String value) {
            addCriterion("RetractLimit4 =", value, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4NotEqualTo(String value) {
            addCriterion("RetractLimit4 <>", value, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4GreaterThan(String value) {
            addCriterion("RetractLimit4 >", value, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4GreaterThanOrEqualTo(String value) {
            addCriterion("RetractLimit4 >=", value, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4LessThan(String value) {
            addCriterion("RetractLimit4 <", value, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4LessThanOrEqualTo(String value) {
            addCriterion("RetractLimit4 <=", value, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4Like(String value) {
            addCriterion("RetractLimit4 like", value, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4NotLike(String value) {
            addCriterion("RetractLimit4 not like", value, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4In(List<String> values) {
            addCriterion("RetractLimit4 in", values, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4NotIn(List<String> values) {
            addCriterion("RetractLimit4 not in", values, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4Between(String value1, String value2) {
            addCriterion("RetractLimit4 between", value1, value2, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andRetractLimit4NotBetween(String value1, String value2) {
            addCriterion("RetractLimit4 not between", value1, value2, "retractLimit4");
            return (Criteria) this;
        }

        public Criteria andFault4IsNull() {
            addCriterion("Fault4 is null");
            return (Criteria) this;
        }

        public Criteria andFault4IsNotNull() {
            addCriterion("Fault4 is not null");
            return (Criteria) this;
        }

        public Criteria andFault4EqualTo(String value) {
            addCriterion("Fault4 =", value, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4NotEqualTo(String value) {
            addCriterion("Fault4 <>", value, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4GreaterThan(String value) {
            addCriterion("Fault4 >", value, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4GreaterThanOrEqualTo(String value) {
            addCriterion("Fault4 >=", value, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4LessThan(String value) {
            addCriterion("Fault4 <", value, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4LessThanOrEqualTo(String value) {
            addCriterion("Fault4 <=", value, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4Like(String value) {
            addCriterion("Fault4 like", value, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4NotLike(String value) {
            addCriterion("Fault4 not like", value, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4In(List<String> values) {
            addCriterion("Fault4 in", values, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4NotIn(List<String> values) {
            addCriterion("Fault4 not in", values, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4Between(String value1, String value2) {
            addCriterion("Fault4 between", value1, value2, "fault4");
            return (Criteria) this;
        }

        public Criteria andFault4NotBetween(String value1, String value2) {
            addCriterion("Fault4 not between", value1, value2, "fault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4IsNull() {
            addCriterion("StopFault4 is null");
            return (Criteria) this;
        }

        public Criteria andStopFault4IsNotNull() {
            addCriterion("StopFault4 is not null");
            return (Criteria) this;
        }

        public Criteria andStopFault4EqualTo(String value) {
            addCriterion("StopFault4 =", value, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4NotEqualTo(String value) {
            addCriterion("StopFault4 <>", value, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4GreaterThan(String value) {
            addCriterion("StopFault4 >", value, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4GreaterThanOrEqualTo(String value) {
            addCriterion("StopFault4 >=", value, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4LessThan(String value) {
            addCriterion("StopFault4 <", value, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4LessThanOrEqualTo(String value) {
            addCriterion("StopFault4 <=", value, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4Like(String value) {
            addCriterion("StopFault4 like", value, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4NotLike(String value) {
            addCriterion("StopFault4 not like", value, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4In(List<String> values) {
            addCriterion("StopFault4 in", values, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4NotIn(List<String> values) {
            addCriterion("StopFault4 not in", values, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4Between(String value1, String value2) {
            addCriterion("StopFault4 between", value1, value2, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andStopFault4NotBetween(String value1, String value2) {
            addCriterion("StopFault4 not between", value1, value2, "stopFault4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4IsNull() {
            addCriterion("OverTorque4 is null");
            return (Criteria) this;
        }

        public Criteria andOverTorque4IsNotNull() {
            addCriterion("OverTorque4 is not null");
            return (Criteria) this;
        }

        public Criteria andOverTorque4EqualTo(String value) {
            addCriterion("OverTorque4 =", value, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4NotEqualTo(String value) {
            addCriterion("OverTorque4 <>", value, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4GreaterThan(String value) {
            addCriterion("OverTorque4 >", value, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4GreaterThanOrEqualTo(String value) {
            addCriterion("OverTorque4 >=", value, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4LessThan(String value) {
            addCriterion("OverTorque4 <", value, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4LessThanOrEqualTo(String value) {
            addCriterion("OverTorque4 <=", value, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4Like(String value) {
            addCriterion("OverTorque4 like", value, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4NotLike(String value) {
            addCriterion("OverTorque4 not like", value, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4In(List<String> values) {
            addCriterion("OverTorque4 in", values, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4NotIn(List<String> values) {
            addCriterion("OverTorque4 not in", values, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4Between(String value1, String value2) {
            addCriterion("OverTorque4 between", value1, value2, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andOverTorque4NotBetween(String value1, String value2) {
            addCriterion("OverTorque4 not between", value1, value2, "overTorque4");
            return (Criteria) this;
        }

        public Criteria andPosition4IsNull() {
            addCriterion("Position4 is null");
            return (Criteria) this;
        }

        public Criteria andPosition4IsNotNull() {
            addCriterion("Position4 is not null");
            return (Criteria) this;
        }

        public Criteria andPosition4EqualTo(BigDecimal value) {
            addCriterion("Position4 =", value, "position4");
            return (Criteria) this;
        }

        public Criteria andPosition4NotEqualTo(BigDecimal value) {
            addCriterion("Position4 <>", value, "position4");
            return (Criteria) this;
        }

        public Criteria andPosition4GreaterThan(BigDecimal value) {
            addCriterion("Position4 >", value, "position4");
            return (Criteria) this;
        }

        public Criteria andPosition4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Position4 >=", value, "position4");
            return (Criteria) this;
        }

        public Criteria andPosition4LessThan(BigDecimal value) {
            addCriterion("Position4 <", value, "position4");
            return (Criteria) this;
        }

        public Criteria andPosition4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Position4 <=", value, "position4");
            return (Criteria) this;
        }

        public Criteria andPosition4In(List<BigDecimal> values) {
            addCriterion("Position4 in", values, "position4");
            return (Criteria) this;
        }

        public Criteria andPosition4NotIn(List<BigDecimal> values) {
            addCriterion("Position4 not in", values, "position4");
            return (Criteria) this;
        }

        public Criteria andPosition4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position4 between", value1, value2, "position4");
            return (Criteria) this;
        }

        public Criteria andPosition4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position4 not between", value1, value2, "position4");
            return (Criteria) this;
        }

        public Criteria andTorque4IsNull() {
            addCriterion("Torque4 is null");
            return (Criteria) this;
        }

        public Criteria andTorque4IsNotNull() {
            addCriterion("Torque4 is not null");
            return (Criteria) this;
        }

        public Criteria andTorque4EqualTo(BigDecimal value) {
            addCriterion("Torque4 =", value, "torque4");
            return (Criteria) this;
        }

        public Criteria andTorque4NotEqualTo(BigDecimal value) {
            addCriterion("Torque4 <>", value, "torque4");
            return (Criteria) this;
        }

        public Criteria andTorque4GreaterThan(BigDecimal value) {
            addCriterion("Torque4 >", value, "torque4");
            return (Criteria) this;
        }

        public Criteria andTorque4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque4 >=", value, "torque4");
            return (Criteria) this;
        }

        public Criteria andTorque4LessThan(BigDecimal value) {
            addCriterion("Torque4 <", value, "torque4");
            return (Criteria) this;
        }

        public Criteria andTorque4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque4 <=", value, "torque4");
            return (Criteria) this;
        }

        public Criteria andTorque4In(List<BigDecimal> values) {
            addCriterion("Torque4 in", values, "torque4");
            return (Criteria) this;
        }

        public Criteria andTorque4NotIn(List<BigDecimal> values) {
            addCriterion("Torque4 not in", values, "torque4");
            return (Criteria) this;
        }

        public Criteria andTorque4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque4 between", value1, value2, "torque4");
            return (Criteria) this;
        }

        public Criteria andTorque4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque4 not between", value1, value2, "torque4");
            return (Criteria) this;
        }

        public Criteria andSpeed4IsNull() {
            addCriterion("Speed4 is null");
            return (Criteria) this;
        }

        public Criteria andSpeed4IsNotNull() {
            addCriterion("Speed4 is not null");
            return (Criteria) this;
        }

        public Criteria andSpeed4EqualTo(BigDecimal value) {
            addCriterion("Speed4 =", value, "speed4");
            return (Criteria) this;
        }

        public Criteria andSpeed4NotEqualTo(BigDecimal value) {
            addCriterion("Speed4 <>", value, "speed4");
            return (Criteria) this;
        }

        public Criteria andSpeed4GreaterThan(BigDecimal value) {
            addCriterion("Speed4 >", value, "speed4");
            return (Criteria) this;
        }

        public Criteria andSpeed4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed4 >=", value, "speed4");
            return (Criteria) this;
        }

        public Criteria andSpeed4LessThan(BigDecimal value) {
            addCriterion("Speed4 <", value, "speed4");
            return (Criteria) this;
        }

        public Criteria andSpeed4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed4 <=", value, "speed4");
            return (Criteria) this;
        }

        public Criteria andSpeed4In(List<BigDecimal> values) {
            addCriterion("Speed4 in", values, "speed4");
            return (Criteria) this;
        }

        public Criteria andSpeed4NotIn(List<BigDecimal> values) {
            addCriterion("Speed4 not in", values, "speed4");
            return (Criteria) this;
        }

        public Criteria andSpeed4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed4 between", value1, value2, "speed4");
            return (Criteria) this;
        }

        public Criteria andSpeed4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed4 not between", value1, value2, "speed4");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5IsNull() {
            addCriterion("PositioningCompleted5 is null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5IsNotNull() {
            addCriterion("PositioningCompleted5 is not null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5EqualTo(String value) {
            addCriterion("PositioningCompleted5 =", value, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5NotEqualTo(String value) {
            addCriterion("PositioningCompleted5 <>", value, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5GreaterThan(String value) {
            addCriterion("PositioningCompleted5 >", value, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5GreaterThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted5 >=", value, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5LessThan(String value) {
            addCriterion("PositioningCompleted5 <", value, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5LessThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted5 <=", value, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5Like(String value) {
            addCriterion("PositioningCompleted5 like", value, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5NotLike(String value) {
            addCriterion("PositioningCompleted5 not like", value, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5In(List<String> values) {
            addCriterion("PositioningCompleted5 in", values, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5NotIn(List<String> values) {
            addCriterion("PositioningCompleted5 not in", values, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5Between(String value1, String value2) {
            addCriterion("PositioningCompleted5 between", value1, value2, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted5NotBetween(String value1, String value2) {
            addCriterion("PositioningCompleted5 not between", value1, value2, "positioningCompleted5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5IsNull() {
            addCriterion("DriverFault5 is null");
            return (Criteria) this;
        }

        public Criteria andDriverFault5IsNotNull() {
            addCriterion("DriverFault5 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverFault5EqualTo(String value) {
            addCriterion("DriverFault5 =", value, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5NotEqualTo(String value) {
            addCriterion("DriverFault5 <>", value, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5GreaterThan(String value) {
            addCriterion("DriverFault5 >", value, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5GreaterThanOrEqualTo(String value) {
            addCriterion("DriverFault5 >=", value, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5LessThan(String value) {
            addCriterion("DriverFault5 <", value, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5LessThanOrEqualTo(String value) {
            addCriterion("DriverFault5 <=", value, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5Like(String value) {
            addCriterion("DriverFault5 like", value, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5NotLike(String value) {
            addCriterion("DriverFault5 not like", value, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5In(List<String> values) {
            addCriterion("DriverFault5 in", values, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5NotIn(List<String> values) {
            addCriterion("DriverFault5 not in", values, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5Between(String value1, String value2) {
            addCriterion("DriverFault5 between", value1, value2, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverFault5NotBetween(String value1, String value2) {
            addCriterion("DriverFault5 not between", value1, value2, "driverFault5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5IsNull() {
            addCriterion("DriverEnable5 is null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5IsNotNull() {
            addCriterion("DriverEnable5 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5EqualTo(String value) {
            addCriterion("DriverEnable5 =", value, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5NotEqualTo(String value) {
            addCriterion("DriverEnable5 <>", value, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5GreaterThan(String value) {
            addCriterion("DriverEnable5 >", value, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5GreaterThanOrEqualTo(String value) {
            addCriterion("DriverEnable5 >=", value, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5LessThan(String value) {
            addCriterion("DriverEnable5 <", value, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5LessThanOrEqualTo(String value) {
            addCriterion("DriverEnable5 <=", value, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5Like(String value) {
            addCriterion("DriverEnable5 like", value, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5NotLike(String value) {
            addCriterion("DriverEnable5 not like", value, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5In(List<String> values) {
            addCriterion("DriverEnable5 in", values, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5NotIn(List<String> values) {
            addCriterion("DriverEnable5 not in", values, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5Between(String value1, String value2) {
            addCriterion("DriverEnable5 between", value1, value2, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andDriverEnable5NotBetween(String value1, String value2) {
            addCriterion("DriverEnable5 not between", value1, value2, "driverEnable5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5IsNull() {
            addCriterion("ReachLimit5 is null");
            return (Criteria) this;
        }

        public Criteria andReachLimit5IsNotNull() {
            addCriterion("ReachLimit5 is not null");
            return (Criteria) this;
        }

        public Criteria andReachLimit5EqualTo(String value) {
            addCriterion("ReachLimit5 =", value, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5NotEqualTo(String value) {
            addCriterion("ReachLimit5 <>", value, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5GreaterThan(String value) {
            addCriterion("ReachLimit5 >", value, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5GreaterThanOrEqualTo(String value) {
            addCriterion("ReachLimit5 >=", value, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5LessThan(String value) {
            addCriterion("ReachLimit5 <", value, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5LessThanOrEqualTo(String value) {
            addCriterion("ReachLimit5 <=", value, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5Like(String value) {
            addCriterion("ReachLimit5 like", value, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5NotLike(String value) {
            addCriterion("ReachLimit5 not like", value, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5In(List<String> values) {
            addCriterion("ReachLimit5 in", values, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5NotIn(List<String> values) {
            addCriterion("ReachLimit5 not in", values, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5Between(String value1, String value2) {
            addCriterion("ReachLimit5 between", value1, value2, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andReachLimit5NotBetween(String value1, String value2) {
            addCriterion("ReachLimit5 not between", value1, value2, "reachLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5IsNull() {
            addCriterion("RetractLimit5 is null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5IsNotNull() {
            addCriterion("RetractLimit5 is not null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5EqualTo(String value) {
            addCriterion("RetractLimit5 =", value, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5NotEqualTo(String value) {
            addCriterion("RetractLimit5 <>", value, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5GreaterThan(String value) {
            addCriterion("RetractLimit5 >", value, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5GreaterThanOrEqualTo(String value) {
            addCriterion("RetractLimit5 >=", value, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5LessThan(String value) {
            addCriterion("RetractLimit5 <", value, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5LessThanOrEqualTo(String value) {
            addCriterion("RetractLimit5 <=", value, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5Like(String value) {
            addCriterion("RetractLimit5 like", value, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5NotLike(String value) {
            addCriterion("RetractLimit5 not like", value, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5In(List<String> values) {
            addCriterion("RetractLimit5 in", values, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5NotIn(List<String> values) {
            addCriterion("RetractLimit5 not in", values, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5Between(String value1, String value2) {
            addCriterion("RetractLimit5 between", value1, value2, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andRetractLimit5NotBetween(String value1, String value2) {
            addCriterion("RetractLimit5 not between", value1, value2, "retractLimit5");
            return (Criteria) this;
        }

        public Criteria andFault5IsNull() {
            addCriterion("Fault5 is null");
            return (Criteria) this;
        }

        public Criteria andFault5IsNotNull() {
            addCriterion("Fault5 is not null");
            return (Criteria) this;
        }

        public Criteria andFault5EqualTo(String value) {
            addCriterion("Fault5 =", value, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5NotEqualTo(String value) {
            addCriterion("Fault5 <>", value, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5GreaterThan(String value) {
            addCriterion("Fault5 >", value, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5GreaterThanOrEqualTo(String value) {
            addCriterion("Fault5 >=", value, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5LessThan(String value) {
            addCriterion("Fault5 <", value, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5LessThanOrEqualTo(String value) {
            addCriterion("Fault5 <=", value, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5Like(String value) {
            addCriterion("Fault5 like", value, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5NotLike(String value) {
            addCriterion("Fault5 not like", value, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5In(List<String> values) {
            addCriterion("Fault5 in", values, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5NotIn(List<String> values) {
            addCriterion("Fault5 not in", values, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5Between(String value1, String value2) {
            addCriterion("Fault5 between", value1, value2, "fault5");
            return (Criteria) this;
        }

        public Criteria andFault5NotBetween(String value1, String value2) {
            addCriterion("Fault5 not between", value1, value2, "fault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5IsNull() {
            addCriterion("StopFault5 is null");
            return (Criteria) this;
        }

        public Criteria andStopFault5IsNotNull() {
            addCriterion("StopFault5 is not null");
            return (Criteria) this;
        }

        public Criteria andStopFault5EqualTo(String value) {
            addCriterion("StopFault5 =", value, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5NotEqualTo(String value) {
            addCriterion("StopFault5 <>", value, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5GreaterThan(String value) {
            addCriterion("StopFault5 >", value, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5GreaterThanOrEqualTo(String value) {
            addCriterion("StopFault5 >=", value, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5LessThan(String value) {
            addCriterion("StopFault5 <", value, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5LessThanOrEqualTo(String value) {
            addCriterion("StopFault5 <=", value, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5Like(String value) {
            addCriterion("StopFault5 like", value, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5NotLike(String value) {
            addCriterion("StopFault5 not like", value, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5In(List<String> values) {
            addCriterion("StopFault5 in", values, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5NotIn(List<String> values) {
            addCriterion("StopFault5 not in", values, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5Between(String value1, String value2) {
            addCriterion("StopFault5 between", value1, value2, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andStopFault5NotBetween(String value1, String value2) {
            addCriterion("StopFault5 not between", value1, value2, "stopFault5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5IsNull() {
            addCriterion("OverTorque5 is null");
            return (Criteria) this;
        }

        public Criteria andOverTorque5IsNotNull() {
            addCriterion("OverTorque5 is not null");
            return (Criteria) this;
        }

        public Criteria andOverTorque5EqualTo(String value) {
            addCriterion("OverTorque5 =", value, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5NotEqualTo(String value) {
            addCriterion("OverTorque5 <>", value, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5GreaterThan(String value) {
            addCriterion("OverTorque5 >", value, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5GreaterThanOrEqualTo(String value) {
            addCriterion("OverTorque5 >=", value, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5LessThan(String value) {
            addCriterion("OverTorque5 <", value, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5LessThanOrEqualTo(String value) {
            addCriterion("OverTorque5 <=", value, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5Like(String value) {
            addCriterion("OverTorque5 like", value, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5NotLike(String value) {
            addCriterion("OverTorque5 not like", value, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5In(List<String> values) {
            addCriterion("OverTorque5 in", values, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5NotIn(List<String> values) {
            addCriterion("OverTorque5 not in", values, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5Between(String value1, String value2) {
            addCriterion("OverTorque5 between", value1, value2, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andOverTorque5NotBetween(String value1, String value2) {
            addCriterion("OverTorque5 not between", value1, value2, "overTorque5");
            return (Criteria) this;
        }

        public Criteria andPosition5IsNull() {
            addCriterion("Position5 is null");
            return (Criteria) this;
        }

        public Criteria andPosition5IsNotNull() {
            addCriterion("Position5 is not null");
            return (Criteria) this;
        }

        public Criteria andPosition5EqualTo(BigDecimal value) {
            addCriterion("Position5 =", value, "position5");
            return (Criteria) this;
        }

        public Criteria andPosition5NotEqualTo(BigDecimal value) {
            addCriterion("Position5 <>", value, "position5");
            return (Criteria) this;
        }

        public Criteria andPosition5GreaterThan(BigDecimal value) {
            addCriterion("Position5 >", value, "position5");
            return (Criteria) this;
        }

        public Criteria andPosition5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Position5 >=", value, "position5");
            return (Criteria) this;
        }

        public Criteria andPosition5LessThan(BigDecimal value) {
            addCriterion("Position5 <", value, "position5");
            return (Criteria) this;
        }

        public Criteria andPosition5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Position5 <=", value, "position5");
            return (Criteria) this;
        }

        public Criteria andPosition5In(List<BigDecimal> values) {
            addCriterion("Position5 in", values, "position5");
            return (Criteria) this;
        }

        public Criteria andPosition5NotIn(List<BigDecimal> values) {
            addCriterion("Position5 not in", values, "position5");
            return (Criteria) this;
        }

        public Criteria andPosition5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position5 between", value1, value2, "position5");
            return (Criteria) this;
        }

        public Criteria andPosition5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position5 not between", value1, value2, "position5");
            return (Criteria) this;
        }

        public Criteria andTorque5IsNull() {
            addCriterion("Torque5 is null");
            return (Criteria) this;
        }

        public Criteria andTorque5IsNotNull() {
            addCriterion("Torque5 is not null");
            return (Criteria) this;
        }

        public Criteria andTorque5EqualTo(BigDecimal value) {
            addCriterion("Torque5 =", value, "torque5");
            return (Criteria) this;
        }

        public Criteria andTorque5NotEqualTo(BigDecimal value) {
            addCriterion("Torque5 <>", value, "torque5");
            return (Criteria) this;
        }

        public Criteria andTorque5GreaterThan(BigDecimal value) {
            addCriterion("Torque5 >", value, "torque5");
            return (Criteria) this;
        }

        public Criteria andTorque5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque5 >=", value, "torque5");
            return (Criteria) this;
        }

        public Criteria andTorque5LessThan(BigDecimal value) {
            addCriterion("Torque5 <", value, "torque5");
            return (Criteria) this;
        }

        public Criteria andTorque5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque5 <=", value, "torque5");
            return (Criteria) this;
        }

        public Criteria andTorque5In(List<BigDecimal> values) {
            addCriterion("Torque5 in", values, "torque5");
            return (Criteria) this;
        }

        public Criteria andTorque5NotIn(List<BigDecimal> values) {
            addCriterion("Torque5 not in", values, "torque5");
            return (Criteria) this;
        }

        public Criteria andTorque5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque5 between", value1, value2, "torque5");
            return (Criteria) this;
        }

        public Criteria andTorque5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque5 not between", value1, value2, "torque5");
            return (Criteria) this;
        }

        public Criteria andSpeed5IsNull() {
            addCriterion("Speed5 is null");
            return (Criteria) this;
        }

        public Criteria andSpeed5IsNotNull() {
            addCriterion("Speed5 is not null");
            return (Criteria) this;
        }

        public Criteria andSpeed5EqualTo(BigDecimal value) {
            addCriterion("Speed5 =", value, "speed5");
            return (Criteria) this;
        }

        public Criteria andSpeed5NotEqualTo(BigDecimal value) {
            addCriterion("Speed5 <>", value, "speed5");
            return (Criteria) this;
        }

        public Criteria andSpeed5GreaterThan(BigDecimal value) {
            addCriterion("Speed5 >", value, "speed5");
            return (Criteria) this;
        }

        public Criteria andSpeed5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed5 >=", value, "speed5");
            return (Criteria) this;
        }

        public Criteria andSpeed5LessThan(BigDecimal value) {
            addCriterion("Speed5 <", value, "speed5");
            return (Criteria) this;
        }

        public Criteria andSpeed5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed5 <=", value, "speed5");
            return (Criteria) this;
        }

        public Criteria andSpeed5In(List<BigDecimal> values) {
            addCriterion("Speed5 in", values, "speed5");
            return (Criteria) this;
        }

        public Criteria andSpeed5NotIn(List<BigDecimal> values) {
            addCriterion("Speed5 not in", values, "speed5");
            return (Criteria) this;
        }

        public Criteria andSpeed5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed5 between", value1, value2, "speed5");
            return (Criteria) this;
        }

        public Criteria andSpeed5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed5 not between", value1, value2, "speed5");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6IsNull() {
            addCriterion("PositioningCompleted6 is null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6IsNotNull() {
            addCriterion("PositioningCompleted6 is not null");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6EqualTo(String value) {
            addCriterion("PositioningCompleted6 =", value, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6NotEqualTo(String value) {
            addCriterion("PositioningCompleted6 <>", value, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6GreaterThan(String value) {
            addCriterion("PositioningCompleted6 >", value, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6GreaterThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted6 >=", value, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6LessThan(String value) {
            addCriterion("PositioningCompleted6 <", value, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6LessThanOrEqualTo(String value) {
            addCriterion("PositioningCompleted6 <=", value, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6Like(String value) {
            addCriterion("PositioningCompleted6 like", value, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6NotLike(String value) {
            addCriterion("PositioningCompleted6 not like", value, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6In(List<String> values) {
            addCriterion("PositioningCompleted6 in", values, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6NotIn(List<String> values) {
            addCriterion("PositioningCompleted6 not in", values, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6Between(String value1, String value2) {
            addCriterion("PositioningCompleted6 between", value1, value2, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andPositioningCompleted6NotBetween(String value1, String value2) {
            addCriterion("PositioningCompleted6 not between", value1, value2, "positioningCompleted6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6IsNull() {
            addCriterion("DriverFault6 is null");
            return (Criteria) this;
        }

        public Criteria andDriverFault6IsNotNull() {
            addCriterion("DriverFault6 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverFault6EqualTo(String value) {
            addCriterion("DriverFault6 =", value, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6NotEqualTo(String value) {
            addCriterion("DriverFault6 <>", value, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6GreaterThan(String value) {
            addCriterion("DriverFault6 >", value, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6GreaterThanOrEqualTo(String value) {
            addCriterion("DriverFault6 >=", value, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6LessThan(String value) {
            addCriterion("DriverFault6 <", value, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6LessThanOrEqualTo(String value) {
            addCriterion("DriverFault6 <=", value, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6Like(String value) {
            addCriterion("DriverFault6 like", value, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6NotLike(String value) {
            addCriterion("DriverFault6 not like", value, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6In(List<String> values) {
            addCriterion("DriverFault6 in", values, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6NotIn(List<String> values) {
            addCriterion("DriverFault6 not in", values, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6Between(String value1, String value2) {
            addCriterion("DriverFault6 between", value1, value2, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverFault6NotBetween(String value1, String value2) {
            addCriterion("DriverFault6 not between", value1, value2, "driverFault6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6IsNull() {
            addCriterion("DriverEnable6 is null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6IsNotNull() {
            addCriterion("DriverEnable6 is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6EqualTo(String value) {
            addCriterion("DriverEnable6 =", value, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6NotEqualTo(String value) {
            addCriterion("DriverEnable6 <>", value, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6GreaterThan(String value) {
            addCriterion("DriverEnable6 >", value, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6GreaterThanOrEqualTo(String value) {
            addCriterion("DriverEnable6 >=", value, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6LessThan(String value) {
            addCriterion("DriverEnable6 <", value, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6LessThanOrEqualTo(String value) {
            addCriterion("DriverEnable6 <=", value, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6Like(String value) {
            addCriterion("DriverEnable6 like", value, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6NotLike(String value) {
            addCriterion("DriverEnable6 not like", value, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6In(List<String> values) {
            addCriterion("DriverEnable6 in", values, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6NotIn(List<String> values) {
            addCriterion("DriverEnable6 not in", values, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6Between(String value1, String value2) {
            addCriterion("DriverEnable6 between", value1, value2, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andDriverEnable6NotBetween(String value1, String value2) {
            addCriterion("DriverEnable6 not between", value1, value2, "driverEnable6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6IsNull() {
            addCriterion("ReachLimit6 is null");
            return (Criteria) this;
        }

        public Criteria andReachLimit6IsNotNull() {
            addCriterion("ReachLimit6 is not null");
            return (Criteria) this;
        }

        public Criteria andReachLimit6EqualTo(String value) {
            addCriterion("ReachLimit6 =", value, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6NotEqualTo(String value) {
            addCriterion("ReachLimit6 <>", value, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6GreaterThan(String value) {
            addCriterion("ReachLimit6 >", value, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6GreaterThanOrEqualTo(String value) {
            addCriterion("ReachLimit6 >=", value, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6LessThan(String value) {
            addCriterion("ReachLimit6 <", value, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6LessThanOrEqualTo(String value) {
            addCriterion("ReachLimit6 <=", value, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6Like(String value) {
            addCriterion("ReachLimit6 like", value, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6NotLike(String value) {
            addCriterion("ReachLimit6 not like", value, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6In(List<String> values) {
            addCriterion("ReachLimit6 in", values, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6NotIn(List<String> values) {
            addCriterion("ReachLimit6 not in", values, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6Between(String value1, String value2) {
            addCriterion("ReachLimit6 between", value1, value2, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andReachLimit6NotBetween(String value1, String value2) {
            addCriterion("ReachLimit6 not between", value1, value2, "reachLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6IsNull() {
            addCriterion("RetractLimit6 is null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6IsNotNull() {
            addCriterion("RetractLimit6 is not null");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6EqualTo(String value) {
            addCriterion("RetractLimit6 =", value, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6NotEqualTo(String value) {
            addCriterion("RetractLimit6 <>", value, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6GreaterThan(String value) {
            addCriterion("RetractLimit6 >", value, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6GreaterThanOrEqualTo(String value) {
            addCriterion("RetractLimit6 >=", value, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6LessThan(String value) {
            addCriterion("RetractLimit6 <", value, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6LessThanOrEqualTo(String value) {
            addCriterion("RetractLimit6 <=", value, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6Like(String value) {
            addCriterion("RetractLimit6 like", value, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6NotLike(String value) {
            addCriterion("RetractLimit6 not like", value, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6In(List<String> values) {
            addCriterion("RetractLimit6 in", values, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6NotIn(List<String> values) {
            addCriterion("RetractLimit6 not in", values, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6Between(String value1, String value2) {
            addCriterion("RetractLimit6 between", value1, value2, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andRetractLimit6NotBetween(String value1, String value2) {
            addCriterion("RetractLimit6 not between", value1, value2, "retractLimit6");
            return (Criteria) this;
        }

        public Criteria andFault6IsNull() {
            addCriterion("Fault6 is null");
            return (Criteria) this;
        }

        public Criteria andFault6IsNotNull() {
            addCriterion("Fault6 is not null");
            return (Criteria) this;
        }

        public Criteria andFault6EqualTo(String value) {
            addCriterion("Fault6 =", value, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6NotEqualTo(String value) {
            addCriterion("Fault6 <>", value, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6GreaterThan(String value) {
            addCriterion("Fault6 >", value, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6GreaterThanOrEqualTo(String value) {
            addCriterion("Fault6 >=", value, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6LessThan(String value) {
            addCriterion("Fault6 <", value, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6LessThanOrEqualTo(String value) {
            addCriterion("Fault6 <=", value, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6Like(String value) {
            addCriterion("Fault6 like", value, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6NotLike(String value) {
            addCriterion("Fault6 not like", value, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6In(List<String> values) {
            addCriterion("Fault6 in", values, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6NotIn(List<String> values) {
            addCriterion("Fault6 not in", values, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6Between(String value1, String value2) {
            addCriterion("Fault6 between", value1, value2, "fault6");
            return (Criteria) this;
        }

        public Criteria andFault6NotBetween(String value1, String value2) {
            addCriterion("Fault6 not between", value1, value2, "fault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6IsNull() {
            addCriterion("StopFault6 is null");
            return (Criteria) this;
        }

        public Criteria andStopFault6IsNotNull() {
            addCriterion("StopFault6 is not null");
            return (Criteria) this;
        }

        public Criteria andStopFault6EqualTo(String value) {
            addCriterion("StopFault6 =", value, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6NotEqualTo(String value) {
            addCriterion("StopFault6 <>", value, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6GreaterThan(String value) {
            addCriterion("StopFault6 >", value, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6GreaterThanOrEqualTo(String value) {
            addCriterion("StopFault6 >=", value, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6LessThan(String value) {
            addCriterion("StopFault6 <", value, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6LessThanOrEqualTo(String value) {
            addCriterion("StopFault6 <=", value, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6Like(String value) {
            addCriterion("StopFault6 like", value, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6NotLike(String value) {
            addCriterion("StopFault6 not like", value, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6In(List<String> values) {
            addCriterion("StopFault6 in", values, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6NotIn(List<String> values) {
            addCriterion("StopFault6 not in", values, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6Between(String value1, String value2) {
            addCriterion("StopFault6 between", value1, value2, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andStopFault6NotBetween(String value1, String value2) {
            addCriterion("StopFault6 not between", value1, value2, "stopFault6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6IsNull() {
            addCriterion("OverTorque6 is null");
            return (Criteria) this;
        }

        public Criteria andOverTorque6IsNotNull() {
            addCriterion("OverTorque6 is not null");
            return (Criteria) this;
        }

        public Criteria andOverTorque6EqualTo(String value) {
            addCriterion("OverTorque6 =", value, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6NotEqualTo(String value) {
            addCriterion("OverTorque6 <>", value, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6GreaterThan(String value) {
            addCriterion("OverTorque6 >", value, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6GreaterThanOrEqualTo(String value) {
            addCriterion("OverTorque6 >=", value, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6LessThan(String value) {
            addCriterion("OverTorque6 <", value, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6LessThanOrEqualTo(String value) {
            addCriterion("OverTorque6 <=", value, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6Like(String value) {
            addCriterion("OverTorque6 like", value, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6NotLike(String value) {
            addCriterion("OverTorque6 not like", value, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6In(List<String> values) {
            addCriterion("OverTorque6 in", values, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6NotIn(List<String> values) {
            addCriterion("OverTorque6 not in", values, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6Between(String value1, String value2) {
            addCriterion("OverTorque6 between", value1, value2, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andOverTorque6NotBetween(String value1, String value2) {
            addCriterion("OverTorque6 not between", value1, value2, "overTorque6");
            return (Criteria) this;
        }

        public Criteria andPosition6IsNull() {
            addCriterion("Position6 is null");
            return (Criteria) this;
        }

        public Criteria andPosition6IsNotNull() {
            addCriterion("Position6 is not null");
            return (Criteria) this;
        }

        public Criteria andPosition6EqualTo(BigDecimal value) {
            addCriterion("Position6 =", value, "position6");
            return (Criteria) this;
        }

        public Criteria andPosition6NotEqualTo(BigDecimal value) {
            addCriterion("Position6 <>", value, "position6");
            return (Criteria) this;
        }

        public Criteria andPosition6GreaterThan(BigDecimal value) {
            addCriterion("Position6 >", value, "position6");
            return (Criteria) this;
        }

        public Criteria andPosition6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Position6 >=", value, "position6");
            return (Criteria) this;
        }

        public Criteria andPosition6LessThan(BigDecimal value) {
            addCriterion("Position6 <", value, "position6");
            return (Criteria) this;
        }

        public Criteria andPosition6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Position6 <=", value, "position6");
            return (Criteria) this;
        }

        public Criteria andPosition6In(List<BigDecimal> values) {
            addCriterion("Position6 in", values, "position6");
            return (Criteria) this;
        }

        public Criteria andPosition6NotIn(List<BigDecimal> values) {
            addCriterion("Position6 not in", values, "position6");
            return (Criteria) this;
        }

        public Criteria andPosition6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position6 between", value1, value2, "position6");
            return (Criteria) this;
        }

        public Criteria andPosition6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Position6 not between", value1, value2, "position6");
            return (Criteria) this;
        }

        public Criteria andTorque6IsNull() {
            addCriterion("Torque6 is null");
            return (Criteria) this;
        }

        public Criteria andTorque6IsNotNull() {
            addCriterion("Torque6 is not null");
            return (Criteria) this;
        }

        public Criteria andTorque6EqualTo(BigDecimal value) {
            addCriterion("Torque6 =", value, "torque6");
            return (Criteria) this;
        }

        public Criteria andTorque6NotEqualTo(BigDecimal value) {
            addCriterion("Torque6 <>", value, "torque6");
            return (Criteria) this;
        }

        public Criteria andTorque6GreaterThan(BigDecimal value) {
            addCriterion("Torque6 >", value, "torque6");
            return (Criteria) this;
        }

        public Criteria andTorque6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque6 >=", value, "torque6");
            return (Criteria) this;
        }

        public Criteria andTorque6LessThan(BigDecimal value) {
            addCriterion("Torque6 <", value, "torque6");
            return (Criteria) this;
        }

        public Criteria andTorque6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Torque6 <=", value, "torque6");
            return (Criteria) this;
        }

        public Criteria andTorque6In(List<BigDecimal> values) {
            addCriterion("Torque6 in", values, "torque6");
            return (Criteria) this;
        }

        public Criteria andTorque6NotIn(List<BigDecimal> values) {
            addCriterion("Torque6 not in", values, "torque6");
            return (Criteria) this;
        }

        public Criteria andTorque6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque6 between", value1, value2, "torque6");
            return (Criteria) this;
        }

        public Criteria andTorque6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Torque6 not between", value1, value2, "torque6");
            return (Criteria) this;
        }

        public Criteria andSpeed6IsNull() {
            addCriterion("Speed6 is null");
            return (Criteria) this;
        }

        public Criteria andSpeed6IsNotNull() {
            addCriterion("Speed6 is not null");
            return (Criteria) this;
        }

        public Criteria andSpeed6EqualTo(BigDecimal value) {
            addCriterion("Speed6 =", value, "speed6");
            return (Criteria) this;
        }

        public Criteria andSpeed6NotEqualTo(BigDecimal value) {
            addCriterion("Speed6 <>", value, "speed6");
            return (Criteria) this;
        }

        public Criteria andSpeed6GreaterThan(BigDecimal value) {
            addCriterion("Speed6 >", value, "speed6");
            return (Criteria) this;
        }

        public Criteria andSpeed6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed6 >=", value, "speed6");
            return (Criteria) this;
        }

        public Criteria andSpeed6LessThan(BigDecimal value) {
            addCriterion("Speed6 <", value, "speed6");
            return (Criteria) this;
        }

        public Criteria andSpeed6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("Speed6 <=", value, "speed6");
            return (Criteria) this;
        }

        public Criteria andSpeed6In(List<BigDecimal> values) {
            addCriterion("Speed6 in", values, "speed6");
            return (Criteria) this;
        }

        public Criteria andSpeed6NotIn(List<BigDecimal> values) {
            addCriterion("Speed6 not in", values, "speed6");
            return (Criteria) this;
        }

        public Criteria andSpeed6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed6 between", value1, value2, "speed6");
            return (Criteria) this;
        }

        public Criteria andSpeed6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Speed6 not between", value1, value2, "speed6");
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