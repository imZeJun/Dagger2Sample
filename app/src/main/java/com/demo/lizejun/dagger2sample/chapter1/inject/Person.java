package com.demo.lizejun.dagger2sample.chapter1.inject;

import android.content.Context;
import com.demo.lizejun.dagger2sample.chapter1.IMobile;

public class Person {

    private IMobile mMobile;

    public Person(IMobile mobile) {
        this.mMobile = mobile;
    }

    public void dial(Context context, String message) {
        if (mMobile != null) {
            mMobile.dial(context, message);
        }
    }
}
