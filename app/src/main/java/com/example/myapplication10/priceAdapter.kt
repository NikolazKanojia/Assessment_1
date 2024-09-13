package com.example.myapplication10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class priceAdapter(private val prizelist:List<Prize>):RecyclerView.Adapter<priceAdapter.viewHolder>() {

    class viewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
      val prizeimages=itemView.findViewById<ImageView>(R.id.Image1prize)
        val prizename=itemView.findViewById<TextView>(R.id.prizetxt)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.prizerecyclerview,parent,false))
    }

    override fun getItemCount(): Int {
        return prizelist.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val prizep=prizelist[position]
        holder.prizeimages.setImageResource(prizep.image1)
        holder.prizename.text=prizep.name1
    }
}