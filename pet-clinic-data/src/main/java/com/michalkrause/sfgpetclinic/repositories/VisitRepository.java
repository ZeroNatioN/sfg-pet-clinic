package com.michalkrause.sfgpetclinic.repositories;

import com.michalkrause.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
