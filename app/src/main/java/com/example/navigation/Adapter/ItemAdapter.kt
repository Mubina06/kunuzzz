package com.example.navigation.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.navigation.Items
import com.example.navigation.R

class ItemAdapter(var item_list: MutableList<Items>) :RecyclerView.Adapter<ItemAdapter.MyHolder>(){
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var photo = itemView.findViewById<ImageView>(R.id.photo)
        var time = itemView.findViewById<TextView>(R.id.time)
        var news = itemView.findViewById<TextView>(R.id.news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val index= item_list[position]
        holder.news.text = index.news
        holder.time.text = index.time
        holder.photo.setImageResource(index.photo)
    }

    override fun getItemCount(): Int {
        return item_list.size
    }
}