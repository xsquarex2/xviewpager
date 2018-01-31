package com.xsquare.xviewpager.cardadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import com.xsquare.xviewpager.CardBean
import com.xsquare.xviewpager.R
import com.xsquare.xviewpager.base.BasePagerAdapter

/**
 *
 * Created by xsquare on 2018/1/29.
 */

class RotateCardAdapter(var lists:ArrayList<CardBean>) : BasePagerAdapter(lists) {

    override fun initItem(container: ViewGroup?, position: Int): View {
        val bean = lists[position]
        val view = LayoutInflater.from(container!!.context).inflate(R.layout.page_adapter_rotate_card,container,false)
        Glide.with(container).load(bean.img).into(view.findViewById(R.id.iv_img))
        view.findViewById<TextView>(R.id.tv_title).text = bean.title
        return view
    }
}
