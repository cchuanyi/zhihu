package com.ccy.zhihu.ui.home.adapter;

import com.ccy.zhihu.entity.themeDaily.EditorsEntity;
import com.ccy.zhihu.ui.drawer.DisplaybleItem;

import java.util.List;

public class ThemeSectionItem implements DisplaybleItem {

    private List<EditorsEntity> mEditors;

    public ThemeSectionItem(List<EditorsEntity> editors) {
        mEditors = editors;
    }

    public List<EditorsEntity> getEditors() {
        return mEditors;
    }

    public void setEditors(List<EditorsEntity> editors) {
        mEditors = editors;
    }
}
