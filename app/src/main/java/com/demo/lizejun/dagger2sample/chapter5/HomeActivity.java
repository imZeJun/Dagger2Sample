package com.demo.lizejun.dagger2sample.chapter5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class HomeActivity extends AppCompatActivity {

    @Inject
    ActivityData activityData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d("HomeActivity", "data=" + activityData.getData());
    }
}
