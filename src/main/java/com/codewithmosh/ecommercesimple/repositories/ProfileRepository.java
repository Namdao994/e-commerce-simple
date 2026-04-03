package com.codewithmosh.ecommercesimple.repositories;

import com.codewithmosh.ecommercesimple.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}