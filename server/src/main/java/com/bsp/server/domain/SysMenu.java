package com.bsp.server.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class SysMenu {
    private Integer menuId;

    private String menuTitle;

    private String menuKey;

    private String menuName;

    private String component;

    private String permissionId;

    private String permissionName;

    private String menuUrl;

    private String parentId;

    private String menuOrder;

    private String menuIcon;

    private String menuType;

    private String menuRedirect;

    private String menuMetadata;

    private Boolean deleted;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuRedirect() {
        return menuRedirect;
    }

    public void setMenuRedirect(String menuRedirect) {
        this.menuRedirect = menuRedirect;
    }

    public String getMenuMetadata() {
        return menuMetadata;
    }

    public void setMenuMetadata(String menuMetadata) {
        this.menuMetadata = menuMetadata;
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
        sb.append(", menuId=").append(menuId);
        sb.append(", menuTitle=").append(menuTitle);
        sb.append(", menuKey=").append(menuKey);
        sb.append(", menuName=").append(menuName);
        sb.append(", component=").append(component);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", permissionName=").append(permissionName);
        sb.append(", menuUrl=").append(menuUrl);
        sb.append(", parentId=").append(parentId);
        sb.append(", menuOrder=").append(menuOrder);
        sb.append(", menuIcon=").append(menuIcon);
        sb.append(", menuType=").append(menuType);
        sb.append(", menuRedirect=").append(menuRedirect);
        sb.append(", menuMetadata=").append(menuMetadata);
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
        SysMenu other = (SysMenu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getMenuTitle() == null ? other.getMenuTitle() == null : this.getMenuTitle().equals(other.getMenuTitle()))
            && (this.getMenuKey() == null ? other.getMenuKey() == null : this.getMenuKey().equals(other.getMenuKey()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getComponent() == null ? other.getComponent() == null : this.getComponent().equals(other.getComponent()))
            && (this.getPermissionId() == null ? other.getPermissionId() == null : this.getPermissionId().equals(other.getPermissionId()))
            && (this.getPermissionName() == null ? other.getPermissionName() == null : this.getPermissionName().equals(other.getPermissionName()))
            && (this.getMenuUrl() == null ? other.getMenuUrl() == null : this.getMenuUrl().equals(other.getMenuUrl()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getMenuOrder() == null ? other.getMenuOrder() == null : this.getMenuOrder().equals(other.getMenuOrder()))
            && (this.getMenuIcon() == null ? other.getMenuIcon() == null : this.getMenuIcon().equals(other.getMenuIcon()))
            && (this.getMenuType() == null ? other.getMenuType() == null : this.getMenuType().equals(other.getMenuType()))
            && (this.getMenuRedirect() == null ? other.getMenuRedirect() == null : this.getMenuRedirect().equals(other.getMenuRedirect()))
            && (this.getMenuMetadata() == null ? other.getMenuMetadata() == null : this.getMenuMetadata().equals(other.getMenuMetadata()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getMenuTitle() == null) ? 0 : getMenuTitle().hashCode());
        result = prime * result + ((getMenuKey() == null) ? 0 : getMenuKey().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getComponent() == null) ? 0 : getComponent().hashCode());
        result = prime * result + ((getPermissionId() == null) ? 0 : getPermissionId().hashCode());
        result = prime * result + ((getPermissionName() == null) ? 0 : getPermissionName().hashCode());
        result = prime * result + ((getMenuUrl() == null) ? 0 : getMenuUrl().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getMenuOrder() == null) ? 0 : getMenuOrder().hashCode());
        result = prime * result + ((getMenuIcon() == null) ? 0 : getMenuIcon().hashCode());
        result = prime * result + ((getMenuType() == null) ? 0 : getMenuType().hashCode());
        result = prime * result + ((getMenuRedirect() == null) ? 0 : getMenuRedirect().hashCode());
        result = prime * result + ((getMenuMetadata() == null) ? 0 : getMenuMetadata().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    public enum Column {
        menuId("MENU_ID", "menuId", "INTEGER", false),
        menuTitle("MENU_TITLE", "menuTitle", "VARCHAR", false),
        menuKey("MENU_KEY", "menuKey", "VARCHAR", false),
        menuName("MENU_NAME", "menuName", "VARCHAR", false),
        component("COMPONENT", "component", "VARCHAR", false),
        permissionId("PERMISSION_ID", "permissionId", "VARCHAR", false),
        permissionName("PERMISSION_NAME", "permissionName", "VARCHAR", false),
        menuUrl("MENU_URL", "menuUrl", "VARCHAR", false),
        parentId("PARENT_ID", "parentId", "VARCHAR", false),
        menuOrder("MENU_ORDER", "menuOrder", "VARCHAR", false),
        menuIcon("MENU_ICON", "menuIcon", "VARCHAR", false),
        menuType("MENU_TYPE", "menuType", "VARCHAR", false),
        menuRedirect("MENU_REDIRECT", "menuRedirect", "VARCHAR", false),
        menuMetadata("MENU_METADATA", "menuMetadata", "VARCHAR", false),
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