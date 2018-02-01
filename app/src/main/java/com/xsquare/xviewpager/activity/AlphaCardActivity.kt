package com.xsquare.xviewpager.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xsquare.xviewpager.CardBean
import com.xsquare.xviewpager.R
import com.xsquare.xviewpager.cardadapter.AlphaCardAdapter
import com.xsquare.xviewpager.cardadapter.ZoomAlphaAdapter
import com.xsquare.xviewpager.pagertransformer.AlphaScaleCardPageTransformer
import kotlinx.android.synthetic.main.activity_alpha_card.*

/**
 * 透明卡片式
 */
class AlphaCardActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha_card)

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
        supportActionBar!!.title = "Zoom alpha"
        viewPager.setPageTransformer(true, AlphaScaleCardPageTransformer())
    }
}
