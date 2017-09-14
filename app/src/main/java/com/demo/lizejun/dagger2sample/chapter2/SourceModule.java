package com.demo.lizejun.dagger2sample.chapter2;

import dagger.Module;
import dagger.Provides;

@Module
public class SourceModule {

    @Provides
    @Local
    public Source provideLocalSource() {
        return new LocalSource();
    }

    @Provides
    @Remote
    public Source providerRemoteSource() {
        return new RemoteSource();
    }
}


