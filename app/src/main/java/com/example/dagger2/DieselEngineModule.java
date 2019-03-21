package com.example.dagger2;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindDieselEngine(DieselEngine engine);

}
