package com.michalkrause.sfgpetclinic.repositories;

import com.michalkrause.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
