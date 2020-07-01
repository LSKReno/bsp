package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ShaShippingAddress {
    private Integer id;

    private String createdBy;

    private Date creationDate;

    private String lastUpdateBy;

    private Date lastUpdateDate;

    private Integer callCnt;

    private String remark;

    private String stsCd;

    private String familyName;

    private String givenName;

    private String countryName;

    private String countryIsoCd;

    private String stateOrProvinceName;

    private String stateOrProvinceCd;

    private String cityName;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String postalCd;

    private String contactPhoneNo;

    private String email;

    private Integer stoId;

    private String carrierName;

    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryIsoCd() {
        return countryIsoCd;
    }

    public void setCountryIsoCd(String countryIsoCd) {
        this.countryIsoCd = countryIsoCd;
    }

    public String getStateOrProvinceName() {
        return stateOrProvinceName;
    }

    public void setStateOrProvinceName(String stateOrProvinceName) {
        this.stateOrProvinceName = stateOrProvinceName;
    }

    public String getStateOrProvinceCd() {
        return stateOrProvinceCd;
    }

    public void setStateOrProvinceCd(String stateOrProvinceCd) {
        this.stateOrProvinceCd = stateOrProvinceCd;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getPostalCd() {
        return postalCd;
    }

    public void setPostalCd(String postalCd) {
        this.postalCd = postalCd;
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStoId() {
        return stoId;
    }

    public void setStoId(Integer stoId) {
        this.stoId = stoId;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
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
        sb.append(", id=").append(id);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateDate=").append(lastUpdateDate);
        sb.append(", callCnt=").append(callCnt);
        sb.append(", remark=").append(remark);
        sb.append(", stsCd=").append(stsCd);
        sb.append(", familyName=").append(familyName);
        sb.append(", givenName=").append(givenName);
        sb.append(", countryName=").append(countryName);
        sb.append(", countryIsoCd=").append(countryIsoCd);
        sb.append(", stateOrProvinceName=").append(stateOrProvinceName);
        sb.append(", stateOrProvinceCd=").append(stateOrProvinceCd);
        sb.append(", cityName=").append(cityName);
        sb.append(", addressLine1=").append(addressLine1);
        sb.append(", addressLine2=").append(addressLine2);
        sb.append(", addressLine3=").append(addressLine3);
        sb.append(", postalCd=").append(postalCd);
        sb.append(", contactPhoneNo=").append(contactPhoneNo);
        sb.append(", email=").append(email);
        sb.append(", stoId=").append(stoId);
        sb.append(", carrierName=").append(carrierName);
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
        ShaShippingAddress other = (ShaShippingAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getLastUpdateBy() == null ? other.getLastUpdateBy() == null : this.getLastUpdateBy().equals(other.getLastUpdateBy()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getCallCnt() == null ? other.getCallCnt() == null : this.getCallCnt().equals(other.getCallCnt()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStsCd() == null ? other.getStsCd() == null : this.getStsCd().equals(other.getStsCd()))
            && (this.getFamilyName() == null ? other.getFamilyName() == null : this.getFamilyName().equals(other.getFamilyName()))
            && (this.getGivenName() == null ? other.getGivenName() == null : this.getGivenName().equals(other.getGivenName()))
            && (this.getCountryName() == null ? other.getCountryName() == null : this.getCountryName().equals(other.getCountryName()))
            && (this.getCountryIsoCd() == null ? other.getCountryIsoCd() == null : this.getCountryIsoCd().equals(other.getCountryIsoCd()))
            && (this.getStateOrProvinceName() == null ? other.getStateOrProvinceName() == null : this.getStateOrProvinceName().equals(other.getStateOrProvinceName()))
            && (this.getStateOrProvinceCd() == null ? other.getStateOrProvinceCd() == null : this.getStateOrProvinceCd().equals(other.getStateOrProvinceCd()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getAddressLine1() == null ? other.getAddressLine1() == null : this.getAddressLine1().equals(other.getAddressLine1()))
            && (this.getAddressLine2() == null ? other.getAddressLine2() == null : this.getAddressLine2().equals(other.getAddressLine2()))
            && (this.getAddressLine3() == null ? other.getAddressLine3() == null : this.getAddressLine3().equals(other.getAddressLine3()))
            && (this.getPostalCd() == null ? other.getPostalCd() == null : this.getPostalCd().equals(other.getPostalCd()))
            && (this.getContactPhoneNo() == null ? other.getContactPhoneNo() == null : this.getContactPhoneNo().equals(other.getContactPhoneNo()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getStoId() == null ? other.getStoId() == null : this.getStoId().equals(other.getStoId()))
            && (this.getCarrierName() == null ? other.getCarrierName() == null : this.getCarrierName().equals(other.getCarrierName()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getLastUpdateBy() == null) ? 0 : getLastUpdateBy().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getCallCnt() == null) ? 0 : getCallCnt().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStsCd() == null) ? 0 : getStsCd().hashCode());
        result = prime * result + ((getFamilyName() == null) ? 0 : getFamilyName().hashCode());
        result = prime * result + ((getGivenName() == null) ? 0 : getGivenName().hashCode());
        result = prime * result + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        result = prime * result + ((getCountryIsoCd() == null) ? 0 : getCountryIsoCd().hashCode());
        result = prime * result + ((getStateOrProvinceName() == null) ? 0 : getStateOrProvinceName().hashCode());
        result = prime * result + ((getStateOrProvinceCd() == null) ? 0 : getStateOrProvinceCd().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getAddressLine1() == null) ? 0 : getAddressLine1().hashCode());
        result = prime * result + ((getAddressLine2() == null) ? 0 : getAddressLine2().hashCode());
        result = prime * result + ((getAddressLine3() == null) ? 0 : getAddressLine3().hashCode());
        result = prime * result + ((getPostalCd() == null) ? 0 : getPostalCd().hashCode());
        result = prime * result + ((getContactPhoneNo() == null) ? 0 : getContactPhoneNo().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getStoId() == null) ? 0 : getStoId().hashCode());
        result = prime * result + ((getCarrierName() == null) ? 0 : getCarrierName().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        createdBy("CREATED_BY", "createdBy", "VARCHAR", false),
        creationDate("CREATION_DATE", "creationDate", "TIMESTAMP", false),
        lastUpdateBy("LAST_UPDATE_BY", "lastUpdateBy", "VARCHAR", false),
        lastUpdateDate("LAST_UPDATE_DATE", "lastUpdateDate", "TIMESTAMP", false),
        callCnt("CALL_CNT", "callCnt", "INTEGER", false),
        remark("REMARK", "remark", "VARCHAR", false),
        stsCd("STS_CD", "stsCd", "CHAR", false),
        familyName("FAMILY_NAME", "familyName", "VARCHAR", false),
        givenName("GIVEN_NAME", "givenName", "VARCHAR", false),
        countryName("COUNTRY_NAME", "countryName", "VARCHAR", false),
        countryIsoCd("COUNTRY_ISO_CD", "countryIsoCd", "VARCHAR", false),
        stateOrProvinceName("STATE_OR_PROVINCE_NAME", "stateOrProvinceName", "VARCHAR", false),
        stateOrProvinceCd("STATE_OR_PROVINCE_CD", "stateOrProvinceCd", "VARCHAR", false),
        cityName("CITY_NAME", "cityName", "VARCHAR", false),
        addressLine1("ADDRESS_LINE1", "addressLine1", "VARCHAR", false),
        addressLine2("ADDRESS_LINE2", "addressLine2", "VARCHAR", false),
        addressLine3("ADDRESS_LINE3", "addressLine3", "VARCHAR", false),
        postalCd("POSTAL_CD", "postalCd", "VARCHAR", false),
        contactPhoneNo("CONTACT_PHONE_NO", "contactPhoneNo", "VARCHAR", false),
        email("EMAIL", "email", "VARCHAR", false),
        stoId("STO_ID", "stoId", "INTEGER", false),
        carrierName("CARRIER_NAME", "carrierName", "VARCHAR", false),
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