package com.demo.lizejun.dagger2sample.chapter2;


import javax.inject.Inject;

public class DataRepository {

    @Inject
    @Local Source mLocalSource;

    @Inject
    @Remote Source mRemoteSource;

    public DataRepository() {

    }

    public String getLocalData() {
        return mLocalSource.getData();
    }

    public String getRemoteData() {
        return mRemoteSource.getData();
    }

}
