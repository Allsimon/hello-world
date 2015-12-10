package com.metabroadcast.hello.world;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.metabroadcast.hello.world.dagger.component.DaggerHelloWorldComponent;
import com.metabroadcast.hello.world.dagger.component.HelloWorldComponent;
import com.metabroadcast.hello.world.dagger.module.HelloWorldModule;
import com.metabroadcast.hello.world.model.User;
import com.metabroadcast.hello.world.resource.HelloWorldResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    private HelloWorldComponent component;

    public static void main(String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
            Environment environment) throws Exception {
        environment.jersey().register(new AbstractBinder() {

            @Override
            protected void configure() {
                bind(configuration.getUser()).to(User.class);
            }
        });

        component = DaggerHelloWorldComponent.builder()
                .helloWorldModule(new HelloWorldModule(configuration))
                .build();
        environment.jersey().register(component.inject(new HelloWorldResource()));

    }
}
