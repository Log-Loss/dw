package com.dw.dw.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie_actors")
public class MovieActor {
    @Id
    @GeneratedValue
    public Integer id;

    @Column(length = 15)
    public String productId;

    @Column(length = 311)
    public String actor;
}
