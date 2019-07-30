package com.example.heterolayoutrecyclerviewdemo

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder2 (view : View): RecyclerView.ViewHolder(view) {
    //viewholder has one member variable for each view in the layout.
  val imageview : ImageView = view.findViewById(R.id.imageview1)
}