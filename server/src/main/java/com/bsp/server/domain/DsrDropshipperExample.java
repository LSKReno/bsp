package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DsrDropshipperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DsrDropshipperExample() {
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

    public DsrDropshipperExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public DsrDropshipperExample orderBy(String ... orderByClauses) {
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
        DsrDropshipperExample example = new DsrDropshipperExample();
        return example.createCriteria();
    }

    public DsrDropshipperExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public DsrDropshipperExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andDsrIdIsNull() {
            addCriterion("DSR_ID is null");
            return (Criteria) this;
        }

        public Criteria andDsrIdIsNotNull() {
            addCriterion("DSR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDsrIdEqualTo(Integer value) {
            addCriterion("DSR_ID =", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("DSR_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdNotEqualTo(Integer value) {
            addCriterion("DSR_ID <>", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("DSR_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdGreaterThan(Integer value) {
            addCriterion("DSR_ID >", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("DSR_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DSR_ID >=", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("DSR_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdLessThan(Integer value) {
            addCriterion("DSR_ID <", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("DSR_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdLessThanOrEqualTo(Integer value) {
            addCriterion("DSR_ID <=", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdLessThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("DSR_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdIn(List<Integer> values) {
            addCriterion("DSR_ID in", values, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdNotIn(List<Integer> values) {
            addCriterion("DSR_ID not in", values, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdBetween(Integer value1, Integer value2) {
            addCriterion("DSR_ID between", value1, value2, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DSR_ID not between", value1, value2, "dsrId");
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

        public Criteria andNameEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("`NAME` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`NAME` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("`NAME` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`NAME` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("`NAME` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`NAME` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("`NAME` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`NAME` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("`NAME` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`NAME` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualToColumn(DsrDropshipper.Column column) {
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

        public Criteria andCreatedByEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATED_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATED_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATED_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATED_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATED_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(DsrDropshipper.Column column) {
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

        public Criteria andCreationDateEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualToColumn(DsrDropshipper.Column column) {
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

        public Criteria andLastUpdateByEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(DsrDropshipper.Column column) {
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

        public Criteria andLastUpdateDateEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualToColumn(DsrDropshipper.Column column) {
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

        public Criteria andCallCntEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CALL_CNT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Integer value) {
            addCriterion("CALL_CNT <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Integer value) {
            addCriterion("CALL_CNT >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CALL_CNT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CALL_CNT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Integer value) {
            addCriterion("CALL_CNT <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("CALL_CNT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualToColumn(DsrDropshipper.Column column) {
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

        public Criteria andRemarkEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REMARK = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REMARK <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REMARK > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REMARK >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REMARK < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(DsrDropshipper.Column column) {
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

        public Criteria andStsCdEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("STS_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("STS_CD <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("STS_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("STS_CD >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("STS_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("STS_CD >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("STS_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("STS_CD <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("STS_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("STS_CD <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualToColumn(DsrDropshipper.Column column) {
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

        public Criteria andRegisterDateIsNull() {
            addCriterion("REGISTER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("REGISTER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterion("REGISTER_DATE =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REGISTER_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterion("REGISTER_DATE <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REGISTER_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterion("REGISTER_DATE >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REGISTER_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATE >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REGISTER_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterion("REGISTER_DATE <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REGISTER_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("REGISTER_DATE <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("REGISTER_DATE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterion("REGISTER_DATE in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterion("REGISTER_DATE not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATE between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("REGISTER_DATE not between", value1, value2, "registerDate");
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

        public Criteria andDeletedEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(DsrDropshipper.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(DsrDropshipper.Column column) {
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
        private DsrDropshipperExample example;

        protected Criteria(DsrDropshipperExample example) {
            super();
            this.example = example;
        }

        public DsrDropshipperExample example() {
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
        void example(DsrDropshipperExample example);
    }
}