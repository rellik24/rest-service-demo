
package com.rellik24.rest_service.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person")
public class Hello {

    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
