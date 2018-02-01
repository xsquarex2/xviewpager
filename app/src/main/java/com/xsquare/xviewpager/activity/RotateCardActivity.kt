package com.xsquare.xviewpager.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xsquare.xviewpager.CardBean
import com.xsquare.xviewpager.R
import com.xsquare.xviewpager.cardadapter.AlphaCardAdapter
import com.xsquare.xviewpager.pagertransformer.RotateCardPageTransformer
import kotlinx.android.synthetic.main.activity_rotate_card.*

/**
 * 旋转卡片式
 */
class RotateCardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotate_card)
        supportActionBar!!.title = "Rotate card"
        val lists = arrayListOf<CardBean>()
        lists.add(CardBean(R.mipmap.place1, "place1"))
        lists.add(CardBean(R.mipmap.place2, "place2"))
        lists.add(CardBean(R.mipmap.place3, "place3"))
        lists.add(CardBean(R.mipmap.place4, "place4"))
        lists.add(CardBean(R.mipmap.place5, "place5"))
        val adapter = AlphaCardAdapter(lists)
        viewPager.adapter = adapter
        viewPager.pageMargin = 40
        viewPager.offscreenPageLimit = 3
        viewPager.setPageTransformer(true, RotateCardPageTransformer())
    }
}
