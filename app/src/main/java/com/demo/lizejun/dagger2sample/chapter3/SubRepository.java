package com.demo.lizejun.dagger2sample.chapter3;


import javax.inject.Inject;

public class SubRepository {

    @Inject
    LocalSource mLocalSource;

    public SubRepository() {
        //1.实例化所依赖的Component。
        DependencyComponent dependencyComponent = DaggerDependencyComponent.create();
        //2.在构建时传入依赖的Component实例。
        SourceComponent sourceComponent = DaggerSourceComponent.builder().dependencyComponent(dependencyComponent).build();
        //3.获取SubComponent。
        SubSourceComponent subSourceComponent = sourceComponent.getSubSourceComponent();
        //4.完成依赖注入。
        subSourceComponent.inject(this);
    }

    public String getLocalData() {
        return mLocalSource.getLocalData();
    }

}
