package com.dw.dw.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(length = 20)
    public String userId;

    @Column(columnDefinition = "TEXT")
    public String profileName;
}
