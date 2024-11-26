package com.example.javabigwork.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Duties { // 职务
    @Id
    private String id;
    @Column
    private String level;
    @Column
    private String name;
}
