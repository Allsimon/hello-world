package com.metabroadcast.hello.world.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.metabroadcast.hello.world.model.User;

@Path("/welcome")
public class HelloWorldResource {

    @Inject
    User user;

    @GET
    @Path("/{key}")
    public String getName(@PathParam("key") String key) {
        return user.getTemplate() + " " + key;
    }
}
