package com.example.heterolayoutrecyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter =ComplexRecyclerViewAdapter(CreateData())
        recyclerView.layoutManager=LinearLayoutManager(this)
    }

    private fun CreateData (): MutableList<Any>{
        val data : ArrayList<Any> = ArrayList()
        data.add( User("Dany Targaryen", "Valyria"))
        data.add( User("Rob Stark", "Winterfell"))
        data.add("image");
        data.add( User("Jon Snow", "Castle Black"))
        data.add("image");
        data.add(User("Tyrion Lanister", "King's Landing"))
        return data
    }
}