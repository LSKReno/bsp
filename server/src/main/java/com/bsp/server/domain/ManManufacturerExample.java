package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManManufacturerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManManufacturerExample() {
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

    public ManManufacturerExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ManManufacturerExample orderBy(String ... orderByClauses) {
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
        ManManufacturerExample example = new ManManufacturerExample();
        return example.createCriteria();
    }

    public ManManufacturerExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ManManufacturerExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andManIdIsNull() {
            addCriterion("MAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andManIdIsNotNull() {
            addCriterion("MAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManIdEqualTo(Integer value) {
            addCriterion("MAN_ID =", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("MAN_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(Integer value) {
            addCriterion("MAN_ID <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("MAN_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(Integer value) {
            addCriterion("MAN_ID >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("MAN_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAN_ID >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("MAN_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(Integer value) {
            addCriterion("MAN_ID <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("MAN_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(Integer value) {
            addCriterion("MAN_ID <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("MAN_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdIn(List<Integer> values) {
            addCriterion("MAN_ID in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotIn(List<Integer> values) {
            addCriterion("MAN_ID not in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdBetween(Integer value1, Integer value2) {
            addCriterion("MAN_ID between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MAN_ID not between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("NAME_EN =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_EN = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("NAME_EN <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_EN <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("NAME_EN >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_EN > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_EN >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_EN >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("NAME_EN <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_EN < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("NAME_EN <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_EN <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("NAME_EN like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("NAME_EN not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("NAME_EN in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("NAME_EN not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("NAME_EN between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("NAME_EN not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameCnIsNull() {
            addCriterion("NAME_CN is null");
            return (Criteria) this;
        }

        public Criteria andNameCnIsNotNull() {
            addCriterion("NAME_CN is not null");
            return (Criteria) this;
        }

        public Criteria andNameCnEqualTo(String value) {
            addCriterion("NAME_CN =", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_CN = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameCnNotEqualTo(String value) {
            addCriterion("NAME_CN <>", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_CN <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameCnGreaterThan(String value) {
            addCriterion("NAME_CN >", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_CN > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_CN >=", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_CN >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameCnLessThan(String value) {
            addCriterion("NAME_CN <", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_CN < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameCnLessThanOrEqualTo(String value) {
            addCriterion("NAME_CN <=", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnLessThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("NAME_CN <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNameCnLike(String value) {
            addCriterion("NAME_CN like", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotLike(String value) {
            addCriterion("NAME_CN not like", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnIn(List<String> values) {
            addCriterion("NAME_CN in", values, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotIn(List<String> values) {
            addCriterion("NAME_CN not in", values, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnBetween(String value1, String value2) {
            addCriterion("NAME_CN between", value1, value2, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotBetween(String value1, String value2) {
            addCriterion("NAME_CN not between", value1, value2, "nameCn");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeIsNull() {
            addCriterion("GMC_REPORT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeIsNotNull() {
            addCriterion("GMC_REPORT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeEqualTo(String value) {
            addCriterion("GMC_REPORT_TYPE =", value, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_TYPE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeNotEqualTo(String value) {
            addCriterion("GMC_REPORT_TYPE <>", value, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_TYPE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeGreaterThan(String value) {
            addCriterion("GMC_REPORT_TYPE >", value, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_TYPE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GMC_REPORT_TYPE >=", value, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_TYPE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeLessThan(String value) {
            addCriterion("GMC_REPORT_TYPE <", value, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_TYPE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeLessThanOrEqualTo(String value) {
            addCriterion("GMC_REPORT_TYPE <=", value, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeLessThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_TYPE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeLike(String value) {
            addCriterion("GMC_REPORT_TYPE like", value, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeNotLike(String value) {
            addCriterion("GMC_REPORT_TYPE not like", value, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeIn(List<String> values) {
            addCriterion("GMC_REPORT_TYPE in", values, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeNotIn(List<String> values) {
            addCriterion("GMC_REPORT_TYPE not in", values, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeBetween(String value1, String value2) {
            addCriterion("GMC_REPORT_TYPE between", value1, value2, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportTypeNotBetween(String value1, String value2) {
            addCriterion("GMC_REPORT_TYPE not between", value1, value2, "gmcReportType");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlIsNull() {
            addCriterion("GMC_REPORT_URL is null");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlIsNotNull() {
            addCriterion("GMC_REPORT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlEqualTo(String value) {
            addCriterion("GMC_REPORT_URL =", value, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_URL = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlNotEqualTo(String value) {
            addCriterion("GMC_REPORT_URL <>", value, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_URL <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlGreaterThan(String value) {
            addCriterion("GMC_REPORT_URL >", value, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_URL > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlGreaterThanOrEqualTo(String value) {
            addCriterion("GMC_REPORT_URL >=", value, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_URL >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlLessThan(String value) {
            addCriterion("GMC_REPORT_URL <", value, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_URL < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlLessThanOrEqualTo(String value) {
            addCriterion("GMC_REPORT_URL <=", value, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlLessThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("GMC_REPORT_URL <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlLike(String value) {
            addCriterion("GMC_REPORT_URL like", value, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlNotLike(String value) {
            addCriterion("GMC_REPORT_URL not like", value, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlIn(List<String> values) {
            addCriterion("GMC_REPORT_URL in", values, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlNotIn(List<String> values) {
            addCriterion("GMC_REPORT_URL not in", values, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlBetween(String value1, String value2) {
            addCriterion("GMC_REPORT_URL between", value1, value2, "gmcReportUrl");
            return (Criteria) this;
        }

        public Criteria andGmcReportUrlNotBetween(String value1, String value2) {
            addCriterion("GMC_REPORT_URL not between", value1, value2, "gmcReportUrl");
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

        public Criteria andCreatedByEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATED_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATED_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATED_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATED_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATED_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(ManManufacturer.Column column) {
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

        public Criteria andCreationDateEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualToColumn(ManManufacturer.Column column) {
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

        public Criteria andLastUpdateByEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(ManManufacturer.Column column) {
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

        public Criteria andLastUpdateDateEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualToColumn(ManManufacturer.Column column) {
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

        public Criteria andCallCntEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CALL_CNT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Integer value) {
            addCriterion("CALL_CNT <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Integer value) {
            addCriterion("CALL_CNT >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CALL_CNT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CALL_CNT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Integer value) {
            addCriterion("CALL_CNT <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("CALL_CNT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualToColumn(ManManufacturer.Column column) {
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

        public Criteria andRemarkEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("REMARK = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("REMARK <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("REMARK > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("REMARK >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("REMARK < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(ManManufacturer.Column column) {
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

        public Criteria andStsCdEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("STS_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("STS_CD <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("STS_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("STS_CD >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("STS_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("STS_CD >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("STS_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("STS_CD <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("STS_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("STS_CD <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualToColumn(ManManufacturer.Column column) {
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

        public Criteria andDeletedEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(ManManufacturer.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(ManManufacturer.Column column) {
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
        private ManManufacturerExample example;

        protected Criteria(ManManufacturerExample example) {
            super();
            this.example = example;
        }

        public ManManufacturerExample example() {
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
        void example(ManManufacturerExample example);
    }
}