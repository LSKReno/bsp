package com.bsp.server.dto;

public class OrderItemWithProductDto {
    private SalSalesOrderLineItemDto salSalesOrderLineItemDto;
    private ProProductDto proProductDto;

    public SalSalesOrderLineItemDto getSalSalesOrderLineItemDto() {
        return salSalesOrderLineItemDto;
    }

    public void setSalSalesOrderLineItemDto(SalSalesOrderLineItemDto salSalesOrderLineItemDto) {
        this.salSalesOrderLineItemDto = salSalesOrderLineItemDto;
    }

    public ProProductDto getProProductDto() {
        return proProductDto;
    }

    public void setProProductDto(ProProductDto proProductDto) {
        this.proProductDto = proProductDto;
    }

    @Override
    public String toString() {
        return "OrderItemWithProductDto{" +
                "salSalesOrderLineItemDto=" + salSalesOrderLineItemDto +
                ", proProductDto=" + proProductDto +
                '}';
    }
}
