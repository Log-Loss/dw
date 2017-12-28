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
    public String profileName;

    public Integer helpfulCnt;

    public Integer rateCnt;

    public Integer score;

    public Integer time;

    @Column(columnDefinition = "TEXT")
    public String summary;

    @Column(columnDefinition = "TEXT")
    public String text;
}