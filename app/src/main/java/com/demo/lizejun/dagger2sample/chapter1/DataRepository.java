package com.demo.lizejun.dagger2sample.chapter1;



import javax.inject.Inject;

public class DataRepository {

    @Inject
    LocalSource mLocalSource;

    @Inject
    RemoteSource mRemoteSource;

    public DataRepository() {
        DaggerSourceComponent.create().inject(this);
    }

    public String getData() {
        return mLocalSource.getData();
    }

    public String getNetData() {
        return mRemoteSource.getData();
    }
}
