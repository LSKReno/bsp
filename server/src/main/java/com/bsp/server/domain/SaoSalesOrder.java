package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class SaoSalesOrder {
    private Integer saoId;

    private String createdBy;

    private Date creationDate;

    private String lastUpdateBy;

    private Date lastUpdateDate;

    private Integer callCnt;

    private String remark;

    private String stsCd;

    private Integer manId;

    private Integer warId;

    private Date syncDate;

    private Date paymentDate;

    private Date pushDate;

    private Date trackNoDate;

    private Date fulfillmentDate;

    private Date settlementDate;

    private BigDecimal productAmount;

    private BigDecimal freightCost;

    private BigDecimal handlingFee;

    private String customerRemark;

    private String orderNo;

    private String orderSts;

    private String refundSts;

    private String deliverySts;

    private Integer stoId;

    private BigDecimal lastFreightCost;

    private Date cancleTime;

    private String autoPayStatus;

    private String autoPayTime;

    private Boolean deleted;

    private String buyerCheckoutMessage;

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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
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

    public Date getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(Date syncDate) {
        this.syncDate = syncDate;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getPushDate() {
        return pushDate;
    }

    public void setPushDate(Date pushDate) {
        this.pushDate = pushDate;
    }

    public Date getTrackNoDate() {
        return trackNoDate;
    }

    public void setTrackNoDate(Date trackNoDate) {
        this.trackNoDate = trackNoDate;
    }

    public Date getFulfillmentDate() {
        return fulfillmentDate;
    }

    public void setFulfillmentDate(Date fulfillmentDate) {
        this.fulfillmentDate = fulfillmentDate;
    }

    public Date getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(Date settlementDate) {
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

    public Date getCancleTime() {
        return cancleTime;
    }

    public void setCancleTime(Date cancleTime) {
        this.cancleTime = cancleTime;
    }

    public String getAutoPayStatus() {
        return autoPayStatus;
    }

    public void setAutoPayStatus(String autoPayStatus) {
        this.autoPayStatus = autoPayStatus;
    }

    public String getAutoPayTime() {
        return autoPayTime;
    }

    public void setAutoPayTime(String autoPayTime) {
        this.autoPayTime = autoPayTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getBuyerCheckoutMessage() {
        return buyerCheckoutMessage;
    }

    public void setBuyerCheckoutMessage(String buyerCheckoutMessage) {
        this.buyerCheckoutMessage = buyerCheckoutMessage;
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
        sb.append(", autoPayTime=").append(autoPayTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", buyerCheckoutMessage=").append(buyerCheckoutMessage);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SaoSalesOrder other = (SaoSalesOrder) that;
        return (this.getSaoId() == null ? other.getSaoId() == null : this.getSaoId().equals(other.getSaoId()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getCallCnt() == null ? other.getCallCnt() == null : this.getCallCnt().equals(other.getCallCnt()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStsCd() == null ? other.getStsCd() == null : this.getStsCd().equals(other.getStsCd()))
            && (this.getManId() == null ? other.getManId() == null : this.getManId().equals(other.getManId()))
            && (this.getWarId() == null ? other.getWarId() == null : this.getWarId().equals(other.getWarId()))
            && (this.getSyncDate() == null ? other.getSyncDate() == null : this.getSyncDate().equals(other.getSyncDate()))
            && (this.getPaymentDate() == null ? other.getPaymentDate() == null : this.getPaymentDate().equals(other.getPaymentDate()))
            && (this.getPushDate() == null ? other.getPushDate() == null : this.getPushDate().equals(other.getPushDate()))
            && (this.getTrackNoDate() == null ? other.getTrackNoDate() == null : this.getTrackNoDate().equals(other.getTrackNoDate()))
            && (this.getFulfillmentDate() == null ? other.getFulfillmentDate() == null : this.getFulfillmentDate().equals(other.getFulfillmentDate()))
            && (this.getSettlementDate() == null ? other.getSettlementDate() == null : this.getSettlementDate().equals(other.getSettlementDate()))
            && (this.getProductAmount() == null ? other.getProductAmount() == null : this.getProductAmount().equals(other.getProductAmount()))
            && (this.getFreightCost() == null ? other.getFreightCost() == null : this.getFreightCost().equals(other.getFreightCost()))
            && (this.getHandlingFee() == null ? other.getHandlingFee() == null : this.getHandlingFee().equals(other.getHandlingFee()))
            && (this.getCustomerRemark() == null ? other.getCustomerRemark() == null : this.getCustomerRemark().equals(other.getCustomerRemark()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getOrderSts() == null ? other.getOrderSts() == null : this.getOrderSts().equals(other.getOrderSts()))
            && (this.getRefundSts() == null ? other.getRefundSts() == null : this.getRefundSts().equals(other.getRefundSts()))
            && (this.getDeliverySts() == null ? other.getDeliverySts() == null : this.getDeliverySts().equals(other.getDeliverySts()))
            && (this.getStoId() == null ? other.getStoId() == null : this.getStoId().equals(other.getStoId()))
            && (this.getLastFreightCost() == null ? other.getLastFreightCost() == null : this.getLastFreightCost().equals(other.getLastFreightCost()))
            && (this.getCancleTime() == null ? other.getCancleTime() == null : this.getCancleTime().equals(other.getCancleTime()))
            && (this.getAutoPayStatus() == null ? other.getAutoPayStatus() == null : this.getAutoPayStatus().equals(other.getAutoPayStatus()))
            && (this.getAutoPayTime() == null ? other.getAutoPayTime() == null : this.getAutoPayTime().equals(other.getAutoPayTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getBuyerCheckoutMessage() == null ? other.getBuyerCheckoutMessage() == null : this.getBuyerCheckoutMessage().equals(other.getBuyerCheckoutMessage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSaoId() == null) ? 0 : getSaoId().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getCallCnt() == null) ? 0 : getCallCnt().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStsCd() == null) ? 0 : getStsCd().hashCode());
        result = prime * result + ((getManId() == null) ? 0 : getManId().hashCode());
        result = prime * result + ((getWarId() == null) ? 0 : getWarId().hashCode());
        result = prime * result + ((getSyncDate() == null) ? 0 : getSyncDate().hashCode());
        result = prime * result + ((getPaymentDate() == null) ? 0 : getPaymentDate().hashCode());
        result = prime * result + ((getPushDate() == null) ? 0 : getPushDate().hashCode());
        result = prime * result + ((getTrackNoDate() == null) ? 0 : getTrackNoDate().hashCode());
        result = prime * result + ((getFulfillmentDate() == null) ? 0 : getFulfillmentDate().hashCode());
        result = prime * result + ((getSettlementDate() == null) ? 0 : getSettlementDate().hashCode());
        result = prime * result + ((getProductAmount() == null) ? 0 : getProductAmount().hashCode());
        result = prime * result + ((getFreightCost() == null) ? 0 : getFreightCost().hashCode());
        result = prime * result + ((getHandlingFee() == null) ? 0 : getHandlingFee().hashCode());
        result = prime * result + ((getCustomerRemark() == null) ? 0 : getCustomerRemark().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getOrderSts() == null) ? 0 : getOrderSts().hashCode());
        result = prime * result + ((getRefundSts() == null) ? 0 : getRefundSts().hashCode());
        result = prime * result + ((getDeliverySts() == null) ? 0 : getDeliverySts().hashCode());
        result = prime * result + ((getStoId() == null) ? 0 : getStoId().hashCode());
        result = prime * result + ((getLastFreightCost() == null) ? 0 : getLastFreightCost().hashCode());
        result = prime * result + ((getCancleTime() == null) ? 0 : getCancleTime().hashCode());
        result = prime * result + ((getAutoPayStatus() == null) ? 0 : getAutoPayStatus().hashCode());
        result = prime * result + ((getAutoPayTime() == null) ? 0 : getAutoPayTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getBuyerCheckoutMessage() == null) ? 0 : getBuyerCheckoutMessage().hashCode());
        return result;
    }

    public enum Column {
        saoId("SAO_ID", "saoId", "INTEGER", false),
        createdBy("CREATED_BY", "createdBy", "VARCHAR", false),
        creationDate("CREATION_DATE", "creationDate", "TIMESTAMP", false),
        lastUpdateBy("LAST_UPDATE_BY", "lastUpdateBy", "VARCHAR", false),
        lastUpdateDate("LAST_UPDATE_DATE", "lastUpdateDate", "TIMESTAMP", false),
        callCnt("CALL_CNT", "callCnt", "INTEGER", false),
        remark("REMARK", "remark", "VARCHAR", false),
        stsCd("STS_CD", "stsCd", "CHAR", false),
        manId("MAN_ID", "manId", "INTEGER", false),
        warId("WAR_ID", "warId", "INTEGER", false),
        syncDate("SYNC_DATE", "syncDate", "TIMESTAMP", false),
        paymentDate("PAYMENT_DATE", "paymentDate", "TIMESTAMP", false),
        pushDate("PUSH_DATE", "pushDate", "TIMESTAMP", false),
        trackNoDate("TRACK_NO_DATE", "trackNoDate", "TIMESTAMP", false),
        fulfillmentDate("FULFILLMENT_DATE", "fulfillmentDate", "TIMESTAMP", false),
        settlementDate("SETTLEMENT_DATE", "settlementDate", "TIMESTAMP", false),
        productAmount("PRODUCT_AMOUNT", "productAmount", "DECIMAL", false),
        freightCost("FREIGHT_COST", "freightCost", "DECIMAL", false),
        handlingFee("HANDLING_FEE", "handlingFee", "DECIMAL", false),
        customerRemark("CUSTOMER_REMARK", "customerRemark", "VARCHAR", false),
        orderNo("ORDER_NO", "orderNo", "VARCHAR", false),
        orderSts("ORDER_STS", "orderSts", "VARCHAR", false),
        refundSts("REFUND_STS", "refundSts", "VARCHAR", false),
        deliverySts("DELIVERY_STS", "deliverySts", "VARCHAR", false),
        stoId("STO_ID", "stoId", "INTEGER", false),
        lastFreightCost("LAST_FREIGHT_COST", "lastFreightCost", "DECIMAL", false),
        cancleTime("CANCLE_TIME", "cancleTime", "TIMESTAMP", false),
        autoPayStatus("AUTO_PAY_STATUS", "autoPayStatus", "CHAR", false),
        autoPayTime("AUTO_PAY_TIME", "autoPayTime", "VARCHAR", false),
        deleted("deleted", "deleted", "BIT", false),
        buyerCheckoutMessage("BUYER_CHECKOUT_MESSAGE", "buyerCheckoutMessage", "LONGVARCHAR", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}