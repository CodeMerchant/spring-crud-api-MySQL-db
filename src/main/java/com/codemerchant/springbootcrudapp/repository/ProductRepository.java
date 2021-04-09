package com.codemerchant.springbootcrudapp.repository;

import com.codemerchant.springbootcrudapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
