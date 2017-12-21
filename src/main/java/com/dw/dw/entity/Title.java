package com.dw.dw.entity;

        import javax.persistence.*;

@Entity
@Table(name = "titles")
public class Title {

    @Id
    @Column(length = 420)
    public String title;

    @Column(columnDefinition = "TEXT")
    public String productIds;
}
