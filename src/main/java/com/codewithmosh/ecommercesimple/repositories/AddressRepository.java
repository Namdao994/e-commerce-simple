package com.codewithmosh.ecommercesimple.repositories;

import com.codewithmosh.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}