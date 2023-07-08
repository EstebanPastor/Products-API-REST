package com.chinodev.SpringbootRestApi.persistence.Impl;

import com.chinodev.SpringbootRestApi.entities.Product;
import com.chinodev.SpringbootRestApi.persistence.IProductDAO;
import com.chinodev.SpringbootRestApi.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class ProductDAOImpl implements IProductDAO {
    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findProductByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(Product product) {
    productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
    productRepository.deleteById(id);
    }
}
