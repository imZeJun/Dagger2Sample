package com.demo.lizejun.dagger2sample.chapter3.app;


import android.app.Application;

public class ScopeApp extends Application {

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
