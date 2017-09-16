package com.demo.lizejun.dagger2sample.chapter3;


import javax.inject.Inject;

public class DataRepository {

    @Inject
    DependencySource mDependencySource;

    public DataRepository() {
        //1.实例化所依赖的Component。
        DependencyComponent dependencyComponent = DaggerDependencyComponent.create();
        //2.在构建时传入依赖的Component实例。
        DaggerSourceComponent.builder().dependencyComponent(dependencyComponent).build().inject(this);
    }

    public String getDependencyData() {
        return mDependencySource.getData();
    }
}
