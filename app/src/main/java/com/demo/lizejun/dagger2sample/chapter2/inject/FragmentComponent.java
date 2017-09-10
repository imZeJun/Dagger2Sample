package com.demo.lizejun.dagger2sample.chapter2.inject;


import com.demo.lizejun.dagger2sample.chapter2.ScopeFragment;
import dagger.Subcomponent;

@Subcomponent
public interface FragmentComponent {
    public void inject(ScopeFragment scopeFragment);
}
