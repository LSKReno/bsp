package com.bsp.server.dto;

import java.math.BigDecimal;

public class SaoSalesOrderDto {

    /**
     * 主键

     */
    private Integer saoId;

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
     * 数据有效性

     */
    private String stsCd;

    /**
     * 制造商ID

     */
    private Integer manId;

    /**
     * 仓库ID

     */
    private Integer warId;

    /**
     * 第一次同步时间

     */
    private String syncDate;

    /**
     * 支付时间

     */
    private String paymentDate;

    /**
     * 推送到仓库的时间

     */
    private String pushDate;

    /**
     * 取得物流跟踪号的时间

     */
    private String trackNoDate;

    /**
     * 物流妥投时间

     */
    private String fulfillmentDate;

    /**
     * 结款时间

     */
    private String settlementDate;

    /**
     * 订单价格

     */
    private BigDecimal productAmount;

    /**
     * 运费

     */
    private BigDecimal freightCost;

    /**
     * 订单处理费

     */
    private BigDecimal handlingFee;

    /**
     * 消费者备注

     */
    private String customerRemark;

    /**
     * 订单编号, SO + 8位数字: 例如: SO00000001 , 当订单号多于一千万时，第一位变为由A到Z

     */
    private String orderNo;

    /**
     * 订单状态: 1. AwaitingPayment 2. AwaitingShipment 3. SHIPPED 已发货 4. Complete 已完成5. Canceled已取消

     */
    private String orderSts;

    /**
     * 退款状态 1. OPEN - 开启 2. CLOSE - 已完结

     */
    private String refundSts;

    /**
     * 发货状态 1. SYNC - 已同步到仓库 2. STOCK_OUT - 已出库 3. SHIPPING - 发货中 4. FULFILLED - 已妥投

     */
    private String deliverySts;

    /**
     * GM 平台订单, 已拆单 按 仓库 / 厂家 进行拆单

     */
    private Integer stoId;

    /**
     * 斑马返回物流费用

     */
    private BigDecimal lastFreightCost;

    /**
     * 取消时间

     */
    private String cancleTime;

    /**
     * 0自动，1非自动，2取消，3异常，4完成

     */
    private String autoPayStatus;

    /**
     * 用户留言

     */
    private String buyerCheckoutMessage;

    /**
     * 订单自动支付时间

     */
    private String autoPayTime;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getSaoId() {
        return saoId;
    }

    public void setSaoId(Integer saoId) {
        this.saoId = saoId;
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

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public Integer getWarId() {
        return warId;
    }

    public void setWarId(Integer warId) {
        this.warId = warId;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPushDate() {
        return pushDate;
    }

    public void setPushDate(String pushDate) {
        this.pushDate = pushDate;
    }

    public String getTrackNoDate() {
        return trackNoDate;
    }

    public void setTrackNoDate(String trackNoDate) {
        this.trackNoDate = trackNoDate;
    }

    public String getFulfillmentDate() {
        return fulfillmentDate;
    }

    public void setFulfillmentDate(String fulfillmentDate) {
        this.fulfillmentDate = fulfillmentDate;
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    public BigDecimal getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }

    public BigDecimal getFreightCost() {
        return freightCost;
    }

    public void setFreightCost(BigDecimal freightCost) {
        this.freightCost = freightCost;
    }

    public BigDecimal getHandlingFee() {
        return handlingFee;
    }

    public void setHandlingFee(BigDecimal handlingFee) {
        this.handlingFee = handlingFee;
    }

    public String getCustomerRemark() {
        return customerRemark;
    }

    public void setCustomerRemark(String customerRemark) {
        this.customerRemark = customerRemark;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderSts() {
        return orderSts;
    }

    public void setOrderSts(String orderSts) {
        this.orderSts = orderSts;
    }

    public String getRefundSts() {
        return refundSts;
    }

    public void setRefundSts(String refundSts) {
        this.refundSts = refundSts;
    }

    public String getDeliverySts() {
        return deliverySts;
    }

    public void setDeliverySts(String deliverySts) {
        this.deliverySts = deliverySts;
    }

    public Integer getStoId() {
        return stoId;
    }

    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public BigDecimal getLastFreightCost() {
        return lastFreightCost;
    }

    public void setLastFreightCost(BigDecimal lastFreightCost) {
        this.lastFreightCost = lastFreightCost;
    }

    public String getCancleTime() {
        return cancleTime;
    }

    public void setCancleTime(String cancleTime) {
        this.cancleTime = cancleTime;
    }

    public String getAutoPayStatus() {
        return autoPayStatus;
    }

    public void setAutoPayStatus(String autoPayStatus) {
        this.autoPayStatus = autoPayStatus;
    }

    public String getBuyerCheckoutMessage() {
        return buyerCheckoutMessage;
    }

    public void setBuyerCheckoutMessage(String buyerCheckoutMessage) {
        this.buyerCheckoutMessage = buyerCheckoutMessage;
    }

    public String getAutoPayTime() {
        return autoPayTime;
    }

    public void setAutoPayTime(String autoPayTime) {
        this.autoPayTime = autoPayTime;
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
        sb.append(", saoId=").append(saoId);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", manId=").append(manId);
        sb.append(", warId=").append(warId);
        sb.append(", syncDate=").append(syncDate);
        sb.append(", paymentDate=").append(paymentDate);
        sb.append(", pushDate=").append(pushDate);
        sb.append(", trackNoDate=").append(trackNoDate);
        sb.append(", fulfillmentDate=").append(fulfillmentDate);
        sb.append(", settlementDate=").append(settlementDate);
        sb.append(", productAmount=").append(productAmount);
        sb.append(", freightCost=").append(freightCost);
        sb.append(", handlingFee=").append(handlingFee);
        sb.append(", customerRemark=").append(customerRemark);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderSts=").append(orderSts);
        sb.append(", refundSts=").append(refundSts);
        sb.append(", deliverySts=").append(deliverySts);
        sb.append(", stoId=").append(stoId);
        sb.append(", lastFreightCost=").append(lastFreightCost);
        sb.append(", cancleTime=").append(cancleTime);
        sb.append(", autoPayStatus=").append(autoPayStatus);
        sb.append(", buyerCheckoutMessage=").append(buyerCheckoutMessage);
        sb.append(", autoPayTime=").append(autoPayTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}