package com.demo.lizejun.dagger2sample.chapter4.activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ScopeActivityModule {

    @Provides
    @PerScopeActivity
    public ScopeActivitySharedData provideScopeActivityData() {
        return new ScopeActivitySharedData();
    }

    @Provides
    public ScopeActivityNormalData provideScopeActivityNormalData() {
        return new ScopeActivityNormalData();
    }
}
