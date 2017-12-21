package com.dw.dw.entity;

import com.fasterxml.jackson.annotation.JsonRawValue;

import javax.persistence.*;

@Entity
@Table(name = "directors")
public class Director {

    @Id
    @Column(length = 228)
    public String director;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String productIds;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String actors;
}
