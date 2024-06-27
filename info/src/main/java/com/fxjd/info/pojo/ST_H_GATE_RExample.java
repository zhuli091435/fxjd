package com.fxjd.info.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ST_H_GATE_RExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ST_H_GATE_RExample() {
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

        public Criteria andModeIsNull() {
            addCriterion("Mode is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("Mode is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(Integer value) {
            addCriterion("Mode =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(Integer value) {
            addCriterion("Mode <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(Integer value) {
            addCriterion("Mode >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Mode >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(Integer value) {
            addCriterion("Mode <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(Integer value) {
            addCriterion("Mode <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<Integer> values) {
            addCriterion("Mode in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<Integer> values) {
            addCriterion("Mode not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(Integer value1, Integer value2) {
            addCriterion("Mode between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(Integer value1, Integer value2) {
            addCriterion("Mode not between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusIsNull() {
            addCriterion("RemoteStatus is null");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusIsNotNull() {
            addCriterion("RemoteStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusEqualTo(Integer value) {
            addCriterion("RemoteStatus =", value, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusNotEqualTo(Integer value) {
            addCriterion("RemoteStatus <>", value, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusGreaterThan(Integer value) {
            addCriterion("RemoteStatus >", value, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RemoteStatus >=", value, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusLessThan(Integer value) {
            addCriterion("RemoteStatus <", value, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("RemoteStatus <=", value, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusIn(List<Integer> values) {
            addCriterion("RemoteStatus in", values, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusNotIn(List<Integer> values) {
            addCriterion("RemoteStatus not in", values, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusBetween(Integer value1, Integer value2) {
            addCriterion("RemoteStatus between", value1, value2, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andRemoteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RemoteStatus not between", value1, value2, "remoteStatus");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultIsNull() {
            addCriterion("MainPumpFault is null");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultIsNotNull() {
            addCriterion("MainPumpFault is not null");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultEqualTo(Integer value) {
            addCriterion("MainPumpFault =", value, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultNotEqualTo(Integer value) {
            addCriterion("MainPumpFault <>", value, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultGreaterThan(Integer value) {
            addCriterion("MainPumpFault >", value, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("MainPumpFault >=", value, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultLessThan(Integer value) {
            addCriterion("MainPumpFault <", value, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultLessThanOrEqualTo(Integer value) {
            addCriterion("MainPumpFault <=", value, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultIn(List<Integer> values) {
            addCriterion("MainPumpFault in", values, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultNotIn(List<Integer> values) {
            addCriterion("MainPumpFault not in", values, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultBetween(Integer value1, Integer value2) {
            addCriterion("MainPumpFault between", value1, value2, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpFaultNotBetween(Integer value1, Integer value2) {
            addCriterion("MainPumpFault not between", value1, value2, "mainPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultIsNull() {
            addCriterion("BackupPumpFault is null");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultIsNotNull() {
            addCriterion("BackupPumpFault is not null");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultEqualTo(Integer value) {
            addCriterion("BackupPumpFault =", value, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultNotEqualTo(Integer value) {
            addCriterion("BackupPumpFault <>", value, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultGreaterThan(Integer value) {
            addCriterion("BackupPumpFault >", value, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("BackupPumpFault >=", value, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultLessThan(Integer value) {
            addCriterion("BackupPumpFault <", value, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultLessThanOrEqualTo(Integer value) {
            addCriterion("BackupPumpFault <=", value, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultIn(List<Integer> values) {
            addCriterion("BackupPumpFault in", values, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultNotIn(List<Integer> values) {
            addCriterion("BackupPumpFault not in", values, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultBetween(Integer value1, Integer value2) {
            addCriterion("BackupPumpFault between", value1, value2, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andBackupPumpFaultNotBetween(Integer value1, Integer value2) {
            addCriterion("BackupPumpFault not between", value1, value2, "backupPumpFault");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunIsNull() {
            addCriterion("MainPumpRun is null");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunIsNotNull() {
            addCriterion("MainPumpRun is not null");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunEqualTo(Integer value) {
            addCriterion("MainPumpRun =", value, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunNotEqualTo(Integer value) {
            addCriterion("MainPumpRun <>", value, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunGreaterThan(Integer value) {
            addCriterion("MainPumpRun >", value, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunGreaterThanOrEqualTo(Integer value) {
            addCriterion("MainPumpRun >=", value, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunLessThan(Integer value) {
            addCriterion("MainPumpRun <", value, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunLessThanOrEqualTo(Integer value) {
            addCriterion("MainPumpRun <=", value, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunIn(List<Integer> values) {
            addCriterion("MainPumpRun in", values, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunNotIn(List<Integer> values) {
            addCriterion("MainPumpRun not in", values, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunBetween(Integer value1, Integer value2) {
            addCriterion("MainPumpRun between", value1, value2, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andMainPumpRunNotBetween(Integer value1, Integer value2) {
            addCriterion("MainPumpRun not between", value1, value2, "mainPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunIsNull() {
            addCriterion("BackupPumpRun is null");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunIsNotNull() {
            addCriterion("BackupPumpRun is not null");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunEqualTo(Integer value) {
            addCriterion("BackupPumpRun =", value, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunNotEqualTo(Integer value) {
            addCriterion("BackupPumpRun <>", value, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunGreaterThan(Integer value) {
            addCriterion("BackupPumpRun >", value, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunGreaterThanOrEqualTo(Integer value) {
            addCriterion("BackupPumpRun >=", value, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunLessThan(Integer value) {
            addCriterion("BackupPumpRun <", value, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunLessThanOrEqualTo(Integer value) {
            addCriterion("BackupPumpRun <=", value, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunIn(List<Integer> values) {
            addCriterion("BackupPumpRun in", values, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunNotIn(List<Integer> values) {
            addCriterion("BackupPumpRun not in", values, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunBetween(Integer value1, Integer value2) {
            addCriterion("BackupPumpRun between", value1, value2, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andBackupPumpRunNotBetween(Integer value1, Integer value2) {
            addCriterion("BackupPumpRun not between", value1, value2, "backupPumpRun");
            return (Criteria) this;
        }

        public Criteria andFaultIsNull() {
            addCriterion("Fault is null");
            return (Criteria) this;
        }

        public Criteria andFaultIsNotNull() {
            addCriterion("Fault is not null");
            return (Criteria) this;
        }

        public Criteria andFaultEqualTo(Integer value) {
            addCriterion("Fault =", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotEqualTo(Integer value) {
            addCriterion("Fault <>", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultGreaterThan(Integer value) {
            addCriterion("Fault >", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fault >=", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLessThan(Integer value) {
            addCriterion("Fault <", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLessThanOrEqualTo(Integer value) {
            addCriterion("Fault <=", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultIn(List<Integer> values) {
            addCriterion("Fault in", values, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotIn(List<Integer> values) {
            addCriterion("Fault not in", values, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultBetween(Integer value1, Integer value2) {
            addCriterion("Fault between", value1, value2, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotBetween(Integer value1, Integer value2) {
            addCriterion("Fault not between", value1, value2, "fault");
            return (Criteria) this;
        }

        public Criteria andFullOpenIsNull() {
            addCriterion("FullOpen is null");
            return (Criteria) this;
        }

        public Criteria andFullOpenIsNotNull() {
            addCriterion("FullOpen is not null");
            return (Criteria) this;
        }

        public Criteria andFullOpenEqualTo(Integer value) {
            addCriterion("FullOpen =", value, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullOpenNotEqualTo(Integer value) {
            addCriterion("FullOpen <>", value, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullOpenGreaterThan(Integer value) {
            addCriterion("FullOpen >", value, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("FullOpen >=", value, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullOpenLessThan(Integer value) {
            addCriterion("FullOpen <", value, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullOpenLessThanOrEqualTo(Integer value) {
            addCriterion("FullOpen <=", value, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullOpenIn(List<Integer> values) {
            addCriterion("FullOpen in", values, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullOpenNotIn(List<Integer> values) {
            addCriterion("FullOpen not in", values, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullOpenBetween(Integer value1, Integer value2) {
            addCriterion("FullOpen between", value1, value2, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("FullOpen not between", value1, value2, "fullOpen");
            return (Criteria) this;
        }

        public Criteria andFullCloseIsNull() {
            addCriterion("FullClose is null");
            return (Criteria) this;
        }

        public Criteria andFullCloseIsNotNull() {
            addCriterion("FullClose is not null");
            return (Criteria) this;
        }

        public Criteria andFullCloseEqualTo(Integer value) {
            addCriterion("FullClose =", value, "fullClose");
            return (Criteria) this;
        }

        public Criteria andFullCloseNotEqualTo(Integer value) {
            addCriterion("FullClose <>", value, "fullClose");
            return (Criteria) this;
        }

        public Criteria andFullCloseGreaterThan(Integer value) {
            addCriterion("FullClose >", value, "fullClose");
            return (Criteria) this;
        }

        public Criteria andFullCloseGreaterThanOrEqualTo(Integer value) {
            addCriterion("FullClose >=", value, "fullClose");
            return (Criteria) this;
        }

        public Criteria andFullCloseLessThan(Integer value) {
            addCriterion("FullClose <", value, "fullClose");
            return (Criteria) this;
        }

        public Criteria andFullCloseLessThanOrEqualTo(Integer value) {
            addCriterion("FullClose <=", value, "fullClose");
            return (Criteria) this;
        }

        public Criteria andFullCloseIn(List<Integer> values) {
            addCriterion("FullClose in", values, "fullClose");
            return (Criteria) this;
        }

        public Criteria andFullCloseNotIn(List<Integer> values) {
            addCriterion("FullClose not in", values, "fullClose");
            return (Criteria) this;
        }

        public Criteria andFullCloseBetween(Integer value1, Integer value2) {
            addCriterion("FullClose between", value1, value2, "fullClose");
            return (Criteria) this;
        }

        public Criteria andFullCloseNotBetween(Integer value1, Integer value2) {
            addCriterion("FullClose not between", value1, value2, "fullClose");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoIsNull() {
            addCriterion("ChuanXiao is null");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoIsNotNull() {
            addCriterion("ChuanXiao is not null");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoEqualTo(Integer value) {
            addCriterion("ChuanXiao =", value, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoNotEqualTo(Integer value) {
            addCriterion("ChuanXiao <>", value, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoGreaterThan(Integer value) {
            addCriterion("ChuanXiao >", value, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChuanXiao >=", value, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoLessThan(Integer value) {
            addCriterion("ChuanXiao <", value, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoLessThanOrEqualTo(Integer value) {
            addCriterion("ChuanXiao <=", value, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoIn(List<Integer> values) {
            addCriterion("ChuanXiao in", values, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoNotIn(List<Integer> values) {
            addCriterion("ChuanXiao not in", values, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoBetween(Integer value1, Integer value2) {
            addCriterion("ChuanXiao between", value1, value2, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andChuanXiaoNotBetween(Integer value1, Integer value2) {
            addCriterion("ChuanXiao not between", value1, value2, "chuanXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoIsNull() {
            addCriterion("TuoXiao is null");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoIsNotNull() {
            addCriterion("TuoXiao is not null");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoEqualTo(Integer value) {
            addCriterion("TuoXiao =", value, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoNotEqualTo(Integer value) {
            addCriterion("TuoXiao <>", value, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoGreaterThan(Integer value) {
            addCriterion("TuoXiao >", value, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("TuoXiao >=", value, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoLessThan(Integer value) {
            addCriterion("TuoXiao <", value, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoLessThanOrEqualTo(Integer value) {
            addCriterion("TuoXiao <=", value, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoIn(List<Integer> values) {
            addCriterion("TuoXiao in", values, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoNotIn(List<Integer> values) {
            addCriterion("TuoXiao not in", values, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoBetween(Integer value1, Integer value2) {
            addCriterion("TuoXiao between", value1, value2, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andTuoXiaoNotBetween(Integer value1, Integer value2) {
            addCriterion("TuoXiao not between", value1, value2, "tuoXiao");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveIsNull() {
            addCriterion("LeftOpenValve is null");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveIsNotNull() {
            addCriterion("LeftOpenValve is not null");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveEqualTo(Integer value) {
            addCriterion("LeftOpenValve =", value, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveNotEqualTo(Integer value) {
            addCriterion("LeftOpenValve <>", value, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveGreaterThan(Integer value) {
            addCriterion("LeftOpenValve >", value, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveGreaterThanOrEqualTo(Integer value) {
            addCriterion("LeftOpenValve >=", value, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveLessThan(Integer value) {
            addCriterion("LeftOpenValve <", value, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveLessThanOrEqualTo(Integer value) {
            addCriterion("LeftOpenValve <=", value, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveIn(List<Integer> values) {
            addCriterion("LeftOpenValve in", values, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveNotIn(List<Integer> values) {
            addCriterion("LeftOpenValve not in", values, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveBetween(Integer value1, Integer value2) {
            addCriterion("LeftOpenValve between", value1, value2, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpenValveNotBetween(Integer value1, Integer value2) {
            addCriterion("LeftOpenValve not between", value1, value2, "leftOpenValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveIsNull() {
            addCriterion("LeftCloseValve is null");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveIsNotNull() {
            addCriterion("LeftCloseValve is not null");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveEqualTo(Integer value) {
            addCriterion("LeftCloseValve =", value, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveNotEqualTo(Integer value) {
            addCriterion("LeftCloseValve <>", value, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveGreaterThan(Integer value) {
            addCriterion("LeftCloseValve >", value, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveGreaterThanOrEqualTo(Integer value) {
            addCriterion("LeftCloseValve >=", value, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveLessThan(Integer value) {
            addCriterion("LeftCloseValve <", value, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveLessThanOrEqualTo(Integer value) {
            addCriterion("LeftCloseValve <=", value, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveIn(List<Integer> values) {
            addCriterion("LeftCloseValve in", values, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveNotIn(List<Integer> values) {
            addCriterion("LeftCloseValve not in", values, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveBetween(Integer value1, Integer value2) {
            addCriterion("LeftCloseValve between", value1, value2, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftCloseValveNotBetween(Integer value1, Integer value2) {
            addCriterion("LeftCloseValve not between", value1, value2, "leftCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveIsNull() {
            addCriterion("RightOpenValve is null");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveIsNotNull() {
            addCriterion("RightOpenValve is not null");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveEqualTo(Integer value) {
            addCriterion("RightOpenValve =", value, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveNotEqualTo(Integer value) {
            addCriterion("RightOpenValve <>", value, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveGreaterThan(Integer value) {
            addCriterion("RightOpenValve >", value, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveGreaterThanOrEqualTo(Integer value) {
            addCriterion("RightOpenValve >=", value, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveLessThan(Integer value) {
            addCriterion("RightOpenValve <", value, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveLessThanOrEqualTo(Integer value) {
            addCriterion("RightOpenValve <=", value, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveIn(List<Integer> values) {
            addCriterion("RightOpenValve in", values, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveNotIn(List<Integer> values) {
            addCriterion("RightOpenValve not in", values, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveBetween(Integer value1, Integer value2) {
            addCriterion("RightOpenValve between", value1, value2, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightOpenValveNotBetween(Integer value1, Integer value2) {
            addCriterion("RightOpenValve not between", value1, value2, "rightOpenValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveIsNull() {
            addCriterion("RightCloseValve is null");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveIsNotNull() {
            addCriterion("RightCloseValve is not null");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveEqualTo(Integer value) {
            addCriterion("RightCloseValve =", value, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveNotEqualTo(Integer value) {
            addCriterion("RightCloseValve <>", value, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveGreaterThan(Integer value) {
            addCriterion("RightCloseValve >", value, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveGreaterThanOrEqualTo(Integer value) {
            addCriterion("RightCloseValve >=", value, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveLessThan(Integer value) {
            addCriterion("RightCloseValve <", value, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveLessThanOrEqualTo(Integer value) {
            addCriterion("RightCloseValve <=", value, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveIn(List<Integer> values) {
            addCriterion("RightCloseValve in", values, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveNotIn(List<Integer> values) {
            addCriterion("RightCloseValve not in", values, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveBetween(Integer value1, Integer value2) {
            addCriterion("RightCloseValve between", value1, value2, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andRightCloseValveNotBetween(Integer value1, Integer value2) {
            addCriterion("RightCloseValve not between", value1, value2, "rightCloseValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveIsNull() {
            addCriterion("LeftChuanXiaoValve is null");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveIsNotNull() {
            addCriterion("LeftChuanXiaoValve is not null");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveEqualTo(Integer value) {
            addCriterion("LeftChuanXiaoValve =", value, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveNotEqualTo(Integer value) {
            addCriterion("LeftChuanXiaoValve <>", value, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveGreaterThan(Integer value) {
            addCriterion("LeftChuanXiaoValve >", value, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveGreaterThanOrEqualTo(Integer value) {
            addCriterion("LeftChuanXiaoValve >=", value, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveLessThan(Integer value) {
            addCriterion("LeftChuanXiaoValve <", value, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveLessThanOrEqualTo(Integer value) {
            addCriterion("LeftChuanXiaoValve <=", value, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveIn(List<Integer> values) {
            addCriterion("LeftChuanXiaoValve in", values, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveNotIn(List<Integer> values) {
            addCriterion("LeftChuanXiaoValve not in", values, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveBetween(Integer value1, Integer value2) {
            addCriterion("LeftChuanXiaoValve between", value1, value2, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftChuanXiaoValveNotBetween(Integer value1, Integer value2) {
            addCriterion("LeftChuanXiaoValve not between", value1, value2, "leftChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveIsNull() {
            addCriterion("LeftTuoXiaoValve is null");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveIsNotNull() {
            addCriterion("LeftTuoXiaoValve is not null");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveEqualTo(Integer value) {
            addCriterion("LeftTuoXiaoValve =", value, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveNotEqualTo(Integer value) {
            addCriterion("LeftTuoXiaoValve <>", value, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveGreaterThan(Integer value) {
            addCriterion("LeftTuoXiaoValve >", value, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveGreaterThanOrEqualTo(Integer value) {
            addCriterion("LeftTuoXiaoValve >=", value, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveLessThan(Integer value) {
            addCriterion("LeftTuoXiaoValve <", value, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveLessThanOrEqualTo(Integer value) {
            addCriterion("LeftTuoXiaoValve <=", value, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveIn(List<Integer> values) {
            addCriterion("LeftTuoXiaoValve in", values, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveNotIn(List<Integer> values) {
            addCriterion("LeftTuoXiaoValve not in", values, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveBetween(Integer value1, Integer value2) {
            addCriterion("LeftTuoXiaoValve between", value1, value2, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftTuoXiaoValveNotBetween(Integer value1, Integer value2) {
            addCriterion("LeftTuoXiaoValve not between", value1, value2, "leftTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveIsNull() {
            addCriterion("RightChuanXiaoValve is null");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveIsNotNull() {
            addCriterion("RightChuanXiaoValve is not null");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveEqualTo(Integer value) {
            addCriterion("RightChuanXiaoValve =", value, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveNotEqualTo(Integer value) {
            addCriterion("RightChuanXiaoValve <>", value, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveGreaterThan(Integer value) {
            addCriterion("RightChuanXiaoValve >", value, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveGreaterThanOrEqualTo(Integer value) {
            addCriterion("RightChuanXiaoValve >=", value, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveLessThan(Integer value) {
            addCriterion("RightChuanXiaoValve <", value, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveLessThanOrEqualTo(Integer value) {
            addCriterion("RightChuanXiaoValve <=", value, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveIn(List<Integer> values) {
            addCriterion("RightChuanXiaoValve in", values, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveNotIn(List<Integer> values) {
            addCriterion("RightChuanXiaoValve not in", values, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveBetween(Integer value1, Integer value2) {
            addCriterion("RightChuanXiaoValve between", value1, value2, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightChuanXiaoValveNotBetween(Integer value1, Integer value2) {
            addCriterion("RightChuanXiaoValve not between", value1, value2, "rightChuanXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveIsNull() {
            addCriterion("RightTuoXiaoValve is null");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveIsNotNull() {
            addCriterion("RightTuoXiaoValve is not null");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveEqualTo(Integer value) {
            addCriterion("RightTuoXiaoValve =", value, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveNotEqualTo(Integer value) {
            addCriterion("RightTuoXiaoValve <>", value, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveGreaterThan(Integer value) {
            addCriterion("RightTuoXiaoValve >", value, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveGreaterThanOrEqualTo(Integer value) {
            addCriterion("RightTuoXiaoValve >=", value, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveLessThan(Integer value) {
            addCriterion("RightTuoXiaoValve <", value, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveLessThanOrEqualTo(Integer value) {
            addCriterion("RightTuoXiaoValve <=", value, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveIn(List<Integer> values) {
            addCriterion("RightTuoXiaoValve in", values, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveNotIn(List<Integer> values) {
            addCriterion("RightTuoXiaoValve not in", values, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveBetween(Integer value1, Integer value2) {
            addCriterion("RightTuoXiaoValve between", value1, value2, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andRightTuoXiaoValveNotBetween(Integer value1, Integer value2) {
            addCriterion("RightTuoXiaoValve not between", value1, value2, "rightTuoXiaoValve");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningIsNull() {
            addCriterion("LeftOpening is null");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningIsNotNull() {
            addCriterion("LeftOpening is not null");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningEqualTo(BigDecimal value) {
            addCriterion("LeftOpening =", value, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningNotEqualTo(BigDecimal value) {
            addCriterion("LeftOpening <>", value, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningGreaterThan(BigDecimal value) {
            addCriterion("LeftOpening >", value, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LeftOpening >=", value, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningLessThan(BigDecimal value) {
            addCriterion("LeftOpening <", value, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LeftOpening <=", value, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningIn(List<BigDecimal> values) {
            addCriterion("LeftOpening in", values, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningNotIn(List<BigDecimal> values) {
            addCriterion("LeftOpening not in", values, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LeftOpening between", value1, value2, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andLeftOpeningNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LeftOpening not between", value1, value2, "leftOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningIsNull() {
            addCriterion("RightOpening is null");
            return (Criteria) this;
        }

        public Criteria andRightOpeningIsNotNull() {
            addCriterion("RightOpening is not null");
            return (Criteria) this;
        }

        public Criteria andRightOpeningEqualTo(BigDecimal value) {
            addCriterion("RightOpening =", value, "rightOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningNotEqualTo(BigDecimal value) {
            addCriterion("RightOpening <>", value, "rightOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningGreaterThan(BigDecimal value) {
            addCriterion("RightOpening >", value, "rightOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RightOpening >=", value, "rightOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningLessThan(BigDecimal value) {
            addCriterion("RightOpening <", value, "rightOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RightOpening <=", value, "rightOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningIn(List<BigDecimal> values) {
            addCriterion("RightOpening in", values, "rightOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningNotIn(List<BigDecimal> values) {
            addCriterion("RightOpening not in", values, "rightOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RightOpening between", value1, value2, "rightOpening");
            return (Criteria) this;
        }

        public Criteria andRightOpeningNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RightOpening not between", value1, value2, "rightOpening");
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