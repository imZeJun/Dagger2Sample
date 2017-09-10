package com.demo.lizejun.dagger2sample.chapter2.inject;

import com.demo.lizejun.dagger2sample.chapter1.IMobile;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    @PerActivity
    public Person providePerson(@Android IMobile mobile) {
        return new Person(mobile);
    }
}
