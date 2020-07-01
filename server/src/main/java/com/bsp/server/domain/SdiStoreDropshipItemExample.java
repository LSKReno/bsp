package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SdiStoreDropshipItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SdiStoreDropshipItemExample() {
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

    public SdiStoreDropshipItemExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SdiStoreDropshipItemExample orderBy(String ... orderByClauses) {
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
        SdiStoreDropshipItemExample example = new SdiStoreDropshipItemExample();
        return example.createCriteria();
    }

    public SdiStoreDropshipItemExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SdiStoreDropshipItemExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andDilIdIsNull() {
            addCriterion("DIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDilIdIsNotNull() {
            addCriterion("DIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDilIdEqualTo(Integer value) {
            addCriterion("DIL_ID =", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DIL_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDilIdNotEqualTo(Integer value) {
            addCriterion("DIL_ID <>", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DIL_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDilIdGreaterThan(Integer value) {
            addCriterion("DIL_ID >", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DIL_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDilIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIL_ID >=", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DIL_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDilIdLessThan(Integer value) {
            addCriterion("DIL_ID <", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DIL_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDilIdLessThanOrEqualTo(Integer value) {
            addCriterion("DIL_ID <=", value, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DIL_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDilIdIn(List<Integer> values) {
            addCriterion("DIL_ID in", values, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdNotIn(List<Integer> values) {
            addCriterion("DIL_ID not in", values, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdBetween(Integer value1, Integer value2) {
            addCriterion("DIL_ID between", value1, value2, "dilId");
            return (Criteria) this;
        }

        public Criteria andDilIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DIL_ID not between", value1, value2, "dilId");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("PRO_ID =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("PRO_ID in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("PRO_ID not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_ID between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_ID not between", value1, value2, "proId");
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

        public Criteria andStrIdEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STR_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdNotEqualTo(Integer value) {
            addCriterion("STR_ID <>", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STR_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThan(Integer value) {
            addCriterion("STR_ID >", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STR_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STR_ID >=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STR_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdLessThan(Integer value) {
            addCriterion("STR_ID <", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STR_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStrIdLessThanOrEqualTo(Integer value) {
            addCriterion("STR_ID <=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
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

        public Criteria andStoreRetentionIsNull() {
            addCriterion("STORE_RETENTION is null");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionIsNotNull() {
            addCriterion("STORE_RETENTION is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionEqualTo(Integer value) {
            addCriterion("STORE_RETENTION =", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STORE_RETENTION = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoreRetentionNotEqualTo(Integer value) {
            addCriterion("STORE_RETENTION <>", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STORE_RETENTION <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoreRetentionGreaterThan(Integer value) {
            addCriterion("STORE_RETENTION >", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STORE_RETENTION > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoreRetentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("STORE_RETENTION >=", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STORE_RETENTION >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoreRetentionLessThan(Integer value) {
            addCriterion("STORE_RETENTION <", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STORE_RETENTION < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoreRetentionLessThanOrEqualTo(Integer value) {
            addCriterion("STORE_RETENTION <=", value, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STORE_RETENTION <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoreRetentionIn(List<Integer> values) {
            addCriterion("STORE_RETENTION in", values, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionNotIn(List<Integer> values) {
            addCriterion("STORE_RETENTION not in", values, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionBetween(Integer value1, Integer value2) {
            addCriterion("STORE_RETENTION between", value1, value2, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andStoreRetentionNotBetween(Integer value1, Integer value2) {
            addCriterion("STORE_RETENTION not between", value1, value2, "storeRetention");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceIsNull() {
            addCriterion("DROPSHIP_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceIsNotNull() {
            addCriterion("DROPSHIP_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceEqualTo(BigDecimal value) {
            addCriterion("DROPSHIP_PRICE =", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_PRICE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipPriceNotEqualTo(BigDecimal value) {
            addCriterion("DROPSHIP_PRICE <>", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_PRICE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipPriceGreaterThan(BigDecimal value) {
            addCriterion("DROPSHIP_PRICE >", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_PRICE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DROPSHIP_PRICE >=", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_PRICE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipPriceLessThan(BigDecimal value) {
            addCriterion("DROPSHIP_PRICE <", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_PRICE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DROPSHIP_PRICE <=", value, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_PRICE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipPriceIn(List<BigDecimal> values) {
            addCriterion("DROPSHIP_PRICE in", values, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceNotIn(List<BigDecimal> values) {
            addCriterion("DROPSHIP_PRICE not in", values, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DROPSHIP_PRICE between", value1, value2, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DROPSHIP_PRICE not between", value1, value2, "dropshipPrice");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusIsNull() {
            addCriterion("DROPSHIP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusIsNotNull() {
            addCriterion("DROPSHIP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusEqualTo(String value) {
            addCriterion("DROPSHIP_STATUS =", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_STATUS = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipStatusNotEqualTo(String value) {
            addCriterion("DROPSHIP_STATUS <>", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_STATUS <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipStatusGreaterThan(String value) {
            addCriterion("DROPSHIP_STATUS >", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_STATUS > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DROPSHIP_STATUS >=", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_STATUS >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipStatusLessThan(String value) {
            addCriterion("DROPSHIP_STATUS <", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_STATUS < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipStatusLessThanOrEqualTo(String value) {
            addCriterion("DROPSHIP_STATUS <=", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("DROPSHIP_STATUS <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDropshipStatusLike(String value) {
            addCriterion("DROPSHIP_STATUS like", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusNotLike(String value) {
            addCriterion("DROPSHIP_STATUS not like", value, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusIn(List<String> values) {
            addCriterion("DROPSHIP_STATUS in", values, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusNotIn(List<String> values) {
            addCriterion("DROPSHIP_STATUS not in", values, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusBetween(String value1, String value2) {
            addCriterion("DROPSHIP_STATUS between", value1, value2, "dropshipStatus");
            return (Criteria) this;
        }

        public Criteria andDropshipStatusNotBetween(String value1, String value2) {
            addCriterion("DROPSHIP_STATUS not between", value1, value2, "dropshipStatus");
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

        public Criteria andCreatedByEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
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

        public Criteria andCreationDateEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
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

        public Criteria andLastUpdateByEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
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

        public Criteria andCallCntEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Integer value) {
            addCriterion("CALL_CNT <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Integer value) {
            addCriterion("CALL_CNT >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Integer value) {
            addCriterion("CALL_CNT <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
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

        public Criteria andLastUpdateDateEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
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

        public Criteria andRemarkEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("REMARK = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("REMARK <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("REMARK > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("REMARK >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("REMARK < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
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

        public Criteria andStsCdEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STS_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("STS_CD <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STS_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("STS_CD >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STS_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("STS_CD >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STS_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("STS_CD <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("STS_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("STS_CD <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
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

        public Criteria andShelfStockIsNull() {
            addCriterion("SHELF_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andShelfStockIsNotNull() {
            addCriterion("SHELF_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andShelfStockEqualTo(Integer value) {
            addCriterion("SHELF_STOCK =", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("SHELF_STOCK = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShelfStockNotEqualTo(Integer value) {
            addCriterion("SHELF_STOCK <>", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("SHELF_STOCK <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShelfStockGreaterThan(Integer value) {
            addCriterion("SHELF_STOCK >", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("SHELF_STOCK > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShelfStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHELF_STOCK >=", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("SHELF_STOCK >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShelfStockLessThan(Integer value) {
            addCriterion("SHELF_STOCK <", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("SHELF_STOCK < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShelfStockLessThanOrEqualTo(Integer value) {
            addCriterion("SHELF_STOCK <=", value, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("SHELF_STOCK <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShelfStockIn(List<Integer> values) {
            addCriterion("SHELF_STOCK in", values, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockNotIn(List<Integer> values) {
            addCriterion("SHELF_STOCK not in", values, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockBetween(Integer value1, Integer value2) {
            addCriterion("SHELF_STOCK between", value1, value2, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andShelfStockNotBetween(Integer value1, Integer value2) {
            addCriterion("SHELF_STOCK not between", value1, value2, "shelfStock");
            return (Criteria) this;
        }

        public Criteria andPreferDateIsNull() {
            addCriterion("PREFER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPreferDateIsNotNull() {
            addCriterion("PREFER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPreferDateEqualTo(Date value) {
            addCriterion("PREFER_DATE =", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PREFER_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreferDateNotEqualTo(Date value) {
            addCriterion("PREFER_DATE <>", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PREFER_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreferDateGreaterThan(Date value) {
            addCriterion("PREFER_DATE >", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PREFER_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreferDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PREFER_DATE >=", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PREFER_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreferDateLessThan(Date value) {
            addCriterion("PREFER_DATE <", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PREFER_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreferDateLessThanOrEqualTo(Date value) {
            addCriterion("PREFER_DATE <=", value, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("PREFER_DATE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPreferDateIn(List<Date> values) {
            addCriterion("PREFER_DATE in", values, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateNotIn(List<Date> values) {
            addCriterion("PREFER_DATE not in", values, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateBetween(Date value1, Date value2) {
            addCriterion("PREFER_DATE between", value1, value2, "preferDate");
            return (Criteria) this;
        }

        public Criteria andPreferDateNotBetween(Date value1, Date value2) {
            addCriterion("PREFER_DATE not between", value1, value2, "preferDate");
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

        public Criteria andDeletedEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(SdiStoreDropshipItem.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(SdiStoreDropshipItem.Column column) {
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
        private SdiStoreDropshipItemExample example;

        protected Criteria(SdiStoreDropshipItemExample example) {
            super();
            this.example = example;
        }

        public SdiStoreDropshipItemExample example() {
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
        void example(SdiStoreDropshipItemExample example);
    }
}