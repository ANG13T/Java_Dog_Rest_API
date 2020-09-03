package com.udacity.bootstrap.repository;

import com.udacity.bootstrap.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Dog, Long> {
}
