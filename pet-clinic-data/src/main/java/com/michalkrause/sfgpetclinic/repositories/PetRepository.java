package com.michalkrause.sfgpetclinic.repositories;

import com.michalkrause.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
