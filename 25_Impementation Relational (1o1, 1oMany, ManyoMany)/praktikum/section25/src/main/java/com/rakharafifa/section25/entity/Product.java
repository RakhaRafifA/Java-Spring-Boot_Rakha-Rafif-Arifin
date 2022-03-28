package com.rakharafifa.section25.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    private String product_name;
    private Long model_year;
    private Long list_price;
    public String getProduct_name() {
        return product_name;
    }
    public Long getList_price() {
        return list_price;
    }
    public void setList_price(Long list_price) {
        this.list_price = list_price;
    }
    public Long getModel_year() {
        return model_year;
    }
    public void setModel_year(Long model_year) {
        this.model_year = model_year;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}
