package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public SysUserExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SysUserExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        SysUserExample example = new SysUserExample();
        return example.createCriteria();
    }

    public SysUserExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SysUserExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USER_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USER_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USER_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USER_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USER_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USER_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USERNAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USERNAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USERNAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USERNAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USERNAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("USERNAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`PASSWORD` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`PASSWORD` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`PASSWORD` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`PASSWORD` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`PASSWORD` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`PASSWORD` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`PASSWORD` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`PASSWORD` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`PASSWORD` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`PASSWORD` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`PASSWORD` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`PASSWORD` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`PASSWORD` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`PASSWORD` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`PASSWORD` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`PASSWORD` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`PASSWORD` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`PASSWORD` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`PASSWORD` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`PASSWORD` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`NAME` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`NAME` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`NAME` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NAME` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`NAME` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NAME` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`NAME` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NAME` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`NAME` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NAME` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`NAME` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NAME` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`NAME` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NAME` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`NAME` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`NAME` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`NAME` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`NAME` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`NAME` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`NAME` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRightsIsNull() {
            addCriterion("RIGHTS is null");
            return (Criteria) this;
        }

        public Criteria andRightsIsNotNull() {
            addCriterion("RIGHTS is not null");
            return (Criteria) this;
        }

        public Criteria andRightsEqualTo(String value) {
            addCriterion("RIGHTS =", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("RIGHTS = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRightsNotEqualTo(String value) {
            addCriterion("RIGHTS <>", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("RIGHTS <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRightsGreaterThan(String value) {
            addCriterion("RIGHTS >", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("RIGHTS > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRightsGreaterThanOrEqualTo(String value) {
            addCriterion("RIGHTS >=", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("RIGHTS >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRightsLessThan(String value) {
            addCriterion("RIGHTS <", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("RIGHTS < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRightsLessThanOrEqualTo(String value) {
            addCriterion("RIGHTS <=", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("RIGHTS <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRightsLike(String value) {
            addCriterion("RIGHTS like", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotLike(String value) {
            addCriterion("RIGHTS not like", value, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsIn(List<String> values) {
            addCriterion("RIGHTS in", values, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotIn(List<String> values) {
            addCriterion("RIGHTS not in", values, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsBetween(String value1, String value2) {
            addCriterion("RIGHTS between", value1, value2, "rights");
            return (Criteria) this;
        }

        public Criteria andRightsNotBetween(String value1, String value2) {
            addCriterion("RIGHTS not between", value1, value2, "rights");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("ROLE_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("ROLE_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("ROLE_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("ROLE_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("ROLE_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("ROLE_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("ROLE_ID like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("ROLE_ID not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNull() {
            addCriterion("LAST_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {
            addCriterion("LAST_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(String value) {
            addCriterion("LAST_LOGIN =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("LAST_LOGIN = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(String value) {
            addCriterion("LAST_LOGIN <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("LAST_LOGIN <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(String value) {
            addCriterion("LAST_LOGIN >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("LAST_LOGIN > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("LAST_LOGIN >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(String value) {
            addCriterion("LAST_LOGIN <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("LAST_LOGIN < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("LAST_LOGIN <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastLoginLike(String value) {
            addCriterion("LAST_LOGIN like", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotLike(String value) {
            addCriterion("LAST_LOGIN not like", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<String> values) {
            addCriterion("LAST_LOGIN in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<String> values) {
            addCriterion("LAST_LOGIN not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("IP = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("IP <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("IP > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("IP >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("IP < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("IP <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`STATUS` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`STATUS` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`STATUS` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`STATUS` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`STATUS` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`STATUS` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`STATUS` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`STATUS` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`STATUS` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`STATUS` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`STATUS` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`STATUS` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`STATUS` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`STATUS` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`STATUS` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`STATUS` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`STATUS` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`STATUS` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`STATUS` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`STATUS` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("BZ = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("BZ <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("BZ > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("BZ >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("BZ < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("BZ <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andSkinIsNull() {
            addCriterion("SKIN is null");
            return (Criteria) this;
        }

        public Criteria andSkinIsNotNull() {
            addCriterion("SKIN is not null");
            return (Criteria) this;
        }

        public Criteria andSkinEqualTo(String value) {
            addCriterion("SKIN =", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("SKIN = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkinNotEqualTo(String value) {
            addCriterion("SKIN <>", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("SKIN <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThan(String value) {
            addCriterion("SKIN >", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("SKIN > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThanOrEqualTo(String value) {
            addCriterion("SKIN >=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("SKIN >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkinLessThan(String value) {
            addCriterion("SKIN <", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("SKIN < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkinLessThanOrEqualTo(String value) {
            addCriterion("SKIN <=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("SKIN <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkinLike(String value) {
            addCriterion("SKIN like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotLike(String value) {
            addCriterion("SKIN not like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinIn(List<String> values) {
            addCriterion("SKIN in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotIn(List<String> values) {
            addCriterion("SKIN not in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinBetween(String value1, String value2) {
            addCriterion("SKIN between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotBetween(String value1, String value2) {
            addCriterion("SKIN not between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("EMAIL = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("EMAIL <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("EMAIL > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("EMAIL >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("EMAIL < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("EMAIL <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("`NUMBER` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`NUMBER` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("`NUMBER` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NUMBER` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("`NUMBER` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NUMBER` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("`NUMBER` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NUMBER` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("`NUMBER` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NUMBER` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("`NUMBER` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NUMBER` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("`NUMBER` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("`NUMBER` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("`NUMBER` like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("`NUMBER` not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("`NUMBER` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("`NUMBER` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("`NUMBER` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("`NUMBER` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("PHONE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("PHONE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("PHONE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("PHONE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("PHONE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("PHONE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdIsNull() {
            addCriterion("MAN_BUYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdIsNotNull() {
            addCriterion("MAN_BUYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdEqualTo(Integer value) {
            addCriterion("MAN_BUYER_ID =", value, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("MAN_BUYER_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManBuyerIdNotEqualTo(Integer value) {
            addCriterion("MAN_BUYER_ID <>", value, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("MAN_BUYER_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManBuyerIdGreaterThan(Integer value) {
            addCriterion("MAN_BUYER_ID >", value, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("MAN_BUYER_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAN_BUYER_ID >=", value, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("MAN_BUYER_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManBuyerIdLessThan(Integer value) {
            addCriterion("MAN_BUYER_ID <", value, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("MAN_BUYER_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("MAN_BUYER_ID <=", value, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("MAN_BUYER_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManBuyerIdIn(List<Integer> values) {
            addCriterion("MAN_BUYER_ID in", values, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdNotIn(List<Integer> values) {
            addCriterion("MAN_BUYER_ID not in", values, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdBetween(Integer value1, Integer value2) {
            addCriterion("MAN_BUYER_ID between", value1, value2, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andManBuyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MAN_BUYER_ID not between", value1, value2, "manBuyerId");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(SysUser.Column column) {
            addCriterion(new StringBuilder("deleted <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private SysUserExample example;

        protected Criteria(SysUserExample example) {
            super();
            this.example = example;
        }

        public SysUserExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
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

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.bsp.server.domain.SysUserExample example);
    }
}