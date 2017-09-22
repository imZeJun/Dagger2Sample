package com.demo.lizejun.dagger2sample.chapter5;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    public ActivityData provideActivityData() {
        return new ActivityData();
    }

}
