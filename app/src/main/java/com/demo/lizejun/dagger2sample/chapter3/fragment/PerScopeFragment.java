package com.demo.lizejun.dagger2sample.chapter3.fragment;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import javax.inject.Scope;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

//每个Activity只有一个实例。
@Documented
@Retention(RUNTIME)
@Scope
public @interface PerScopeFragment {}
