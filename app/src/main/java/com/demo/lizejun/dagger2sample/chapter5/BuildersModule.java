package com.demo.lizejun.dagger2sample.chapter5;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class BuildersModule {

    @Binds
    @IntoMap
    @ActivityKey(HomeActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindHomeActivityInjectorFactory(ActivityComponent.Builder builder);
}
