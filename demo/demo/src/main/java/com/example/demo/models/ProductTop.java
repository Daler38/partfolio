package com.example.demo.models;


import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductTop {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, description, month  ;
    private Long amount, price , data;

    public ProductTop() {
    }



    public ProductTop(String title, String description, String month, Long amount, Long price, Long data) {


        this.month =month;
        this.title = title;
        this.description = description;
        this.amount = amount;
        this.price = price;
        this.data = data;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }



}
