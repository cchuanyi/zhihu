package com.ccy.zhihu.ui.drawer;

import com.ccy.zhihu.R;
import com.zhy.adapter.recyclerview.base.ItemViewDelegate;
import com.zhy.adapter.recyclerview.base.ViewHolder;

public class DrawerHomeItemDelegate implements ItemViewDelegate<DisplaybleItem> {
    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_drawer_menu_home;
    }

    @Override
    public boolean isForViewType(DisplaybleItem item, int position) {
        return item instanceof DrawerHomeItem;
    }

    @Override
    public void convert(ViewHolder holder, DisplaybleItem displaybleItem, int position) {

    }
}
