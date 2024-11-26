package com.example.javabigwork.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Product {
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String model;
    @Column
    private String size;
    @Column
    private Float weight;
    @Column
    private String notes;
    @Column
    private String annex;
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;
    @Column
    private String type;
}
