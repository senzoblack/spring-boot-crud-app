package com.lionblvck.springbootcrudapp.repository;

import com.lionblvck.springbootcrudapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
