package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WafWalletAccountFundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WafWalletAccountFundExample() {
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

    public WafWalletAccountFundExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public WafWalletAccountFundExample orderBy(String ... orderByClauses) {
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
        WafWalletAccountFundExample example = new WafWalletAccountFundExample();
        return example.createCriteria();
    }

    public WafWalletAccountFundExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public WafWalletAccountFundExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andBuyerIdEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("BUYER_ID = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Integer value) {
            addCriterion("BUYER_ID <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("BUYER_ID <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Integer value) {
            addCriterion("BUYER_ID >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("BUYER_ID > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUYER_ID >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("BUYER_ID >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Integer value) {
            addCriterion("BUYER_ID <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("BUYER_ID < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUYER_ID <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
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

        public Criteria andAvailableMoneyIsNull() {
            addCriterion("AVAILABLE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyIsNotNull() {
            addCriterion("AVAILABLE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY =", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY <>", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY >", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY >=", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY <", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_MONEY <=", value, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("AVAILABLE_MONEY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_MONEY in", values, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_MONEY not in", values, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_MONEY between", value1, value2, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andAvailableMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_MONEY not between", value1, value2, "availableMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyIsNull() {
            addCriterion("DEPOSITING_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyIsNotNull() {
            addCriterion("DEPOSITING_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY =", value, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY <>", value, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyGreaterThan(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY >", value, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY >=", value, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyLessThan(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY <", value, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSITING_MONEY <=", value, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("DEPOSITING_MONEY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyIn(List<BigDecimal> values) {
            addCriterion("DEPOSITING_MONEY in", values, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSITING_MONEY not in", values, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSITING_MONEY between", value1, value2, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andDepositingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSITING_MONEY not between", value1, value2, "depositingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyIsNull() {
            addCriterion("WITHDRAWING_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyIsNotNull() {
            addCriterion("WITHDRAWING_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY =", value, "withdrawingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyNotEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY <>", value, "withdrawingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyGreaterThan(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY >", value, "withdrawingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY >=", value, "withdrawingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyLessThan(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY <", value, "withdrawingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHDRAWING_MONEY <=", value, "withdrawingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("WITHDRAWING_MONEY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyIn(List<BigDecimal> values) {
            addCriterion("WITHDRAWING_MONEY in", values, "withdrawingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyNotIn(List<BigDecimal> values) {
            addCriterion("WITHDRAWING_MONEY not in", values, "withdrawingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAWING_MONEY between", value1, value2, "withdrawingMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawingMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHDRAWING_MONEY not between", value1, value2, "withdrawingMoney");
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

        public Criteria andCreateByEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
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

        public Criteria andCreateTimeEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CREATE_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
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

        public Criteria andLastUpdateByEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_BY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
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

        public Criteria andLastUpdateTimeEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("LAST_UPDATE_TIME < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
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

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CURRENCY = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CURRENCY <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CURRENCY > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CURRENCY >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CURRENCY < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("CURRENCY <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
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

        public Criteria andDeletedEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(WafWalletAccountFund.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(WafWalletAccountFund.Column column) {
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
        private WafWalletAccountFundExample example;

        protected Criteria(WafWalletAccountFundExample example) {
            super();
            this.example = example;
        }

        public WafWalletAccountFundExample example() {
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
        void example(WafWalletAccountFundExample example);
    }
}