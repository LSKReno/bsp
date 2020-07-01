package com.bsp.server.dto;

import java.math.BigDecimal;

public class WtaWalletTransactionAduitDto {

    /**
     * 主键

     */
    private Integer transactionAuditId;

    /**
     * 买家id

     */
    private Integer buyerId;

    /**
     * 业务记录id

     */
    private Integer transactionId;

    /**
     * 前可用余额

     */
    private BigDecimal availableMoneyBefore;

    /**
     * 前充值中金额

     */
    private BigDecimal depositingMoneyBefore;

    /**
     * 前提现中金额

     */
    private BigDecimal withdrawingMoneyBefore;

    /**
     * 操作金额

     */
    private BigDecimal operateMoney;

    /**
     * 操作类型 1-申请 2-提现 3-消费 4-退款

     */
    private Integer operateType;

    /**
     * 变更后可用余额

     */
    private BigDecimal availableMoneyAfter;

    /**
     * 变更后充值中金额

     */
    private BigDecimal depositingMoneyAfter;

    /**
     * 变更后提现中金额

     */
    private BigDecimal withdrawingMoneyAfter;

    /**
     * 操作人

     */
    private String operateBy;

    /**
     * 操作状态 2-申请 , 4 -完成 , -1-失败

     */
    private Integer status;

    /**
     * 创建人

     */
    private String createBy;

    /**
     * 创建时间

     */
    private String createTime;

    /**
     * 更新人

     */
    private String lastUpdateBy;

    /**
     * 最后更新时间

     */
    private String lastUpdateTime;

    /**
     * 逻辑删除
     */
    private Integer deleted;

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

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
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

}