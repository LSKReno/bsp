package com.bsp.server.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class EbaEbayAuthorizationDto {

    /**
     * 主键

     */
    private Integer ebaId;

    /**
     * 网店ID

     */
    private Integer strId;

    /**
     * ebay账号ID

     */
    private String appId;

    /**
     * ebay密钥

     */
    private String secretKey;

    /**
     * ebay TOKEN

     */
    private String token;

    /**
     * 创建人

     */
    private String createdBy;

    /**
     * 创建时间

     */
    private String creationDate;

    /**
     * 更新人

     */
    private String lastUpdateBy;

    /**
     * 更新时间

     */
    private String lastUpdateDate;

    /**
     * 乐观锁

     */
    private Integer callCnt;

    /**
     * 备注

     */
    private String remark;

    /**
     * 状态

     */
    private String stsCd;

    /**
     * token失效时间

     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date expDate;

    /**
     * 取消授权时间

     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date cancleDate;

    /**
     * 用户id

     */
    private String accountId;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getEbaId() {
        return ebaId;
    }

    public void setEbaId(Integer ebaId) {
        this.ebaId = ebaId;
    }

    public Integer getStrId() {
        return strId;
    }

    public void setStrId(Integer strId) {
        this.strId = strId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStsCd() {
        return stsCd;
    }

    public void setStsCd(String stsCd) {
        this.stsCd = stsCd;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Date getCancleDate() {
        return cancleDate;
    }

    public void setCancleDate(Date cancleDate) {
        this.cancleDate = cancleDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
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
        sb.append(", ebaId=").append(ebaId);
        sb.append(", strId=").append(strId);
        sb.append(", appId=").append(appId);
        sb.append(", secretKey=").append(secretKey);
        sb.append(", token=").append(token);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", expDate=").append(expDate);
        sb.append(", cancleDate=").append(cancleDate);
        sb.append(", accountId=").append(accountId);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}