package com.ra.md4_ss1_bt1.model.service;

import com.ra.md4_ss1_bt1.model.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    Optional<Product> findById(int id);

    Product save(Product product);

    void delete(int id);
}
