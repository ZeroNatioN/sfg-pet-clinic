package com.michalkrause.sfgpetclinic.repositories;

import com.michalkrause.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
