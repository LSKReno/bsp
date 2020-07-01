package com.bsp.server.dto;


public class StrStoreDto {

    /**
     * 主键

     */
    private Integer strId;

    /**
     * 借卖ID

     */
    private Integer dsrId;

    /**
     * 平台类别,1:Amazon;2:ebay

     */
    private String plataeformType;

    /**
     * 网店名 - 从api中取得

     */
    private String storeName;

    /**
     * API 对接状态 1. INI - 刚授权 2. WIP - 正常对接 3. EXP - token 过期 4. ERR - token 出错 5. CLS - 网店关闭

     */
    private String storeStsCd;

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
    private String stsCd;

    /**
     * 状态

     */
    private String remark;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getStrId() {
        return strId;
    }

    public void setStrId(Integer strId) {
        this.strId = strId;
    }

    public Integer getDsrId() {
        return dsrId;
    }

    public void setDsrId(Integer dsrId) {
        this.dsrId = dsrId;
    }

    public String getPlataeformType() {
        return plataeformType;
    }

    public void setPlataeformType(String plataeformType) {
        this.plataeformType = plataeformType;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreStsCd() {
        return storeStsCd;
    }

    public void setStoreStsCd(String storeStsCd) {
        this.storeStsCd = storeStsCd;
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

    public String getStsCd() {
        return stsCd;
    }

    public void setStsCd(String stsCd) {
        this.stsCd = stsCd;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        sb.append(", strId=").append(strId);
        sb.append(", dsrId=").append(dsrId);
        sb.append(", plataeformType=").append(plataeformType);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeStsCd=").append(storeStsCd);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", remark=").append(remark);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}