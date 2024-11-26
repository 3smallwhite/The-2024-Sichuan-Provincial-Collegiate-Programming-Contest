package com.example.javabigwork.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class CustomerVisit {  //客户来访
    @Id
    private String id;
    @Temporal(TemporalType.TIME)
    private Date time;
    @Column
    private String status;
    @Column
    private String message; // 来访事宜
    @Column
    private String notes;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private KeyPerson keyPerson;
}
