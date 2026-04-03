package com.codewithmosh.ecommercesimple.repositories;

import com.codewithmosh.ecommercesimple.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}