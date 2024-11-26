package com.example.javabigwork.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Contract { // 合同
    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String area;
    @Column
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Column
    @Temporal(TemporalType.TIME)
    private Date endTime;
    @Column
    private String note;
    @Column
    private Double totalPrice;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private KeyPerson keyPerson;
    @ManyToMany
    private List<Product> productList;
}
