package com.example.myapplication10

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserinfoAdapter(private val mList: List<Userinfo>):RecyclerView.Adapter<UserinfoAdapter.viewHolder>() {

    class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        val UserImage=itemView.findViewById<ImageView>(R.id.usersimage)
        val UserName=itemView.findViewById<TextView>(R.id.usersname)
        val ll=itemView.findViewById<LinearLayout>(R.id.Linearlayout1)
        val rv=itemView.findViewById<RecyclerView>(R.id.recyclerview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.namerecyclerview,parent,false))
    }

    override fun getItemCount(): Int {
      return mList.size
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        val userlist = mList[position]
        if(position ==0){
            holder.UserImage.visibility =View.GONE


        }else{
            holder.UserImage.visibility =View.VISIBLE
            holder.UserImage.setImageResource(userlist.image)
        }
        holder.UserName.text=userlist.userName
        holder.UserName.setTextSize(20F)



    }
}