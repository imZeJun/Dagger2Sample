package com.demo.lizejun.dagger2sample.chapter4.activity;


import com.demo.lizejun.dagger2sample.chapter4.app.ScopeAppComponent;
import com.demo.lizejun.dagger2sample.chapter4.fragment.ScopeFragmentComponent;

import dagger.Component;

@Component(dependencies = {ScopeAppComponent.class}, modules = {ScopeActivityModule.class})
@PerScopeActivity
public interface ScopeActivityComponent {
    public void inject(ScopeActivity scopeActivity);
    ScopeFragmentComponent scopeFragmentComponent();
}
