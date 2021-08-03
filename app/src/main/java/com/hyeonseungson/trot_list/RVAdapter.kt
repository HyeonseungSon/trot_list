package com.hyeonseungson.trot_list

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RVAdapter(val items: MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        Log.d ("view??", view.toString())
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        Log.d("chk000", items.size.toString())
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(item : String) {

            Log.d ("itemView?", itemView.toString())

            val rv_text = itemView.findViewById<TextView>(R.id.rvNumberId)
            rv_text.text = item

            Log.d("chk001", item)

        }
    }
}