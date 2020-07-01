package com.bsp.server.dto;


public class WitWishlistDto {

    /**
     * 主键id

     */
    private Integer witId;

    /**
     * 借卖方id，关联dsr表

     */
    private Integer dsrId;

    /**
     * 外键 关联Pro表主键

     */
    private Integer proId;

    /**
     * 创建人

     */
    private String createdBy;

    /**
     * 创建时间

     */
    private String creationDate;

    /**
     * 修改人

     */
    private String lastUpdateBy;

    /**
     * 修改时间

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
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getWitId() {
        return witId;
    }

    public void setWitId(Integer witId) {
        this.witId = witId;
    }

    public Integer getDsrId() {
        return dsrId;
    }

    public void setDsrId(Integer dsrId) {
        this.dsrId = dsrId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
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
        sb.append(", witId=").append(witId);
        sb.append(", dsrId=").append(dsrId);
        sb.append(", proId=").append(proId);
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