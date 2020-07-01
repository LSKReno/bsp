package com.bsp.server.dto;


public class GoaGovernmentAreaDto {

    /**
     * 主键id

     */
    private Integer goaId;

    /**
     * 邮编

     */
    private String zipCode;

    /**
     * 洲

     */
    private String state;

    /**
     * 洲简称

     */
    private String stateShorthand;

    /**
     * 城市

     */
    private String city;

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
     * 乐观锁

     */
    private Integer callCnt;

    /**
     * 更新时间

     */
    private String lastUpdateDate;

    /**
     * 备注

     */
    private String remark;

    /**
     * 数据有效性

     */
    private String stsCd;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getGoaId() {
        return goaId;
    }

    public void setGoaId(Integer goaId) {
        this.goaId = goaId;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateShorthand() {
        return stateShorthand;
    }

    public void setStateShorthand(String stateShorthand) {
        this.stateShorthand = stateShorthand;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
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
        sb.append(", goaId=").append(goaId);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", state=").append(state);
        sb.append(", stateShorthand=").append(stateShorthand);
        sb.append(", city=").append(city);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}