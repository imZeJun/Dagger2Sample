package com.demo.lizejun.dagger2sample.chapter5;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent extends AndroidInjector<HomeActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeActivity> {}
}
