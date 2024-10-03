package com.rellik24.rest_service.controller;

import com.rellik24.rest_service.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonService personService;

    // 使用構造函數進行依賴注入
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public String getPerson() {
        personService.printById();
        return "Done";
    }
}