package com.bsp.server.dto;

import java.math.BigDecimal;

public class WafWalletAccountFundDto {

    /**
     * 买家id

     */
    private Integer buyerId;

    /**
     * 可用金额

     */
    private BigDecimal availableMoney;

    /**
     * 充值中金额

     */
    private BigDecimal depositingMoney;

    /**
     * 提现中金额

     */
    private BigDecimal withdrawingMoney;

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
     * 账户币种:USD,RMB

     */
    private String currency;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public BigDecimal getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(BigDecimal availableMoney) {
        this.availableMoney = availableMoney;
    }

    public BigDecimal getDepositingMoney() {
        return depositingMoney;
    }

    public void setDepositingMoney(BigDecimal depositingMoney) {
        this.depositingMoney = depositingMoney;
    }

    public BigDecimal getWithdrawingMoney() {
        return withdrawingMoney;
    }

    public void setWithdrawingMoney(BigDecimal withdrawingMoney) {
        this.withdrawingMoney = withdrawingMoney;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
        sb.append(", buyerId=").append(buyerId);
        sb.append(", availableMoney=").append(availableMoney);
        sb.append(", depositingMoney=").append(depositingMoney);
        sb.append(", withdrawingMoney=").append(withdrawingMoney);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", currency=").append(currency);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}