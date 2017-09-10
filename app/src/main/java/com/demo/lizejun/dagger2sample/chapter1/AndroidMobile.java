package com.demo.lizejun.dagger2sample.chapter1;

import android.content.Context;
import android.widget.Toast;

public class AndroidMobile implements IMobile {

    @Override
    public void dial(Context context, String message) {
        Toast.makeText(context, "使用安卓手机拨打=" + message, Toast.LENGTH_SHORT).show();
    }
}
