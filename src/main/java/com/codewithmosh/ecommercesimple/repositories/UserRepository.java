package com.codewithmosh.ecommercesimple.repositories;

import com.codewithmosh.ecommercesimple.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
