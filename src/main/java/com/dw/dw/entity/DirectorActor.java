package com.dw.dw.entity;

import javax.persistence.*;

@Entity
@Table(name = "director_actor")
public class DirectorActor {

    @Id
    @GeneratedValue
    public Integer id;

    @Column(length = 228)
    public String director;

    @Column(length = 331)
    public String actor;

    public Integer coTimes;

    @Column(columnDefinition = "TEXT")
    public String productIds;
}
