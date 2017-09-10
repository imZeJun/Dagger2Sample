package com.demo.lizejun.dagger2sample.chapter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.chapter1.inject.DaggerInjectPersonComponent;
import com.demo.lizejun.dagger2sample.chapter1.inject.InjectPerson;
import com.demo.lizejun.dagger2sample.chapter1.normal.NormalPerson;

import javax.inject.Inject;

public class InjectSimpleActivity extends AppCompatActivity {

    private TextView mTvDialNormal;
    private TextView mTvDialInject;

    private NormalPerson mNormalNormalPerson;

    @Inject
    InjectPerson mInjectPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inject_simple);
        //使用普通方式创建。
        mNormalNormalPerson = new NormalPerson(new AndroidMobile());
        //使用依赖注入方式创建、
        DaggerInjectPersonComponent.create().inject(this);
        mTvDialNormal = (TextView) findViewById(R.id.tv_dial_normal);
        mTvDialNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNormalNormalPerson.dial(InjectSimpleActivity.this, "你好，我是杂毛");
            }
        });
        mTvDialInject = (TextView) findViewById(R.id.tv_dial_inject);
        mTvDialInject.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mInjectPerson.dial(InjectSimpleActivity.this, "你好，我是杂毛");
            }
        });
    }
}
