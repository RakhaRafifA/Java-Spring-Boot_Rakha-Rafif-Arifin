package com.rakharafifa.section23.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer stock;
    private Integer price;

    @Column(name = "Id")
    public Long getId() {
        return id;
    }
    @Column(name = "Name")
    public String getName() {
        return name;
    }
    @Column(name = "Price")
    public Integer getPrice() {
        return price;
    }
    @Column(name = "Description")
    public String getDescription() {
        return description;
    }
    @Column(name = "Stock")
    public Integer getStock() {
        return stock;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
}