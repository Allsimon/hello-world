package com.metabroadcast.hello.world;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.metabroadcast.hello.world.model.User;

import io.dropwizard.Configuration;

public class HelloWorldConfiguration extends Configuration {

    private User user;

    @Valid
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

}
