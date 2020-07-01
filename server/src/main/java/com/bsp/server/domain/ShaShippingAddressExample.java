package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShaShippingAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShaShippingAddressExample() {
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

    public ShaShippingAddressExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ShaShippingAddressExample orderBy(String ... orderByClauses) {
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
        ShaShippingAddressExample example = new ShaShippingAddressExample();
        return example.createCriteria();
    }

    public ShaShippingAddressExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ShaShippingAddressExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andCreatedByEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATED_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATED_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATED_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATED_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATED_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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

        public Criteria andCreationDateEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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

        public Criteria andLastUpdateByEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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

        public Criteria andLastUpdateDateEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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

        public Criteria andCallCntEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CALL_CNT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Integer value) {
            addCriterion("CALL_CNT <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Integer value) {
            addCriterion("CALL_CNT >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CALL_CNT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CALL_CNT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Integer value) {
            addCriterion("CALL_CNT <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CALL_CNT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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

        public Criteria andRemarkEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("REMARK = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("REMARK <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("REMARK > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("REMARK >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("REMARK < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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

        public Criteria andStsCdEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STS_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("STS_CD <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STS_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("STS_CD >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STS_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("STS_CD >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STS_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("STS_CD <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STS_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("STS_CD <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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

        public Criteria andFamilyNameIsNull() {
            addCriterion("FAMILY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("FAMILY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("FAMILY_NAME =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("FAMILY_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("FAMILY_NAME <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("FAMILY_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("FAMILY_NAME >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("FAMILY_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILY_NAME >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("FAMILY_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("FAMILY_NAME <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("FAMILY_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("FAMILY_NAME <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("FAMILY_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("FAMILY_NAME like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("FAMILY_NAME not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("FAMILY_NAME in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("FAMILY_NAME not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("FAMILY_NAME between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("FAMILY_NAME not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNull() {
            addCriterion("GIVEN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNotNull() {
            addCriterion("GIVEN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGivenNameEqualTo(String value) {
            addCriterion("GIVEN_NAME =", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("GIVEN_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGivenNameNotEqualTo(String value) {
            addCriterion("GIVEN_NAME <>", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("GIVEN_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThan(String value) {
            addCriterion("GIVEN_NAME >", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("GIVEN_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThanOrEqualTo(String value) {
            addCriterion("GIVEN_NAME >=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("GIVEN_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThan(String value) {
            addCriterion("GIVEN_NAME <", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("GIVEN_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThanOrEqualTo(String value) {
            addCriterion("GIVEN_NAME <=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("GIVEN_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGivenNameLike(String value) {
            addCriterion("GIVEN_NAME like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotLike(String value) {
            addCriterion("GIVEN_NAME not like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIn(List<String> values) {
            addCriterion("GIVEN_NAME in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotIn(List<String> values) {
            addCriterion("GIVEN_NAME not in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameBetween(String value1, String value2) {
            addCriterion("GIVEN_NAME between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotBetween(String value1, String value2) {
            addCriterion("GIVEN_NAME not between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNull() {
            addCriterion("COUNTRY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCountryNameIsNotNull() {
            addCriterion("COUNTRY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualTo(String value) {
            addCriterion("COUNTRY_NAME =", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualTo(String value) {
            addCriterion("COUNTRY_NAME <>", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThan(String value) {
            addCriterion("COUNTRY_NAME >", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_NAME >=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThan(String value) {
            addCriterion("COUNTRY_NAME <", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_NAME <=", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryNameLike(String value) {
            addCriterion("COUNTRY_NAME like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotLike(String value) {
            addCriterion("COUNTRY_NAME not like", value, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameIn(List<String> values) {
            addCriterion("COUNTRY_NAME in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotIn(List<String> values) {
            addCriterion("COUNTRY_NAME not in", values, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameBetween(String value1, String value2) {
            addCriterion("COUNTRY_NAME between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryNameNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_NAME not between", value1, value2, "countryName");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdIsNull() {
            addCriterion("COUNTRY_ISO_CD is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdIsNotNull() {
            addCriterion("COUNTRY_ISO_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdEqualTo(String value) {
            addCriterion("COUNTRY_ISO_CD =", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_ISO_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdNotEqualTo(String value) {
            addCriterion("COUNTRY_ISO_CD <>", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_ISO_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdGreaterThan(String value) {
            addCriterion("COUNTRY_ISO_CD >", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_ISO_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_ISO_CD >=", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_ISO_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdLessThan(String value) {
            addCriterion("COUNTRY_ISO_CD <", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_ISO_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_ISO_CD <=", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("COUNTRY_ISO_CD <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdLike(String value) {
            addCriterion("COUNTRY_ISO_CD like", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdNotLike(String value) {
            addCriterion("COUNTRY_ISO_CD not like", value, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdIn(List<String> values) {
            addCriterion("COUNTRY_ISO_CD in", values, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdNotIn(List<String> values) {
            addCriterion("COUNTRY_ISO_CD not in", values, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdBetween(String value1, String value2) {
            addCriterion("COUNTRY_ISO_CD between", value1, value2, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andCountryIsoCdNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_ISO_CD not between", value1, value2, "countryIsoCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameIsNull() {
            addCriterion("STATE_OR_PROVINCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameIsNotNull() {
            addCriterion("STATE_OR_PROVINCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameEqualTo(String value) {
            addCriterion("STATE_OR_PROVINCE_NAME =", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameNotEqualTo(String value) {
            addCriterion("STATE_OR_PROVINCE_NAME <>", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameGreaterThan(String value) {
            addCriterion("STATE_OR_PROVINCE_NAME >", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("STATE_OR_PROVINCE_NAME >=", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameLessThan(String value) {
            addCriterion("STATE_OR_PROVINCE_NAME <", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("STATE_OR_PROVINCE_NAME <=", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameLike(String value) {
            addCriterion("STATE_OR_PROVINCE_NAME like", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameNotLike(String value) {
            addCriterion("STATE_OR_PROVINCE_NAME not like", value, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameIn(List<String> values) {
            addCriterion("STATE_OR_PROVINCE_NAME in", values, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameNotIn(List<String> values) {
            addCriterion("STATE_OR_PROVINCE_NAME not in", values, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameBetween(String value1, String value2) {
            addCriterion("STATE_OR_PROVINCE_NAME between", value1, value2, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceNameNotBetween(String value1, String value2) {
            addCriterion("STATE_OR_PROVINCE_NAME not between", value1, value2, "stateOrProvinceName");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdIsNull() {
            addCriterion("STATE_OR_PROVINCE_CD is null");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdIsNotNull() {
            addCriterion("STATE_OR_PROVINCE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdEqualTo(String value) {
            addCriterion("STATE_OR_PROVINCE_CD =", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdNotEqualTo(String value) {
            addCriterion("STATE_OR_PROVINCE_CD <>", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdGreaterThan(String value) {
            addCriterion("STATE_OR_PROVINCE_CD >", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdGreaterThanOrEqualTo(String value) {
            addCriterion("STATE_OR_PROVINCE_CD >=", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdLessThan(String value) {
            addCriterion("STATE_OR_PROVINCE_CD <", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdLessThanOrEqualTo(String value) {
            addCriterion("STATE_OR_PROVINCE_CD <=", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STATE_OR_PROVINCE_CD <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdLike(String value) {
            addCriterion("STATE_OR_PROVINCE_CD like", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdNotLike(String value) {
            addCriterion("STATE_OR_PROVINCE_CD not like", value, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdIn(List<String> values) {
            addCriterion("STATE_OR_PROVINCE_CD in", values, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdNotIn(List<String> values) {
            addCriterion("STATE_OR_PROVINCE_CD not in", values, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdBetween(String value1, String value2) {
            addCriterion("STATE_OR_PROVINCE_CD between", value1, value2, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andStateOrProvinceCdNotBetween(String value1, String value2) {
            addCriterion("STATE_OR_PROVINCE_CD not between", value1, value2, "stateOrProvinceCd");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CITY_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CITY_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CITY_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CITY_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CITY_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CITY_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAddressLine1IsNull() {
            addCriterion("ADDRESS_LINE1 is null");
            return (Criteria) this;
        }

        public Criteria andAddressLine1IsNotNull() {
            addCriterion("ADDRESS_LINE1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLine1EqualTo(String value) {
            addCriterion("ADDRESS_LINE1 =", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1EqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE1 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine1NotEqualTo(String value) {
            addCriterion("ADDRESS_LINE1 <>", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1NotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE1 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine1GreaterThan(String value) {
            addCriterion("ADDRESS_LINE1 >", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1GreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE1 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine1GreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_LINE1 >=", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1GreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE1 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine1LessThan(String value) {
            addCriterion("ADDRESS_LINE1 <", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1LessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE1 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine1LessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_LINE1 <=", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1LessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE1 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine1Like(String value) {
            addCriterion("ADDRESS_LINE1 like", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1NotLike(String value) {
            addCriterion("ADDRESS_LINE1 not like", value, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1In(List<String> values) {
            addCriterion("ADDRESS_LINE1 in", values, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1NotIn(List<String> values) {
            addCriterion("ADDRESS_LINE1 not in", values, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1Between(String value1, String value2) {
            addCriterion("ADDRESS_LINE1 between", value1, value2, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine1NotBetween(String value1, String value2) {
            addCriterion("ADDRESS_LINE1 not between", value1, value2, "addressLine1");
            return (Criteria) this;
        }

        public Criteria andAddressLine2IsNull() {
            addCriterion("ADDRESS_LINE2 is null");
            return (Criteria) this;
        }

        public Criteria andAddressLine2IsNotNull() {
            addCriterion("ADDRESS_LINE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLine2EqualTo(String value) {
            addCriterion("ADDRESS_LINE2 =", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2EqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE2 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine2NotEqualTo(String value) {
            addCriterion("ADDRESS_LINE2 <>", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2NotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE2 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine2GreaterThan(String value) {
            addCriterion("ADDRESS_LINE2 >", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2GreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE2 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine2GreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_LINE2 >=", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2GreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE2 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine2LessThan(String value) {
            addCriterion("ADDRESS_LINE2 <", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2LessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE2 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine2LessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_LINE2 <=", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2LessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE2 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine2Like(String value) {
            addCriterion("ADDRESS_LINE2 like", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2NotLike(String value) {
            addCriterion("ADDRESS_LINE2 not like", value, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2In(List<String> values) {
            addCriterion("ADDRESS_LINE2 in", values, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2NotIn(List<String> values) {
            addCriterion("ADDRESS_LINE2 not in", values, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2Between(String value1, String value2) {
            addCriterion("ADDRESS_LINE2 between", value1, value2, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine2NotBetween(String value1, String value2) {
            addCriterion("ADDRESS_LINE2 not between", value1, value2, "addressLine2");
            return (Criteria) this;
        }

        public Criteria andAddressLine3IsNull() {
            addCriterion("ADDRESS_LINE3 is null");
            return (Criteria) this;
        }

        public Criteria andAddressLine3IsNotNull() {
            addCriterion("ADDRESS_LINE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAddressLine3EqualTo(String value) {
            addCriterion("ADDRESS_LINE3 =", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3EqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE3 = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine3NotEqualTo(String value) {
            addCriterion("ADDRESS_LINE3 <>", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3NotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE3 <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine3GreaterThan(String value) {
            addCriterion("ADDRESS_LINE3 >", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3GreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE3 > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine3GreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_LINE3 >=", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3GreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE3 >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine3LessThan(String value) {
            addCriterion("ADDRESS_LINE3 <", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3LessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE3 < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine3LessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_LINE3 <=", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3LessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("ADDRESS_LINE3 <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLine3Like(String value) {
            addCriterion("ADDRESS_LINE3 like", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3NotLike(String value) {
            addCriterion("ADDRESS_LINE3 not like", value, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3In(List<String> values) {
            addCriterion("ADDRESS_LINE3 in", values, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3NotIn(List<String> values) {
            addCriterion("ADDRESS_LINE3 not in", values, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3Between(String value1, String value2) {
            addCriterion("ADDRESS_LINE3 between", value1, value2, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andAddressLine3NotBetween(String value1, String value2) {
            addCriterion("ADDRESS_LINE3 not between", value1, value2, "addressLine3");
            return (Criteria) this;
        }

        public Criteria andPostalCdIsNull() {
            addCriterion("POSTAL_CD is null");
            return (Criteria) this;
        }

        public Criteria andPostalCdIsNotNull() {
            addCriterion("POSTAL_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCdEqualTo(String value) {
            addCriterion("POSTAL_CD =", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("POSTAL_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCdNotEqualTo(String value) {
            addCriterion("POSTAL_CD <>", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("POSTAL_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCdGreaterThan(String value) {
            addCriterion("POSTAL_CD >", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("POSTAL_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCdGreaterThanOrEqualTo(String value) {
            addCriterion("POSTAL_CD >=", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("POSTAL_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCdLessThan(String value) {
            addCriterion("POSTAL_CD <", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("POSTAL_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCdLessThanOrEqualTo(String value) {
            addCriterion("POSTAL_CD <=", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("POSTAL_CD <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPostalCdLike(String value) {
            addCriterion("POSTAL_CD like", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdNotLike(String value) {
            addCriterion("POSTAL_CD not like", value, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdIn(List<String> values) {
            addCriterion("POSTAL_CD in", values, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdNotIn(List<String> values) {
            addCriterion("POSTAL_CD not in", values, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdBetween(String value1, String value2) {
            addCriterion("POSTAL_CD between", value1, value2, "postalCd");
            return (Criteria) this;
        }

        public Criteria andPostalCdNotBetween(String value1, String value2) {
            addCriterion("POSTAL_CD not between", value1, value2, "postalCd");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoIsNull() {
            addCriterion("CONTACT_PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoIsNotNull() {
            addCriterion("CONTACT_PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoEqualTo(String value) {
            addCriterion("CONTACT_PHONE_NO =", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CONTACT_PHONE_NO = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoNotEqualTo(String value) {
            addCriterion("CONTACT_PHONE_NO <>", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CONTACT_PHONE_NO <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoGreaterThan(String value) {
            addCriterion("CONTACT_PHONE_NO >", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CONTACT_PHONE_NO > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE_NO >=", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CONTACT_PHONE_NO >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoLessThan(String value) {
            addCriterion("CONTACT_PHONE_NO <", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CONTACT_PHONE_NO < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_PHONE_NO <=", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CONTACT_PHONE_NO <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoLike(String value) {
            addCriterion("CONTACT_PHONE_NO like", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoNotLike(String value) {
            addCriterion("CONTACT_PHONE_NO not like", value, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoIn(List<String> values) {
            addCriterion("CONTACT_PHONE_NO in", values, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoNotIn(List<String> values) {
            addCriterion("CONTACT_PHONE_NO not in", values, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE_NO between", value1, value2, "contactPhoneNo");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNoNotBetween(String value1, String value2) {
            addCriterion("CONTACT_PHONE_NO not between", value1, value2, "contactPhoneNo");
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

        public Criteria andEmailEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("EMAIL = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("EMAIL <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("EMAIL > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("EMAIL >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("EMAIL < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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

        public Criteria andStoIdEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STO_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdNotEqualTo(Integer value) {
            addCriterion("STO_ID <>", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STO_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThan(Integer value) {
            addCriterion("STO_ID >", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STO_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STO_ID >=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STO_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdLessThan(Integer value) {
            addCriterion("STO_ID <", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("STO_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanOrEqualTo(Integer value) {
            addCriterion("STO_ID <=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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

        public Criteria andCarrierNameIsNull() {
            addCriterion("CARRIER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNotNull() {
            addCriterion("CARRIER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameEqualTo(String value) {
            addCriterion("CARRIER_NAME =", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CARRIER_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotEqualTo(String value) {
            addCriterion("CARRIER_NAME <>", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CARRIER_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThan(String value) {
            addCriterion("CARRIER_NAME >", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CARRIER_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThanOrEqualTo(String value) {
            addCriterion("CARRIER_NAME >=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CARRIER_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThan(String value) {
            addCriterion("CARRIER_NAME <", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CARRIER_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThanOrEqualTo(String value) {
            addCriterion("CARRIER_NAME <=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("CARRIER_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarrierNameLike(String value) {
            addCriterion("CARRIER_NAME like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotLike(String value) {
            addCriterion("CARRIER_NAME not like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIn(List<String> values) {
            addCriterion("CARRIER_NAME in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotIn(List<String> values) {
            addCriterion("CARRIER_NAME not in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameBetween(String value1, String value2) {
            addCriterion("CARRIER_NAME between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotBetween(String value1, String value2) {
            addCriterion("CARRIER_NAME not between", value1, value2, "carrierName");
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

        public Criteria andDeletedEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(ShaShippingAddress.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(ShaShippingAddress.Column column) {
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
        private ShaShippingAddressExample example;

        protected Criteria(ShaShippingAddressExample example) {
            super();
            this.example = example;
        }

        public ShaShippingAddressExample example() {
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
        void example(ShaShippingAddressExample example);
    }
}