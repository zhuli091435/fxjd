package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_RAIN_RExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_RAIN_RExample() {
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

        public Criteria andRainIntensityIsNull() {
            addCriterion("RainIntensity is null");
            return (Criteria) this;
        }

        public Criteria andRainIntensityIsNotNull() {
            addCriterion("RainIntensity is not null");
            return (Criteria) this;
        }

        public Criteria andRainIntensityEqualTo(BigDecimal value) {
            addCriterion("RainIntensity =", value, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andRainIntensityNotEqualTo(BigDecimal value) {
            addCriterion("RainIntensity <>", value, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andRainIntensityGreaterThan(BigDecimal value) {
            addCriterion("RainIntensity >", value, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andRainIntensityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RainIntensity >=", value, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andRainIntensityLessThan(BigDecimal value) {
            addCriterion("RainIntensity <", value, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andRainIntensityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RainIntensity <=", value, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andRainIntensityIn(List<BigDecimal> values) {
            addCriterion("RainIntensity in", values, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andRainIntensityNotIn(List<BigDecimal> values) {
            addCriterion("RainIntensity not in", values, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andRainIntensityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RainIntensity between", value1, value2, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andRainIntensityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RainIntensity not between", value1, value2, "rainIntensity");
            return (Criteria) this;
        }

        public Criteria andLightRainModeIsNull() {
            addCriterion("LightRainMode is null");
            return (Criteria) this;
        }

        public Criteria andLightRainModeIsNotNull() {
            addCriterion("LightRainMode is not null");
            return (Criteria) this;
        }

        public Criteria andLightRainModeEqualTo(Integer value) {
            addCriterion("LightRainMode =", value, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andLightRainModeNotEqualTo(Integer value) {
            addCriterion("LightRainMode <>", value, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andLightRainModeGreaterThan(Integer value) {
            addCriterion("LightRainMode >", value, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andLightRainModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LightRainMode >=", value, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andLightRainModeLessThan(Integer value) {
            addCriterion("LightRainMode <", value, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andLightRainModeLessThanOrEqualTo(Integer value) {
            addCriterion("LightRainMode <=", value, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andLightRainModeIn(List<Integer> values) {
            addCriterion("LightRainMode in", values, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andLightRainModeNotIn(List<Integer> values) {
            addCriterion("LightRainMode not in", values, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andLightRainModeBetween(Integer value1, Integer value2) {
            addCriterion("LightRainMode between", value1, value2, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andLightRainModeNotBetween(Integer value1, Integer value2) {
            addCriterion("LightRainMode not between", value1, value2, "lightRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeIsNull() {
            addCriterion("ModerateRainMode is null");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeIsNotNull() {
            addCriterion("ModerateRainMode is not null");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeEqualTo(Integer value) {
            addCriterion("ModerateRainMode =", value, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeNotEqualTo(Integer value) {
            addCriterion("ModerateRainMode <>", value, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeGreaterThan(Integer value) {
            addCriterion("ModerateRainMode >", value, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ModerateRainMode >=", value, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeLessThan(Integer value) {
            addCriterion("ModerateRainMode <", value, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeLessThanOrEqualTo(Integer value) {
            addCriterion("ModerateRainMode <=", value, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeIn(List<Integer> values) {
            addCriterion("ModerateRainMode in", values, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeNotIn(List<Integer> values) {
            addCriterion("ModerateRainMode not in", values, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeBetween(Integer value1, Integer value2) {
            addCriterion("ModerateRainMode between", value1, value2, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andModerateRainModeNotBetween(Integer value1, Integer value2) {
            addCriterion("ModerateRainMode not between", value1, value2, "moderateRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeIsNull() {
            addCriterion("HeavyRainMode is null");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeIsNotNull() {
            addCriterion("HeavyRainMode is not null");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeEqualTo(Integer value) {
            addCriterion("HeavyRainMode =", value, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeNotEqualTo(Integer value) {
            addCriterion("HeavyRainMode <>", value, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeGreaterThan(Integer value) {
            addCriterion("HeavyRainMode >", value, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("HeavyRainMode >=", value, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeLessThan(Integer value) {
            addCriterion("HeavyRainMode <", value, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeLessThanOrEqualTo(Integer value) {
            addCriterion("HeavyRainMode <=", value, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeIn(List<Integer> values) {
            addCriterion("HeavyRainMode in", values, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeNotIn(List<Integer> values) {
            addCriterion("HeavyRainMode not in", values, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeBetween(Integer value1, Integer value2) {
            addCriterion("HeavyRainMode between", value1, value2, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andHeavyRainModeNotBetween(Integer value1, Integer value2) {
            addCriterion("HeavyRainMode not between", value1, value2, "heavyRainMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeIsNull() {
            addCriterion("RainstormMode is null");
            return (Criteria) this;
        }

        public Criteria andRainstormModeIsNotNull() {
            addCriterion("RainstormMode is not null");
            return (Criteria) this;
        }

        public Criteria andRainstormModeEqualTo(Integer value) {
            addCriterion("RainstormMode =", value, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeNotEqualTo(Integer value) {
            addCriterion("RainstormMode <>", value, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeGreaterThan(Integer value) {
            addCriterion("RainstormMode >", value, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RainstormMode >=", value, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeLessThan(Integer value) {
            addCriterion("RainstormMode <", value, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeLessThanOrEqualTo(Integer value) {
            addCriterion("RainstormMode <=", value, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeIn(List<Integer> values) {
            addCriterion("RainstormMode in", values, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeNotIn(List<Integer> values) {
            addCriterion("RainstormMode not in", values, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeBetween(Integer value1, Integer value2) {
            addCriterion("RainstormMode between", value1, value2, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andRainstormModeNotBetween(Integer value1, Integer value2) {
            addCriterion("RainstormMode not between", value1, value2, "rainstormMode");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1IsNull() {
            addCriterion("WaterPumpStatus1 is null");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1IsNotNull() {
            addCriterion("WaterPumpStatus1 is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1EqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus1 =", value, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1NotEqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus1 <>", value, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1GreaterThan(BigDecimal value) {
            addCriterion("WaterPumpStatus1 >", value, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus1 >=", value, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1LessThan(BigDecimal value) {
            addCriterion("WaterPumpStatus1 <", value, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus1 <=", value, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1In(List<BigDecimal> values) {
            addCriterion("WaterPumpStatus1 in", values, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1NotIn(List<BigDecimal> values) {
            addCriterion("WaterPumpStatus1 not in", values, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("WaterPumpStatus1 between", value1, value2, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WaterPumpStatus1 not between", value1, value2, "waterPumpStatus1");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2IsNull() {
            addCriterion("WaterPumpStatus2 is null");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2IsNotNull() {
            addCriterion("WaterPumpStatus2 is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2EqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus2 =", value, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2NotEqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus2 <>", value, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2GreaterThan(BigDecimal value) {
            addCriterion("WaterPumpStatus2 >", value, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus2 >=", value, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2LessThan(BigDecimal value) {
            addCriterion("WaterPumpStatus2 <", value, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus2 <=", value, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2In(List<BigDecimal> values) {
            addCriterion("WaterPumpStatus2 in", values, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2NotIn(List<BigDecimal> values) {
            addCriterion("WaterPumpStatus2 not in", values, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("WaterPumpStatus2 between", value1, value2, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WaterPumpStatus2 not between", value1, value2, "waterPumpStatus2");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3IsNull() {
            addCriterion("WaterPumpStatus3 is null");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3IsNotNull() {
            addCriterion("WaterPumpStatus3 is not null");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3EqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus3 =", value, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3NotEqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus3 <>", value, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3GreaterThan(BigDecimal value) {
            addCriterion("WaterPumpStatus3 >", value, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus3 >=", value, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3LessThan(BigDecimal value) {
            addCriterion("WaterPumpStatus3 <", value, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("WaterPumpStatus3 <=", value, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3In(List<BigDecimal> values) {
            addCriterion("WaterPumpStatus3 in", values, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3NotIn(List<BigDecimal> values) {
            addCriterion("WaterPumpStatus3 not in", values, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("WaterPumpStatus3 between", value1, value2, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andWaterPumpStatus3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WaterPumpStatus3 not between", value1, value2, "waterPumpStatus3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1IsNull() {
            addCriterion("PipelineFlow1 is null");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1IsNotNull() {
            addCriterion("PipelineFlow1 is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1EqualTo(BigDecimal value) {
            addCriterion("PipelineFlow1 =", value, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1NotEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow1 <>", value, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1GreaterThan(BigDecimal value) {
            addCriterion("PipelineFlow1 >", value, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow1 >=", value, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1LessThan(BigDecimal value) {
            addCriterion("PipelineFlow1 <", value, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow1 <=", value, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1In(List<BigDecimal> values) {
            addCriterion("PipelineFlow1 in", values, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1NotIn(List<BigDecimal> values) {
            addCriterion("PipelineFlow1 not in", values, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelineFlow1 between", value1, value2, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelineFlow1 not between", value1, value2, "pipelineFlow1");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2IsNull() {
            addCriterion("PipelineFlow2 is null");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2IsNotNull() {
            addCriterion("PipelineFlow2 is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2EqualTo(BigDecimal value) {
            addCriterion("PipelineFlow2 =", value, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2NotEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow2 <>", value, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2GreaterThan(BigDecimal value) {
            addCriterion("PipelineFlow2 >", value, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow2 >=", value, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2LessThan(BigDecimal value) {
            addCriterion("PipelineFlow2 <", value, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow2 <=", value, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2In(List<BigDecimal> values) {
            addCriterion("PipelineFlow2 in", values, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2NotIn(List<BigDecimal> values) {
            addCriterion("PipelineFlow2 not in", values, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelineFlow2 between", value1, value2, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelineFlow2 not between", value1, value2, "pipelineFlow2");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3IsNull() {
            addCriterion("PipelineFlow3 is null");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3IsNotNull() {
            addCriterion("PipelineFlow3 is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3EqualTo(BigDecimal value) {
            addCriterion("PipelineFlow3 =", value, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3NotEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow3 <>", value, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3GreaterThan(BigDecimal value) {
            addCriterion("PipelineFlow3 >", value, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow3 >=", value, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3LessThan(BigDecimal value) {
            addCriterion("PipelineFlow3 <", value, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelineFlow3 <=", value, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3In(List<BigDecimal> values) {
            addCriterion("PipelineFlow3 in", values, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3NotIn(List<BigDecimal> values) {
            addCriterion("PipelineFlow3 not in", values, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelineFlow3 between", value1, value2, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelineFlow3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelineFlow3 not between", value1, value2, "pipelineFlow3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1IsNull() {
            addCriterion("PipelinePressure1 is null");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1IsNotNull() {
            addCriterion("PipelinePressure1 is not null");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1EqualTo(BigDecimal value) {
            addCriterion("PipelinePressure1 =", value, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1NotEqualTo(BigDecimal value) {
            addCriterion("PipelinePressure1 <>", value, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1GreaterThan(BigDecimal value) {
            addCriterion("PipelinePressure1 >", value, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelinePressure1 >=", value, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1LessThan(BigDecimal value) {
            addCriterion("PipelinePressure1 <", value, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelinePressure1 <=", value, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1In(List<BigDecimal> values) {
            addCriterion("PipelinePressure1 in", values, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1NotIn(List<BigDecimal> values) {
            addCriterion("PipelinePressure1 not in", values, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelinePressure1 between", value1, value2, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelinePressure1 not between", value1, value2, "pipelinePressure1");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2IsNull() {
            addCriterion("PipelinePressure2 is null");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2IsNotNull() {
            addCriterion("PipelinePressure2 is not null");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2EqualTo(BigDecimal value) {
            addCriterion("PipelinePressure2 =", value, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2NotEqualTo(BigDecimal value) {
            addCriterion("PipelinePressure2 <>", value, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2GreaterThan(BigDecimal value) {
            addCriterion("PipelinePressure2 >", value, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelinePressure2 >=", value, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2LessThan(BigDecimal value) {
            addCriterion("PipelinePressure2 <", value, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelinePressure2 <=", value, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2In(List<BigDecimal> values) {
            addCriterion("PipelinePressure2 in", values, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2NotIn(List<BigDecimal> values) {
            addCriterion("PipelinePressure2 not in", values, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelinePressure2 between", value1, value2, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelinePressure2 not between", value1, value2, "pipelinePressure2");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3IsNull() {
            addCriterion("PipelinePressure3 is null");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3IsNotNull() {
            addCriterion("PipelinePressure3 is not null");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3EqualTo(BigDecimal value) {
            addCriterion("PipelinePressure3 =", value, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3NotEqualTo(BigDecimal value) {
            addCriterion("PipelinePressure3 <>", value, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3GreaterThan(BigDecimal value) {
            addCriterion("PipelinePressure3 >", value, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelinePressure3 >=", value, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3LessThan(BigDecimal value) {
            addCriterion("PipelinePressure3 <", value, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PipelinePressure3 <=", value, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3In(List<BigDecimal> values) {
            addCriterion("PipelinePressure3 in", values, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3NotIn(List<BigDecimal> values) {
            addCriterion("PipelinePressure3 not in", values, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelinePressure3 between", value1, value2, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andPipelinePressure3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PipelinePressure3 not between", value1, value2, "pipelinePressure3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1IsNull() {
            addCriterion("AdjustingValveOpening1 is null");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1IsNotNull() {
            addCriterion("AdjustingValveOpening1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1EqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening1 =", value, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1NotEqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening1 <>", value, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1GreaterThan(BigDecimal value) {
            addCriterion("AdjustingValveOpening1 >", value, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening1 >=", value, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1LessThan(BigDecimal value) {
            addCriterion("AdjustingValveOpening1 <", value, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening1 <=", value, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1In(List<BigDecimal> values) {
            addCriterion("AdjustingValveOpening1 in", values, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1NotIn(List<BigDecimal> values) {
            addCriterion("AdjustingValveOpening1 not in", values, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustingValveOpening1 between", value1, value2, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustingValveOpening1 not between", value1, value2, "adjustingValveOpening1");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2IsNull() {
            addCriterion("AdjustingValveOpening2 is null");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2IsNotNull() {
            addCriterion("AdjustingValveOpening2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2EqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening2 =", value, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2NotEqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening2 <>", value, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2GreaterThan(BigDecimal value) {
            addCriterion("AdjustingValveOpening2 >", value, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening2 >=", value, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2LessThan(BigDecimal value) {
            addCriterion("AdjustingValveOpening2 <", value, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening2 <=", value, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2In(List<BigDecimal> values) {
            addCriterion("AdjustingValveOpening2 in", values, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2NotIn(List<BigDecimal> values) {
            addCriterion("AdjustingValveOpening2 not in", values, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustingValveOpening2 between", value1, value2, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustingValveOpening2 not between", value1, value2, "adjustingValveOpening2");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3IsNull() {
            addCriterion("AdjustingValveOpening3 is null");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3IsNotNull() {
            addCriterion("AdjustingValveOpening3 is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3EqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening3 =", value, "adjustingValveOpening3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3NotEqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening3 <>", value, "adjustingValveOpening3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3GreaterThan(BigDecimal value) {
            addCriterion("AdjustingValveOpening3 >", value, "adjustingValveOpening3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening3 >=", value, "adjustingValveOpening3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3LessThan(BigDecimal value) {
            addCriterion("AdjustingValveOpening3 <", value, "adjustingValveOpening3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("AdjustingValveOpening3 <=", value, "adjustingValveOpening3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3In(List<BigDecimal> values) {
            addCriterion("AdjustingValveOpening3 in", values, "adjustingValveOpening3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3NotIn(List<BigDecimal> values) {
            addCriterion("AdjustingValveOpening3 not in", values, "adjustingValveOpening3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustingValveOpening3 between", value1, value2, "adjustingValveOpening3");
            return (Criteria) this;
        }

        public Criteria andAdjustingValveOpening3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AdjustingValveOpening3 not between", value1, value2, "adjustingValveOpening3");
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