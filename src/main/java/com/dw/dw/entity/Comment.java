package com.dw.dw.entity;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue
    public Integer id;

    @Column(columnDefinition = "TEXT")
    public String productId;

    @Column(columnDefinition = "TEXT")
    public String userId;

    @Column(columnDefinition = "TEXT")
    public Integer helpfulCnt;

    @Column(columnDefinition = "TEXT")
    public Integer rateCnt;

    @Column(columnDefinition = "TEXT")
    public Integer score;

    @Column(columnDefinition = "TEXT")
    public Integer time;
}