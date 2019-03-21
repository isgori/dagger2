package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine_TAG";

    @Inject
    public PetrolEngine(){}

    @Override
    public void start() {
        Log.d(TAG, "start: ");
    }
}
