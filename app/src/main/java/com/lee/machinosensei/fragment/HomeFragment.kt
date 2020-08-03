package com.lee.machinosensei.fragment

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.lee.machinosensei.R
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.item_teacher.view.*


class HomeFragment : Fragment() {

    var adapter: TeacherGridAdapter? = null
    var adapter_area: TeacherGridAdapter? = null
    var teacherList = ArrayList<Teacher>()
    var teacherList_area = ArrayList<Teacher>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val intent = requireActivity().intent
        //選択された言語
        var select_lang: String? = intent.extras!!.getString("select_lang")

        // TODO DBから先生情報を取得しLISTにセットする
        //  　イメージは何型？
        var drawable: Drawable = resources.getDrawable(R.drawable.ic_menu_camera,null)
        teacherList.add(Teacher("Coffee", drawable, "detail"))
        teacherList.add(Teacher("Espersso", drawable, "detail"))
        teacherList.add(Teacher("French Fires", drawable, "detail"))
        teacherList.add(Teacher("Honey",drawable, "detail"))
        teacherList.add(Teacher("Strawberry", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Strawberry", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Honey", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Honey", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Honey", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        teacherList.add(Teacher("Sugar cubes", drawable, "detail"))
        adapter = TeacherGridAdapter(teacherList)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        // 選択された言語
        root.tv_lang.text = select_lang + "先生を表示"
        // 最新の先生
        root.recycler.adapter = adapter

        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        teacherList_area.add(Teacher("Coffee", drawable, "detail"))
        adapter_area = TeacherGridAdapter(teacherList_area)
        // 近所の先生
        root.recycler_area.adapter = adapter_area

        return root
    }

    class Teacher {
        var ivTeacher: Drawable? = null
        var tvTeacherName: String? = null
        var tvdetail1: String? = null

        constructor(name: String, image: Drawable, detail1: String) {
            this.ivTeacher = image
            this.tvTeacherName = name
            this.tvdetail1 = detail1

        }
    }

    class TeacherGridAdapter(private val items: ArrayList<Teacher>) :
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
            fun bind(listener: View.OnClickListener, item: Teacher) {
                view.ivTeacher.setImageDrawable(item.ivTeacher)
                view.tvTeacherName.text = item.tvTeacherName
                view.tvDetail1.text = item.tvdetail1
                view.setOnClickListener(listener)
            }
        }
    }
}