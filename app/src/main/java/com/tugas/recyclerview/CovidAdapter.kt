package com.tugas.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class CovidAdapter (private val list: ArrayList<Covid>): RecyclerView.Adapter<CovidAdapter.Holder>() {
    class Holder(val view: View): RecyclerView.ViewHolder(view){
        val name: TextView = view.findViewById<TextView>(R.id.item_name)
        val image: ImageView = view.findViewById<ImageView>(R.id.item_image)
        val info: TextView = view.findViewById<TextView>(R.id.item_info)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return Holder(v)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.name.text = list[position].name
        holder.info.text = list[position].info
        holder.image.setImageResource(list[position].image)

    }
    override fun getItemCount(): Int =  list.size
}