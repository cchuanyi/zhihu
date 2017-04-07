package com.ccy.zhihu.mvpframe.base;

public interface BaseView {

    //void showError(String msg);

    void onRequestStart();
    void onRequestError(String msg);
    void onRequestEnd();
    void onInternetError();
}
