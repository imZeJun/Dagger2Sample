package com.demo.lizejun.dagger2sample.chapter1.inject;

import com.demo.lizejun.dagger2sample.chapter1.IMobile;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonModule {

    @Provides
    public Person providePerson(@Android IMobile mobile) {
        return new Person(mobile);
    }
}
