package com.demo.lizejun.dagger2sample.chapter1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demo.lizejun.dagger2sample.R;


public class RepositoryActivity extends AppCompatActivity {

    private static final String TAG = RepositoryActivity.class.getSimpleName();
    private Button mBtnGetData;
    private Button mBtnGetNetData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository);
        mBtnGetData = (Button) findViewById(R.id.bt_get_data);
        mBtnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataRepository repository = new DataRepository();
                String data = repository.getData();
                Toast.makeText(RepositoryActivity.this, data, Toast.LENGTH_SHORT).show();
            }
        });
        mBtnGetNetData = (Button) findViewById(R.id.bt_get_net_data);
        mBtnGetNetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataRepository repository = new DataRepository();
                String data = repository.getNetData();
                Toast.makeText(RepositoryActivity.this, data, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
