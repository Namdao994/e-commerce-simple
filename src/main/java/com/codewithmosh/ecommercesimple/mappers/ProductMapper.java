package com.codewithmosh.ecommercesimple.mappers;

import com.codewithmosh.ecommercesimple.dtos.ProductDto;
import com.codewithmosh.ecommercesimple.entities.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = ("spring"))
public interface ProductMapper {
ProductDto toDto(Product product);
}
