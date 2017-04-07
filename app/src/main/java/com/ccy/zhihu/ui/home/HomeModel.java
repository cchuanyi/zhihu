package com.ccy.zhihu.ui.home;

import com.ccy.zhihu.api.Networks;
import com.ccy.zhihu.entity.commonEntity.BeforeDailyEntity;
import com.ccy.zhihu.entity.commonEntity.LatestDailyEntity;
import com.ccy.zhihu.entity.themeDaily.ThemeContentListEntity;
import com.ccy.zhihu.mvpframe.rx.RxSchedulerHelper;

import rx.Observable;

public class HomeModel implements HomeContract.Model {

    @Override
    public Observable<LatestDailyEntity> getLatestDaily() {
        return Networks.getInstance().getCommonApi().getLatestDaily()
                .compose(RxSchedulerHelper.<LatestDailyEntity>io_main());
    }

    @Override
    public Observable<BeforeDailyEntity> getBeforeDaily(String date) {
        return Networks.getInstance().getCommonApi().getBeforeDaily(date)
                .compose(RxSchedulerHelper.<BeforeDailyEntity>io_main());
    }

    @Override
    public Observable<ThemeContentListEntity> getThemeContentList(int id) {
        return Networks.getInstance().getThemeApi().getThemeContentList(id)
                .compose(RxSchedulerHelper.<ThemeContentListEntity>io_main());
    }
}
