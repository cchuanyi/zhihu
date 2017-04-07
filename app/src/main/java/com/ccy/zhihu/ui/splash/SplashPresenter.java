package com.ccy.zhihu.ui.splash;

import android.util.Log;

import com.ccy.zhihu.entity.commonEntity.SplashImgEntity;

import rx.Observable;
import rx.Subscriber;

public class SplashPresenter extends SplashContract.Presenter{

    private static final String TAG = "SplashPresenter";

    @Override
    void getSplashImage() {
        mRxManager.add(mModel
                .getSplahImg()
                .subscribe(new Subscriber<SplashImgEntity>() {
                    @Override
                    public void onCompleted() {
                        mView.onRequestEnd();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: ", e);
                        mView.onRequestEnd();
                    }

                    @Override
                    public void onNext(SplashImgEntity splashImgEntity) {
                        mView.loadSplashImage(splashImgEntity);
                    }
                }));
    }
}
