package com.demo.lizejun.dagger2sample.chapter2;


import javax.inject.Inject;
import javax.inject.Named;

public class DataRepository {

    @Inject
    @Named("Local") Source mLocalSource;

    @Inject
    @Named("Remote") Source mRemoteSource;

    public DataRepository() {
        DaggerSourceComponent.create().inject(this);
    }

    public String getLocalData() {
        return mLocalSource.getData();
    }

    public String getRemoteData() {
        return mRemoteSource.getData();
    }

}
