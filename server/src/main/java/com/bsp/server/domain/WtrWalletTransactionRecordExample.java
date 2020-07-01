package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtrWalletTransactionRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtrWalletTransactionRecordExample() {
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

    public WtrWalletTransactionRecordExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public WtrWalletTransactionRecordExample orderBy(String ... orderByClauses) {
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
        WtrWalletTransactionRecordExample example = new WtrWalletTransactionRecordExample();
        return example.createCriteria();
    }

    public WtrWalletTransactionRecordExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public WtrWalletTransactionRecordExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andTransactionIdEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(Integer value) {
            addCriterion("TRANSACTION_ID <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(Integer value) {
            addCriterion("TRANSACTION_ID >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTION_ID >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(Integer value) {
            addCriterion("TRANSACTION_ID <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTION_ID <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
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

        public Criteria andBuyerIdEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUYER_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Integer value) {
            addCriterion("BUYER_ID <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUYER_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Integer value) {
            addCriterion("BUYER_ID >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUYER_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUYER_ID >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUYER_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Integer value) {
            addCriterion("BUYER_ID <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUYER_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUYER_ID <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
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

        public Criteria andBankCardIdIsNull() {
            addCriterion("BANK_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdIsNotNull() {
            addCriterion("BANK_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardIdEqualTo(Integer value) {
            addCriterion("BANK_CARD_ID =", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_CARD_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotEqualTo(Integer value) {
            addCriterion("BANK_CARD_ID <>", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_CARD_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThan(Integer value) {
            addCriterion("BANK_CARD_ID >", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_CARD_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BANK_CARD_ID >=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_CARD_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThan(Integer value) {
            addCriterion("BANK_CARD_ID <", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_CARD_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("BANK_CARD_ID <=", value, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_CARD_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankCardIdIn(List<Integer> values) {
            addCriterion("BANK_CARD_ID in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotIn(List<Integer> values) {
            addCriterion("BANK_CARD_ID not in", values, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdBetween(Integer value1, Integer value2) {
            addCriterion("BANK_CARD_ID between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andBankCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BANK_CARD_ID not between", value1, value2, "bankCardId");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberIsNull() {
            addCriterion("TRANSACTION_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberIsNotNull() {
            addCriterion("TRANSACTION_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberEqualTo(String value) {
            addCriterion("TRANSACTION_NUMBER =", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_NUMBER = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotEqualTo(String value) {
            addCriterion("TRANSACTION_NUMBER <>", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_NUMBER <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionNumberGreaterThan(String value) {
            addCriterion("TRANSACTION_NUMBER >", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_NUMBER > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionNumberGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_NUMBER >=", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_NUMBER >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLessThan(String value) {
            addCriterion("TRANSACTION_NUMBER <", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_NUMBER < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_NUMBER <=", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_NUMBER <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLike(String value) {
            addCriterion("TRANSACTION_NUMBER like", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotLike(String value) {
            addCriterion("TRANSACTION_NUMBER not like", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberIn(List<String> values) {
            addCriterion("TRANSACTION_NUMBER in", values, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotIn(List<String> values) {
            addCriterion("TRANSACTION_NUMBER not in", values, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberBetween(String value1, String value2) {
            addCriterion("TRANSACTION_NUMBER between", value1, value2, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_NUMBER not between", value1, value2, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNull() {
            addCriterion("TRANSACTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNotNull() {
            addCriterion("TRANSACTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualTo(Byte value) {
            addCriterion("TRANSACTION_TYPE =", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_TYPE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualTo(Byte value) {
            addCriterion("TRANSACTION_TYPE <>", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_TYPE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThan(Byte value) {
            addCriterion("TRANSACTION_TYPE >", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_TYPE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("TRANSACTION_TYPE >=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_TYPE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThan(Byte value) {
            addCriterion("TRANSACTION_TYPE <", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_TYPE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualTo(Byte value) {
            addCriterion("TRANSACTION_TYPE <=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_TYPE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIn(List<Byte> values) {
            addCriterion("TRANSACTION_TYPE in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotIn(List<Byte> values) {
            addCriterion("TRANSACTION_TYPE not in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeBetween(Byte value1, Byte value2) {
            addCriterion("TRANSACTION_TYPE between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("TRANSACTION_TYPE not between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("ACCOUNT_NAME =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACCOUNT_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACCOUNT_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("ACCOUNT_NAME >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACCOUNT_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACCOUNT_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("ACCOUNT_NAME <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACCOUNT_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACCOUNT_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("ACCOUNT_NAME like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("ACCOUNT_NAME not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("ACCOUNT_NAME in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("ACCOUNT_NAME not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyIsNull() {
            addCriterion("TRANSACTION_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyIsNotNull() {
            addCriterion("TRANSACTION_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyEqualTo(BigDecimal value) {
            addCriterion("TRANSACTION_MONEY =", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_MONEY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyNotEqualTo(BigDecimal value) {
            addCriterion("TRANSACTION_MONEY <>", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_MONEY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyGreaterThan(BigDecimal value) {
            addCriterion("TRANSACTION_MONEY >", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_MONEY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSACTION_MONEY >=", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_MONEY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyLessThan(BigDecimal value) {
            addCriterion("TRANSACTION_MONEY <", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_MONEY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSACTION_MONEY <=", value, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_MONEY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyIn(List<BigDecimal> values) {
            addCriterion("TRANSACTION_MONEY in", values, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyNotIn(List<BigDecimal> values) {
            addCriterion("TRANSACTION_MONEY not in", values, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSACTION_MONEY between", value1, value2, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andTransactionMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSACTION_MONEY not between", value1, value2, "transactionMoney");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("COMMISSION is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("COMMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(BigDecimal value) {
            addCriterion("COMMISSION =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMMISSION = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(BigDecimal value) {
            addCriterion("COMMISSION <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMMISSION <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(BigDecimal value) {
            addCriterion("COMMISSION >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMMISSION > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSION >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMMISSION >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(BigDecimal value) {
            addCriterion("COMMISSION <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMMISSION < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMISSION <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMMISSION <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<BigDecimal> values) {
            addCriterion("COMMISSION in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<BigDecimal> values) {
            addCriterion("COMMISSION not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMISSION between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMISSION not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionIsNull() {
            addCriterion("DISCOUNT_COMMISSION is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionIsNotNull() {
            addCriterion("DISCOUNT_COMMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_COMMISSION =", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("DISCOUNT_COMMISSION = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_COMMISSION <>", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("DISCOUNT_COMMISSION <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_COMMISSION >", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("DISCOUNT_COMMISSION > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_COMMISSION >=", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("DISCOUNT_COMMISSION >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_COMMISSION <", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("DISCOUNT_COMMISSION < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_COMMISSION <=", value, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("DISCOUNT_COMMISSION <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_COMMISSION in", values, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_COMMISSION not in", values, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_COMMISSION between", value1, value2, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andDiscountCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_COMMISSION not between", value1, value2, "discountCommission");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodIsNull() {
            addCriterion("TRANSACTION_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodIsNotNull() {
            addCriterion("TRANSACTION_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodEqualTo(Byte value) {
            addCriterion("TRANSACTION_METHOD =", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_METHOD = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMethodNotEqualTo(Byte value) {
            addCriterion("TRANSACTION_METHOD <>", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_METHOD <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMethodGreaterThan(Byte value) {
            addCriterion("TRANSACTION_METHOD >", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_METHOD > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMethodGreaterThanOrEqualTo(Byte value) {
            addCriterion("TRANSACTION_METHOD >=", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_METHOD >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMethodLessThan(Byte value) {
            addCriterion("TRANSACTION_METHOD <", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_METHOD < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMethodLessThanOrEqualTo(Byte value) {
            addCriterion("TRANSACTION_METHOD <=", value, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_METHOD <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionMethodIn(List<Byte> values) {
            addCriterion("TRANSACTION_METHOD in", values, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodNotIn(List<Byte> values) {
            addCriterion("TRANSACTION_METHOD not in", values, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodBetween(Byte value1, Byte value2) {
            addCriterion("TRANSACTION_METHOD between", value1, value2, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andTransactionMethodNotBetween(Byte value1, Byte value2) {
            addCriterion("TRANSACTION_METHOD not between", value1, value2, "transactionMethod");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("COMPLETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("COMPLETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("COMPLETE_TIME =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMPLETE_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("COMPLETE_TIME <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMPLETE_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("COMPLETE_TIME >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMPLETE_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_TIME >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMPLETE_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("COMPLETE_TIME <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMPLETE_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_TIME <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("COMPLETE_TIME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("COMPLETE_TIME in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("COMPLETE_TIME not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_TIME between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_TIME not between", value1, value2, "completeTime");
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

        public Criteria andStatusEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("`STATUS` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`STATUS` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("`STATUS` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`STATUS` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("`STATUS` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`STATUS` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("`STATUS` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`STATUS` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("`STATUS` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`STATUS` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
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

        public Criteria andActualMoneyIsNull() {
            addCriterion("ACTUAL_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andActualMoneyIsNotNull() {
            addCriterion("ACTUAL_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andActualMoneyEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_MONEY =", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_MONEY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_MONEY <>", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_MONEY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualMoneyGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_MONEY >", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_MONEY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_MONEY >=", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_MONEY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualMoneyLessThan(BigDecimal value) {
            addCriterion("ACTUAL_MONEY <", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_MONEY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_MONEY <=", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_MONEY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualMoneyIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_MONEY in", values, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_MONEY not in", values, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_MONEY between", value1, value2, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_MONEY not between", value1, value2, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualCommissionIsNull() {
            addCriterion("ACTUAL_COMMISSION is null");
            return (Criteria) this;
        }

        public Criteria andActualCommissionIsNotNull() {
            addCriterion("ACTUAL_COMMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andActualCommissionEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COMMISSION =", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_COMMISSION = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualCommissionNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COMMISSION <>", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_COMMISSION <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualCommissionGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COMMISSION >", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_COMMISSION > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COMMISSION >=", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_COMMISSION >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualCommissionLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COMMISSION <", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_COMMISSION < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COMMISSION <=", value, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_COMMISSION <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualCommissionIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COMMISSION in", values, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COMMISSION not in", values, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COMMISSION between", value1, value2, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COMMISSION not between", value1, value2, "actualCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionIsNull() {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION is null");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionIsNotNull() {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION =", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_DISCOUNT_COMMISSION = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION <>", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_DISCOUNT_COMMISSION <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION >", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_DISCOUNT_COMMISSION > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION >=", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_DISCOUNT_COMMISSION >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionLessThan(BigDecimal value) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION <", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_DISCOUNT_COMMISSION < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION <=", value, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("ACTUAL_DISCOUNT_COMMISSION <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION in", values, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION not in", values, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION between", value1, value2, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andActualDiscountCommissionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_DISCOUNT_COMMISSION not between", value1, value2, "actualDiscountCommission");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BALANCE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BALANCE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BALANCE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BALANCE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BALANCE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BALANCE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("BUSINESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("BUSINESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("BUSINESS_ID =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUSINESS_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("BUSINESS_ID <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUSINESS_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("BUSINESS_ID >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUSINESS_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_ID >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUSINESS_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("BUSINESS_ID <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUSINESS_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_ID <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BUSINESS_ID <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("BUSINESS_ID in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("BUSINESS_ID not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_ID between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_ID not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIsNull() {
            addCriterion("FINANCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIsNotNull() {
            addCriterion("FINANCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeEqualTo(Byte value) {
            addCriterion("FINANCE_TYPE =", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FINANCE_TYPE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotEqualTo(Byte value) {
            addCriterion("FINANCE_TYPE <>", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FINANCE_TYPE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThan(Byte value) {
            addCriterion("FINANCE_TYPE >", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FINANCE_TYPE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("FINANCE_TYPE >=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FINANCE_TYPE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThan(Byte value) {
            addCriterion("FINANCE_TYPE <", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FINANCE_TYPE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThanOrEqualTo(Byte value) {
            addCriterion("FINANCE_TYPE <=", value, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FINANCE_TYPE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFinanceTypeIn(List<Byte> values) {
            addCriterion("FINANCE_TYPE in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotIn(List<Byte> values) {
            addCriterion("FINANCE_TYPE not in", values, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeBetween(Byte value1, Byte value2) {
            addCriterion("FINANCE_TYPE between", value1, value2, "financeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("FINANCE_TYPE not between", value1, value2, "financeType");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("NOTE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("NOTE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("NOTE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("NOTE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("NOTE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("NOTE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("OPERATOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("OPERATOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("OPERATOR_NAME =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_NAME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("OPERATOR_NAME <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_NAME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("OPERATOR_NAME >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_NAME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_NAME >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_NAME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("OPERATOR_NAME <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_NAME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_NAME <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_NAME <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("OPERATOR_NAME like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("OPERATOR_NAME not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("OPERATOR_NAME in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("OPERATOR_NAME not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("OPERATOR_NAME between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_NAME not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorIpIsNull() {
            addCriterion("OPERATOR_IP is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIpIsNotNull() {
            addCriterion("OPERATOR_IP is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIpEqualTo(String value) {
            addCriterion("OPERATOR_IP =", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_IP = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotEqualTo(String value) {
            addCriterion("OPERATOR_IP <>", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_IP <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorIpGreaterThan(String value) {
            addCriterion("OPERATOR_IP >", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_IP > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorIpGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_IP >=", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_IP >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorIpLessThan(String value) {
            addCriterion("OPERATOR_IP <", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_IP < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorIpLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_IP <=", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("OPERATOR_IP <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOperatorIpLike(String value) {
            addCriterion("OPERATOR_IP like", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotLike(String value) {
            addCriterion("OPERATOR_IP not like", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpIn(List<String> values) {
            addCriterion("OPERATOR_IP in", values, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotIn(List<String> values) {
            addCriterion("OPERATOR_IP not in", values, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpBetween(String value1, String value2) {
            addCriterion("OPERATOR_IP between", value1, value2, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_IP not between", value1, value2, "operatorIp");
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

        public Criteria andCreateByEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
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

        public Criteria andCreateTimeEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
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

        public Criteria andLastUpdateByEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
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

        public Criteria andLastUpdateTimeEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
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

        public Criteria andBankReceiptUrlIsNull() {
            addCriterion("BANK_RECEIPT_URL is null");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlIsNotNull() {
            addCriterion("BANK_RECEIPT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlEqualTo(String value) {
            addCriterion("BANK_RECEIPT_URL =", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_RECEIPT_URL = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlNotEqualTo(String value) {
            addCriterion("BANK_RECEIPT_URL <>", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_RECEIPT_URL <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlGreaterThan(String value) {
            addCriterion("BANK_RECEIPT_URL >", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_RECEIPT_URL > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_RECEIPT_URL >=", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_RECEIPT_URL >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlLessThan(String value) {
            addCriterion("BANK_RECEIPT_URL <", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_RECEIPT_URL < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlLessThanOrEqualTo(String value) {
            addCriterion("BANK_RECEIPT_URL <=", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("BANK_RECEIPT_URL <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlLike(String value) {
            addCriterion("BANK_RECEIPT_URL like", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlNotLike(String value) {
            addCriterion("BANK_RECEIPT_URL not like", value, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlIn(List<String> values) {
            addCriterion("BANK_RECEIPT_URL in", values, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlNotIn(List<String> values) {
            addCriterion("BANK_RECEIPT_URL not in", values, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlBetween(String value1, String value2) {
            addCriterion("BANK_RECEIPT_URL between", value1, value2, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andBankReceiptUrlNotBetween(String value1, String value2) {
            addCriterion("BANK_RECEIPT_URL not between", value1, value2, "bankReceiptUrl");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNull() {
            addCriterion("EXCHANGE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNotNull() {
            addCriterion("EXCHANGE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("EXCHANGE_RATE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("EXCHANGE_RATE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGE_RATE >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("EXCHANGE_RATE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE >=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("EXCHANGE_RATE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("EXCHANGE_RATE <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("EXCHANGE_RATE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE <=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("EXCHANGE_RATE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExchangeRateIn(List<BigDecimal> values) {
            addCriterion("EXCHANGE_RATE in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGE_RATE not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGE_RATE between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGE_RATE not between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andTransactionDescIsNull() {
            addCriterion("TRANSACTION_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTransactionDescIsNotNull() {
            addCriterion("TRANSACTION_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionDescEqualTo(String value) {
            addCriterion("TRANSACTION_DESC =", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_DESC = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotEqualTo(String value) {
            addCriterion("TRANSACTION_DESC <>", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_DESC <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionDescGreaterThan(String value) {
            addCriterion("TRANSACTION_DESC >", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_DESC > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionDescGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_DESC >=", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_DESC >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionDescLessThan(String value) {
            addCriterion("TRANSACTION_DESC <", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_DESC < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionDescLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_DESC <=", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("TRANSACTION_DESC <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTransactionDescLike(String value) {
            addCriterion("TRANSACTION_DESC like", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotLike(String value) {
            addCriterion("TRANSACTION_DESC not like", value, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescIn(List<String> values) {
            addCriterion("TRANSACTION_DESC in", values, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotIn(List<String> values) {
            addCriterion("TRANSACTION_DESC not in", values, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescBetween(String value1, String value2) {
            addCriterion("TRANSACTION_DESC between", value1, value2, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionDescNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_DESC not between", value1, value2, "transactionDesc");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeIsNull() {
            addCriterion("FOREIGN_EXCHANGE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeIsNotNull() {
            addCriterion("FOREIGN_EXCHANGE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeEqualTo(BigDecimal value) {
            addCriterion("FOREIGN_EXCHANGE_FEE =", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FOREIGN_EXCHANGE_FEE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeNotEqualTo(BigDecimal value) {
            addCriterion("FOREIGN_EXCHANGE_FEE <>", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FOREIGN_EXCHANGE_FEE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeGreaterThan(BigDecimal value) {
            addCriterion("FOREIGN_EXCHANGE_FEE >", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FOREIGN_EXCHANGE_FEE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOREIGN_EXCHANGE_FEE >=", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FOREIGN_EXCHANGE_FEE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeLessThan(BigDecimal value) {
            addCriterion("FOREIGN_EXCHANGE_FEE <", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FOREIGN_EXCHANGE_FEE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOREIGN_EXCHANGE_FEE <=", value, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("FOREIGN_EXCHANGE_FEE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeIn(List<BigDecimal> values) {
            addCriterion("FOREIGN_EXCHANGE_FEE in", values, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeNotIn(List<BigDecimal> values) {
            addCriterion("FOREIGN_EXCHANGE_FEE not in", values, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOREIGN_EXCHANGE_FEE between", value1, value2, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andForeignExchangeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOREIGN_EXCHANGE_FEE not between", value1, value2, "foreignExchangeFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeIsNull() {
            addCriterion("WITHDRAW_FEE is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeIsNotNull() {
            addCriterion("WITHDRAW_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeEqualTo(BigDecimal value) {
            addCriterion("WITHDRAW_FEE =", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("WITHDRAW_FEE = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeNotEqualTo(BigDecimal value) {
            addCriterion("WITHDRAW_FEE <>", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("WITHDRAW_FEE <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeGreaterThan(BigDecimal value) {
            addCriterion("WITHDRAW_FEE >", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("WITHDRAW_FEE > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAW_FEE >=", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("WITHDRAW_FEE >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeLessThan(BigDecimal value) {
            addCriterion("WITHDRAW_FEE <", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("WITHDRAW_FEE < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAW_FEE <=", value, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("WITHDRAW_FEE <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeIn(List<BigDecimal> values) {
            addCriterion("WITHDRAW_FEE in", values, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeNotIn(List<BigDecimal> values) {
            addCriterion("WITHDRAW_FEE not in", values, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAW_FEE between", value1, value2, "withdrawFee");
            return (Criteria) this;
        }

        public Criteria andWithdrawFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAW_FEE not between", value1, value2, "withdrawFee");
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

        public Criteria andDeletedEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(WtrWalletTransactionRecord.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(WtrWalletTransactionRecord.Column column) {
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
        private WtrWalletTransactionRecordExample example;

        protected Criteria(WtrWalletTransactionRecordExample example) {
            super();
            this.example = example;
        }

        public WtrWalletTransactionRecordExample example() {
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
        void example(WtrWalletTransactionRecordExample example);
    }
}