package com.demo.lizejun.dagger2sample.chapter3;


import dagger.Component;

@Component(dependencies = DependencyComponent.class, modules = SourceModule.class)
public interface SourceComponent {

    public void inject(DataRepository dataRepository);

    SubSourceComponent getSubSourceComponent();
}
