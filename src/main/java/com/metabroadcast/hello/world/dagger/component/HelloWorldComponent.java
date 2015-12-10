package com.metabroadcast.hello.world.dagger.component;

import javax.inject.Singleton;

import com.metabroadcast.hello.world.dagger.module.HelloWorldModule;
import com.metabroadcast.hello.world.resource.HelloWorldResource;

import dagger.Component;

@Singleton
@Component(modules = HelloWorldModule.class)
public interface HelloWorldComponent {

    HelloWorldResource inject(HelloWorldResource resource);

}
