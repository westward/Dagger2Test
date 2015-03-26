package com.example.vladk.dagger2test;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class DummyControllerTest {

    @Module
    public static class TestModule {

        @Provides
        @Singleton
        Context provideContext() {
            //TODO mock the getMessage() method
            return mock( Context.class );
        }
    }

    @Component(modules = TestModule.class)
    public interface TestComponent {

        void inject( DummyControllerTest test );
    }

    /**/

    @Inject
    DummyController mDummyController;

    @Before
    public void startup() {
        Dagger_DummyControllerTest$TestComponent.builder()
            .testModule( new TestModule() )
            .build()
            .inject( this );
    }

    @Test
    public void testGetMessage() throws Exception {

        assertNotNull( "Controller is not alive", mDummyController.getMessage() );
    }
}
