package com.ccy.zhihu.loader;

import android.content.Context;
import android.view.View;

import java.io.Serializable;

import rx.Observable;

public interface ImageLoaderInterface<T extends View> extends Serializable{
    void displayImage(Context context, Object path, T imageView);

    void displayCircleImage(Context context, Object path, T imageView);

    T creteImageView(Context context);
}
