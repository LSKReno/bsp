package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ProProduct {
    private Integer proId;

    private String skuCd;

    private Integer brdId;

    private Integer manId;

    private String title;

    private String upc;

    private String ean;

    private String model;

    private String warrantyDay;

    private BigDecimal retailPrice;

    private String createdBy;

    private Date creationDate;

    private String lastUpdateBy;

    private Date lastUpdateDate;

    private Integer callCnt;

    private String remark;

    private String stsCd;

    private BigDecimal mininumRetailPrice;

    private String replenishmentPeriod;

    private String keyWords;

    private String timeUnit;

    private Integer stockseting;

    private Boolean deleted;

    private String warranty;

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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
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
        sb.append(", timeUnit=").append(timeUnit);
        sb.append(", stockseting=").append(stockseting);
        sb.append(", deleted=").append(deleted);
        sb.append(", warranty=").append(warranty);
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
        ProProduct other = (ProProduct) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getSkuCd() == null ? other.getSkuCd() == null : this.getSkuCd().equals(other.getSkuCd()))
            && (this.getBrdId() == null ? other.getBrdId() == null : this.getBrdId().equals(other.getBrdId()))
            && (this.getManId() == null ? other.getManId() == null : this.getManId().equals(other.getManId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getUpc() == null ? other.getUpc() == null : this.getUpc().equals(other.getUpc()))
            && (this.getEan() == null ? other.getEan() == null : this.getEan().equals(other.getEan()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getWarrantyDay() == null ? other.getWarrantyDay() == null : this.getWarrantyDay().equals(other.getWarrantyDay()))
            && (this.getRetailPrice() == null ? other.getRetailPrice() == null : this.getRetailPrice().equals(other.getRetailPrice()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getCallCnt() == null ? other.getCallCnt() == null : this.getCallCnt().equals(other.getCallCnt()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStsCd() == null ? other.getStsCd() == null : this.getStsCd().equals(other.getStsCd()))
            && (this.getMininumRetailPrice() == null ? other.getMininumRetailPrice() == null : this.getMininumRetailPrice().equals(other.getMininumRetailPrice()))
            && (this.getReplenishmentPeriod() == null ? other.getReplenishmentPeriod() == null : this.getReplenishmentPeriod().equals(other.getReplenishmentPeriod()))
            && (this.getKeyWords() == null ? other.getKeyWords() == null : this.getKeyWords().equals(other.getKeyWords()))
            && (this.getTimeUnit() == null ? other.getTimeUnit() == null : this.getTimeUnit().equals(other.getTimeUnit()))
            && (this.getStockseting() == null ? other.getStockseting() == null : this.getStockseting().equals(other.getStockseting()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getWarranty() == null ? other.getWarranty() == null : this.getWarranty().equals(other.getWarranty()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getSkuCd() == null) ? 0 : getSkuCd().hashCode());
        result = prime * result + ((getBrdId() == null) ? 0 : getBrdId().hashCode());
        result = prime * result + ((getManId() == null) ? 0 : getManId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUpc() == null) ? 0 : getUpc().hashCode());
        result = prime * result + ((getEan() == null) ? 0 : getEan().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getWarrantyDay() == null) ? 0 : getWarrantyDay().hashCode());
        result = prime * result + ((getRetailPrice() == null) ? 0 : getRetailPrice().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getCallCnt() == null) ? 0 : getCallCnt().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStsCd() == null) ? 0 : getStsCd().hashCode());
        result = prime * result + ((getMininumRetailPrice() == null) ? 0 : getMininumRetailPrice().hashCode());
        result = prime * result + ((getReplenishmentPeriod() == null) ? 0 : getReplenishmentPeriod().hashCode());
        result = prime * result + ((getKeyWords() == null) ? 0 : getKeyWords().hashCode());
        result = prime * result + ((getTimeUnit() == null) ? 0 : getTimeUnit().hashCode());
        result = prime * result + ((getStockseting() == null) ? 0 : getStockseting().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getWarranty() == null) ? 0 : getWarranty().hashCode());
        return result;
    }

    public enum Column {
        proId("PRO_ID", "proId", "INTEGER", false),
        skuCd("SKU_CD", "skuCd", "VARCHAR", false),
        brdId("BRD_ID", "brdId", "INTEGER", false),
        manId("MAN_ID", "manId", "INTEGER", false),
        title("TITLE", "title", "VARCHAR", false),
        upc("UPC", "upc", "VARCHAR", false),
        ean("EAN", "ean", "VARCHAR", false),
        model("MODEL", "model", "VARCHAR", false),
        warrantyDay("WARRANTY_DAY", "warrantyDay", "VARCHAR", false),
        retailPrice("RETAIL_PRICE", "retailPrice", "DECIMAL", false),
        createdBy("CREATED_BY", "createdBy", "VARCHAR", false),
        creationDate("CREATION_DATE", "creationDate", "TIMESTAMP", false),
        lastUpdateBy("LAST_UPDATE_BY", "lastUpdateBy", "VARCHAR", false),
        lastUpdateDate("LAST_UPDATE_DATE", "lastUpdateDate", "TIMESTAMP", false),
        callCnt("CALL_CNT", "callCnt", "INTEGER", false),
        remark("REMARK", "remark", "VARCHAR", false),
        stsCd("STS_CD", "stsCd", "CHAR", false),
        mininumRetailPrice("MININUM_RETAIL_PRICE", "mininumRetailPrice", "DECIMAL", false),
        replenishmentPeriod("REPLENISHMENT_PERIOD", "replenishmentPeriod", "VARCHAR", false),
        keyWords("KEY_WORDS", "keyWords", "VARCHAR", false),
        timeUnit("TIME_UNIT", "timeUnit", "VARCHAR", false),
        stockseting("STOCKSETING", "stockseting", "INTEGER", false),
        deleted("deleted", "deleted", "BIT", false),
        warranty("WARRANTY", "warranty", "LONGVARCHAR", false);

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