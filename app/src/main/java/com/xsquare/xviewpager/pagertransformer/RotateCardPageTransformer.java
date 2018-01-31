package com.xsquare.xviewpager.pagertransformer;

import android.support.v4.view.ViewPager;
import android.view.View;

public class RotateCardPageTransformer implements ViewPager.PageTransformer {

    private static final float DEFAULT_MAX_ROTATE = 15.0f;
    private float mMaxRotate = DEFAULT_MAX_ROTATE;

    @Override
    public void transformPage(View view, float position) {

        /**
         * setPivotY(setPivotX)都以改View的相对坐标定位
         * setRotation()参数旋转的角度，顺时针为正
         */
        if (position < 0) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight());
            view.setRotation(mMaxRotate*position);
        }else{
            view.setPivotX(0);
            view.setPivotY(view.getHeight());
            view.setRotation(mMaxRotate*position);
        }
    }
}
