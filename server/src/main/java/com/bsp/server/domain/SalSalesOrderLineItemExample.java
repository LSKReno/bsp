package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalSalesOrderLineItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalSalesOrderLineItemExample() {
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

    public SalSalesOrderLineItemExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public SalSalesOrderLineItemExample orderBy(String ... orderByClauses) {
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
        SalSalesOrderLineItemExample example = new SalSalesOrderLineItemExample();
        return example.createCriteria();
    }

    public SalSalesOrderLineItemExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public SalSalesOrderLineItemExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andSalIdIsNull() {
            addCriterion("SAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalIdIsNotNull() {
            addCriterion("SAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalIdEqualTo(Integer value) {
            addCriterion("SAL_ID =", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAL_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalIdNotEqualTo(Integer value) {
            addCriterion("SAL_ID <>", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAL_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalIdGreaterThan(Integer value) {
            addCriterion("SAL_ID >", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAL_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAL_ID >=", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAL_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalIdLessThan(Integer value) {
            addCriterion("SAL_ID <", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAL_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalIdLessThanOrEqualTo(Integer value) {
            addCriterion("SAL_ID <=", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAL_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSalIdIn(List<Integer> values) {
            addCriterion("SAL_ID in", values, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdNotIn(List<Integer> values) {
            addCriterion("SAL_ID not in", values, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdBetween(Integer value1, Integer value2) {
            addCriterion("SAL_ID between", value1, value2, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SAL_ID not between", value1, value2, "salId");
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

        public Criteria andCreatedByEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATED_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
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

        public Criteria andCreationDateEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
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

        public Criteria andLastUpdateByEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
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

        public Criteria andLastUpdateDateEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
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

        public Criteria andCallCntEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Integer value) {
            addCriterion("CALL_CNT <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Integer value) {
            addCriterion("CALL_CNT >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Integer value) {
            addCriterion("CALL_CNT <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("CALL_CNT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
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

        public Criteria andRemarkEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("REMARK = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("REMARK <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("REMARK > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("REMARK >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("REMARK < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
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

        public Criteria andStsCdEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("STS_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("STS_CD <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("STS_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("STS_CD >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("STS_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("STS_CD >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("STS_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("STS_CD <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("STS_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("STS_CD <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
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

        public Criteria andSaoIdIsNull() {
            addCriterion("SAO_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaoIdIsNotNull() {
            addCriterion("SAO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaoIdEqualTo(Integer value) {
            addCriterion("SAO_ID =", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAO_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSaoIdNotEqualTo(Integer value) {
            addCriterion("SAO_ID <>", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAO_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSaoIdGreaterThan(Integer value) {
            addCriterion("SAO_ID >", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAO_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSaoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAO_ID >=", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAO_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSaoIdLessThan(Integer value) {
            addCriterion("SAO_ID <", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAO_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSaoIdLessThanOrEqualTo(Integer value) {
            addCriterion("SAO_ID <=", value, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SAO_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSaoIdIn(List<Integer> values) {
            addCriterion("SAO_ID in", values, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdNotIn(List<Integer> values) {
            addCriterion("SAO_ID not in", values, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdBetween(Integer value1, Integer value2) {
            addCriterion("SAO_ID between", value1, value2, "saoId");
            return (Criteria) this;
        }

        public Criteria andSaoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SAO_ID not between", value1, value2, "saoId");
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

        public Criteria andProIdEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRO_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
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

        public Criteria andQtyIsNull() {
            addCriterion("QTY is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(Integer value) {
            addCriterion("QTY =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("QTY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(Integer value) {
            addCriterion("QTY <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("QTY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(Integer value) {
            addCriterion("QTY >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("QTY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("QTY >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("QTY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(Integer value) {
            addCriterion("QTY <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("QTY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(Integer value) {
            addCriterion("QTY <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("QTY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<Integer> values) {
            addCriterion("QTY in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<Integer> values) {
            addCriterion("QTY not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(Integer value1, Integer value2) {
            addCriterion("QTY between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("QTY not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRICE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRICE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRICE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRICE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRICE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("PRICE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSolIdIsNull() {
            addCriterion("SOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSolIdIsNotNull() {
            addCriterion("SOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSolIdEqualTo(Integer value) {
            addCriterion("SOL_ID =", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SOL_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSolIdNotEqualTo(Integer value) {
            addCriterion("SOL_ID <>", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SOL_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSolIdGreaterThan(Integer value) {
            addCriterion("SOL_ID >", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SOL_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOL_ID >=", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SOL_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSolIdLessThan(Integer value) {
            addCriterion("SOL_ID <", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SOL_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSolIdLessThanOrEqualTo(Integer value) {
            addCriterion("SOL_ID <=", value, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("SOL_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSolIdIn(List<Integer> values) {
            addCriterion("SOL_ID in", values, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdNotIn(List<Integer> values) {
            addCriterion("SOL_ID not in", values, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdBetween(Integer value1, Integer value2) {
            addCriterion("SOL_ID between", value1, value2, "solId");
            return (Criteria) this;
        }

        public Criteria andSolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SOL_ID not between", value1, value2, "solId");
            return (Criteria) this;
        }

        public Criteria andTrackingNoIsNull() {
            addCriterion("TRACKING_NO is null");
            return (Criteria) this;
        }

        public Criteria andTrackingNoIsNotNull() {
            addCriterion("TRACKING_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingNoEqualTo(String value) {
            addCriterion("TRACKING_NO =", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("TRACKING_NO = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNoNotEqualTo(String value) {
            addCriterion("TRACKING_NO <>", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("TRACKING_NO <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNoGreaterThan(String value) {
            addCriterion("TRACKING_NO >", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("TRACKING_NO > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRACKING_NO >=", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("TRACKING_NO >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNoLessThan(String value) {
            addCriterion("TRACKING_NO <", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("TRACKING_NO < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNoLessThanOrEqualTo(String value) {
            addCriterion("TRACKING_NO <=", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("TRACKING_NO <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTrackingNoLike(String value) {
            addCriterion("TRACKING_NO like", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoNotLike(String value) {
            addCriterion("TRACKING_NO not like", value, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoIn(List<String> values) {
            addCriterion("TRACKING_NO in", values, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoNotIn(List<String> values) {
            addCriterion("TRACKING_NO not in", values, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoBetween(String value1, String value2) {
            addCriterion("TRACKING_NO between", value1, value2, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andTrackingNoNotBetween(String value1, String value2) {
            addCriterion("TRACKING_NO not between", value1, value2, "trackingNo");
            return (Criteria) this;
        }

        public Criteria andWspNameIsNull() {
            addCriterion("WSP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWspNameIsNotNull() {
            addCriterion("WSP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWspNameEqualTo(String value) {
            addCriterion("WSP_NAME =", value, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("WSP_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWspNameNotEqualTo(String value) {
            addCriterion("WSP_NAME <>", value, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("WSP_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWspNameGreaterThan(String value) {
            addCriterion("WSP_NAME >", value, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("WSP_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWspNameGreaterThanOrEqualTo(String value) {
            addCriterion("WSP_NAME >=", value, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("WSP_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWspNameLessThan(String value) {
            addCriterion("WSP_NAME <", value, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("WSP_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWspNameLessThanOrEqualTo(String value) {
            addCriterion("WSP_NAME <=", value, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("WSP_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWspNameLike(String value) {
            addCriterion("WSP_NAME like", value, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameNotLike(String value) {
            addCriterion("WSP_NAME not like", value, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameIn(List<String> values) {
            addCriterion("WSP_NAME in", values, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameNotIn(List<String> values) {
            addCriterion("WSP_NAME not in", values, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameBetween(String value1, String value2) {
            addCriterion("WSP_NAME between", value1, value2, "wspName");
            return (Criteria) this;
        }

        public Criteria andWspNameNotBetween(String value1, String value2) {
            addCriterion("WSP_NAME not between", value1, value2, "wspName");
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

        public Criteria andDeletedEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(SalSalesOrderLineItem.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(SalSalesOrderLineItem.Column column) {
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
        private SalSalesOrderLineItemExample example;

        protected Criteria(SalSalesOrderLineItemExample example) {
            super();
            this.example = example;
        }

        public SalSalesOrderLineItemExample example() {
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
        void example(SalSalesOrderLineItemExample example);
    }
}