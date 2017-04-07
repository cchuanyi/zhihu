package com.ccy.zhihu.ui.detail;

import com.ccy.zhihu.api.Networks;
import com.ccy.zhihu.entity.commonEntity.StoryContentEntity;
import com.ccy.zhihu.entity.commonEntity.StoryExtraEntity;
import com.ccy.zhihu.mvpframe.rx.RxSchedulerHelper;

import rx.Observable;

/**
 * Created by Administrator on 2017/1/12.
 */

public class DetailModel implements DetailContract.Model {
    @Override
    public Observable<StoryContentEntity> getStoryContent(int id) {
        return Networks.getInstance().getCommonApi()
                .getStoryContent(id)
                .compose(RxSchedulerHelper.<StoryContentEntity>io_main());
    }

    @Override
    public Observable<StoryExtraEntity> getStoryExtras(int id) {
        return Networks.getInstance().getCommonApi()
                .getStoryExtra(id)
                .compose(RxSchedulerHelper.<StoryExtraEntity>io_main());
    }
}
