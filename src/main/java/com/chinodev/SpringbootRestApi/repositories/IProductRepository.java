package com.chinodev.SpringbootRestApi.repositories;
import com.chinodev.SpringbootRestApi.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface IProductRepository extends CrudRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2")
    List<Product> findProductByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
    List<Product> findBProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
}
