package com.bsp.server.dto;


public class StoStoreOrderDto {

    /**
     * 主键

     */
    private Integer stoId;

    /**
     * 网店ID，外键关联str表主键
     */
    private Integer strId;

    /**
     * AMAZON / EBAY 平台的订单 ID 例如: AMAZON : 058-1233752-8214740 EBAY : 865826
     */
    private String orderId;

    /**
     * 订单创建时间
     */
    private String orderCreatedTime;

    /**
     * 支付时间
     */
    private String paidTime;

    /**
     * 订单更新时间
     */
    private String lastModifiedTime;

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
     * 有效性
     */
    private String stsCd;

    /**
     * 平台类别 1、amazon 2、ebay
     */
    private String plateformType;

    /**
     * 订单取消时间
     */
    private String cancelCompleteDate;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getStoId() {
        return stoId;
    }

    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public Integer getStrId() {
        return strId;
    }

    public void setStrId(Integer strId) {
        this.strId = strId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderCreatedTime() {
        return orderCreatedTime;
    }

    public void setOrderCreatedTime(String orderCreatedTime) {
        this.orderCreatedTime = orderCreatedTime;
    }

    public String getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
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

    public String getPlateformType() {
        return plateformType;
    }

    public void setPlateformType(String plateformType) {
        this.plateformType = plateformType;
    }

    public String getCancelCompleteDate() {
        return cancelCompleteDate;
    }

    public void setCancelCompleteDate(String cancelCompleteDate) {
        this.cancelCompleteDate = cancelCompleteDate;
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
        sb.append(", stoId=").append(stoId);
        sb.append(", strId=").append(strId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderCreatedTime=").append(orderCreatedTime);
        sb.append(", paidTime=").append(paidTime);
        sb.append(", lastModifiedTime=").append(lastModifiedTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", plateformType=").append(plateformType);
        sb.append(", cancelCompleteDate=").append(cancelCompleteDate);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}