package com.dw.dw.entity;

import javax.persistence.*;

@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @Column(length = 331)
    public String actor;

    @Column(columnDefinition = "TEXT")
    public String productIds;

    @Column(columnDefinition = "TEXT")
    public String directors;
}
