package com.metabroadcast.hello.world.model;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String template;

    @Valid
    @JsonProperty("template")
    public String getTemplate() {
        return template;
    }

}
