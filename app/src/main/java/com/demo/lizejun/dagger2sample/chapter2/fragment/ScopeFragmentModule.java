package com.demo.lizejun.dagger2sample.chapter2.fragment;


import dagger.Module;
import dagger.Provides;

@Module
public class ScopeFragmentModule {

    @Provides
    @PerScopeFragment
    public ScopeFragmentData provideScopeFragmentData() {
        return new ScopeFragmentData();
    }
}
