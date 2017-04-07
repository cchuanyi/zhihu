package com.ccy.zhihu.ui.home.adapter;

import android.content.Context;

import com.ccy.zhihu.ui.drawer.DisplaybleItem;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;
public class HYArticleListAdapter extends MultiItemTypeAdapter<DisplaybleItem> {

    public HYArticleListAdapter(Context context, List<DisplaybleItem> datas) {
        super(context, datas);

        addItemViewDelegate(new HomeHeaderItemDelegate());
        addItemViewDelegate(new HomeSectionItemDelegate());
        addItemViewDelegate(new ArticleItemDelegate());
        addItemViewDelegate(new ThemeSectionItemDelegate());
        addItemViewDelegate(new ThemeHeaderItemDelegate());
    }

}
