package com.bsp.server.dto;

import java.util.List;

public class StrWithOrderDto {
    private StrStoreDto strStoreDto;
    private List<SaoSalesOrderDto> saoSalesOrderDtos;

    public StrStoreDto getStrStoreDto() {
        return strStoreDto;
    }

    public void setStrStoreDto(StrStoreDto strStoreDto) {
        this.strStoreDto = strStoreDto;
    }

    public List<SaoSalesOrderDto> getSaoSalesOrderDtos() {
        return saoSalesOrderDtos;
    }

    public void setSaoSalesOrderDtos(List<SaoSalesOrderDto> saoSalesOrderDtos) {
        this.saoSalesOrderDtos = saoSalesOrderDtos;
    }

    @Override
    public String toString() {
        return "StrWithOrderDto{" +
                "strStoreDto=" + strStoreDto +
                ", saoSalesOrderDtos=" + saoSalesOrderDtos +
                '}';
    }
}
