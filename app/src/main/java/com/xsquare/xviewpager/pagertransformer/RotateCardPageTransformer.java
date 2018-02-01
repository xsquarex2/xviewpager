package com.xsquare.xviewpager.pagertransformer;

import android.support.v4.view.ViewPager;
import android.view.View;

public class RotateCardPageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View view, float position) {
        //旋转角度
        float mRotate = 30f;
        //
        /**
         * setPivotY(setPivotX)设置锚点，以View的相对坐标定位
         * setRotation()参数旋转的角度，顺时针为正
         */
        if (position <= -1) {//[销毁,-1]
            //以view的右下角为锚点
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight());
            view.setRotation(mRotate*position);
        }else if (position<= 0&&position>-1){//(-1,0]向左滑一页
            //锚点在view的底部线上，从view的宽度* 设定比例mSize的位置移动到view的最右侧
            view.setPivotX(view.getWidth() * 0.5f * (1 - position));
            view.setPivotY(view.getHeight());
            view.setRotation(mRotate*position);
        }else if (position>0&&position<=1){//(0,1]向右滑一页
            //锚点在view的底部线上，从view的宽度* 设定比例mSize的位置移动到view的最左侧
            view.setPivotX(view.getWidth() * 0.5f * (1 - position));
            view.setPivotY(view.getHeight());
            view.setRotation(mRotate*position);
        }else if (position > 1){//[1,销毁]
            //以view的左下角为锚点
            view.setPivotX(0);
            view.setPivotY(view.getHeight());
            view.setRotation(mRotate*position);
        }
    }
}
