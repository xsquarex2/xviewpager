package com.xsquare.xviewpager.pagertransformer;

import android.util.Log;
import android.view.View;

import com.xsquare.xviewpager.base.BasePageTransformer;

/**
 * 卡片式、预览左右缩放半透明图片
 */
public class AlphaScaleCardPageTransformer extends BasePageTransformer {

    /**
     * @param page 滑动的页面
     * @param position 想右滑动为正（可查源码），范围（0,+∞）,向右滑动一个页面增加1
     */
    @Override
    public void transform(View page, float position) {
        Log.e("trans",page.hashCode()+"-----"+String.valueOf(position));
        //缩放值
        float SCALE_MAX = 0.8f;
        float scale = (position < 0)
                ? ((1 - SCALE_MAX) * position + 1)
                : ((SCALE_MAX - 1) * position + 1);
        //透明度值
        float ALPHA_MAX = 0.4f;
        float alpha = (position < 0)
                ? ((1 - ALPHA_MAX) * position + 1)
                : ((ALPHA_MAX - 1) * position + 1);
        //设置锚点的坐标值，以像素为单位。默认是View的中心。
        if (position < 0) {
            page.setPivotX(page.getWidth());
            page.setPivotY(page.getHeight()/2);
        } else {
            page.setPivotX(0);
            page.setPivotY(page.getHeight()/2);
        }
        //设置缩放
        page.setScaleX(scale);
        page.setScaleY(scale);
        //设置透明值
        //Math.abs()取绝对值
        page.setAlpha(Math.abs(alpha));
    }
}
