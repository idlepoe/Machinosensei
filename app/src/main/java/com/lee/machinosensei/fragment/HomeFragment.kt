package com.lee.machinosensei.fragment

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.lee.machinosensei.R
import com.lee.machinosensei.adapter.TeacherGrid
import com.lee.machinosensei.adapter.TeacherGridAdapter
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    var adapter: TeacherGridAdapter? = null
    var adapter_area: TeacherGridAdapter? = null
    var teacherList = ArrayList<TeacherGrid>()
    var teacherList_area = ArrayList<TeacherGrid>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // TODO DBから先生情報を取得しLISTにセットする
        //  　イメージは何型？
        var drawable: Drawable = resources.getDrawable(R.drawable.ic_menu_camera,null)
        teacherList.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList.add(TeacherGrid("Espersso", drawable, "detail"))
        teacherList.add(TeacherGrid("French Fires", drawable, "detail"))
        teacherList.add(TeacherGrid("Honey",drawable, "detail"))
        teacherList.add(TeacherGrid("Strawberry", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Strawberry", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Honey", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Honey", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Honey", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", drawable, "detail"))
        adapter = TeacherGridAdapter(teacherList)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        root.recycler.setLayoutManager(GridLayoutManager(this.requireContext(), 3))
        // 最新の先生
        root.recycler.adapter = adapter
        // 先生選択
        root.recycler.setOnClickListener(View.OnClickListener {
            // // TODO 詳細へ？
            Toast.makeText(this.requireContext(), "先生詳細へ", Toast.LENGTH_SHORT).show()
        })

        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        teacherList_area.add(TeacherGrid("Coffee", drawable, "detail"))
        adapter_area = TeacherGridAdapter(teacherList_area)
        // 近所の先生
        root.recycler_area.adapter = adapter_area
        // 先生選択
        root.recycler_area.setOnClickListener(View.OnClickListener {
            // // TODO 詳細へ？
            Toast.makeText(this.requireContext(), "先生詳細へ", Toast.LENGTH_SHORT).show()
        })

        return root
    }
}