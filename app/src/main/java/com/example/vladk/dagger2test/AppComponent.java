package com.example.vladk.dagger2test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Dagger2 application level Component.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject( MainActivity activity );
}
