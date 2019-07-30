package com.example.heterolayoutrecyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class ComplexRecyclerViewAdapter(private val data: MutableList<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val _USER: Int = 0
    private val _IMAGE: Int = 1

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var context: Context = parent.context
        var inflater: LayoutInflater = LayoutInflater.from(context)
        var viewholder: RecyclerView.ViewHolder
        when (viewType) {
            _USER -> {
                val v1: View = inflater.inflate(R.layout.viewholder1, parent, false)
                viewholder = ViewHolder1(v1)
                return  viewholder
            }

            _IMAGE -> {
                val v2: View = inflater.inflate(R.layout.viewholder2, parent, false)
                viewholder = ViewHolder2(v2)
                return viewholder
            }


        }
        val v2: View = inflater.inflate(R.layout.viewholder2, parent, false)
        viewholder = ViewHolder2(v2)
        return viewholder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder.itemViewType){
            _USER -> {
                val vh1 : ViewHolder1 = holder as ViewHolder1
                configureViewHolder1(vh1,position)


            }
            _IMAGE ->{
            val vh2 : ViewHolder2 = holder as ViewHolder2
            configureViewHolder2(vh2,position)

        }


        }

    }
    private fun configureViewHolder1(vh1 : ViewHolder1 , position: Int){
        val user : User = data.get(position) as User
        vh1.label1.text = "Name : ${user.name}"
        vh1.label2.text = "Hometown : ${user.hometown}"

    }
    private fun configureViewHolder2(vh2 : ViewHolder2, position: Int){
        vh2.imageview.setImageResource(R.drawable.lorem_ipsum_star_big)
    }


    override fun getItemViewType(position: Int): Int {
        if (data.get(position) is User) {
            return _USER //return 0
        } else if (data.get(position) is String) {
            return _IMAGE // return 1
        }

        return 1
    }

}