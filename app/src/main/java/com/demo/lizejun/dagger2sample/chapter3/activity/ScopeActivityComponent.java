package com.demo.lizejun.dagger2sample.chapter3.activity;


import com.demo.lizejun.dagger2sample.chapter3.app.ScopeAppComponent;
import com.demo.lizejun.dagger2sample.chapter3.fragment.ScopeFragmentComponent;

import dagger.Component;

@Component(dependencies = {ScopeAppComponent.class}, modules = {ScopeActivityModule.class})
@PerScopeActivity
public interface ScopeActivityComponent {
    public void inject(ScopeActivity scopeActivity);
    ScopeFragmentComponent scopeFragmentComponent();
}
