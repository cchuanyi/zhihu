package com.ccy.zhihu.ui.main;

import com.ccy.zhihu.entity.themeDaily.ThemesEntity;
import com.ccy.zhihu.mvpframe.base.BaseModel;
import com.ccy.zhihu.mvpframe.base.BasePresenter;
import com.ccy.zhihu.mvpframe.base.BaseView;

import rx.Observable;

public interface DrawerMainContract {

    interface Model extends BaseModel {
        Observable<ThemesEntity> getOtherThemeList();
    }

    interface View extends BaseView {
        void loadOtherThemeList(ThemesEntity themesEntity);
    }

    abstract class Presenter extends BasePresenter<Model, View> {
        abstract void getOtherThemes();
    }
}
