package com.xsquare.xviewpager

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by xsquare on 2018/1/29.
 */

class MainAdapter(var lists:List<String>,var context:Context) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private var listner:OnClickListener?=null
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val title = lists.get(position)
        holder!!.tvTitle.text = title
        holder.itemView.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                if (listner!=null){
                    listner!!.onClick(title,position)
                }
            }
        })
    }

    override fun getItemCount(): Int = lists.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.adapter_main,parent,false))
    }

    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        var tvTitle = itemView.findViewById<TextView>(R.id.tv_title)
    }
    fun setOnClickListener(onClickListener: OnClickListener){
        this.listner = onClickListener
    }
    interface OnClickListener{
        fun onClick(title:String,position:Int)
    }

}
