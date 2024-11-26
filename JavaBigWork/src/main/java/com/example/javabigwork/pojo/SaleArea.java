package com.example.javabigwork.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class SaleArea {
    @Id
    private String id;
    @Column
    private String name;
    @ManyToOne
    private Department department;
    @Column
    private String notes;
    @Temporal(TemporalType.DATE)
    private Date createTime;
}
