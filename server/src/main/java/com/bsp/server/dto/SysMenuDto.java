package com.bsp.server.dto;


public class SysMenuDto {

    /**
     * 主键

     */
    private Integer menuId;

    /**
     * 菜单title
     */
    private String menuTitle;

    /**
     * 菜单name
     */
    private String menuName;

    /**
     * PERMISSION_ID
     */
    private String permissionId;

    /**
     * PERMISSION_NAME
     */
    private String permissionName;

    /**
     * 路径

     */
    private String menuUrl;

    /**
     * 父类ID

     */
    private String parentId;

    /**
     * 排序标识

     */
    private String menuOrder;

    /**
     * 菜单图标样式

     */
    private String menuIcon;

    /**
     * 菜单类型

     */
    private String menuType;

    /**
     * 菜单重定向
     */
    private String menuRedirect;

    /**
     * 菜单元数据
     */
    private String menuMetadata;

    /**
     * 逻辑删除
     */
    private Integer deleted;

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

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
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
        sb.append(", menuId=").append(menuId);
        sb.append(", menuTitle=").append(menuTitle);
        sb.append(", menuName=").append(menuName);
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

}