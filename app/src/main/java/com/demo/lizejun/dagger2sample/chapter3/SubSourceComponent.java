package com.demo.lizejun.dagger2sample.chapter3;


import dagger.Subcomponent;

@Subcomponent
public interface SubSourceComponent {
    public void inject(SubRepository subRepository);
}
