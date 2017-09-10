package com.demo.lizejun.dagger2sample.chapter2.app;


import android.support.multidex.MultiDexApplication;

public class ScopeApp extends MultiDexApplication {

    private ScopeAppComponent mScopeAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mScopeAppComponent = DaggerScopeAppComponent.builder().scopeAppModule(new ScopeAppModule()).build();
    }

    public ScopeAppComponent getAppComponent() {
        return mScopeAppComponent;
    }
}
