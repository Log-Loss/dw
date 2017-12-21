package com.dw.dw.entity;

import com.fasterxml.jackson.annotation.JsonRawValue;

import javax.persistence.*;

@Entity
@Table(name = "titles")
public class Title {

    @Id
    @Column(length = 420)
    public String title;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String productIds;
}
