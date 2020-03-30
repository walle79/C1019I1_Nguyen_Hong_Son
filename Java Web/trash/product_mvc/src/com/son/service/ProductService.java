package com.son.service;

import com.son.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void update(int id, Product product);
    void remove(int id);
    List<Product> findByName(String name);
    void save(Product product);
    Product findById(int id);
}
