package com.example.vladk.dagger2test;

import android.app.Application;
import android.content.Context;

/**
 */
public class TestApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        // Dagger2
        mAppComponent = Dagger_AppComponent.builder()
            .appModule( new AppModule( this ))
            .build();
    }

    public AppComponent getComponent() {
        return mAppComponent;
    }

    public static AppComponent getComponent( Context context ) {
        return ((TestApplication)context.getApplicationContext()).getComponent();
    }
}
