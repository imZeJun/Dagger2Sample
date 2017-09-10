package com.demo.lizejun.dagger2sample.chapter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.chapter1.inject.DaggerPersonComponent;
import com.demo.lizejun.dagger2sample.chapter1.inject.Person;
import com.demo.lizejun.dagger2sample.chapter1.normal.NormalPerson;

import javax.inject.Inject;

public class InjectSimpleActivity extends AppCompatActivity {

    private static final String TAG = InjectSimpleActivity.class.getSimpleName();

    private Button mBtnDialNormal;
    private Button mBtnDialInject;

    private NormalPerson mNormalNormalPerson;

    @Inject
    Person mPerson;
    @Inject
    Person mOtherPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inject_simple);
        //使用普通方式创建。
        mNormalNormalPerson = new NormalPerson(new AndroidMobile());
        //使用依赖注入方式创建。
        DaggerPersonComponent.create().inject(this);
        //测试代码。
        mBtnDialNormal = (Button) findViewById(R.id.bt_dial_normal);
        mBtnDialNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNormalNormalPerson.dial(InjectSimpleActivity.this, "你好，我是杂毛");
            }
        });
        mBtnDialInject = (Button) findViewById(R.id.bt_dial_inject);
        mBtnDialInject.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mPerson.dial(InjectSimpleActivity.this, "你好，我是杂毛");
                Log.d(TAG, "mPerson=" + mPerson + "\nmOtherPerson=" + mOtherPerson);
            }
        });
    }
}
