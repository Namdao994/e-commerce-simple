package com.codewithmosh.ecommercesimple.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class ProductDto {
    @JsonProperty("product_id")
    private Long id;
    private Long categoryId;
    private String name;
    private String description;
    private BigDecimal price;
}
