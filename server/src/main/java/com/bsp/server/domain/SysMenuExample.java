package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuExample() {
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

    public SysMenuExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SysMenuExample orderBy(String ... orderByClauses) {
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
        SysMenuExample example = new SysMenuExample();
        return example.createCriteria();
    }

    public SysMenuExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SysMenuExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuTitleIsNull() {
            addCriterion("MENU_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andMenuTitleIsNotNull() {
            addCriterion("MENU_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTitleEqualTo(String value) {
            addCriterion("MENU_TITLE =", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TITLE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotEqualTo(String value) {
            addCriterion("MENU_TITLE <>", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TITLE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTitleGreaterThan(String value) {
            addCriterion("MENU_TITLE >", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TITLE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTitleGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_TITLE >=", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TITLE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTitleLessThan(String value) {
            addCriterion("MENU_TITLE <", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TITLE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTitleLessThanOrEqualTo(String value) {
            addCriterion("MENU_TITLE <=", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TITLE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTitleLike(String value) {
            addCriterion("MENU_TITLE like", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotLike(String value) {
            addCriterion("MENU_TITLE not like", value, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleIn(List<String> values) {
            addCriterion("MENU_TITLE in", values, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotIn(List<String> values) {
            addCriterion("MENU_TITLE not in", values, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleBetween(String value1, String value2) {
            addCriterion("MENU_TITLE between", value1, value2, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuTitleNotBetween(String value1, String value2) {
            addCriterion("MENU_TITLE not between", value1, value2, "menuTitle");
            return (Criteria) this;
        }

        public Criteria andMenuKeyIsNull() {
            addCriterion("MENU_KEY is null");
            return (Criteria) this;
        }

        public Criteria andMenuKeyIsNotNull() {
            addCriterion("MENU_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andMenuKeyEqualTo(String value) {
            addCriterion("MENU_KEY =", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_KEY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotEqualTo(String value) {
            addCriterion("MENU_KEY <>", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_KEY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuKeyGreaterThan(String value) {
            addCriterion("MENU_KEY >", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_KEY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuKeyGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_KEY >=", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_KEY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuKeyLessThan(String value) {
            addCriterion("MENU_KEY <", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_KEY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuKeyLessThanOrEqualTo(String value) {
            addCriterion("MENU_KEY <=", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_KEY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuKeyLike(String value) {
            addCriterion("MENU_KEY like", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotLike(String value) {
            addCriterion("MENU_KEY not like", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyIn(List<String> values) {
            addCriterion("MENU_KEY in", values, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotIn(List<String> values) {
            addCriterion("MENU_KEY not in", values, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyBetween(String value1, String value2) {
            addCriterion("MENU_KEY between", value1, value2, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotBetween(String value1, String value2) {
            addCriterion("MENU_KEY not between", value1, value2, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andComponentIsNull() {
            addCriterion("COMPONENT is null");
            return (Criteria) this;
        }

        public Criteria andComponentIsNotNull() {
            addCriterion("COMPONENT is not null");
            return (Criteria) this;
        }

        public Criteria andComponentEqualTo(String value) {
            addCriterion("COMPONENT =", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("COMPONENT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andComponentNotEqualTo(String value) {
            addCriterion("COMPONENT <>", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("COMPONENT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThan(String value) {
            addCriterion("COMPONENT >", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("COMPONENT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThanOrEqualTo(String value) {
            addCriterion("COMPONENT >=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("COMPONENT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andComponentLessThan(String value) {
            addCriterion("COMPONENT <", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("COMPONENT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andComponentLessThanOrEqualTo(String value) {
            addCriterion("COMPONENT <=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("COMPONENT <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andComponentLike(String value) {
            addCriterion("COMPONENT like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotLike(String value) {
            addCriterion("COMPONENT not like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentIn(List<String> values) {
            addCriterion("COMPONENT in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotIn(List<String> values) {
            addCriterion("COMPONENT not in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentBetween(String value1, String value2) {
            addCriterion("COMPONENT between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotBetween(String value1, String value2) {
            addCriterion("COMPONENT not between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNull() {
            addCriterion("PERMISSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("PERMISSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(String value) {
            addCriterion("PERMISSION_ID =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(String value) {
            addCriterion("PERMISSION_ID <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(String value) {
            addCriterion("PERMISSION_ID >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_ID >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(String value) {
            addCriterion("PERMISSION_ID <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_ID <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionIdLike(String value) {
            addCriterion("PERMISSION_ID like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotLike(String value) {
            addCriterion("PERMISSION_ID not like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<String> values) {
            addCriterion("PERMISSION_ID in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<String> values) {
            addCriterion("PERMISSION_ID not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(String value1, String value2) {
            addCriterion("PERMISSION_ID between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_ID not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("PERMISSION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("PERMISSION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("PERMISSION_NAME =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("PERMISSION_NAME <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("PERMISSION_NAME >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_NAME >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("PERMISSION_NAME <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_NAME <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PERMISSION_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("PERMISSION_NAME like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("PERMISSION_NAME not like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<String> values) {
            addCriterion("PERMISSION_NAME in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<String> values) {
            addCriterion("PERMISSION_NAME not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("PERMISSION_NAME between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_NAME not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("MENU_URL is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("MENU_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("MENU_URL =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_URL = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("MENU_URL <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_URL <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("MENU_URL >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_URL > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_URL >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_URL >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("MENU_URL <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_URL < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("MENU_URL <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_URL <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("MENU_URL like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("MENU_URL not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("MENU_URL in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("MENU_URL not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("MENU_URL between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("MENU_URL not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PARENT_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PARENT_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PARENT_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PARENT_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PARENT_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("PARENT_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIsNull() {
            addCriterion("MENU_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIsNotNull() {
            addCriterion("MENU_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andMenuOrderEqualTo(String value) {
            addCriterion("MENU_ORDER =", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ORDER = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotEqualTo(String value) {
            addCriterion("MENU_ORDER <>", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ORDER <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThan(String value) {
            addCriterion("MENU_ORDER >", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ORDER > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ORDER >=", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ORDER >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThan(String value) {
            addCriterion("MENU_ORDER <", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ORDER < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThanOrEqualTo(String value) {
            addCriterion("MENU_ORDER <=", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ORDER <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuOrderLike(String value) {
            addCriterion("MENU_ORDER like", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotLike(String value) {
            addCriterion("MENU_ORDER not like", value, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderIn(List<String> values) {
            addCriterion("MENU_ORDER in", values, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotIn(List<String> values) {
            addCriterion("MENU_ORDER not in", values, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderBetween(String value1, String value2) {
            addCriterion("MENU_ORDER between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuOrderNotBetween(String value1, String value2) {
            addCriterion("MENU_ORDER not between", value1, value2, "menuOrder");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNull() {
            addCriterion("MENU_ICON is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNotNull() {
            addCriterion("MENU_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconEqualTo(String value) {
            addCriterion("MENU_ICON =", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ICON = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIconNotEqualTo(String value) {
            addCriterion("MENU_ICON <>", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ICON <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThan(String value) {
            addCriterion("MENU_ICON >", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ICON > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ICON >=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ICON >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThan(String value) {
            addCriterion("MENU_ICON <", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ICON < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanOrEqualTo(String value) {
            addCriterion("MENU_ICON <=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_ICON <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuIconLike(String value) {
            addCriterion("MENU_ICON like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotLike(String value) {
            addCriterion("MENU_ICON not like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconIn(List<String> values) {
            addCriterion("MENU_ICON in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotIn(List<String> values) {
            addCriterion("MENU_ICON not in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconBetween(String value1, String value2) {
            addCriterion("MENU_ICON between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotBetween(String value1, String value2) {
            addCriterion("MENU_ICON not between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("MENU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("MENU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("MENU_TYPE =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TYPE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("MENU_TYPE <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TYPE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("MENU_TYPE >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TYPE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TYPE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("MENU_TYPE <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TYPE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_TYPE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("MENU_TYPE like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("MENU_TYPE not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("MENU_TYPE in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("MENU_TYPE not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("MENU_TYPE between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("MENU_TYPE not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectIsNull() {
            addCriterion("MENU_REDIRECT is null");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectIsNotNull() {
            addCriterion("MENU_REDIRECT is not null");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectEqualTo(String value) {
            addCriterion("MENU_REDIRECT =", value, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_REDIRECT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuRedirectNotEqualTo(String value) {
            addCriterion("MENU_REDIRECT <>", value, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_REDIRECT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuRedirectGreaterThan(String value) {
            addCriterion("MENU_REDIRECT >", value, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_REDIRECT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuRedirectGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_REDIRECT >=", value, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_REDIRECT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuRedirectLessThan(String value) {
            addCriterion("MENU_REDIRECT <", value, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_REDIRECT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuRedirectLessThanOrEqualTo(String value) {
            addCriterion("MENU_REDIRECT <=", value, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_REDIRECT <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuRedirectLike(String value) {
            addCriterion("MENU_REDIRECT like", value, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectNotLike(String value) {
            addCriterion("MENU_REDIRECT not like", value, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectIn(List<String> values) {
            addCriterion("MENU_REDIRECT in", values, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectNotIn(List<String> values) {
            addCriterion("MENU_REDIRECT not in", values, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectBetween(String value1, String value2) {
            addCriterion("MENU_REDIRECT between", value1, value2, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuRedirectNotBetween(String value1, String value2) {
            addCriterion("MENU_REDIRECT not between", value1, value2, "menuRedirect");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataIsNull() {
            addCriterion("MENU_METADATA is null");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataIsNotNull() {
            addCriterion("MENU_METADATA is not null");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataEqualTo(String value) {
            addCriterion("MENU_METADATA =", value, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_METADATA = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuMetadataNotEqualTo(String value) {
            addCriterion("MENU_METADATA <>", value, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_METADATA <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuMetadataGreaterThan(String value) {
            addCriterion("MENU_METADATA >", value, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_METADATA > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuMetadataGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_METADATA >=", value, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_METADATA >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuMetadataLessThan(String value) {
            addCriterion("MENU_METADATA <", value, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_METADATA < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuMetadataLessThanOrEqualTo(String value) {
            addCriterion("MENU_METADATA <=", value, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataLessThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("MENU_METADATA <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMenuMetadataLike(String value) {
            addCriterion("MENU_METADATA like", value, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataNotLike(String value) {
            addCriterion("MENU_METADATA not like", value, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataIn(List<String> values) {
            addCriterion("MENU_METADATA in", values, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataNotIn(List<String> values) {
            addCriterion("MENU_METADATA not in", values, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataBetween(String value1, String value2) {
            addCriterion("MENU_METADATA between", value1, value2, "menuMetadata");
            return (Criteria) this;
        }

        public Criteria andMenuMetadataNotBetween(String value1, String value2) {
            addCriterion("MENU_METADATA not between", value1, value2, "menuMetadata");
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

        public Criteria andDeletedEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(SysMenu.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(SysMenu.Column column) {
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
        private SysMenuExample example;

        protected Criteria(SysMenuExample example) {
            super();
            this.example = example;
        }

        public SysMenuExample example() {
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
        void example(com.bsp.server.domain.SysMenuExample example);
    }
}