package com.xsquare.xviewpager.pagertransformer;

import android.view.View;

import com.xsquare.xviewpager.base.BasePageTransformer;

public class ZoomOutTransformer extends BasePageTransformer {

	@Override
	public void transform(View view, float position) {
		final float scale = 1f + Math.abs(position);

		view.setPivotX(view.getWidth() * 0.5f);
		view.setPivotY(view.getHeight() * 0.5f);

		view.setAlpha(position < -1f || position > 1f ? 0f : 1f - (scale - 1f));
		view.setScaleX(scale);
		view.setScaleY(scale);
		if(position == -1){
			view.setTranslationX(view.getWidth() * -1);
		}
	}
}
