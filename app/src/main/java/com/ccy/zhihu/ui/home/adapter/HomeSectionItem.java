package com.ccy.zhihu.ui.home.adapter;

import com.ccy.zhihu.ui.drawer.DisplaybleItem;
import com.ccy.zhihu.util.DateUtils;

import java.util.Date;

public class HomeSectionItem implements DisplaybleItem {

    private String strDate;

    private String formatDate;

    public HomeSectionItem(String strDate) {
        this.strDate = strDate;
    }

    public String getFormatDate() {
        if (strDate == null) {
            return null;
        }

        Date date = new Date();
        date = DateUtils.str2date(strDate, "yyyyMMdd");
        formatDate = DateUtils.date2str(date);
        return formatDate;
    }

    public void setFormatDate(String formatDate) {
        this.formatDate = formatDate;
    }
}
