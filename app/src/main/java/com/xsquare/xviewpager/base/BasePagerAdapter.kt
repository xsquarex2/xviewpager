package com.xsquare.xviewpager.base

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup

/**
 * BaseAdapter(PagerAdapter)
 * 适用ViewPager的Adapter（非Fragment的）
 * Created by xsquare on 2018/1/29.
 */
abstract class BasePagerAdapter(var list: ArrayList<*>) :PagerAdapter(){

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        container!!.removeView(`object` as View?)
    }
    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        val view = initItem(container,position)
        container!!.addView(view)
        return view
    }
    override fun isViewFromObject(view: View?, `object`: Any?): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return list.size
    }
    abstract fun initItem(container: ViewGroup?,position: Int):View
}