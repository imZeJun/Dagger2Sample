package com.demo.lizejun.dagger2sample.chapter5;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public AppData provideAppData() {
        return new AppData();
    }
}
