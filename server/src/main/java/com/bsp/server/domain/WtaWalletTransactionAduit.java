package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class WtaWalletTransactionAduit {
    private Integer transactionAuditId;

    private Integer buyerId;

    private Integer transactionId;

    private BigDecimal availableMoneyBefore;

    private BigDecimal depositingMoneyBefore;

    private BigDecimal withdrawingMoneyBefore;

    private BigDecimal operateMoney;

    private Byte operateType;

    private BigDecimal availableMoneyAfter;

    private BigDecimal depositingMoneyAfter;

    private BigDecimal withdrawingMoneyAfter;

    private String operateBy;

    private Byte status;

    private String createBy;

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;

    private Boolean deleted;

    public Integer getTransactionAuditId() {
        return transactionAuditId;
    }

    public void setTransactionAuditId(Integer transactionAuditId) {
        this.transactionAuditId = transactionAuditId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public BigDecimal getAvailableMoneyBefore() {
        return availableMoneyBefore;
    }

    public void setAvailableMoneyBefore(BigDecimal availableMoneyBefore) {
        this.availableMoneyBefore = availableMoneyBefore;
    }

    public BigDecimal getDepositingMoneyBefore() {
        return depositingMoneyBefore;
    }

    public void setDepositingMoneyBefore(BigDecimal depositingMoneyBefore) {
        this.depositingMoneyBefore = depositingMoneyBefore;
    }

    public BigDecimal getWithdrawingMoneyBefore() {
        return withdrawingMoneyBefore;
    }

    public void setWithdrawingMoneyBefore(BigDecimal withdrawingMoneyBefore) {
        this.withdrawingMoneyBefore = withdrawingMoneyBefore;
    }

    public BigDecimal getOperateMoney() {
        return operateMoney;
    }

    public void setOperateMoney(BigDecimal operateMoney) {
        this.operateMoney = operateMoney;
    }

    public Byte getOperateType() {
        return operateType;
    }

    public void setOperateType(Byte operateType) {
        this.operateType = operateType;
    }

    public BigDecimal getAvailableMoneyAfter() {
        return availableMoneyAfter;
    }

    public void setAvailableMoneyAfter(BigDecimal availableMoneyAfter) {
        this.availableMoneyAfter = availableMoneyAfter;
    }

    public BigDecimal getDepositingMoneyAfter() {
        return depositingMoneyAfter;
    }

    public void setDepositingMoneyAfter(BigDecimal depositingMoneyAfter) {
        this.depositingMoneyAfter = depositingMoneyAfter;
    }

    public BigDecimal getWithdrawingMoneyAfter() {
        return withdrawingMoneyAfter;
    }

    public void setWithdrawingMoneyAfter(BigDecimal withdrawingMoneyAfter) {
        this.withdrawingMoneyAfter = withdrawingMoneyAfter;
    }

    public String getOperateBy() {
        return operateBy;
    }

    public void setOperateBy(String operateBy) {
        this.operateBy = operateBy;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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
        sb.append(", transactionAuditId=").append(transactionAuditId);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", availableMoneyBefore=").append(availableMoneyBefore);
        sb.append(", depositingMoneyBefore=").append(depositingMoneyBefore);
        sb.append(", withdrawingMoneyBefore=").append(withdrawingMoneyBefore);
        sb.append(", operateMoney=").append(operateMoney);
        sb.append(", operateType=").append(operateType);
        sb.append(", availableMoneyAfter=").append(availableMoneyAfter);
        sb.append(", depositingMoneyAfter=").append(depositingMoneyAfter);
        sb.append(", withdrawingMoneyAfter=").append(withdrawingMoneyAfter);
        sb.append(", operateBy=").append(operateBy);
        sb.append(", status=").append(status);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
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
        WtaWalletTransactionAduit other = (WtaWalletTransactionAduit) that;
        return (this.getTransactionAuditId() == null ? other.getTransactionAuditId() == null : this.getTransactionAuditId().equals(other.getTransactionAuditId()))
            && (this.getBuyerId() == null ? other.getBuyerId() == null : this.getBuyerId().equals(other.getBuyerId()))
            && (this.getTransactionId() == null ? other.getTransactionId() == null : this.getTransactionId().equals(other.getTransactionId()))
            && (this.getAvailableMoneyBefore() == null ? other.getAvailableMoneyBefore() == null : this.getAvailableMoneyBefore().equals(other.getAvailableMoneyBefore()))
            && (this.getDepositingMoneyBefore() == null ? other.getDepositingMoneyBefore() == null : this.getDepositingMoneyBefore().equals(other.getDepositingMoneyBefore()))
            && (this.getWithdrawingMoneyBefore() == null ? other.getWithdrawingMoneyBefore() == null : this.getWithdrawingMoneyBefore().equals(other.getWithdrawingMoneyBefore()))
            && (this.getOperateMoney() == null ? other.getOperateMoney() == null : this.getOperateMoney().equals(other.getOperateMoney()))
            && (this.getOperateType() == null ? other.getOperateType() == null : this.getOperateType().equals(other.getOperateType()))
            && (this.getAvailableMoneyAfter() == null ? other.getAvailableMoneyAfter() == null : this.getAvailableMoneyAfter().equals(other.getAvailableMoneyAfter()))
            && (this.getDepositingMoneyAfter() == null ? other.getDepositingMoneyAfter() == null : this.getDepositingMoneyAfter().equals(other.getDepositingMoneyAfter()))
            && (this.getWithdrawingMoneyAfter() == null ? other.getWithdrawingMoneyAfter() == null : this.getWithdrawingMoneyAfter().equals(other.getWithdrawingMoneyAfter()))
            && (this.getOperateBy() == null ? other.getOperateBy() == null : this.getOperateBy().equals(other.getOperateBy()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransactionAuditId() == null) ? 0 : getTransactionAuditId().hashCode());
        result = prime * result + ((getBuyerId() == null) ? 0 : getBuyerId().hashCode());
        result = prime * result + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        result = prime * result + ((getAvailableMoneyBefore() == null) ? 0 : getAvailableMoneyBefore().hashCode());
        result = prime * result + ((getDepositingMoneyBefore() == null) ? 0 : getDepositingMoneyBefore().hashCode());
        result = prime * result + ((getWithdrawingMoneyBefore() == null) ? 0 : getWithdrawingMoneyBefore().hashCode());
        result = prime * result + ((getOperateMoney() == null) ? 0 : getOperateMoney().hashCode());
        result = prime * result + ((getOperateType() == null) ? 0 : getOperateType().hashCode());
        result = prime * result + ((getAvailableMoneyAfter() == null) ? 0 : getAvailableMoneyAfter().hashCode());
        result = prime * result + ((getDepositingMoneyAfter() == null) ? 0 : getDepositingMoneyAfter().hashCode());
        result = prime * result + ((getWithdrawingMoneyAfter() == null) ? 0 : getWithdrawingMoneyAfter().hashCode());
        result = prime * result + ((getOperateBy() == null) ? 0 : getOperateBy().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    public enum Column {
        transactionAuditId("TRANSACTION_AUDIT_ID", "transactionAuditId", "INTEGER", false),
        buyerId("BUYER_ID", "buyerId", "INTEGER", false),
        transactionId("TRANSACTION_ID", "transactionId", "INTEGER", false),
        availableMoneyBefore("AVAILABLE_MONEY_BEFORE", "availableMoneyBefore", "DECIMAL", false),
        depositingMoneyBefore("DEPOSITING_MONEY_BEFORE", "depositingMoneyBefore", "DECIMAL", false),
        withdrawingMoneyBefore("WITHDRAWING_MONEY_BEFORE", "withdrawingMoneyBefore", "DECIMAL", false),
        operateMoney("OPERATE_MONEY", "operateMoney", "DECIMAL", false),
        operateType("OPERATE_TYPE", "operateType", "TINYINT", false),
        availableMoneyAfter("AVAILABLE_MONEY_AFTER", "availableMoneyAfter", "DECIMAL", false),
        depositingMoneyAfter("DEPOSITING_MONEY_AFTER", "depositingMoneyAfter", "DECIMAL", false),
        withdrawingMoneyAfter("WITHDRAWING_MONEY_AFTER", "withdrawingMoneyAfter", "DECIMAL", false),
        operateBy("OPERATE_BY", "operateBy", "VARCHAR", false),
        status("STATUS", "status", "TINYINT", true),
        createBy("CREATE_BY", "createBy", "VARCHAR", false),
        createTime("CREATE_TIME", "createTime", "TIMESTAMP", false),
        lastUpdateBy("LAST_UPDATE_BY", "lastUpdateBy", "VARCHAR", false),
        lastUpdateTime("LAST_UPDATE_TIME", "lastUpdateTime", "TIMESTAMP", false),
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