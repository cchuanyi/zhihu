package com.ccy.zhihu.ui.home;

import com.ccy.zhihu.entity.commonEntity.BeforeDailyEntity;
import com.ccy.zhihu.entity.commonEntity.LatestDailyEntity;
import com.ccy.zhihu.entity.themeDaily.ThemeContentListEntity;
import com.ccy.zhihu.mvpframe.base.BaseModel;
import com.ccy.zhihu.mvpframe.base.BasePresenter;
import com.ccy.zhihu.mvpframe.base.BaseView;

import rx.Observable;

public interface HomeContract {

    interface Model extends BaseModel {
        Observable<LatestDailyEntity> getLatestDaily();

        Observable<BeforeDailyEntity> getBeforeDaily(String date);

        Observable<ThemeContentListEntity> getThemeContentList(int id);
    }

    interface View extends BaseView {
        <T> void refreshHomeList(T t);

        void loadBeforeDaily(BeforeDailyEntity beforeDailyEntity);
    }

    abstract class Presenter extends BasePresenter<Model, View> {
        abstract void getLatestDaily();

        abstract void getBeforeDaily(String date);

        abstract void getOtherThemeList(int id);
    }
}
