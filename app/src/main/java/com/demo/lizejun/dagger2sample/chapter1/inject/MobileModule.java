package com.demo.lizejun.dagger2sample.chapter1.inject;

import com.demo.lizejun.dagger2sample.chapter1.AndroidMobile;
import com.demo.lizejun.dagger2sample.chapter1.IMobile;
import com.demo.lizejun.dagger2sample.chapter1.IPhoneMobile;
import dagger.Module;
import dagger.Provides;

@Module
public class MobileModule {

    @Provides
    @Android
    public IMobile provideAndroidMobile() {
        return new AndroidMobile();
    }

    @Provides
    @IPhone
    public IMobile provideIPhoneMobile() {
        return new IPhoneMobile();
    }
}
