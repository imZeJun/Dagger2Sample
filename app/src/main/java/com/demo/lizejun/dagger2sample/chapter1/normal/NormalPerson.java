package com.demo.lizejun.dagger2sample.chapter1.normal;

import android.content.Context;

import com.demo.lizejun.dagger2sample.chapter1.IMobile;

public class NormalPerson {

    private IMobile mMobile;

    public NormalPerson(IMobile mobile) {
        this.mMobile = mobile;
    }

    public void dial(Context context, String message) {
        if (mMobile != null) {
            mMobile.dial(context, message);
        }
    }
}
