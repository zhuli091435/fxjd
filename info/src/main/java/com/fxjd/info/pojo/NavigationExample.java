package com.fxjd.info.pojo;

import java.util.ArrayList;
import java.util.List;

public class NavigationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NavigationExample() {
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

        public Criteria andIcoIsNull() {
            addCriterion("Ico is null");
            return (Criteria) this;
        }

        public Criteria andIcoIsNotNull() {
            addCriterion("Ico is not null");
            return (Criteria) this;
        }

        public Criteria andIcoEqualTo(String value) {
            addCriterion("Ico =", value, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoNotEqualTo(String value) {
            addCriterion("Ico <>", value, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoGreaterThan(String value) {
            addCriterion("Ico >", value, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoGreaterThanOrEqualTo(String value) {
            addCriterion("Ico >=", value, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoLessThan(String value) {
            addCriterion("Ico <", value, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoLessThanOrEqualTo(String value) {
            addCriterion("Ico <=", value, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoLike(String value) {
            addCriterion("Ico like", value, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoNotLike(String value) {
            addCriterion("Ico not like", value, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoIn(List<String> values) {
            addCriterion("Ico in", values, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoNotIn(List<String> values) {
            addCriterion("Ico not in", values, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoBetween(String value1, String value2) {
            addCriterion("Ico between", value1, value2, "ico");
            return (Criteria) this;
        }

        public Criteria andIcoNotBetween(String value1, String value2) {
            addCriterion("Ico not between", value1, value2, "ico");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentIDIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIDEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andParentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentID");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("Url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("Url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("Url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("Url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("Url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("Url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("Url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("Url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("Url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("Url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("Url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("Url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("Url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPermissionsIsNull() {
            addCriterion("Permissions is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsIsNotNull() {
            addCriterion("Permissions is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsEqualTo(String value) {
            addCriterion("Permissions =", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotEqualTo(String value) {
            addCriterion("Permissions <>", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsGreaterThan(String value) {
            addCriterion("Permissions >", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsGreaterThanOrEqualTo(String value) {
            addCriterion("Permissions >=", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsLessThan(String value) {
            addCriterion("Permissions <", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsLessThanOrEqualTo(String value) {
            addCriterion("Permissions <=", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsLike(String value) {
            addCriterion("Permissions like", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotLike(String value) {
            addCriterion("Permissions not like", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsIn(List<String> values) {
            addCriterion("Permissions in", values, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotIn(List<String> values) {
            addCriterion("Permissions not in", values, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsBetween(String value1, String value2) {
            addCriterion("Permissions between", value1, value2, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotBetween(String value1, String value2) {
            addCriterion("Permissions not between", value1, value2, "permissions");
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