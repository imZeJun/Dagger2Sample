package com.demo.lizejun.dagger2sample.chapter3.app;

import javax.inject.Singleton;

import dagger.Component;

//每个进程只有一个实例。
@Singleton
@Component(modules = {ScopeAppModule.class})
public interface ScopeAppComponent {
    public ScopeAppData getScopeAppData(); //如果它被其它的Component依赖，那么需要声明getXXX方法。
}
