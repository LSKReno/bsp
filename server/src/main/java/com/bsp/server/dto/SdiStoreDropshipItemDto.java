package com.bsp.server.dto;

import java.math.BigDecimal;

public class SdiStoreDropshipItemDto {

    /**
     * 主键id

     */
    private Integer dilId;

    /**
     * 商品id

     */
    private Integer proId;

    /**
     * 网店id

     */
    private Integer strId;

    /**
     * 网点预留量

     */
    private Integer storeRetention;

    /**
     * 借卖价格

     */
    private BigDecimal dropshipPrice;

    /**
     * 0-提交 1-上架 2-下架

     */
    private String dropshipStatus;

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
     * 网店上架商品数量

     */
    private Integer shelfStock;

    /**
     * 商品网店上架时间

     */
    private String preferDate;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getDilId() {
        return dilId;
    }

    public void setDilId(Integer dilId) {
        this.dilId = dilId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getStrId() {
        return strId;
    }

    public void setStrId(Integer strId) {
        this.strId = strId;
    }

    public Integer getStoreRetention() {
        return storeRetention;
    }

    public void setStoreRetention(Integer storeRetention) {
        this.storeRetention = storeRetention;
    }

    public BigDecimal getDropshipPrice() {
        return dropshipPrice;
    }

    public void setDropshipPrice(BigDecimal dropshipPrice) {
        this.dropshipPrice = dropshipPrice;
    }

    public String getDropshipStatus() {
        return dropshipStatus;
    }

    public void setDropshipStatus(String dropshipStatus) {
        this.dropshipStatus = dropshipStatus;
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

    public Integer getShelfStock() {
        return shelfStock;
    }

    public void setShelfStock(Integer shelfStock) {
        this.shelfStock = shelfStock;
    }

    public String getPreferDate() {
        return preferDate;
    }

    public void setPreferDate(String preferDate) {
        this.preferDate = preferDate;
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
        sb.append(", dilId=").append(dilId);
        sb.append(", proId=").append(proId);
        sb.append(", strId=").append(strId);
        sb.append(", storeRetention=").append(storeRetention);
        sb.append(", dropshipPrice=").append(dropshipPrice);
        sb.append(", dropshipStatus=").append(dropshipStatus);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", shelfStock=").append(shelfStock);
        sb.append(", preferDate=").append(preferDate);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}