package com.codewithmosh.ecommercesimple.repositories;

import com.codewithmosh.ecommercesimple.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}