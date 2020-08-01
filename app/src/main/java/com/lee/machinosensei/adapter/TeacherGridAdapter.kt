package com.lee.machinosensei.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.lee.machinosensei.R
import kotlinx.android.synthetic.main.item_teacher.view.*

class TeacherGridAdapter : BaseAdapter {
    var teacherList = ArrayList<TeacherGrid>()
    var context: Context? = null

    constructor(context: Context, foodsList: ArrayList<TeacherGrid>) : super() {
        this.context = context
        this.teacherList = foodsList
    }

    override fun getCount(): Int {
        return teacherList.size
    }

    override fun getItem(position: Int): Any {
        return teacherList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val teacherGrid = this.teacherList[position]

        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var teacherView = inflator.inflate(R.layout.item_teacher, null)
        teacherView.ivTeacher.setImageResource(teacherGrid.ivTeacher!!)
        teacherView.tvTeacherName.text = teacherGrid.tvTeacherName!!
        teacherView.tvDetail1.text = teacherGrid.tvdetail1!!

        return teacherView
    }
}