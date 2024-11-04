package com.ra.md4_ss1_bt1.model.service;

import com.ra.md4_ss1_bt1.model.entity.Product;
import com.ra.md4_ss1_bt1.model.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IProductServiceImpl implements IProductService {
private final IProductRepository productRepository;
@Autowired
public IProductServiceImpl(IProductRepository productRepository) {
    this.productRepository = productRepository;
}
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(int id) {
productRepository.deleteById(id);
    }
}
