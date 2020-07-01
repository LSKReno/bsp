package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class WtrWalletTransactionRecord {
    private Integer transactionId;

    private Integer buyerId;

    private Integer bankCardId;

    private String transactionNumber;

    private Byte transactionType;

    private String accountName;

    private BigDecimal transactionMoney;

    private BigDecimal commission;

    private BigDecimal discountCommission;

    private Byte transactionMethod;

    private Date completeTime;

    private Byte status;

    private BigDecimal actualMoney;

    private BigDecimal actualCommission;

    private BigDecimal actualDiscountCommission;

    private BigDecimal balance;

    private Integer businessId;

    private Byte financeType;

    private String note;

    private String operatorName;

    private String operatorIp;

    private String createBy;

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;

    private String bankReceiptUrl;

    private BigDecimal exchangeRate;

    private String transactionDesc;

    private BigDecimal foreignExchangeFee;

    private BigDecimal withdrawFee;

    private Boolean deleted;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Byte getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Byte transactionType) {
        this.transactionType = transactionType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BigDecimal getTransactionMoney() {
        return transactionMoney;
    }

    public void setTransactionMoney(BigDecimal transactionMoney) {
        this.transactionMoney = transactionMoney;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getDiscountCommission() {
        return discountCommission;
    }

    public void setDiscountCommission(BigDecimal discountCommission) {
        this.discountCommission = discountCommission;
    }

    public Byte getTransactionMethod() {
        return transactionMethod;
    }

    public void setTransactionMethod(Byte transactionMethod) {
        this.transactionMethod = transactionMethod;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public BigDecimal getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(BigDecimal actualMoney) {
        this.actualMoney = actualMoney;
    }

    public BigDecimal getActualCommission() {
        return actualCommission;
    }

    public void setActualCommission(BigDecimal actualCommission) {
        this.actualCommission = actualCommission;
    }

    public BigDecimal getActualDiscountCommission() {
        return actualDiscountCommission;
    }

    public void setActualDiscountCommission(BigDecimal actualDiscountCommission) {
        this.actualDiscountCommission = actualDiscountCommission;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Byte getFinanceType() {
        return financeType;
    }

    public void setFinanceType(Byte financeType) {
        this.financeType = financeType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getBankReceiptUrl() {
        return bankReceiptUrl;
    }

    public void setBankReceiptUrl(String bankReceiptUrl) {
        this.bankReceiptUrl = bankReceiptUrl;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }

    public void setTransactionDesc(String transactionDesc) {
        this.transactionDesc = transactionDesc;
    }

    public BigDecimal getForeignExchangeFee() {
        return foreignExchangeFee;
    }

    public void setForeignExchangeFee(BigDecimal foreignExchangeFee) {
        this.foreignExchangeFee = foreignExchangeFee;
    }

    public BigDecimal getWithdrawFee() {
        return withdrawFee;
    }

    public void setWithdrawFee(BigDecimal withdrawFee) {
        this.withdrawFee = withdrawFee;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transactionId=").append(transactionId);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", bankCardId=").append(bankCardId);
        sb.append(", transactionNumber=").append(transactionNumber);
        sb.append(", transactionType=").append(transactionType);
        sb.append(", accountName=").append(accountName);
        sb.append(", transactionMoney=").append(transactionMoney);
        sb.append(", commission=").append(commission);
        sb.append(", discountCommission=").append(discountCommission);
        sb.append(", transactionMethod=").append(transactionMethod);
        sb.append(", completeTime=").append(completeTime);
        sb.append(", status=").append(status);
        sb.append(", actualMoney=").append(actualMoney);
        sb.append(", actualCommission=").append(actualCommission);
        sb.append(", actualDiscountCommission=").append(actualDiscountCommission);
        sb.append(", balance=").append(balance);
        sb.append(", businessId=").append(businessId);
        sb.append(", financeType=").append(financeType);
        sb.append(", note=").append(note);
        sb.append(", operatorName=").append(operatorName);
        sb.append(", operatorIp=").append(operatorIp);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", bankReceiptUrl=").append(bankReceiptUrl);
        sb.append(", exchangeRate=").append(exchangeRate);
        sb.append(", transactionDesc=").append(transactionDesc);
        sb.append(", foreignExchangeFee=").append(foreignExchangeFee);
        sb.append(", withdrawFee=").append(withdrawFee);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WtrWalletTransactionRecord other = (WtrWalletTransactionRecord) that;
        return (this.getTransactionId() == null ? other.getTransactionId() == null : this.getTransactionId().equals(other.getTransactionId()))
            && (this.getBuyerId() == null ? other.getBuyerId() == null : this.getBuyerId().equals(other.getBuyerId()))
            && (this.getBankCardId() == null ? other.getBankCardId() == null : this.getBankCardId().equals(other.getBankCardId()))
            && (this.getTransactionNumber() == null ? other.getTransactionNumber() == null : this.getTransactionNumber().equals(other.getTransactionNumber()))
            && (this.getTransactionType() == null ? other.getTransactionType() == null : this.getTransactionType().equals(other.getTransactionType()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getTransactionMoney() == null ? other.getTransactionMoney() == null : this.getTransactionMoney().equals(other.getTransactionMoney()))
            && (this.getCommission() == null ? other.getCommission() == null : this.getCommission().equals(other.getCommission()))
            && (this.getDiscountCommission() == null ? other.getDiscountCommission() == null : this.getDiscountCommission().equals(other.getDiscountCommission()))
            && (this.getTransactionMethod() == null ? other.getTransactionMethod() == null : this.getTransactionMethod().equals(other.getTransactionMethod()))
            && (this.getCompleteTime() == null ? other.getCompleteTime() == null : this.getCompleteTime().equals(other.getCompleteTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getActualMoney() == null ? other.getActualMoney() == null : this.getActualMoney().equals(other.getActualMoney()))
            && (this.getActualCommission() == null ? other.getActualCommission() == null : this.getActualCommission().equals(other.getActualCommission()))
            && (this.getActualDiscountCommission() == null ? other.getActualDiscountCommission() == null : this.getActualDiscountCommission().equals(other.getActualDiscountCommission()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getBusinessId() == null ? other.getBusinessId() == null : this.getBusinessId().equals(other.getBusinessId()))
            && (this.getFinanceType() == null ? other.getFinanceType() == null : this.getFinanceType().equals(other.getFinanceType()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getOperatorName() == null ? other.getOperatorName() == null : this.getOperatorName().equals(other.getOperatorName()))
            && (this.getOperatorIp() == null ? other.getOperatorIp() == null : this.getOperatorIp().equals(other.getOperatorIp()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getBankReceiptUrl() == null ? other.getBankReceiptUrl() == null : this.getBankReceiptUrl().equals(other.getBankReceiptUrl()))
            && (this.getExchangeRate() == null ? other.getExchangeRate() == null : this.getExchangeRate().equals(other.getExchangeRate()))
            && (this.getTransactionDesc() == null ? other.getTransactionDesc() == null : this.getTransactionDesc().equals(other.getTransactionDesc()))
            && (this.getForeignExchangeFee() == null ? other.getForeignExchangeFee() == null : this.getForeignExchangeFee().equals(other.getForeignExchangeFee()))
            && (this.getWithdrawFee() == null ? other.getWithdrawFee() == null : this.getWithdrawFee().equals(other.getWithdrawFee()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        result = prime * result + ((getBuyerId() == null) ? 0 : getBuyerId().hashCode());
        result = prime * result + ((getBankCardId() == null) ? 0 : getBankCardId().hashCode());
        result = prime * result + ((getTransactionNumber() == null) ? 0 : getTransactionNumber().hashCode());
        result = prime * result + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getTransactionMoney() == null) ? 0 : getTransactionMoney().hashCode());
        result = prime * result + ((getCommission() == null) ? 0 : getCommission().hashCode());
        result = prime * result + ((getDiscountCommission() == null) ? 0 : getDiscountCommission().hashCode());
        result = prime * result + ((getTransactionMethod() == null) ? 0 : getTransactionMethod().hashCode());
        result = prime * result + ((getCompleteTime() == null) ? 0 : getCompleteTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getActualMoney() == null) ? 0 : getActualMoney().hashCode());
        result = prime * result + ((getActualCommission() == null) ? 0 : getActualCommission().hashCode());
        result = prime * result + ((getActualDiscountCommission() == null) ? 0 : getActualDiscountCommission().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getBusinessId() == null) ? 0 : getBusinessId().hashCode());
        result = prime * result + ((getFinanceType() == null) ? 0 : getFinanceType().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getOperatorName() == null) ? 0 : getOperatorName().hashCode());
        result = prime * result + ((getOperatorIp() == null) ? 0 : getOperatorIp().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getBankReceiptUrl() == null) ? 0 : getBankReceiptUrl().hashCode());
        result = prime * result + ((getExchangeRate() == null) ? 0 : getExchangeRate().hashCode());
        result = prime * result + ((getTransactionDesc() == null) ? 0 : getTransactionDesc().hashCode());
        result = prime * result + ((getForeignExchangeFee() == null) ? 0 : getForeignExchangeFee().hashCode());
        result = prime * result + ((getWithdrawFee() == null) ? 0 : getWithdrawFee().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    public enum Column {
        transactionId("TRANSACTION_ID", "transactionId", "INTEGER", false),
        buyerId("BUYER_ID", "buyerId", "INTEGER", false),
        bankCardId("BANK_CARD_ID", "bankCardId", "INTEGER", false),
        transactionNumber("TRANSACTION_NUMBER", "transactionNumber", "VARCHAR", false),
        transactionType("TRANSACTION_TYPE", "transactionType", "TINYINT", false),
        accountName("ACCOUNT_NAME", "accountName", "VARCHAR", false),
        transactionMoney("TRANSACTION_MONEY", "transactionMoney", "DECIMAL", false),
        commission("COMMISSION", "commission", "DECIMAL", false),
        discountCommission("DISCOUNT_COMMISSION", "discountCommission", "DECIMAL", false),
        transactionMethod("TRANSACTION_METHOD", "transactionMethod", "TINYINT", false),
        completeTime("COMPLETE_TIME", "completeTime", "TIMESTAMP", false),
        status("STATUS", "status", "TINYINT", true),
        actualMoney("ACTUAL_MONEY", "actualMoney", "DECIMAL", false),
        actualCommission("ACTUAL_COMMISSION", "actualCommission", "DECIMAL", false),
        actualDiscountCommission("ACTUAL_DISCOUNT_COMMISSION", "actualDiscountCommission", "DECIMAL", false),
        balance("BALANCE", "balance", "DECIMAL", false),
        businessId("BUSINESS_ID", "businessId", "INTEGER", false),
        financeType("FINANCE_TYPE", "financeType", "TINYINT", false),
        note("NOTE", "note", "VARCHAR", false),
        operatorName("OPERATOR_NAME", "operatorName", "VARCHAR", false),
        operatorIp("OPERATOR_IP", "operatorIp", "VARCHAR", false),
        createBy("CREATE_BY", "createBy", "VARCHAR", false),
        createTime("CREATE_TIME", "createTime", "TIMESTAMP", false),
        lastUpdateBy("LAST_UPDATE_BY", "lastUpdateBy", "VARCHAR", false),
        lastUpdateTime("LAST_UPDATE_TIME", "lastUpdateTime", "TIMESTAMP", false),
        bankReceiptUrl("BANK_RECEIPT_URL", "bankReceiptUrl", "VARCHAR", false),
        exchangeRate("EXCHANGE_RATE", "exchangeRate", "DECIMAL", false),
        transactionDesc("TRANSACTION_DESC", "transactionDesc", "VARCHAR", false),
        foreignExchangeFee("FOREIGN_EXCHANGE_FEE", "foreignExchangeFee", "DECIMAL", false),
        withdrawFee("WITHDRAW_FEE", "withdrawFee", "DECIMAL", false),
        deleted("deleted", "deleted", "BIT", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}