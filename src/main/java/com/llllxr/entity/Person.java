package com.llllxr.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column()
    private String name;
    @Column(columnDefinition = "text")
    private String introduce;
}
