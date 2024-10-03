package com.rellik24.rest_service.controller;

import com.rellik24.rest_service.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Hello hello;

    @GetMapping("hello")
    public String hello() {

        return hello.getWord();
    }
}
