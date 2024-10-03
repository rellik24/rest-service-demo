package com.rellik24.rest_service.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("${person.id}")
    private int id;

    @Value("${person.name}")
    private String name;

    public void getPerson() {
        System.out.println(this.id);
        System.out.println(this.name);
    }
}
