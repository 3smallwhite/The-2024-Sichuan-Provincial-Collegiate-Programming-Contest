package com.example.javabigwork.pojo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SalePerson extends Person { // 销售人员
    @Id
    private String id;
    @ManyToOne
    private Duties duties;
    @ManyToOne
    private SaleArea saleArea;
}
