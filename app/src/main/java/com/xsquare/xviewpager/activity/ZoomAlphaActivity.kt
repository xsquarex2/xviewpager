package com.xsquare.xviewpager.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xsquare.xviewpager.CardBean
import com.xsquare.xviewpager.R
import com.xsquare.xviewpager.cardadapter.ZoomAlphaAdapter
import com.xsquare.xviewpager.pagertransformer.ZoomOutTransformer
import kotlinx.android.synthetic.main.activity_zoom_alpha.*


class ZoomAlphaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zoom_alpha)
        val lists = arrayListOf<CardBean>()
        lists.add(CardBean(R.mipmap.place1, "place1"))
        lists.add(CardBean(R.mipmap.place2, "place2"))
        lists.add(CardBean(R.mipmap.place3, "place3"))
        lists.add(CardBean(R.mipmap.place4, "place4"))
        lists.add(CardBean(R.mipmap.place5, "place5"))
        val adapter = ZoomAlphaAdapter(lists)
        viewPager.adapter = adapter
        viewPager.pageMargin = 40
        viewPager.offscreenPageLimit = 3
        supportActionBar!!.title = "Alpha card"
        viewPager.setPageTransformer(true, ZoomOutTransformer())
    }
}
