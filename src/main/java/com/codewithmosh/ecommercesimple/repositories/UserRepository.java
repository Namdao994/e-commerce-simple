package com.codewithmosh.ecommercesimple.repositories;

import com.codewithmosh.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
