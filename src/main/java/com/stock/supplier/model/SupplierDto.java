package com.stock.supplier.model;

import lombok.Data;

@Data
public class SupplierDto {
    private String name;

    private int phone;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
