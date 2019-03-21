package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine_TAG";

    @Inject
    public DieselEngine(){}

    @Override
    public void start() {
        Log.d(TAG, "start: ");
    }
}
