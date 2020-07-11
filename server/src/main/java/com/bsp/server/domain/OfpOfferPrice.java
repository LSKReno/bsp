package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class OfpOfferPrice {
    private Integer ofpId;

    private Integer manId;

    private Date effetiveStartDate;

    private Date effectiveEndDate;

    private String proId;

    private String price;

    private String typeCd;

    private String dsrId;

    private String createdBy;

    private Date creationDate;

    private String lastUpdateBy;

    private Date lastUpdateDate;

    private String callCnt;

    private String remark;

    private String stsCd;

    private String period;

    private Boolean deleted;

    public Integer getOfpId() {
        return ofpId;
    }

    public void setOfpId(Integer ofpId) {
        this.ofpId = ofpId;
    }

    public Integer getManId() {
        return manId;
    }

    public void setManId(Integer manId) {
        this.manId = manId;
    }

    public Date getEffetiveStartDate() {
        return effetiveStartDate;
    }

    public void setEffetiveStartDate(Date effetiveStartDate) {
        this.effetiveStartDate = effetiveStartDate;
    }

    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public String getDsrId() {
        return dsrId;
    }

    public void setDsrId(String dsrId) {
        this.dsrId = dsrId;
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

    public String getCallCnt() {
        return callCnt;
    }

    public void setCallCnt(String callCnt) {
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

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
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
        sb.append(", ofpId=").append(ofpId);
        sb.append(", manId=").append(manId);
        sb.append(", effetiveStartDate=").append(effetiveStartDate);
        sb.append(", effectiveEndDate=").append(effectiveEndDate);
        sb.append(", proId=").append(proId);
        sb.append(", price=").append(price);
        sb.append(", typeCd=").append(typeCd);
        sb.append(", dsrId=").append(dsrId);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", period=").append(period);
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
        OfpOfferPrice other = (OfpOfferPrice) that;
        return (this.getOfpId() == null ? other.getOfpId() == null : this.getOfpId().equals(other.getOfpId()))
            && (this.getManId() == null ? other.getManId() == null : this.getManId().equals(other.getManId()))
            && (this.getEffetiveStartDate() == null ? other.getEffetiveStartDate() == null : this.getEffetiveStartDate().equals(other.getEffetiveStartDate()))
            && (this.getEffectiveEndDate() == null ? other.getEffectiveEndDate() == null : this.getEffectiveEndDate().equals(other.getEffectiveEndDate()))
            && (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getTypeCd() == null ? other.getTypeCd() == null : this.getTypeCd().equals(other.getTypeCd()))
            && (this.getDsrId() == null ? other.getDsrId() == null : this.getDsrId().equals(other.getDsrId()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getCallCnt() == null ? other.getCallCnt() == null : this.getCallCnt().equals(other.getCallCnt()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStsCd() == null ? other.getStsCd() == null : this.getStsCd().equals(other.getStsCd()))
            && (this.getPeriod() == null ? other.getPeriod() == null : this.getPeriod().equals(other.getPeriod()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOfpId() == null) ? 0 : getOfpId().hashCode());
        result = prime * result + ((getManId() == null) ? 0 : getManId().hashCode());
        result = prime * result + ((getEffetiveStartDate() == null) ? 0 : getEffetiveStartDate().hashCode());
        result = prime * result + ((getEffectiveEndDate() == null) ? 0 : getEffectiveEndDate().hashCode());
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getTypeCd() == null) ? 0 : getTypeCd().hashCode());
        result = prime * result + ((getDsrId() == null) ? 0 : getDsrId().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getCallCnt() == null) ? 0 : getCallCnt().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStsCd() == null) ? 0 : getStsCd().hashCode());
        result = prime * result + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    public enum Column {
        ofpId("OFP_ID", "ofpId", "INTEGER", false),
        manId("MAN_ID", "manId", "INTEGER", false),
        effetiveStartDate("EFFETIVE_START_DATE", "effetiveStartDate", "TIMESTAMP", false),
        effectiveEndDate("EFFECTIVE_END_DATE", "effectiveEndDate", "TIMESTAMP", false),
        proId("PRO_ID", "proId", "VARCHAR", false),
        price("PRICE", "price", "VARCHAR", false),
        typeCd("TYPE_CD", "typeCd", "VARCHAR", false),
        dsrId("DSR_ID", "dsrId", "VARCHAR", false),
        createdBy("CREATED_BY", "createdBy", "VARCHAR", false),
        creationDate("CREATION_DATE", "creationDate", "TIMESTAMP", false),
        lastUpdateBy("LAST_UPDATE_BY", "lastUpdateBy", "VARCHAR", false),
        lastUpdateDate("LAST_UPDATE_DATE", "lastUpdateDate", "TIMESTAMP", false),
        callCnt("CALL_CNT", "callCnt", "VARCHAR", false),
        remark("REMARK", "remark", "VARCHAR", false),
        stsCd("STS_CD", "stsCd", "VARCHAR", false),
        period("PERIOD", "period", "VARCHAR", false),
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