package com.demo.lizejun.dagger2sample.chapter1.inject;

import com.demo.lizejun.dagger2sample.chapter1.IMobile;

import dagger.Module;
import dagger.Provides;

@Module
public class InjectPersonModule {

    @Provides
    public InjectPerson provideInjectPerson(@Android IMobile mobile) {
        return new InjectPerson(mobile);
    }
}
