package com.talk.fragments.dynamic;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.talk.R;
import com.talk.activity.dynamic.DynamicActivity;
import com.talk.base.BaseFragment;
import com.talk.interfaces.IBasePersenter;

import butterknife.BindView;
import butterknife.OnClick;

public class DynamicFragment extends BaseFragment {
    @BindView(R.id.iv_add)
    ImageView ivAdd;

    @Override
    protected int getLayout() {
        return R.layout.fragment_dynamic;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected IBasePersenter createPersenter() {
        return null;
    }

    @OnClick(R.id.iv_add)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.iv_add:
                openDynamicInfo();
                break;
        }
    }

    private void openDynamicInfo() {
        Intent intent = new Intent(getContext(), DynamicActivity.class);
        startActivity(intent);
    }
}
