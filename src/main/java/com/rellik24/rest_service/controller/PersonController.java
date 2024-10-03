package com.rellik24.rest_service.controller;

import com.rellik24.rest_service.model.Person;
import com.rellik24.rest_service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public String getPerson() {
        personService.printPersonInfo();
        return "Done";
    }
}