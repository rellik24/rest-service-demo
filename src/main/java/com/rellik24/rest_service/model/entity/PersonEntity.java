package com.rellik24.rest_service.model.entity;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "person", schema = "public") // 指定表名，與資料庫的 person 表對應
public class PersonEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;
}
