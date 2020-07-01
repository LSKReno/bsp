package com.bsp.server.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class WaaWalletAccountDto {

    /**
     * 主键

     */
    private Integer buyerId;

    /**
     * 账户名

     */
    private String accountName;

    /**
     * 邮箱

     */
    private String email;

    /**
     * 支付密码, 加密串

     */
    private String password;

    /**
     * 激活时间

     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date activeTime;

    /**
     * 是否激活 N - 未激活 , Y - 激活

     */
    private String isActive;

    /**
     * 状态  7 -正常,  17 -冻结

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
     * 账户类型:1-客户 2-厂家

     */
    private Integer accountType;

    /**
     * 订单处理时间

     */
    private String holdOrderTime;

    /**
     * 0-FALSE 1-TRUE

     */
    private String autoPayStatus;

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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
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

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getHoldOrderTime() {
        return holdOrderTime;
    }

    public void setHoldOrderTime(String holdOrderTime) {
        this.holdOrderTime = holdOrderTime;
    }

    public String getAutoPayStatus() {
        return autoPayStatus;
    }

    public void setAutoPayStatus(String autoPayStatus) {
        this.autoPayStatus = autoPayStatus;
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
        sb.append(", accountName=").append(accountName);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", activeTime=").append(activeTime);
        sb.append(", isActive=").append(isActive);
        sb.append(", status=").append(status);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", accountType=").append(accountType);
        sb.append(", holdOrderTime=").append(holdOrderTime);
        sb.append(", autoPayStatus=").append(autoPayStatus);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}