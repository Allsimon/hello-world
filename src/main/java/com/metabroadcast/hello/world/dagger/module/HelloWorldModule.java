package com.metabroadcast.hello.world.dagger.module;

import javax.inject.Singleton;

import com.metabroadcast.hello.world.HelloWorldConfiguration;
import com.metabroadcast.hello.world.model.User;

import dagger.Module;
import dagger.Provides;

@Module
public class HelloWorldModule {

    private HelloWorldConfiguration configuration;

    public HelloWorldModule(HelloWorldConfiguration configuration) {
        this.configuration = configuration;
    }

    @Provides
    @Singleton
    public User provideUser() {
        return configuration.getUser();
    }

}
