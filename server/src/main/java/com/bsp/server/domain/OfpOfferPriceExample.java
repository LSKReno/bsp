package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfpOfferPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfpOfferPriceExample() {
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

    public OfpOfferPriceExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public OfpOfferPriceExample orderBy(String ... orderByClauses) {
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
        OfpOfferPriceExample example = new OfpOfferPriceExample();
        return example.createCriteria();
    }

    public OfpOfferPriceExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public OfpOfferPriceExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andOfpIdIsNull() {
            addCriterion("OFP_ID is null");
            return (Criteria) this;
        }

        public Criteria andOfpIdIsNotNull() {
            addCriterion("OFP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOfpIdEqualTo(Integer value) {
            addCriterion("OFP_ID =", value, "ofpId");
            return (Criteria) this;
        }

        public Criteria andOfpIdEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("OFP_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfpIdNotEqualTo(Integer value) {
            addCriterion("OFP_ID <>", value, "ofpId");
            return (Criteria) this;
        }

        public Criteria andOfpIdNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("OFP_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfpIdGreaterThan(Integer value) {
            addCriterion("OFP_ID >", value, "ofpId");
            return (Criteria) this;
        }

        public Criteria andOfpIdGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("OFP_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OFP_ID >=", value, "ofpId");
            return (Criteria) this;
        }

        public Criteria andOfpIdGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("OFP_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfpIdLessThan(Integer value) {
            addCriterion("OFP_ID <", value, "ofpId");
            return (Criteria) this;
        }

        public Criteria andOfpIdLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("OFP_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfpIdLessThanOrEqualTo(Integer value) {
            addCriterion("OFP_ID <=", value, "ofpId");
            return (Criteria) this;
        }

        public Criteria andOfpIdLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("OFP_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOfpIdIn(List<Integer> values) {
            addCriterion("OFP_ID in", values, "ofpId");
            return (Criteria) this;
        }

        public Criteria andOfpIdNotIn(List<Integer> values) {
            addCriterion("OFP_ID not in", values, "ofpId");
            return (Criteria) this;
        }

        public Criteria andOfpIdBetween(Integer value1, Integer value2) {
            addCriterion("OFP_ID between", value1, value2, "ofpId");
            return (Criteria) this;
        }

        public Criteria andOfpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OFP_ID not between", value1, value2, "ofpId");
            return (Criteria) this;
        }

        public Criteria andManIdIsNull() {
            addCriterion("MAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andManIdIsNotNull() {
            addCriterion("MAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andManIdEqualTo(String value) {
            addCriterion("MAN_ID =", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("MAN_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(String value) {
            addCriterion("MAN_ID <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("MAN_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(String value) {
            addCriterion("MAN_ID >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("MAN_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAN_ID >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("MAN_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(String value) {
            addCriterion("MAN_ID <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("MAN_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(String value) {
            addCriterion("MAN_ID <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("MAN_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdLike(String value) {
            addCriterion("MAN_ID like", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotLike(String value) {
            addCriterion("MAN_ID not like", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdIn(List<String> values) {
            addCriterion("MAN_ID in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotIn(List<String> values) {
            addCriterion("MAN_ID not in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdBetween(String value1, String value2) {
            addCriterion("MAN_ID between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotBetween(String value1, String value2) {
            addCriterion("MAN_ID not between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateIsNull() {
            addCriterion("EFFETIVE_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateIsNotNull() {
            addCriterion("EFFETIVE_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateEqualTo(Date value) {
            addCriterion("EFFETIVE_START_DATE =", value, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFETIVE_START_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateNotEqualTo(Date value) {
            addCriterion("EFFETIVE_START_DATE <>", value, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFETIVE_START_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateGreaterThan(Date value) {
            addCriterion("EFFETIVE_START_DATE >", value, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFETIVE_START_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFETIVE_START_DATE >=", value, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFETIVE_START_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateLessThan(Date value) {
            addCriterion("EFFETIVE_START_DATE <", value, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFETIVE_START_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateLessThanOrEqualTo(Date value) {
            addCriterion("EFFETIVE_START_DATE <=", value, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFETIVE_START_DATE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateIn(List<Date> values) {
            addCriterion("EFFETIVE_START_DATE in", values, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateNotIn(List<Date> values) {
            addCriterion("EFFETIVE_START_DATE not in", values, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateBetween(Date value1, Date value2) {
            addCriterion("EFFETIVE_START_DATE between", value1, value2, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffetiveStartDateNotBetween(Date value1, Date value2) {
            addCriterion("EFFETIVE_START_DATE not between", value1, value2, "effetiveStartDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateIsNull() {
            addCriterion("EFFECTIVE_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateIsNotNull() {
            addCriterion("EFFECTIVE_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateEqualTo(Date value) {
            addCriterion("EFFECTIVE_END_DATE =", value, "effectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFECTIVE_END_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateNotEqualTo(Date value) {
            addCriterion("EFFECTIVE_END_DATE <>", value, "effectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFECTIVE_END_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateGreaterThan(Date value) {
            addCriterion("EFFECTIVE_END_DATE >", value, "effectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFECTIVE_END_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_END_DATE >=", value, "effectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFECTIVE_END_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateLessThan(Date value) {
            addCriterion("EFFECTIVE_END_DATE <", value, "effectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFECTIVE_END_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateLessThanOrEqualTo(Date value) {
            addCriterion("EFFECTIVE_END_DATE <=", value, "effectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("EFFECTIVE_END_DATE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateIn(List<Date> values) {
            addCriterion("EFFECTIVE_END_DATE in", values, "effectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateNotIn(List<Date> values) {
            addCriterion("EFFECTIVE_END_DATE not in", values, "effectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_END_DATE between", value1, value2, "effectiveEndDate");
            return (Criteria) this;
        }

        public Criteria andEffectiveEndDateNotBetween(Date value1, Date value2) {
            addCriterion("EFFECTIVE_END_DATE not between", value1, value2, "effectiveEndDate");
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

        public Criteria andProIdEqualTo(String value) {
            addCriterion("PRO_ID =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRO_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(String value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRO_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(String value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRO_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRO_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(String value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRO_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(String value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRO_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdLike(String value) {
            addCriterion("PRO_ID like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotLike(String value) {
            addCriterion("PRO_ID not like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<String> values) {
            addCriterion("PRO_ID in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<String> values) {
            addCriterion("PRO_ID not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(String value1, String value2) {
            addCriterion("PRO_ID between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(String value1, String value2) {
            addCriterion("PRO_ID not between", value1, value2, "proId");
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

        public Criteria andPriceEqualTo(String value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRICE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRICE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRICE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRICE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRICE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PRICE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("PRICE like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("PRICE not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTypeCdIsNull() {
            addCriterion("TYPE_CD is null");
            return (Criteria) this;
        }

        public Criteria andTypeCdIsNotNull() {
            addCriterion("TYPE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCdEqualTo(String value) {
            addCriterion("TYPE_CD =", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("TYPE_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeCdNotEqualTo(String value) {
            addCriterion("TYPE_CD <>", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("TYPE_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeCdGreaterThan(String value) {
            addCriterion("TYPE_CD >", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("TYPE_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeCdGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_CD >=", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("TYPE_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeCdLessThan(String value) {
            addCriterion("TYPE_CD <", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("TYPE_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeCdLessThanOrEqualTo(String value) {
            addCriterion("TYPE_CD <=", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("TYPE_CD <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeCdLike(String value) {
            addCriterion("TYPE_CD like", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotLike(String value) {
            addCriterion("TYPE_CD not like", value, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdIn(List<String> values) {
            addCriterion("TYPE_CD in", values, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotIn(List<String> values) {
            addCriterion("TYPE_CD not in", values, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdBetween(String value1, String value2) {
            addCriterion("TYPE_CD between", value1, value2, "typeCd");
            return (Criteria) this;
        }

        public Criteria andTypeCdNotBetween(String value1, String value2) {
            addCriterion("TYPE_CD not between", value1, value2, "typeCd");
            return (Criteria) this;
        }

        public Criteria andDsrIdIsNull() {
            addCriterion("DSR_ID is null");
            return (Criteria) this;
        }

        public Criteria andDsrIdIsNotNull() {
            addCriterion("DSR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDsrIdEqualTo(String value) {
            addCriterion("DSR_ID =", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("DSR_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdNotEqualTo(String value) {
            addCriterion("DSR_ID <>", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("DSR_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdGreaterThan(String value) {
            addCriterion("DSR_ID >", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("DSR_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdGreaterThanOrEqualTo(String value) {
            addCriterion("DSR_ID >=", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("DSR_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdLessThan(String value) {
            addCriterion("DSR_ID <", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("DSR_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdLessThanOrEqualTo(String value) {
            addCriterion("DSR_ID <=", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("DSR_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDsrIdLike(String value) {
            addCriterion("DSR_ID like", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdNotLike(String value) {
            addCriterion("DSR_ID not like", value, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdIn(List<String> values) {
            addCriterion("DSR_ID in", values, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdNotIn(List<String> values) {
            addCriterion("DSR_ID not in", values, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdBetween(String value1, String value2) {
            addCriterion("DSR_ID between", value1, value2, "dsrId");
            return (Criteria) this;
        }

        public Criteria andDsrIdNotBetween(String value1, String value2) {
            addCriterion("DSR_ID not between", value1, value2, "dsrId");
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

        public Criteria andCreatedByEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATED_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATED_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATED_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATED_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATED_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
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

        public Criteria andCreationDateEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
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

        public Criteria andLastUpdateByEqualTo(Date value) {
            addCriterion("LAST_UPDATE_BY =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(Date value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<Date> values) {
            addCriterion("LAST_UPDATE_BY in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_BY not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_BY between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(Date value1, Date value2) {
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

        public Criteria andLastUpdateDateEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
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

        public Criteria andCallCntEqualTo(String value) {
            addCriterion("CALL_CNT =", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CALL_CNT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(String value) {
            addCriterion("CALL_CNT <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(String value) {
            addCriterion("CALL_CNT >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CALL_CNT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_CNT >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CALL_CNT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(String value) {
            addCriterion("CALL_CNT <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CALL_CNT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(String value) {
            addCriterion("CALL_CNT <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLike(String value) {
            addCriterion("CALL_CNT like", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotLike(String value) {
            addCriterion("CALL_CNT not like", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntIn(List<String> values) {
            addCriterion("CALL_CNT in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotIn(List<String> values) {
            addCriterion("CALL_CNT not in", values, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntBetween(String value1, String value2) {
            addCriterion("CALL_CNT between", value1, value2, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotBetween(String value1, String value2) {
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

        public Criteria andRemarkEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("REMARK = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("REMARK <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("REMARK > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("REMARK >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("REMARK < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
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

        public Criteria andStsCdEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("STS_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("STS_CD <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("STS_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("STS_CD >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("STS_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("STS_CD >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("STS_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("STS_CD <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("STS_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("STS_CD <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
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

        public Criteria andPeriodIsNull() {
            addCriterion("PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("PERIOD =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PERIOD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("PERIOD <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PERIOD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("PERIOD >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PERIOD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PERIOD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("PERIOD <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PERIOD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("PERIOD <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("PERIOD <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("PERIOD like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("PERIOD not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("PERIOD in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("PERIOD not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("PERIOD between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("PERIOD not between", value1, value2, "period");
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

        public Criteria andDeletedEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(OfpOfferPrice.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(OfpOfferPrice.Column column) {
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
        private OfpOfferPriceExample example;

        protected Criteria(OfpOfferPriceExample example) {
            super();
            this.example = example;
        }

        public OfpOfferPriceExample example() {
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
        void example(OfpOfferPriceExample example);
    }
}