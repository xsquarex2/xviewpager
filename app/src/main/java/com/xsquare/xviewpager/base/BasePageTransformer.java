package com.xsquare.xviewpager.base;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * BasePageTransformer
 * Created by xsquare on 2018/1/30.
 */
public abstract class BasePageTransformer implements ViewPager.PageTransformer{
    /**
     * @param page 滑动的页面
     * @param position 想左滑动为正（可查源码），范围（0,+∞）,向左滑动一个页面增加1，反之
     */
    @Override
    public void transformPage(View page, float position) {
        transform(page,position);
    }
    public abstract void transform(View page,float position);
}
