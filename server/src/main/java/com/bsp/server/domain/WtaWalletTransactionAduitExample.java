package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtaWalletTransactionAduitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtaWalletTransactionAduitExample() {
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

    public WtaWalletTransactionAduitExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public WtaWalletTransactionAduitExample orderBy(String ... orderByClauses) {
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
        WtaWalletTransactionAduitExample example = new WtaWalletTransactionAduitExample();
        return example.createCriteria();
    }

    public WtaWalletTransactionAduitExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public WtaWalletTransactionAduitExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andTransactionAuditIdIsNull() {
            addCriterion("TRANSACTION_AUDIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdIsNotNull() {
            addCriterion("TRANSACTION_AUDIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdEqualTo(Integer value) {
            addCriterion("TRANSACTION_AUDIT_ID =", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_AUDIT_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdNotEqualTo(Integer value) {
            addCriterion("TRANSACTION_AUDIT_ID <>", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_AUDIT_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdGreaterThan(Integer value) {
            addCriterion("TRANSACTION_AUDIT_ID >", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_AUDIT_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTION_AUDIT_ID >=", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_AUDIT_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdLessThan(Integer value) {
            addCriterion("TRANSACTION_AUDIT_ID <", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_AUDIT_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTION_AUDIT_ID <=", value, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_AUDIT_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdIn(List<Integer> values) {
            addCriterion("TRANSACTION_AUDIT_ID in", values, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdNotIn(List<Integer> values) {
            addCriterion("TRANSACTION_AUDIT_ID not in", values, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTION_AUDIT_ID between", value1, value2, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andTransactionAuditIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTION_AUDIT_ID not between", value1, value2, "transactionAuditId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("BUYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("BUYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Integer value) {
            addCriterion("BUYER_ID =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("BUYER_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Integer value) {
            addCriterion("BUYER_ID <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("BUYER_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Integer value) {
            addCriterion("BUYER_ID >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("BUYER_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUYER_ID >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("BUYER_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Integer value) {
            addCriterion("BUYER_ID <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("BUYER_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUYER_ID <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("BUYER_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Integer> values) {
            addCriterion("BUYER_ID in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Integer> values) {
            addCriterion("BUYER_ID not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Integer value1, Integer value2) {
            addCriterion("BUYER_ID between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUYER_ID not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(Integer value) {
            addCriterion("TRANSACTION_ID =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(Integer value) {
            addCriterion("TRANSACTION_ID <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(Integer value) {
            addCriterion("TRANSACTION_ID >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTION_ID >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(Integer value) {
            addCriterion("TRANSACTION_ID <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTION_ID <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<Integer> values) {
            addCriterion("TRANSACTION_ID in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<Integer> values) {
            addCriterion("TRANSACTION_ID not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTION_ID between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTION_ID not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeIsNull() {
            addCriterion("AVAILABLE_MONEY_BEFORE is null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeIsNotNull() {
            addCriterion("AVAILABLE_MONEY_BEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_BEFORE =", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_BEFORE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_BEFORE <>", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_BEFORE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_BEFORE >", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_BEFORE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_BEFORE >=", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_BEFORE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_BEFORE <", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_BEFORE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_BEFORE <=", value, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_BEFORE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_MONEY_BEFORE in", values, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_MONEY_BEFORE not in", values, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_MONEY_BEFORE between", value1, value2, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_MONEY_BEFORE not between", value1, value2, "availableMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeIsNull() {
            addCriterion("DEPOSITING_MONEY_BEFORE is null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeIsNotNull() {
            addCriterion("DEPOSITING_MONEY_BEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_BEFORE =", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_BEFORE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_BEFORE <>", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_BEFORE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeGreaterThan(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_BEFORE >", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_BEFORE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_BEFORE >=", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_BEFORE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeLessThan(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_BEFORE <", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_BEFORE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_BEFORE <=", value, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_BEFORE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeIn(List<BigDecimal> values) {
            addCriterion("DEPOSITING_MONEY_BEFORE in", values, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSITING_MONEY_BEFORE not in", values, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSITING_MONEY_BEFORE between", value1, value2, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSITING_MONEY_BEFORE not between", value1, value2, "depositingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeIsNull() {
            addCriterion("WITHDRAWING_MONEY_BEFORE is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeIsNotNull() {
            addCriterion("WITHDRAWING_MONEY_BEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_BEFORE =", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_BEFORE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeNotEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_BEFORE <>", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_BEFORE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeGreaterThan(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_BEFORE >", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_BEFORE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_BEFORE >=", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_BEFORE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeLessThan(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_BEFORE <", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_BEFORE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_BEFORE <=", value, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_BEFORE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeIn(List<BigDecimal> values) {
            addCriterion("WITHDRAWING_MONEY_BEFORE in", values, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeNotIn(List<BigDecimal> values) {
            addCriterion("WITHDRAWING_MONEY_BEFORE not in", values, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAWING_MONEY_BEFORE between", value1, value2, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBeforeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAWING_MONEY_BEFORE not between", value1, value2, "withdrawingMoneyBefore");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyIsNull() {
            addCriterion("OPERATE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyIsNotNull() {
            addCriterion("OPERATE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyEqualTo(BigDecimal value) {
            addCriterion("OPERATE_MONEY =", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_MONEY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateMoneyNotEqualTo(BigDecimal value) {
            addCriterion("OPERATE_MONEY <>", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_MONEY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateMoneyGreaterThan(BigDecimal value) {
            addCriterion("OPERATE_MONEY >", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_MONEY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATE_MONEY >=", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_MONEY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateMoneyLessThan(BigDecimal value) {
            addCriterion("OPERATE_MONEY <", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_MONEY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATE_MONEY <=", value, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_MONEY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateMoneyIn(List<BigDecimal> values) {
            addCriterion("OPERATE_MONEY in", values, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyNotIn(List<BigDecimal> values) {
            addCriterion("OPERATE_MONEY not in", values, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATE_MONEY between", value1, value2, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATE_MONEY not between", value1, value2, "operateMoney");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNull() {
            addCriterion("OPERATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNotNull() {
            addCriterion("OPERATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualTo(Byte value) {
            addCriterion("OPERATE_TYPE =", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_TYPE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualTo(Byte value) {
            addCriterion("OPERATE_TYPE <>", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_TYPE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThan(Byte value) {
            addCriterion("OPERATE_TYPE >", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_TYPE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("OPERATE_TYPE >=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_TYPE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThan(Byte value) {
            addCriterion("OPERATE_TYPE <", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_TYPE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("OPERATE_TYPE <=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_TYPE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateTypeIn(List<Byte> values) {
            addCriterion("OPERATE_TYPE in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotIn(List<Byte> values) {
            addCriterion("OPERATE_TYPE not in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeBetween(Byte value1, Byte value2) {
            addCriterion("OPERATE_TYPE between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("OPERATE_TYPE not between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterIsNull() {
            addCriterion("AVAILABLE_MONEY_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterIsNotNull() {
            addCriterion("AVAILABLE_MONEY_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_AFTER =", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_AFTER = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_AFTER <>", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_AFTER <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_AFTER >", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_AFTER > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_AFTER >=", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_AFTER >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_AFTER <", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_AFTER < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY_AFTER <=", value, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY_AFTER <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_MONEY_AFTER in", values, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_MONEY_AFTER not in", values, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_MONEY_AFTER between", value1, value2, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_MONEY_AFTER not between", value1, value2, "availableMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterIsNull() {
            addCriterion("DEPOSITING_MONEY_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterIsNotNull() {
            addCriterion("DEPOSITING_MONEY_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_AFTER =", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_AFTER = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_AFTER <>", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_AFTER <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterGreaterThan(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_AFTER >", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_AFTER > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_AFTER >=", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_AFTER >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterLessThan(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_AFTER <", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_AFTER < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY_AFTER <=", value, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY_AFTER <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterIn(List<BigDecimal> values) {
            addCriterion("DEPOSITING_MONEY_AFTER in", values, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSITING_MONEY_AFTER not in", values, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSITING_MONEY_AFTER between", value1, value2, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSITING_MONEY_AFTER not between", value1, value2, "depositingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterIsNull() {
            addCriterion("WITHDRAWING_MONEY_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterIsNotNull() {
            addCriterion("WITHDRAWING_MONEY_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_AFTER =", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_AFTER = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterNotEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_AFTER <>", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_AFTER <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterGreaterThan(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_AFTER >", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_AFTER > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_AFTER >=", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_AFTER >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterLessThan(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_AFTER <", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_AFTER < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY_AFTER <=", value, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY_AFTER <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterIn(List<BigDecimal> values) {
            addCriterion("WITHDRAWING_MONEY_AFTER in", values, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterNotIn(List<BigDecimal> values) {
            addCriterion("WITHDRAWING_MONEY_AFTER not in", values, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAWING_MONEY_AFTER between", value1, value2, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyAfterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAWING_MONEY_AFTER not between", value1, value2, "withdrawingMoneyAfter");
            return (Criteria) this;
        }

        public Criteria andOperateByIsNull() {
            addCriterion("OPERATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andOperateByIsNotNull() {
            addCriterion("OPERATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andOperateByEqualTo(String value) {
            addCriterion("OPERATE_BY =", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateByNotEqualTo(String value) {
            addCriterion("OPERATE_BY <>", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateByGreaterThan(String value) {
            addCriterion("OPERATE_BY >", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateByGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATE_BY >=", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateByLessThan(String value) {
            addCriterion("OPERATE_BY <", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateByLessThanOrEqualTo(String value) {
            addCriterion("OPERATE_BY <=", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("OPERATE_BY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperateByLike(String value) {
            addCriterion("OPERATE_BY like", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByNotLike(String value) {
            addCriterion("OPERATE_BY not like", value, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByIn(List<String> values) {
            addCriterion("OPERATE_BY in", values, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByNotIn(List<String> values) {
            addCriterion("OPERATE_BY not in", values, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByBetween(String value1, String value2) {
            addCriterion("OPERATE_BY between", value1, value2, "operateBy");
            return (Criteria) this;
        }

        public Criteria andOperateByNotBetween(String value1, String value2) {
            addCriterion("OPERATE_BY not between", value1, value2, "operateBy");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`STATUS` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("`STATUS` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`STATUS` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("`STATUS` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`STATUS` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("`STATUS` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`STATUS` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("`STATUS` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`STATUS` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("`STATUS` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`STATUS` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("`STATUS` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`STATUS` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`STATUS` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`STATUS` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`STATUS` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_BY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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

        public Criteria andLastUpdateByEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
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

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("LAST_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("LAST_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
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

        public Criteria andDeletedEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(WtaWalletTransactionAduit.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(WtaWalletTransactionAduit.Column column) {
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
        private WtaWalletTransactionAduitExample example;

        protected Criteria(WtaWalletTransactionAduitExample example) {
            super();
            this.example = example;
        }

        public WtaWalletTransactionAduitExample example() {
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
        void example(WtaWalletTransactionAduitExample example);
    }
}