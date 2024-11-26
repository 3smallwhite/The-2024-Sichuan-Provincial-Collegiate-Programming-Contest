package com.example.javabigwork.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Customer { // 客户
    @Id
    private String id;
    @Column
    private String customerName;
    @Column
    private String address;
    @Column
    private String area;   // 这里只写省份
    @Column
    private String industry;
    @Column
    private String unitName;
    @ManyToMany
    private List<KeyPerson> keyPersonList;
}
