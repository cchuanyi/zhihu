package com.ccy.zhihu.ui.splash;

import com.ccy.zhihu.entity.commonEntity.SplashImgEntity;
import com.ccy.zhihu.mvpframe.base.BaseModel;
import com.ccy.zhihu.mvpframe.base.BasePresenter;
import com.ccy.zhihu.mvpframe.base.BaseView;

import rx.Observable;

public interface SplashContract {
    interface Model extends BaseModel{
        Observable<SplashImgEntity> getSplahImg();
    }

    interface View extends BaseView{
        void loadSplashImage(SplashImgEntity splashImgEntity);
    }

    abstract class Presenter extends BasePresenter<Model, View> {
        abstract void getSplashImage();
    }
}
