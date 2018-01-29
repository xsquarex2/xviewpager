package com.xsquare.xviewpager

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.xsquare.xviewpager.card.AlphaCardActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val lists:ArrayList<String> = arrayListOf()
        lists.add("alpha card")
        val adapter = MainAdapter(lists,this)
        recyclerView.adapter = adapter
        adapter.setOnClickListener(object: MainAdapter.OnClickListener {
            override fun onClick(title: String, position: Int) {
                when(position){
                    0 ->{
                        startActivity(Intent(this@MainActivity,AlphaCardActivity::class.java))
                    }
                }
            }
        })
    }
}
