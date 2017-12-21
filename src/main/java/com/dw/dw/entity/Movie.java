package com.dw.dw.entity;

import com.fasterxml.jackson.annotation.JsonRawValue;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @Column(length = 15)
    public String productId;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String actors;

    @Column(columnDefinition = "TEXT")
    public String author;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String authors;

    @Column(columnDefinition = "TEXT")
    public String binding;

    @Column(columnDefinition = "TEXT")
    public String brand;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String creators;

    @Column(columnDefinition = "TEXT")
    public String detail_page_url;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String directors;

    @Column(columnDefinition = "TEXT")
    public String ean;

    @Column(columnDefinition = "TEXT")
    public String edition;

    @Column(columnDefinition = "TEXT")
    public String editorial_review;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String editorial_reviews;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String features;

    @Column(columnDefinition = "TEXT")
    public String formatted_price;

    @Column(length = 95)
    public String genre;

    @Column(columnDefinition = "TEXT")
    public String isbn;

    @Column(columnDefinition = "TEXT")
    public String label;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String languages;

    @Column(columnDefinition = "TEXT")
    public String large_image_url;

    @Column(columnDefinition = "TEXT")
    public String list_price;

    @Column(columnDefinition = "TEXT")
    public String manufacturer;

    @Column(columnDefinition = "TEXT")
    public String medium_image_url;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String price_and_currency;

    @Column(columnDefinition = "TEXT")
    public String product_group;

    @Column(columnDefinition = "TEXT")
    public String product_type_name;

    public Date publication_date;

    @Column(columnDefinition = "TEXT")
    public String publisher;

    public Date release_date;

    @JsonRawValue
    @Column(columnDefinition = "TEXT")
    public String reviews;

    @Column(columnDefinition = "TEXT")
    public String running_time;

    @Column(columnDefinition = "TEXT")
    public String sales_rank;

    @Column(columnDefinition = "TEXT")
    public String sku;

    @Column(columnDefinition = "TEXT")
    public String small_image_url;

    @Column(columnDefinition = "TEXT")
    public String studio;

    @Column(length = 420)
    public String title;
}
