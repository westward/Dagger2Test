package com.example.vladk.dagger2test;

import android.content.Context;

import javax.inject.Inject;

/**
 */
public class DummyController {

    private final Context mContext;

    @Inject
    public DummyController( Context context ) {
        mContext = context;
    }

    public String getMessage() {
        return mContext.getString( R.string.dummy_controller_message );
    }
}
