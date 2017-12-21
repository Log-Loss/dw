package com.dw.dw.entity;

import javax.persistence.*;

@Entity
@Table(name = "directors")
public class Director {

    @Id
    @Column(length = 228)
    public String director;

    @Column(columnDefinition = "TEXT")
    public String productIds;

    @Column(columnDefinition = "TEXT")
    public String actors;
}
