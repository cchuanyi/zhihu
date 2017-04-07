package com.ccy.zhihu.ui.main;

import com.ccy.zhihu.api.Networks;
import com.ccy.zhihu.entity.themeDaily.ThemesEntity;
import com.ccy.zhihu.mvpframe.rx.RxSchedulerHelper;

import rx.Observable;

public class DrawerMainModel implements DrawerMainContract.Model{
    @Override
    public Observable<ThemesEntity> getOtherThemeList() {
        return Networks.getInstance().getThemeApi().
                getThemes()
                .compose(RxSchedulerHelper.<ThemesEntity>io_main());
    }
}
