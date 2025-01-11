package com.stock.supplier.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Fornecedor_2")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 25, name = "name")
    private String name;

    private int phone;

}
