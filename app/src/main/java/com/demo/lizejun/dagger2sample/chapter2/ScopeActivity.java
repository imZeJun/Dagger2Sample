package com.demo.lizejun.dagger2sample.chapter2;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.chapter2.app.App;
import com.demo.lizejun.dagger2sample.chapter2.app.AppComponent;
import com.demo.lizejun.dagger2sample.chapter2.inject.DaggerActivityComponent;
import com.demo.lizejun.dagger2sample.chapter2.inject.Person;
import com.demo.lizejun.dagger2sample.chapter2.inject.ActivityComponent;

import javax.inject.Inject;

public class ScopeActivity extends AppCompatActivity {

    private static final String TAG = ScopeActivity.class.getSimpleName();

    @Inject
    Person mPerson;
    @Inject
    Person mOtherPerson;
    @Inject
    Context mContext;

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scope);
        getPersonComponent().inject(this);
        Button btnDial = (Button) findViewById(R.id.bt_dial);
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPerson.dial(ScopeActivity.this, "你好，我是杂毛");
                Log.d(TAG, "mPerson=" + mPerson + "\nmOtherPerson=" + mOtherPerson + "\nmContext=" + mContext);
            }
        });
    }

    private AppComponent getAppComponent() {
        return ((App) getApplication()).getAppComponent();
    }

    public ActivityComponent getPersonComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder().appComponent(getAppComponent()).build();
        }
        return mActivityComponent;
    }
}
