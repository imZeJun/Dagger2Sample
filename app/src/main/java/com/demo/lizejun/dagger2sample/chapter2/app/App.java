package com.demo.lizejun.dagger2sample.chapter2.app;


import android.support.multidex.MultiDexApplication;

public class App extends MultiDexApplication {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
