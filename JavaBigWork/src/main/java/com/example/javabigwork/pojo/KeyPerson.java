package com.example.javabigwork.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class KeyPerson extends Person { // 关键人物
    @Id
    private String id;
    @Column
    private String code;
    @Column
    private String nikeName;
    @Column
    private String nativePlace;
    @ManyToOne
    private Duties duties;
    @Column
    private String maritalStatus;
    @Column
    private Boolean isMainPerson;
    @ManyToMany
    private List<Customer> customerList;
}
