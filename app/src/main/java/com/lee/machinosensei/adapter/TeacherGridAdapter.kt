package com.lee.machinosensei.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.lee.machinosensei.R
import kotlinx.android.synthetic.main.item_teacher.view.*

class TeacherGridAdapter(private val items: ArrayList<TeacherGrid>) :
    RecyclerView.Adapter<TeacherGridAdapter.ViewHolder>() {

        override fun getItemCount() = items.size

        override fun onBindViewHolder(holder: TeacherGridAdapter.ViewHolder, position: Int) {
            val item = items[position]
            val listener = View.OnClickListener {it ->
                Toast.makeText(it.context, "Clicked: ${item.tvTeacherName}", Toast.LENGTH_SHORT).show()
            }
            holder.apply {
                bind(listener, item)
                itemView.tag = item
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
                TeacherGridAdapter.ViewHolder {
            val inflatedView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_teacher, parent, false)
            return TeacherGridAdapter.ViewHolder(inflatedView)
        }

        class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
            private var view: View = v
            fun bind(listener: View.OnClickListener, item: TeacherGrid) {
                view.ivTeacher.setImageDrawable(item.ivTeacher)
                view.tvTeacherName.text = item.tvTeacherName
                view.tvDetail1.text = item.tvdetail1
                view.setOnClickListener(listener)
            }
        }
}