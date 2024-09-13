package com.example.myapplication10

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.PorterDuff
import android.graphics.drawable.LayerDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class competionAdapter(
    private val context: Context,
    private val competionList: List<Competitionifo>
) : RecyclerView.Adapter<competionAdapter.viewHolder>() {

    class viewHolder(iteamView: View) : RecyclerView.ViewHolder(iteamView) {
        val checkimg = iteamView.findViewById<ImageView>(R.id.check)
        val lockimg = iteamView.findViewById<ImageView>(R.id.lock)

        val checkimg1 = iteamView.findViewById<ImageView>(R.id.check1)
        val lockimg1 = iteamView.findViewById<ImageView>(R.id.lock1)

        val checkimg2 = iteamView.findViewById<ImageView>(R.id.check2)
        val lockimg2 = iteamView.findViewById<ImageView>(R.id.lock2)

        val checkimg3 = iteamView.findViewById<ImageView>(R.id.check3)
        val lockimg3 = iteamView.findViewById<ImageView>(R.id.lock3)

        val checkimg4 = iteamView.findViewById<ImageView>(R.id.check4)
        val lockimg4 = iteamView.findViewById<ImageView>(R.id.lock4)

        val checkimg5 = iteamView.findViewById<ImageView>(R.id.check5)
        val lockimg5 = iteamView.findViewById<ImageView>(R.id.lock5)

        val checkimg6 = iteamView.findViewById<ImageView>(R.id.check6)
        val lockimg6 = iteamView.findViewById<ImageView>(R.id.lock6)

        val ll2 = iteamView.findViewById<LinearLayout>(R.id.Linerarlayout2)
        val comp1 = itemView.findViewById<TextView>(R.id.c1)
        val progress1 = iteamView.findViewById<ProgressBar>(R.id.Prog1)
        val comp2 = itemView.findViewById<TextView>(R.id.c2)
        val progress2 = iteamView.findViewById<ProgressBar>(R.id.Prog2)
        val comp3 = itemView.findViewById<TextView>(R.id.c3)
        val progress3 = iteamView.findViewById<ProgressBar>(R.id.Prog3)
        val comp4 = itemView.findViewById<TextView>(R.id.c4)
        val progress4 = iteamView.findViewById<ProgressBar>(R.id.Prog4)
        val comp5 = itemView.findViewById<TextView>(R.id.c5)
        val progress5 = iteamView.findViewById<ProgressBar>(R.id.Prog5)
        val comp6 = itemView.findViewById<TextView>(R.id.c6)
        val progress6 = iteamView.findViewById<ProgressBar>(R.id.Prog6)
        val comp7 = itemView.findViewById<TextView>(R.id.c7)
        val progress7 = iteamView.findViewById<ProgressBar>(R.id.Prog7)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.compitions, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return competionList.size
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val complist = competionList[position]
        if (position == 0) {
            holder.checkimg.visibility = View.GONE
            holder.lockimg.visibility = View.GONE
            holder.progress1.visibility = View.GONE
            holder.comp1.text = complist.c
            holder.comp1.setTextSize(19F)

            holder.checkimg1.visibility = View.GONE
            holder.lockimg1.visibility = View.GONE
            holder.comp2.text = complist.c1
            holder.progress2.visibility = View.GONE
            holder.comp2.setTextSize(19F)

            holder.checkimg2.visibility = View.GONE
            holder.lockimg2.visibility = View.GONE
            holder.comp3.text = complist.c2
            holder.progress3.visibility = View.GONE
            holder.comp3.setTextSize(19F)

            holder.checkimg3.visibility = View.GONE
            holder.lockimg3.visibility = View.GONE
            holder.comp4.text = complist.c3
            holder.progress4.visibility = View.GONE
            holder.comp4.setTextSize(19F)

            holder.checkimg4.visibility = View.GONE
            holder.lockimg4.visibility = View.GONE
            holder.comp5.text = complist.c4
            holder.progress5.visibility = View.GONE
            holder.comp5.setTextSize(19F)

            holder.checkimg5.visibility = View.GONE
            holder.lockimg5.visibility = View.GONE
            holder.comp6.text = complist.c5
            holder.progress6.visibility = View.GONE
            holder.comp6.setTextSize(19F)

            holder.checkimg6.visibility = View.GONE
            holder.lockimg6.visibility = View.GONE
            holder.comp7.text = complist.c6
            holder.progress7.visibility = View.GONE
            holder.comp7.setTextSize(19F)

        }

        else {
            holder.progress1.visibility = View.VISIBLE
            var x1 = complist.c
            holder.progress1.progress = x1.toInt()
            holder.comp1.text = complist.c + "%"
            val drawable = holder.progress1.progressDrawable as LayerDrawable
            val progressDrawable = drawable.getDrawable(1)
            if (x1.toInt() < 30 && x1.toInt()!=0) {
                progressDrawable.setColorFilter(
                    context.resources.getColor(android.R.color.holo_red_dark),
                    PorterDuff.Mode.SRC_IN
                )
            } else if (x1.toInt() == 100) {

                Log.d("heheheheheheh100","${x1}")
                holder.progress1.visibility = View.GONE
                holder.checkimg.visibility = View.VISIBLE
                holder.lockimg.visibility = View.GONE
                holder.comp1.visibility = View.GONE
            } else if (x1.toInt() == 0) {
                holder.progress1.visibility = View.GONE
                holder.checkimg.visibility = View.GONE
                holder.lockimg.visibility = View.VISIBLE
                holder.comp1.visibility = View.GONE
            } else {
                progressDrawable.setColorFilter(
                    context.resources.getColor(android.R.color.holo_green_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            holder.progress1.progressDrawable = drawable

        //---------------------------------------------------------------------------
            holder.progress2.visibility = View.VISIBLE
            var x2 = complist.c1
            holder.progress2.progress = x2.toInt()
            holder.comp2.text = complist.c1 + "%"
            val drawable2 = holder.progress2.progressDrawable as LayerDrawable
            val progressDrawable2 = drawable2.getDrawable(1)
            if (x2.toInt() < 30 && x2.toInt()!=0) {
                progressDrawable2.setColorFilter(
                    context.resources.getColor(android.R.color.holo_red_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            else if (x2.toInt() == 100)
            {

                Log.d("heheheheheheh100","${x1}")
                holder.progress2.visibility = View.GONE
                holder.checkimg1.visibility = View.VISIBLE
                holder.lockimg1.visibility = View.GONE
                holder.comp2.visibility = View.GONE
            } else if (x2.toInt() == 0) {
                holder.progress2.visibility = View.GONE
                holder.checkimg1.visibility = View.GONE
                holder.lockimg1.visibility = View.VISIBLE
                holder.comp2.visibility = View.GONE
            } else
            {
                progressDrawable2.setColorFilter(
                    context.resources.getColor(android.R.color.holo_green_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            holder.progress2.progressDrawable = drawable2

            //---------------------------------------------------------------------
            holder.progress3.visibility = View.VISIBLE
            var x3 = complist.c2
            holder.progress3.progress = x3.toInt()
            holder.comp3.text = complist.c2 + "%"
            val drawable3 = holder.progress3.progressDrawable as LayerDrawable
            val progressDrawable3 = drawable3.getDrawable(1)
            if (x3.toInt() < 30 && x3.toInt()!=0) {
                progressDrawable3.setColorFilter(
                    context.resources.getColor(android.R.color.holo_red_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            else if (x3.toInt() == 100)
            {

                Log.d("heheheheheheh100","${x1}")
                holder.progress3.visibility = View.GONE
                holder.checkimg2.visibility = View.VISIBLE
                holder.lockimg2.visibility = View.GONE
                holder.comp3.visibility = View.GONE
            }
            else if (x3.toInt() == 0)
            {
                holder.progress3.visibility = View.GONE
                holder.checkimg2.visibility = View.GONE
                holder.lockimg2.visibility = View.VISIBLE
                holder.comp3.visibility = View.GONE
            }
            else
            {
                progressDrawable3.setColorFilter(
                    context.resources.getColor(android.R.color.holo_green_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            holder.progress3.progressDrawable = drawable3
            //----------------------------------------------------------------------------
            holder.progress4.visibility = View.VISIBLE
            var x4 = complist.c3
            holder.progress4.progress = x4.toInt()
            holder.comp4.text = complist.c3 + "%"
            val drawable4 = holder.progress4.progressDrawable as LayerDrawable
            val progressDrawable4 = drawable4.getDrawable(1)
            if (x4.toInt() < 30 && x4.toInt()!=0) {
                progressDrawable4.setColorFilter(
                    context.resources.getColor(android.R.color.holo_red_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            else if (x4.toInt() == 100)
            {

                Log.d("heheheheheheh100","${x1}")
                holder.progress4.visibility = View.GONE
                holder.checkimg3.visibility = View.VISIBLE
                holder.lockimg3.visibility = View.GONE
                holder.comp4.visibility = View.GONE
            }
            else if (x4.toInt() == 0)
            {
                holder.progress4.visibility = View.GONE
                holder.checkimg3.visibility = View.GONE
                holder.lockimg3.visibility = View.VISIBLE
                holder.comp4.visibility = View.GONE
            }
            else
            {
                progressDrawable4.setColorFilter(
                    context.resources.getColor(android.R.color.holo_green_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            holder.progress4.progressDrawable = drawable4

//-------------------------------------------------------------------------------------
            holder.progress5.visibility = View.VISIBLE
            var x5 = complist.c4
            holder.progress5.progress = x5.toInt()
            holder.comp5.text = complist.c4 + "%"
            val drawable5 = holder.progress5.progressDrawable as LayerDrawable
            val progressDrawable5 = drawable5.getDrawable(1)
            if (x5.toInt() < 30 && x5.toInt()!=0) {
                progressDrawable5.setColorFilter(
                    context.resources.getColor(android.R.color.holo_red_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            else if (x5.toInt() == 100)
            {

                Log.d("heheheheheheh100","${x1}")
                holder.progress5.visibility = View.GONE
                holder.checkimg4.visibility = View.VISIBLE
                holder.lockimg4.visibility = View.GONE
                holder.comp5.visibility = View.GONE
            }
            else if (x5.toInt() == 0)
            {
                holder.progress5.visibility = View.GONE
                holder.checkimg4.visibility = View.GONE
                holder.lockimg4.visibility = View.VISIBLE
                holder.comp5.visibility = View.GONE
            }
            else
            {
                progressDrawable5.setColorFilter(
                    context.resources.getColor(android.R.color.holo_green_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            holder.progress5.progressDrawable = drawable5

//--------------------------------------------------------------------------------------
            holder.progress6.visibility = View.VISIBLE
            var x6 = complist.c5
            holder.progress6.progress = x6.toInt()
            holder.comp6.text = complist.c5 + "%"
            val drawable6 = holder.progress6.progressDrawable as LayerDrawable
            val progressDrawable6 = drawable6.getDrawable(1)
            if (x6.toInt() < 30 && x6.toInt()!=0) {
                progressDrawable6.setColorFilter(
                    context.resources.getColor(android.R.color.holo_red_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            else if (x6.toInt() == 100)
            {

                Log.d("heheheheheheh100","${x1}")
                holder.progress6.visibility = View.GONE
                holder.checkimg5.visibility = View.VISIBLE
                holder.lockimg5.visibility = View.GONE
                holder.comp6.visibility = View.GONE
            }
            else if (x6.toInt() == 0)
            {
                holder.progress6.visibility = View.GONE
                holder.checkimg5.visibility = View.GONE
                holder.lockimg5.visibility = View.VISIBLE
                holder.comp6.visibility = View.GONE
            }
            else
            {
                progressDrawable6.setColorFilter(
                    context.resources.getColor(android.R.color.holo_green_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            holder.progress6.progressDrawable = drawable6

            //---------------------------------------------------------------------------
            holder.progress7.visibility = View.VISIBLE
            var x7 = complist.c6
            holder.progress7.progress = x7.toInt()
            holder.comp7.text = complist.c6 + "%"
            val drawable7 = holder.progress7.progressDrawable as LayerDrawable
            val progressDrawable7 = drawable7.getDrawable(1)
            if (x7.toInt() < 30 && x7.toInt()!=0) {
                progressDrawable6.setColorFilter(
                    context.resources.getColor(android.R.color.holo_red_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            else if (x7.toInt() == 100)
            {

                Log.d("heheheheheheh100","${x1}")
                holder.progress7.visibility = View.GONE
                holder.checkimg6.visibility = View.VISIBLE
                holder.lockimg6.visibility = View.GONE
                holder.comp7.visibility = View.GONE
            }
            else if (x7.toInt() == 0)
            {
                holder.progress7.visibility = View.GONE
                holder.checkimg6.visibility = View.GONE
                holder.lockimg6.visibility = View.VISIBLE
                holder.comp7.visibility = View.GONE
            }
            else
            {
                progressDrawable7.setColorFilter(
                    context.resources.getColor(android.R.color.holo_green_dark),
                    PorterDuff.Mode.SRC_IN
                )
            }
            holder.progress7.progressDrawable = drawable7

        }
    }
}