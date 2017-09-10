package com.demo.lizejun.dagger2sample.chapter2.app;


import android.content.Context;
import javax.inject.Singleton;
import dagger.Component;

//每个进程只有一个实例。
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getContext();
}
