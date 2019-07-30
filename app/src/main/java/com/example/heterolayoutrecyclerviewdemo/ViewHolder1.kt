package com.example.heterolayoutrecyclerviewdemo

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder1 (view : View): RecyclerView.ViewHolder(view) {
    //viewholder class has one member variable for each view in the layout
    val label1 : TextView = view.findViewById(R.id.textview1)
    val label2 : TextView =view.findViewById(R.id.textview2)

}