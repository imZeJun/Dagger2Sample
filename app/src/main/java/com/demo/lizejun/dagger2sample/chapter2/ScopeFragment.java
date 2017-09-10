package com.demo.lizejun.dagger2sample.chapter2;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.chapter2.inject.Person;

import javax.inject.Inject;

public class ScopeFragment extends Fragment {

    @Inject
    Person mPerson;

    private ScopeActivity mScopeActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mScopeActivity = (ScopeActivity) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mScopeActivity.getPersonComponent().fragmentComponent().inject(this);
        View rootView = inflater.inflate(R.layout.fragment_scope, container, false);
        TextView tv = (TextView) rootView.findViewById(R.id.tv_scope_fragment);
        tv.setText(mPerson.toString());
        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
