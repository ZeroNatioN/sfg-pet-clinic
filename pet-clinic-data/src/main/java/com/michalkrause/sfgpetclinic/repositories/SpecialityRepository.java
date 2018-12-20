package com.michalkrause.sfgpetclinic.repositories;

import com.michalkrause.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
