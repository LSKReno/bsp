package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class UllUserLoginLogoutLog {
    private Integer ullId;

    private String usiId;

    private String token;

    private String terminalType;

    private String operatingType;

    private Date operatingDate;

    private String createdBy;

    private Date creationDate;

    private String lastUpdateBy;

    private Date lastUpdateDate;

    private String callCnt;

    private String remark;

    private String stsCd;

    private Boolean deleted;

    public Integer getUllId() {
        return ullId;
    }

    public void setUllId(Integer ullId) {
        this.ullId = ullId;
    }

    public String getUsiId() {
        return usiId;
    }

    public void setUsiId(String usiId) {
        this.usiId = usiId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getOperatingType() {
        return operatingType;
    }

    public void setOperatingType(String operatingType) {
        this.operatingType = operatingType;
    }

    public Date getOperatingDate() {
        return operatingDate;
    }

    public void setOperatingDate(Date operatingDate) {
        this.operatingDate = operatingDate;
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
        sb.append(", ullId=").append(ullId);
        sb.append(", usiId=").append(usiId);
        sb.append(", token=").append(token);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", operatingType=").append(operatingType);
        sb.append(", operatingDate=").append(operatingDate);
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
        UllUserLoginLogoutLog other = (UllUserLoginLogoutLog) that;
        return (this.getUllId() == null ? other.getUllId() == null : this.getUllId().equals(other.getUllId()))
            && (this.getUsiId() == null ? other.getUsiId() == null : this.getUsiId().equals(other.getUsiId()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getTerminalType() == null ? other.getTerminalType() == null : this.getTerminalType().equals(other.getTerminalType()))
            && (this.getOperatingType() == null ? other.getOperatingType() == null : this.getOperatingType().equals(other.getOperatingType()))
            && (this.getOperatingDate() == null ? other.getOperatingDate() == null : this.getOperatingDate().equals(other.getOperatingDate()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getCallCnt() == null ? other.getCallCnt() == null : this.getCallCnt().equals(other.getCallCnt()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStsCd() == null ? other.getStsCd() == null : this.getStsCd().equals(other.getStsCd()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUllId() == null) ? 0 : getUllId().hashCode());
        result = prime * result + ((getUsiId() == null) ? 0 : getUsiId().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getTerminalType() == null) ? 0 : getTerminalType().hashCode());
        result = prime * result + ((getOperatingType() == null) ? 0 : getOperatingType().hashCode());
        result = prime * result + ((getOperatingDate() == null) ? 0 : getOperatingDate().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getCallCnt() == null) ? 0 : getCallCnt().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStsCd() == null) ? 0 : getStsCd().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    public enum Column {
        ullId("ULL_ID", "ullId", "INTEGER", false),
        usiId("USI_ID", "usiId", "VARCHAR", false),
        token("TOKEN", "token", "VARCHAR", false),
        terminalType("TERMINAL_TYPE", "terminalType", "VARCHAR", false),
        operatingType("OPERATING_TYPE", "operatingType", "VARCHAR", false),
        operatingDate("OPERATING_DATE", "operatingDate", "TIMESTAMP", false),
        createdBy("CREATED_BY", "createdBy", "VARCHAR", false),
        creationDate("CREATION_DATE", "creationDate", "TIMESTAMP", false),
        lastUpdateBy("LAST_UPDATE_BY", "lastUpdateBy", "VARCHAR", false),
        lastUpdateDate("LAST_UPDATE_DATE", "lastUpdateDate", "TIMESTAMP", false),
        callCnt("CALL_CNT", "callCnt", "VARCHAR", false),
        remark("REMARK", "remark", "VARCHAR", false),
        stsCd("STS_CD", "stsCd", "CHAR", false),
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