package com.demo.lizejun.dagger2sample.chapter1;

import dagger.Component;

@Component(modules = {RemoteSourceModule.class})
public interface SourceComponent {
    public void inject(DataRepository dataRepository);
}
