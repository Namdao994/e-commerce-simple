package com.codewithmosh.ecommercesimple.repositories;

import com.codewithmosh.ecommercesimple.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}