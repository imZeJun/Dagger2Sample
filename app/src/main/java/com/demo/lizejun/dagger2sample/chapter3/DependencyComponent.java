package com.demo.lizejun.dagger2sample.chapter3;

import dagger.Component;

@Component(modules = DependencyModule.class)
public interface DependencyComponent {
    DependencySource getDependencySource();
}
