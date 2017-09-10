package com.demo.lizejun.dagger2sample.utils;

import android.content.Context;
import android.content.Intent;

public class Utils {

    public static void startActivity(Context context, Class targetName) {
        Intent intent = new Intent(context, targetName);
        context.startActivity(intent);
    }
}
