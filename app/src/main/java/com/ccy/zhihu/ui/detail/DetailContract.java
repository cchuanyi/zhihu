package com.ccy.zhihu.ui.detail;

import com.ccy.zhihu.entity.commonEntity.StoryContentEntity;
import com.ccy.zhihu.entity.commonEntity.StoryExtraEntity;
import com.ccy.zhihu.mvpframe.base.BaseModel;
import com.ccy.zhihu.mvpframe.base.BasePresenter;
import com.ccy.zhihu.mvpframe.base.BaseView;

import rx.Observable;

public interface DetailContract {

    interface Model extends BaseModel {
        Observable<StoryContentEntity> getStoryContent(int id);
        Observable<StoryExtraEntity> getStoryExtras(int id);
    }

    interface View extends BaseView {
        void showContent(StoryContentEntity storyContentEntity);
        void showStoryExtras(StoryExtraEntity storyExtraEntity);
    }

    abstract class Presenter extends BasePresenter<Model, View> {
        abstract void getStoryContent(int id);
        abstract void getStoryExtras(int id);
    }
}
