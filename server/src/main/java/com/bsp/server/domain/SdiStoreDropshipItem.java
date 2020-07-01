package com.bsp.server.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class SdiStoreDropshipItem {
    private Integer dilId;

    private Integer proId;

    private Integer strId;

    private Integer storeRetention;

    private BigDecimal dropshipPrice;

    private String dropshipStatus;

    private String createdBy;

    private Date creationDate;

    private String lastUpdateBy;

    private Integer callCnt;

    private Date lastUpdateDate;

    private String remark;

    private String stsCd;

    private Integer shelfStock;

    private Date preferDate;

    private Boolean deleted;

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

    public Integer getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(Integer callCnt) {
        this.callCnt = callCnt;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
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

    public Date getPreferDate() {
        return preferDate;
    }

    public void setPreferDate(Date preferDate) {
        this.preferDate = preferDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
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
        SdiStoreDropshipItem other = (SdiStoreDropshipItem) that;
        return (this.getDilId() == null ? other.getDilId() == null : this.getDilId().equals(other.getDilId()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getStrId() == null ? other.getStrId() == null : this.getStrId().equals(other.getStrId()))
            && (this.getStoreRetention() == null ? other.getStoreRetention() == null : this.getStoreRetention().equals(other.getStoreRetention()))
            && (this.getDropshipPrice() == null ? other.getDropshipPrice() == null : this.getDropshipPrice().equals(other.getDropshipPrice()))
            && (this.getDropshipStatus() == null ? other.getDropshipStatus() == null : this.getDropshipStatus().equals(other.getDropshipStatus()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getCallCnt() == null ? other.getCallCnt() == null : this.getCallCnt().equals(other.getCallCnt()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStsCd() == null ? other.getStsCd() == null : this.getStsCd().equals(other.getStsCd()))
            && (this.getShelfStock() == null ? other.getShelfStock() == null : this.getShelfStock().equals(other.getShelfStock()))
            && (this.getPreferDate() == null ? other.getPreferDate() == null : this.getPreferDate().equals(other.getPreferDate()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDilId() == null) ? 0 : getDilId().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getStrId() == null) ? 0 : getStrId().hashCode());
        result = prime * result + ((getStoreRetention() == null) ? 0 : getStoreRetention().hashCode());
        result = prime * result + ((getDropshipPrice() == null) ? 0 : getDropshipPrice().hashCode());
        result = prime * result + ((getDropshipStatus() == null) ? 0 : getDropshipStatus().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getCallCnt() == null) ? 0 : getCallCnt().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStsCd() == null) ? 0 : getStsCd().hashCode());
        result = prime * result + ((getShelfStock() == null) ? 0 : getShelfStock().hashCode());
        result = prime * result + ((getPreferDate() == null) ? 0 : getPreferDate().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    public enum Column {
        dilId("DIL_ID", "dilId", "INTEGER", false),
        proId("PRO_ID", "proId", "INTEGER", false),
        strId("STR_ID", "strId", "INTEGER", false),
        storeRetention("STORE_RETENTION", "storeRetention", "INTEGER", false),
        dropshipPrice("DROPSHIP_PRICE", "dropshipPrice", "DECIMAL", false),
        dropshipStatus("DROPSHIP_STATUS", "dropshipStatus", "VARCHAR", false),
        createdBy("CREATED_BY", "createdBy", "VARCHAR", false),
        creationDate("CREATION_DATE", "creationDate", "TIMESTAMP", false),
        lastUpdateBy("LAST_UPDATE_BY", "lastUpdateBy", "VARCHAR", false),
        callCnt("CALL_CNT", "callCnt", "INTEGER", false),
        lastUpdateDate("LAST_UPDATE_DATE", "lastUpdateDate", "TIMESTAMP", false),
        remark("REMARK", "remark", "VARCHAR", false),
        stsCd("STS_CD", "stsCd", "CHAR", false),
        shelfStock("SHELF_STOCK", "shelfStock", "INTEGER", false),
        preferDate("PREFER_DATE", "preferDate", "TIMESTAMP", false),
        deleted("deleted", "deleted", "BIT", false);

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