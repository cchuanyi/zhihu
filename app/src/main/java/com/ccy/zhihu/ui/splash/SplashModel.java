package com.ccy.zhihu.ui.splash;

import com.ccy.zhihu.api.Networks;
import com.ccy.zhihu.entity.commonEntity.SplashImgEntity;
import com.ccy.zhihu.mvpframe.rx.RxSchedulerHelper;

import rx.Observable;

public class SplashModel implements SplashContract.Model{
    @Override
    public Observable<SplashImgEntity> getSplahImg() {
        return Networks.getInstance().
                getCommonApi().
                getSplashImg().
                compose(RxSchedulerHelper.<SplashImgEntity>io_main());

    }
}
