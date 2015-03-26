package com.example.vladk.dagger2test;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger2 application level Module
 */
@Module
public class AppModule {

    private final Context mContext;

    public AppModule( TestApplication app ) {
        mContext = app.getApplicationContext();
    }

    @Provides
    @Singleton
    Context provideContext() {
        return mContext;
    }
}
