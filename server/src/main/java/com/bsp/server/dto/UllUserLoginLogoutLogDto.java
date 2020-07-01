package com.bsp.server.dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class UllUserLoginLogoutLogDto {

    /**
     * 
     */
    private Integer ullId;

    /**
     * 
     */
    private String usiId;

    /**
     * 
     */
    private String token;

    /**
     * 
     */
    private String terminalType;

    /**
     * 
     */
    private String operatingType;

    /**
     * 
     */
    private String operatingDate;

    /**
     * 
     */
    private String createdBy;

    /**
     * 
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date creationDate;

    /**
     * 
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lastUpdateBy;

    /**
     * 
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lastUpdateDate;

    /**
     * 
     */
    private String callCnt;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private String stsCd;

    /**
     * 
     */
    private Integer deleted;

    public Integer getUllId() {
        return ullId;
    }

    public void setUllId(Integer ullId) {
        this.ullId = ullId;
    }

    public String getUsiId() {
        return usiId;
    }

    public void setUsiId(String usiId) {
        this.usiId = usiId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getOperatingType() {
        return operatingType;
    }

    public void setOperatingType(String operatingType) {
        this.operatingType = operatingType;
    }

    public String getOperatingDate() {
        return operatingDate;
    }

    public void setOperatingDate(String operatingDate) {
        this.operatingDate = operatingDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(Date lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(String callCnt) {
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
        sb.append(", ullId=").append(ullId);
        sb.append(", usiId=").append(usiId);
        sb.append(", token=").append(token);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", operatingType=").append(operatingType);
        sb.append(", operatingDate=").append(operatingDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}