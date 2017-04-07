package com.ccy.zhihu.ui.drawer;

import com.ccy.zhihu.R;
import com.ccy.zhihu.entity.themeDaily.ThemesEntity;
import com.zhy.adapter.recyclerview.base.ItemViewDelegate;
import com.zhy.adapter.recyclerview.base.ViewHolder;

public class DrawerContentItemDelegate implements ItemViewDelegate<DisplaybleItem>{

    @Override
    public int getItemViewLayoutId() {
        return R.layout.item_drawer_menu_content;
    }

    @Override
    public boolean isForViewType(DisplaybleItem item, int position) {
        return item instanceof ThemesEntity.OthersEntity;
    }

    @Override
    public void convert(ViewHolder holder, DisplaybleItem displaybleItem, final int position) {
        holder.setText(R.id.item_theme_list_tv, ((ThemesEntity.OthersEntity)displaybleItem).getName());
    }

}
