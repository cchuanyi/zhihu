package com.ccy.zhihu.ui.home.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.ccy.zhihu.R;
import com.ccy.zhihu.loader.GlideImageLoader;
import com.ccy.zhihu.ui.drawer.DisplaybleItem;
import com.zhy.adapter.recyclerview.base.ItemViewDelegate;
import com.zhy.adapter.recyclerview.base.ViewHolder;

public class ThemeHeaderItemDelegate implements ItemViewDelegate<DisplaybleItem> {
    @Override
    public int getItemViewLayoutId() {
        return R.layout.theme_header;
    }

    @Override
    public boolean isForViewType(DisplaybleItem item, int position) {
        return item instanceof ThemeHeaderItem;
    }

    @Override
    public void convert(ViewHolder holder, DisplaybleItem displaybleItem, int position) {
        ThemeHeaderItem item = (ThemeHeaderItem)displaybleItem;

        holder.setText(R.id.theme_header_tv, item.getDescription());

        ImageView iv = (ImageView) holder.getView(R.id.theme_header_iv);
        //Glide.with(holder.getConvertView().getContext()).load(item.getImage()).into(iv);
        GlideImageLoader.getInstance().displayImage(holder.getConvertView().getContext(), item.getImage(), iv);
    }
}
