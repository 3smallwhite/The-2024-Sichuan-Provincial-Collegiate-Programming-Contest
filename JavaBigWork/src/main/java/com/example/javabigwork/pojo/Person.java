package com.example.javabigwork.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Person { // 人类
    @Column
    private String name;
    @Column
    private String sex;
    @Column
    @Temporal(TemporalType.DATE)
    private String birthday;
    @Column
    private String telephone;
    @Column
    private String notes;
}
