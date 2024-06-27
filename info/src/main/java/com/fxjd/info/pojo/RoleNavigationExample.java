package com.fxjd.info.pojo;

import java.util.ArrayList;
import java.util.List;

public class RoleNavigationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleNavigationExample() {
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

        public Criteria andRoleIDIsNull() {
            addCriterion("RoleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIDIsNotNull() {
            addCriterion("RoleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIDEqualTo(Integer value) {
            addCriterion("RoleID =", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotEqualTo(Integer value) {
            addCriterion("RoleID <>", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDGreaterThan(Integer value) {
            addCriterion("RoleID >", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("RoleID >=", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDLessThan(Integer value) {
            addCriterion("RoleID <", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDLessThanOrEqualTo(Integer value) {
            addCriterion("RoleID <=", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDIn(List<Integer> values) {
            addCriterion("RoleID in", values, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotIn(List<Integer> values) {
            addCriterion("RoleID not in", values, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDBetween(Integer value1, Integer value2) {
            addCriterion("RoleID between", value1, value2, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotBetween(Integer value1, Integer value2) {
            addCriterion("RoleID not between", value1, value2, "roleID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDIsNull() {
            addCriterion("NavigationID is null");
            return (Criteria) this;
        }

        public Criteria andNavigationIDIsNotNull() {
            addCriterion("NavigationID is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationIDEqualTo(Integer value) {
            addCriterion("NavigationID =", value, "navigationID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDNotEqualTo(Integer value) {
            addCriterion("NavigationID <>", value, "navigationID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDGreaterThan(Integer value) {
            addCriterion("NavigationID >", value, "navigationID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("NavigationID >=", value, "navigationID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDLessThan(Integer value) {
            addCriterion("NavigationID <", value, "navigationID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDLessThanOrEqualTo(Integer value) {
            addCriterion("NavigationID <=", value, "navigationID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDIn(List<Integer> values) {
            addCriterion("NavigationID in", values, "navigationID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDNotIn(List<Integer> values) {
            addCriterion("NavigationID not in", values, "navigationID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDBetween(Integer value1, Integer value2) {
            addCriterion("NavigationID between", value1, value2, "navigationID");
            return (Criteria) this;
        }

        public Criteria andNavigationIDNotBetween(Integer value1, Integer value2) {
            addCriterion("NavigationID not between", value1, value2, "navigationID");
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