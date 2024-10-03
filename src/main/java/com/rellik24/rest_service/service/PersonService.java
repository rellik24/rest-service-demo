package com.rellik24.rest_service.service;

import com.rellik24.rest_service.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final Person person;

    @Autowired
    public PersonService(Person person) {
        this.person = person;
    }

    public void printPersonInfo() {
        person.getPerson();
    }
}
