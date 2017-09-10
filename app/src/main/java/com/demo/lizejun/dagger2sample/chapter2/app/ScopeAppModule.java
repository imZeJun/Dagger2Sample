package com.demo.lizejun.dagger2sample.chapter2.app;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ScopeAppModule {

    @Provides
    @Singleton
    public ScopeAppData provideScopeAppData() {
        return new ScopeAppData();
    }
}
