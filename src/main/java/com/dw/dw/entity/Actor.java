package com.dw.dw.entity;

import com.dw.dw.util.NoSerializer;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @Column(length = 331)
    public String actor;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String productIds;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String directors;

}
