package com.dw.dw.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie_directors")
public class MovieDirector {
    @Id
    @GeneratedValue
    public Integer id;

    @Column(length = 15)
    public String productId;

    @Column(length = 228)
    public String director;
}
