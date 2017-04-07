package com.ccy.zhihu.ui.home.adapter;

import com.ccy.zhihu.ui.drawer.DisplaybleItem;

public class ThemeHeaderItem implements DisplaybleItem {
    private String image;
    private String description;

    public ThemeHeaderItem(String image, String description) {
        this.image = image;
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
