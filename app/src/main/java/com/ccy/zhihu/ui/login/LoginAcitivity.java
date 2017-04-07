package com.ccy.zhihu.ui.login;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.ccy.zhihu.R;
import com.ccy.zhihu.common.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginAcitivity extends BaseActivity {

    @BindView(R.id.toolBar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_acitivity);
        ButterKnife.bind(this);
    }

    @Override
    public void initView() {
        super.initView();
        setToolbar(mToolbar, "登录");
        mToolbar.inflateMenu(R.menu.menu_main);
    }
}
