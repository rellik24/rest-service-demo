package com.rellik24.rest_service.service;

import com.rellik24.rest_service.dao.PersonDAO;
import com.rellik24.rest_service.model.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("PersonService")
public class PersonService {

    @Autowired
    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public void printById(){
        Optional<PersonEntity> result = this.personDAO.findById(1L);

        if (result.isPresent()) {
            System.out.println(result.get());
        }
    }
}
