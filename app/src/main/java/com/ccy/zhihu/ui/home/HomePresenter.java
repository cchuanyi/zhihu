package com.ccy.zhihu.ui.home;

import com.ccy.zhihu.entity.commonEntity.BeforeDailyEntity;
import com.ccy.zhihu.entity.commonEntity.LatestDailyEntity;
import com.ccy.zhihu.entity.themeDaily.ThemeContentListEntity;

import rx.Subscriber;

public class HomePresenter extends HomeContract.Presenter {

    @Override
    void getLatestDaily() {
        mRxManager.add(mModel.getLatestDaily()
        .subscribe(new Subscriber<LatestDailyEntity>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                mView.onRequestError("数据加载失败ヽ(≧Д≦)ノ");
            }

            @Override
            public void onNext(LatestDailyEntity latestDailyEntity) {
                mView.refreshHomeList(latestDailyEntity);
            }
        }));
    }

    @Override
    void getBeforeDaily(String date) {
        mRxManager.add(mModel.getBeforeDaily(date)
        .subscribe(new Subscriber<BeforeDailyEntity>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                mView.onRequestError("数据加载失败ヽ(≧Д≦)ノ");
            }

            @Override
            public void onNext(BeforeDailyEntity beforeDailyEntity) {
                mView.loadBeforeDaily(beforeDailyEntity);
            }
        }));
    }

    @Override
    void getOtherThemeList(int id) {
        mRxManager.add(mModel.getThemeContentList(id)
        .subscribe(new Subscriber<ThemeContentListEntity>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(ThemeContentListEntity themeContentListEntity) {
                mView.refreshHomeList(themeContentListEntity);
            }
        }));
    }
}
