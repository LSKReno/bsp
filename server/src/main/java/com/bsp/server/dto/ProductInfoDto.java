package com.bsp.server.dto;

public class ProductInfoDto {
    /**
     * 标题

     */
    private String title;

    /**
     * 商品sku编码

     */
    private String skuCd;
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
     * 商品描述（富文本、纯文本、卖点）

     */
    private String descrition;

    /**
     * 单价

     */
    private String price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSkuCd(String skuCd) {
        this.skuCd = skuCd;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarrantyDay(String warrantyDay) {
        this.warrantyDay = warrantyDay;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getSkuCd() {
        return skuCd;
    }

    public String getUpc() {
        return upc;
    }

    public String getEan() {
        return ean;
    }

    public String getModel() {
        return model;
    }

    public String getWarrantyDay() {
        return warrantyDay;
    }

    public String getDescrition() {
        return descrition;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductInfoDto{" +
                "title='" + title + '\'' +
                ", skuCd='" + skuCd + '\'' +
                ", upc='" + upc + '\'' +
                ", ean='" + ean + '\'' +
                ", model='" + model + '\'' +
                ", warrantyDay='" + warrantyDay + '\'' +
                ", descrition='" + descrition + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
