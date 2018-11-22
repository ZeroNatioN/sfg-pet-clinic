package com.michalkrause.sfgpetclinic.services;

import com.michalkrause.sfgpetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
