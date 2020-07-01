package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoStoreOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoStoreOrderExample() {
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

    public StoStoreOrderExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public StoStoreOrderExample orderBy(String ... orderByClauses) {
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
        StoStoreOrderExample example = new StoStoreOrderExample();
        return example.createCriteria();
    }

    public StoStoreOrderExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public StoStoreOrderExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andStoIdIsNull() {
            addCriterion("STO_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoIdIsNotNull() {
            addCriterion("STO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoIdEqualTo(Integer value) {
            addCriterion("STO_ID =", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STO_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdNotEqualTo(Integer value) {
            addCriterion("STO_ID <>", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STO_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThan(Integer value) {
            addCriterion("STO_ID >", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STO_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STO_ID >=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STO_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdLessThan(Integer value) {
            addCriterion("STO_ID <", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STO_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanOrEqualTo(Integer value) {
            addCriterion("STO_ID <=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STO_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdIn(List<Integer> values) {
            addCriterion("STO_ID in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotIn(List<Integer> values) {
            addCriterion("STO_ID not in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdBetween(Integer value1, Integer value2) {
            addCriterion("STO_ID between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STO_ID not between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andStrIdIsNull() {
            addCriterion("STR_ID is null");
            return (Criteria) this;
        }

        public Criteria andStrIdIsNotNull() {
            addCriterion("STR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStrIdEqualTo(Integer value) {
            addCriterion("STR_ID =", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STR_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdNotEqualTo(Integer value) {
            addCriterion("STR_ID <>", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STR_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThan(Integer value) {
            addCriterion("STR_ID >", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STR_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STR_ID >=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STR_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdLessThan(Integer value) {
            addCriterion("STR_ID <", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STR_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdLessThanOrEqualTo(Integer value) {
            addCriterion("STR_ID <=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STR_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdIn(List<Integer> values) {
            addCriterion("STR_ID in", values, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotIn(List<Integer> values) {
            addCriterion("STR_ID not in", values, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdBetween(Integer value1, Integer value2) {
            addCriterion("STR_ID between", value1, value2, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STR_ID not between", value1, value2, "strId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeIsNull() {
            addCriterion("ORDER_CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeIsNotNull() {
            addCriterion("ORDER_CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeEqualTo(String value) {
            addCriterion("ORDER_CREATED_TIME =", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_CREATED_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeNotEqualTo(String value) {
            addCriterion("ORDER_CREATED_TIME <>", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_CREATED_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeGreaterThan(String value) {
            addCriterion("ORDER_CREATED_TIME >", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_CREATED_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CREATED_TIME >=", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_CREATED_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeLessThan(String value) {
            addCriterion("ORDER_CREATED_TIME <", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_CREATED_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CREATED_TIME <=", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("ORDER_CREATED_TIME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeLike(String value) {
            addCriterion("ORDER_CREATED_TIME like", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeNotLike(String value) {
            addCriterion("ORDER_CREATED_TIME not like", value, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeIn(List<String> values) {
            addCriterion("ORDER_CREATED_TIME in", values, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeNotIn(List<String> values) {
            addCriterion("ORDER_CREATED_TIME not in", values, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeBetween(String value1, String value2) {
            addCriterion("ORDER_CREATED_TIME between", value1, value2, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedTimeNotBetween(String value1, String value2) {
            addCriterion("ORDER_CREATED_TIME not between", value1, value2, "orderCreatedTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNull() {
            addCriterion("PAID_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNotNull() {
            addCriterion("PAID_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeEqualTo(String value) {
            addCriterion("PAID_TIME =", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PAID_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotEqualTo(String value) {
            addCriterion("PAID_TIME <>", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PAID_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThan(String value) {
            addCriterion("PAID_TIME >", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PAID_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PAID_TIME >=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PAID_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThan(String value) {
            addCriterion("PAID_TIME <", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PAID_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanOrEqualTo(String value) {
            addCriterion("PAID_TIME <=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PAID_TIME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPaidTimeLike(String value) {
            addCriterion("PAID_TIME like", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotLike(String value) {
            addCriterion("PAID_TIME not like", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIn(List<String> values) {
            addCriterion("PAID_TIME in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotIn(List<String> values) {
            addCriterion("PAID_TIME not in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeBetween(String value1, String value2) {
            addCriterion("PAID_TIME between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotBetween(String value1, String value2) {
            addCriterion("PAID_TIME not between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNull() {
            addCriterion("LAST_MODIFIED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNotNull() {
            addCriterion("LAST_MODIFIED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeEqualTo(String value) {
            addCriterion("LAST_MODIFIED_TIME =", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_MODIFIED_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotEqualTo(String value) {
            addCriterion("LAST_MODIFIED_TIME <>", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_MODIFIED_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThan(String value) {
            addCriterion("LAST_MODIFIED_TIME >", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_MODIFIED_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_TIME >=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_MODIFIED_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThan(String value) {
            addCriterion("LAST_MODIFIED_TIME <", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_MODIFIED_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_TIME <=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_MODIFIED_TIME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLike(String value) {
            addCriterion("LAST_MODIFIED_TIME like", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotLike(String value) {
            addCriterion("LAST_MODIFIED_TIME not like", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIn(List<String> values) {
            addCriterion("LAST_MODIFIED_TIME in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotIn(List<String> values) {
            addCriterion("LAST_MODIFIED_TIME not in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_TIME between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_TIME not between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATED_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATED_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATED_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATED_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATED_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATED_BY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("CREATION_DATE =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("CREATION_DATE in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("CREATION_DATE not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNull() {
            addCriterion("LAST_UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("LAST_UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLike(String value) {
            addCriterion("LAST_UPDATE_BY like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotLike(String value) {
            addCriterion("LAST_UPDATE_BY not like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY not between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCallCntIsNull() {
            addCriterion("CALL_CNT is null");
            return (Criteria) this;
        }

        public Criteria andCallCntIsNotNull() {
            addCriterion("CALL_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andCallCntEqualTo(Integer value) {
            addCriterion("CALL_CNT =", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CALL_CNT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Integer value) {
            addCriterion("CALL_CNT <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Integer value) {
            addCriterion("CALL_CNT >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CALL_CNT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CALL_CNT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Integer value) {
            addCriterion("CALL_CNT <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CALL_CNT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntIn(List<Integer> values) {
            addCriterion("CALL_CNT in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotIn(List<Integer> values) {
            addCriterion("CALL_CNT not in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntBetween(Integer value1, Integer value2) {
            addCriterion("CALL_CNT between", value1, value2, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotBetween(Integer value1, Integer value2) {
            addCriterion("CALL_CNT not between", value1, value2, "callCnt");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("REMARK = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("REMARK <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("REMARK > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("REMARK >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("REMARK < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("REMARK <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStsCdIsNull() {
            addCriterion("STS_CD is null");
            return (Criteria) this;
        }

        public Criteria andStsCdIsNotNull() {
            addCriterion("STS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andStsCdEqualTo(String value) {
            addCriterion("STS_CD =", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STS_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("STS_CD <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STS_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("STS_CD >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STS_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("STS_CD >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STS_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("STS_CD <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STS_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("STS_CD <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("STS_CD <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLike(String value) {
            addCriterion("STS_CD like", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotLike(String value) {
            addCriterion("STS_CD not like", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdIn(List<String> values) {
            addCriterion("STS_CD in", values, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotIn(List<String> values) {
            addCriterion("STS_CD not in", values, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdBetween(String value1, String value2) {
            addCriterion("STS_CD between", value1, value2, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotBetween(String value1, String value2) {
            addCriterion("STS_CD not between", value1, value2, "stsCd");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeIsNull() {
            addCriterion("PLATEFORM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeIsNotNull() {
            addCriterion("PLATEFORM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeEqualTo(String value) {
            addCriterion("PLATEFORM_TYPE =", value, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PLATEFORM_TYPE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateformTypeNotEqualTo(String value) {
            addCriterion("PLATEFORM_TYPE <>", value, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PLATEFORM_TYPE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateformTypeGreaterThan(String value) {
            addCriterion("PLATEFORM_TYPE >", value, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PLATEFORM_TYPE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateformTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PLATEFORM_TYPE >=", value, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PLATEFORM_TYPE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateformTypeLessThan(String value) {
            addCriterion("PLATEFORM_TYPE <", value, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PLATEFORM_TYPE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateformTypeLessThanOrEqualTo(String value) {
            addCriterion("PLATEFORM_TYPE <=", value, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("PLATEFORM_TYPE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPlateformTypeLike(String value) {
            addCriterion("PLATEFORM_TYPE like", value, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeNotLike(String value) {
            addCriterion("PLATEFORM_TYPE not like", value, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeIn(List<String> values) {
            addCriterion("PLATEFORM_TYPE in", values, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeNotIn(List<String> values) {
            addCriterion("PLATEFORM_TYPE not in", values, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeBetween(String value1, String value2) {
            addCriterion("PLATEFORM_TYPE between", value1, value2, "plateformType");
            return (Criteria) this;
        }

        public Criteria andPlateformTypeNotBetween(String value1, String value2) {
            addCriterion("PLATEFORM_TYPE not between", value1, value2, "plateformType");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateIsNull() {
            addCriterion("CANCEL_COMPLETE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateIsNotNull() {
            addCriterion("CANCEL_COMPLETE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateEqualTo(String value) {
            addCriterion("CANCEL_COMPLETE_DATE =", value, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CANCEL_COMPLETE_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateNotEqualTo(String value) {
            addCriterion("CANCEL_COMPLETE_DATE <>", value, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CANCEL_COMPLETE_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateGreaterThan(String value) {
            addCriterion("CANCEL_COMPLETE_DATE >", value, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CANCEL_COMPLETE_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_COMPLETE_DATE >=", value, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CANCEL_COMPLETE_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateLessThan(String value) {
            addCriterion("CANCEL_COMPLETE_DATE <", value, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CANCEL_COMPLETE_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_COMPLETE_DATE <=", value, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateLessThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("CANCEL_COMPLETE_DATE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateLike(String value) {
            addCriterion("CANCEL_COMPLETE_DATE like", value, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateNotLike(String value) {
            addCriterion("CANCEL_COMPLETE_DATE not like", value, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateIn(List<String> values) {
            addCriterion("CANCEL_COMPLETE_DATE in", values, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateNotIn(List<String> values) {
            addCriterion("CANCEL_COMPLETE_DATE not in", values, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateBetween(String value1, String value2) {
            addCriterion("CANCEL_COMPLETE_DATE between", value1, value2, "cancelCompleteDate");
            return (Criteria) this;
        }

        public Criteria andCancelCompleteDateNotBetween(String value1, String value2) {
            addCriterion("CANCEL_COMPLETE_DATE not between", value1, value2, "cancelCompleteDate");
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

        public Criteria andDeletedEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(StoStoreOrder.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(StoStoreOrder.Column column) {
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
        private StoStoreOrderExample example;

        protected Criteria(StoStoreOrderExample example) {
            super();
            this.example = example;
        }

        public StoStoreOrderExample example() {
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
        void example(StoStoreOrderExample example);
    }
}