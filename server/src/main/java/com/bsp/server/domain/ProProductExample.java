package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProProductExample() {
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

    public ProProductExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public ProProductExample orderBy(String ... orderByClauses) {
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
        ProProductExample example = new ProProductExample();
        return example.createCriteria();
    }

    public ProProductExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public ProProductExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andProIdEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("PRO_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("PRO_ID <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("PRO_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("PRO_ID >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("PRO_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("PRO_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("PRO_ID <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("PRO_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_ID <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualToColumn(ProProduct.Column column) {
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

        public Criteria andSkuCdIsNull() {
            addCriterion("SKU_CD is null");
            return (Criteria) this;
        }

        public Criteria andSkuCdIsNotNull() {
            addCriterion("SKU_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCdEqualTo(String value) {
            addCriterion("SKU_CD =", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("SKU_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuCdNotEqualTo(String value) {
            addCriterion("SKU_CD <>", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("SKU_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuCdGreaterThan(String value) {
            addCriterion("SKU_CD >", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("SKU_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuCdGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_CD >=", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("SKU_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuCdLessThan(String value) {
            addCriterion("SKU_CD <", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("SKU_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuCdLessThanOrEqualTo(String value) {
            addCriterion("SKU_CD <=", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("SKU_CD <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andSkuCdLike(String value) {
            addCriterion("SKU_CD like", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdNotLike(String value) {
            addCriterion("SKU_CD not like", value, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdIn(List<String> values) {
            addCriterion("SKU_CD in", values, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdNotIn(List<String> values) {
            addCriterion("SKU_CD not in", values, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdBetween(String value1, String value2) {
            addCriterion("SKU_CD between", value1, value2, "skuCd");
            return (Criteria) this;
        }

        public Criteria andSkuCdNotBetween(String value1, String value2) {
            addCriterion("SKU_CD not between", value1, value2, "skuCd");
            return (Criteria) this;
        }

        public Criteria andBrdIdIsNull() {
            addCriterion("BRD_ID is null");
            return (Criteria) this;
        }

        public Criteria andBrdIdIsNotNull() {
            addCriterion("BRD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBrdIdEqualTo(Integer value) {
            addCriterion("BRD_ID =", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("BRD_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrdIdNotEqualTo(Integer value) {
            addCriterion("BRD_ID <>", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("BRD_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrdIdGreaterThan(Integer value) {
            addCriterion("BRD_ID >", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("BRD_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRD_ID >=", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("BRD_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrdIdLessThan(Integer value) {
            addCriterion("BRD_ID <", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("BRD_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrdIdLessThanOrEqualTo(Integer value) {
            addCriterion("BRD_ID <=", value, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("BRD_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBrdIdIn(List<Integer> values) {
            addCriterion("BRD_ID in", values, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdNotIn(List<Integer> values) {
            addCriterion("BRD_ID not in", values, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdBetween(Integer value1, Integer value2) {
            addCriterion("BRD_ID between", value1, value2, "brdId");
            return (Criteria) this;
        }

        public Criteria andBrdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BRD_ID not between", value1, value2, "brdId");
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

        public Criteria andManIdEqualTo(Integer value) {
            addCriterion("MAN_ID =", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MAN_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(Integer value) {
            addCriterion("MAN_ID <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MAN_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(Integer value) {
            addCriterion("MAN_ID >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MAN_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAN_ID >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MAN_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(Integer value) {
            addCriterion("MAN_ID <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MAN_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(Integer value) {
            addCriterion("MAN_ID <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualToColumn(ProProduct.Column column) {
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

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TITLE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TITLE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TITLE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TITLE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TITLE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TITLE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUpcIsNull() {
            addCriterion("UPC is null");
            return (Criteria) this;
        }

        public Criteria andUpcIsNotNull() {
            addCriterion("UPC is not null");
            return (Criteria) this;
        }

        public Criteria andUpcEqualTo(String value) {
            addCriterion("UPC =", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("UPC = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpcNotEqualTo(String value) {
            addCriterion("UPC <>", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("UPC <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpcGreaterThan(String value) {
            addCriterion("UPC >", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("UPC > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpcGreaterThanOrEqualTo(String value) {
            addCriterion("UPC >=", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("UPC >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpcLessThan(String value) {
            addCriterion("UPC <", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("UPC < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpcLessThanOrEqualTo(String value) {
            addCriterion("UPC <=", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("UPC <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpcLike(String value) {
            addCriterion("UPC like", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotLike(String value) {
            addCriterion("UPC not like", value, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcIn(List<String> values) {
            addCriterion("UPC in", values, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotIn(List<String> values) {
            addCriterion("UPC not in", values, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcBetween(String value1, String value2) {
            addCriterion("UPC between", value1, value2, "upc");
            return (Criteria) this;
        }

        public Criteria andUpcNotBetween(String value1, String value2) {
            addCriterion("UPC not between", value1, value2, "upc");
            return (Criteria) this;
        }

        public Criteria andEanIsNull() {
            addCriterion("EAN is null");
            return (Criteria) this;
        }

        public Criteria andEanIsNotNull() {
            addCriterion("EAN is not null");
            return (Criteria) this;
        }

        public Criteria andEanEqualTo(String value) {
            addCriterion("EAN =", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("EAN = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEanNotEqualTo(String value) {
            addCriterion("EAN <>", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("EAN <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEanGreaterThan(String value) {
            addCriterion("EAN >", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("EAN > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEanGreaterThanOrEqualTo(String value) {
            addCriterion("EAN >=", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("EAN >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEanLessThan(String value) {
            addCriterion("EAN <", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("EAN < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEanLessThanOrEqualTo(String value) {
            addCriterion("EAN <=", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("EAN <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEanLike(String value) {
            addCriterion("EAN like", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotLike(String value) {
            addCriterion("EAN not like", value, "ean");
            return (Criteria) this;
        }

        public Criteria andEanIn(List<String> values) {
            addCriterion("EAN in", values, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotIn(List<String> values) {
            addCriterion("EAN not in", values, "ean");
            return (Criteria) this;
        }

        public Criteria andEanBetween(String value1, String value2) {
            addCriterion("EAN between", value1, value2, "ean");
            return (Criteria) this;
        }

        public Criteria andEanNotBetween(String value1, String value2) {
            addCriterion("EAN not between", value1, value2, "ean");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MODEL = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MODEL <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MODEL > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MODEL >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MODEL < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MODEL <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayIsNull() {
            addCriterion("WARRANTY_DAY is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayIsNotNull() {
            addCriterion("WARRANTY_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayEqualTo(String value) {
            addCriterion("WARRANTY_DAY =", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("WARRANTY_DAY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarrantyDayNotEqualTo(String value) {
            addCriterion("WARRANTY_DAY <>", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("WARRANTY_DAY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarrantyDayGreaterThan(String value) {
            addCriterion("WARRANTY_DAY >", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("WARRANTY_DAY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarrantyDayGreaterThanOrEqualTo(String value) {
            addCriterion("WARRANTY_DAY >=", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("WARRANTY_DAY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarrantyDayLessThan(String value) {
            addCriterion("WARRANTY_DAY <", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("WARRANTY_DAY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarrantyDayLessThanOrEqualTo(String value) {
            addCriterion("WARRANTY_DAY <=", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("WARRANTY_DAY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWarrantyDayLike(String value) {
            addCriterion("WARRANTY_DAY like", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayNotLike(String value) {
            addCriterion("WARRANTY_DAY not like", value, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayIn(List<String> values) {
            addCriterion("WARRANTY_DAY in", values, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayNotIn(List<String> values) {
            addCriterion("WARRANTY_DAY not in", values, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayBetween(String value1, String value2) {
            addCriterion("WARRANTY_DAY between", value1, value2, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andWarrantyDayNotBetween(String value1, String value2) {
            addCriterion("WARRANTY_DAY not between", value1, value2, "warrantyDay");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNull() {
            addCriterion("RETAIL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceIsNotNull() {
            addCriterion("RETAIL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRetailPriceEqualTo(BigDecimal value) {
            addCriterion("RETAIL_PRICE =", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("RETAIL_PRICE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotEqualTo(BigDecimal value) {
            addCriterion("RETAIL_PRICE <>", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("RETAIL_PRICE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThan(BigDecimal value) {
            addCriterion("RETAIL_PRICE >", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("RETAIL_PRICE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETAIL_PRICE >=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("RETAIL_PRICE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThan(BigDecimal value) {
            addCriterion("RETAIL_PRICE <", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("RETAIL_PRICE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETAIL_PRICE <=", value, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("RETAIL_PRICE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRetailPriceIn(List<BigDecimal> values) {
            addCriterion("RETAIL_PRICE in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotIn(List<BigDecimal> values) {
            addCriterion("RETAIL_PRICE not in", values, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETAIL_PRICE between", value1, value2, "retailPrice");
            return (Criteria) this;
        }

        public Criteria andRetailPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETAIL_PRICE not between", value1, value2, "retailPrice");
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

        public Criteria andCreatedByEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATED_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATED_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATED_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATED_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATED_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualToColumn(ProProduct.Column column) {
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

        public Criteria andCreationDateEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CREATION_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualToColumn(ProProduct.Column column) {
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

        public Criteria andLastUpdateByEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(ProProduct.Column column) {
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

        public Criteria andLastUpdateDateEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_DATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualToColumn(ProProduct.Column column) {
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

        public Criteria andCallCntEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CALL_CNT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualTo(Integer value) {
            addCriterion("CALL_CNT <>", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CALL_CNT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThan(Integer value) {
            addCriterion("CALL_CNT >", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CALL_CNT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT >=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CALL_CNT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThan(Integer value) {
            addCriterion("CALL_CNT <", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("CALL_CNT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualTo(Integer value) {
            addCriterion("CALL_CNT <=", value, "callCnt");
            return (Criteria) this;
        }

        public Criteria andCallCntLessThanOrEqualToColumn(ProProduct.Column column) {
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

        public Criteria andRemarkEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REMARK = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REMARK <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REMARK > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REMARK >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REMARK < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualToColumn(ProProduct.Column column) {
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

        public Criteria andStsCdEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STS_CD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualTo(String value) {
            addCriterion("STS_CD <>", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STS_CD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThan(String value) {
            addCriterion("STS_CD >", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STS_CD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualTo(String value) {
            addCriterion("STS_CD >=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STS_CD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThan(String value) {
            addCriterion("STS_CD <", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STS_CD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualTo(String value) {
            addCriterion("STS_CD <=", value, "stsCd");
            return (Criteria) this;
        }

        public Criteria andStsCdLessThanOrEqualToColumn(ProProduct.Column column) {
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

        public Criteria andMininumRetailPriceIsNull() {
            addCriterion("MININUM_RETAIL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceIsNotNull() {
            addCriterion("MININUM_RETAIL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceEqualTo(BigDecimal value) {
            addCriterion("MININUM_RETAIL_PRICE =", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MININUM_RETAIL_PRICE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceNotEqualTo(BigDecimal value) {
            addCriterion("MININUM_RETAIL_PRICE <>", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MININUM_RETAIL_PRICE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceGreaterThan(BigDecimal value) {
            addCriterion("MININUM_RETAIL_PRICE >", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MININUM_RETAIL_PRICE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MININUM_RETAIL_PRICE >=", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MININUM_RETAIL_PRICE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceLessThan(BigDecimal value) {
            addCriterion("MININUM_RETAIL_PRICE <", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MININUM_RETAIL_PRICE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MININUM_RETAIL_PRICE <=", value, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("MININUM_RETAIL_PRICE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceIn(List<BigDecimal> values) {
            addCriterion("MININUM_RETAIL_PRICE in", values, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceNotIn(List<BigDecimal> values) {
            addCriterion("MININUM_RETAIL_PRICE not in", values, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MININUM_RETAIL_PRICE between", value1, value2, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andMininumRetailPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MININUM_RETAIL_PRICE not between", value1, value2, "mininumRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodIsNull() {
            addCriterion("REPLENISHMENT_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodIsNotNull() {
            addCriterion("REPLENISHMENT_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodEqualTo(String value) {
            addCriterion("REPLENISHMENT_PERIOD =", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REPLENISHMENT_PERIOD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodNotEqualTo(String value) {
            addCriterion("REPLENISHMENT_PERIOD <>", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REPLENISHMENT_PERIOD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodGreaterThan(String value) {
            addCriterion("REPLENISHMENT_PERIOD >", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REPLENISHMENT_PERIOD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("REPLENISHMENT_PERIOD >=", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REPLENISHMENT_PERIOD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodLessThan(String value) {
            addCriterion("REPLENISHMENT_PERIOD <", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REPLENISHMENT_PERIOD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodLessThanOrEqualTo(String value) {
            addCriterion("REPLENISHMENT_PERIOD <=", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("REPLENISHMENT_PERIOD <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodLike(String value) {
            addCriterion("REPLENISHMENT_PERIOD like", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodNotLike(String value) {
            addCriterion("REPLENISHMENT_PERIOD not like", value, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodIn(List<String> values) {
            addCriterion("REPLENISHMENT_PERIOD in", values, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodNotIn(List<String> values) {
            addCriterion("REPLENISHMENT_PERIOD not in", values, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodBetween(String value1, String value2) {
            addCriterion("REPLENISHMENT_PERIOD between", value1, value2, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andReplenishmentPeriodNotBetween(String value1, String value2) {
            addCriterion("REPLENISHMENT_PERIOD not between", value1, value2, "replenishmentPeriod");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNull() {
            addCriterion("KEY_WORDS is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIsNotNull() {
            addCriterion("KEY_WORDS is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordsEqualTo(String value) {
            addCriterion("KEY_WORDS =", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("KEY_WORDS = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotEqualTo(String value) {
            addCriterion("KEY_WORDS <>", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("KEY_WORDS <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThan(String value) {
            addCriterion("KEY_WORDS >", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("KEY_WORDS > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_WORDS >=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("KEY_WORDS >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThan(String value) {
            addCriterion("KEY_WORDS <", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("KEY_WORDS < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThanOrEqualTo(String value) {
            addCriterion("KEY_WORDS <=", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("KEY_WORDS <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeyWordsLike(String value) {
            addCriterion("KEY_WORDS like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotLike(String value) {
            addCriterion("KEY_WORDS not like", value, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsIn(List<String> values) {
            addCriterion("KEY_WORDS in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotIn(List<String> values) {
            addCriterion("KEY_WORDS not in", values, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsBetween(String value1, String value2) {
            addCriterion("KEY_WORDS between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andKeyWordsNotBetween(String value1, String value2) {
            addCriterion("KEY_WORDS not between", value1, value2, "keyWords");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNull() {
            addCriterion("TIME_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIsNotNull() {
            addCriterion("TIME_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andTimeUnitEqualTo(String value) {
            addCriterion("TIME_UNIT =", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TIME_UNIT = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotEqualTo(String value) {
            addCriterion("TIME_UNIT <>", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TIME_UNIT <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThan(String value) {
            addCriterion("TIME_UNIT >", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TIME_UNIT > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_UNIT >=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TIME_UNIT >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThan(String value) {
            addCriterion("TIME_UNIT <", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TIME_UNIT < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThanOrEqualTo(String value) {
            addCriterion("TIME_UNIT <=", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("TIME_UNIT <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTimeUnitLike(String value) {
            addCriterion("TIME_UNIT like", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotLike(String value) {
            addCriterion("TIME_UNIT not like", value, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitIn(List<String> values) {
            addCriterion("TIME_UNIT in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotIn(List<String> values) {
            addCriterion("TIME_UNIT not in", values, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitBetween(String value1, String value2) {
            addCriterion("TIME_UNIT between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andTimeUnitNotBetween(String value1, String value2) {
            addCriterion("TIME_UNIT not between", value1, value2, "timeUnit");
            return (Criteria) this;
        }

        public Criteria andStocksetingIsNull() {
            addCriterion("STOCKSETING is null");
            return (Criteria) this;
        }

        public Criteria andStocksetingIsNotNull() {
            addCriterion("STOCKSETING is not null");
            return (Criteria) this;
        }

        public Criteria andStocksetingEqualTo(Integer value) {
            addCriterion("STOCKSETING =", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STOCKSETING = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStocksetingNotEqualTo(Integer value) {
            addCriterion("STOCKSETING <>", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STOCKSETING <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStocksetingGreaterThan(Integer value) {
            addCriterion("STOCKSETING >", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STOCKSETING > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStocksetingGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOCKSETING >=", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STOCKSETING >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStocksetingLessThan(Integer value) {
            addCriterion("STOCKSETING <", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STOCKSETING < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStocksetingLessThanOrEqualTo(Integer value) {
            addCriterion("STOCKSETING <=", value, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingLessThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("STOCKSETING <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStocksetingIn(List<Integer> values) {
            addCriterion("STOCKSETING in", values, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingNotIn(List<Integer> values) {
            addCriterion("STOCKSETING not in", values, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingBetween(Integer value1, Integer value2) {
            addCriterion("STOCKSETING between", value1, value2, "stockseting");
            return (Criteria) this;
        }

        public Criteria andStocksetingNotBetween(Integer value1, Integer value2) {
            addCriterion("STOCKSETING not between", value1, value2, "stockseting");
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

        public Criteria andDeletedEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(ProProduct.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(ProProduct.Column column) {
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
        private ProProductExample example;

        protected Criteria(ProProductExample example) {
            super();
            this.example = example;
        }

        public ProProductExample example() {
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
        void example(ProProductExample example);
    }
}