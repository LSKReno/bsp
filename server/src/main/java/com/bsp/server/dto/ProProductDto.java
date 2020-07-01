package com.bsp.server.dto;

import java.math.BigDecimal;

public class ProProductDto {

    /**
     * 主键id

     */
    private Integer proId;

    /**
     * 商品sku编码

     */
    private String skuCd;

    /**
     * 外键，关联品牌id

     */
    private Integer brdId;

    /**
     * 外键关联man_id

     */
    private Integer manId;

    /**
     * 标题

     */
    private String title;

    /**
     * upc编码

     */
    private String upc;

    /**
     * ena编码

     */
    private String ean;

    /**
     * 型号

     */
    private String model;

    /**
     * 保修期（单位有年、月、日）

     */
    private String warrantyDay;

    /**
     * 建议零售价

     */
    private BigDecimal retailPrice;

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
     * 最低零售价

     */
    private BigDecimal mininumRetailPrice;

    /**
     * 补货期（天）

     */
    private String replenishmentPeriod;

    /**
     * 关键字，预留后续搜索使用

     */
    private String keyWords;

    /**
     * 保修政策说明

     */
    private String warranty;

    /**
     * 保修期单位 1、年 2、月 3、日

     */
    private String timeUnit;

    /**
     * 库存预警设置（当低于预警值时发出警告）

     */
    private Integer stockseting;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getSkuCd() {
        return skuCd;
    }

    public void setSkuCd(String skuCd) {
        this.skuCd = skuCd;
    }

    public Integer getBrdId() {
        return brdId;
    }

    public void setBrdId(Integer brdId) {
        this.brdId = brdId;
    }

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWarrantyDay() {
        return warrantyDay;
    }

    public void setWarrantyDay(String warrantyDay) {
        this.warrantyDay = warrantyDay;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
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

    public BigDecimal getMininumRetailPrice() {
        return mininumRetailPrice;
    }

    public void setMininumRetailPrice(BigDecimal mininumRetailPrice) {
        this.mininumRetailPrice = mininumRetailPrice;
    }

    public String getReplenishmentPeriod() {
        return replenishmentPeriod;
    }

    public void setReplenishmentPeriod(String replenishmentPeriod) {
        this.replenishmentPeriod = replenishmentPeriod;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Integer getStockseting() {
        return stockseting;
    }

    public void setStockseting(Integer stockseting) {
        this.stockseting = stockseting;
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
        sb.append(", proId=").append(proId);
        sb.append(", skuCd=").append(skuCd);
        sb.append(", brdId=").append(brdId);
        sb.append(", manId=").append(manId);
        sb.append(", title=").append(title);
        sb.append(", upc=").append(upc);
        sb.append(", ean=").append(ean);
        sb.append(", model=").append(model);
        sb.append(", warrantyDay=").append(warrantyDay);
        sb.append(", retailPrice=").append(retailPrice);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", mininumRetailPrice=").append(mininumRetailPrice);
        sb.append(", replenishmentPeriod=").append(replenishmentPeriod);
        sb.append(", keyWords=").append(keyWords);
        sb.append(", warranty=").append(warranty);
        sb.append(", timeUnit=").append(timeUnit);
        sb.append(", stockseting=").append(stockseting);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

}