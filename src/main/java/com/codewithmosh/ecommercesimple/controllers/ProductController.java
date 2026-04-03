package com.codewithmosh.ecommercesimple.controllers;

import com.codewithmosh.ecommercesimple.dtos.ProductDto;
import com.codewithmosh.ecommercesimple.entities.Product;
import com.codewithmosh.ecommercesimple.mappers.ProductMapper;
import com.codewithmosh.ecommercesimple.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @GetMapping
    public List<ProductDto> getAllProduct(@RequestParam(required = false) Byte categoryId) {
        List<Product> products;
        if(categoryId != null) {
            products =  productRepository.findByCategoryId(categoryId);
        } else {
            products = productRepository.findAllWithCategory();
        }
        return products.stream().map(productMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElse(null);
        if(product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productMapper.toDto(product));
    }
}
