package com.rakharafifa.section25.service;

import java.util.ArrayList;
import java.util.List;

import com.rakharafifa.section25.entity.Product;
import com.rakharafifa.section25.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct(){
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product getProductById(Long product_id){
        return productRepository.findById(product_id).get();
    }

    @Override
    public Product postProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public void updateProduct(Long product_id, Product product){
        Product products = productRepository.findById(product_id).get();
        System.out.println(products.toString());
        products.setProduct_name(product.getProduct_name());
        products.setModel_year(product.getModel_year());
        products.setList_price(product.getList_price());
        productRepository.save(products);
    }

    @Override
    public void deleteProduct(Long product_id){
        productRepository.deleteById(product_id);
    }
}
