package com.demo.lizejun.dagger2sample.chapter2;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class SourceModule {

    @Provides
    @Named("Local")
    public Source provideLocalSource() {
        return new LocalSource();
    }

    @Provides
    @Named("Remote")
    public Source providerRemoteSource() {
        return new RemoteSource();
    }
}


