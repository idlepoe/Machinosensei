package com.lee.machinosensei.fragment

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
    var teacherList = ArrayList<TeacherGrid>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // TODO DBから先生情報を取得しLISTにセットする
        //  　イメージは扱う型によってStringに修正
        teacherList.add(TeacherGrid("Coffee", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Espersso", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("French Fires", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Honey",R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Strawberry", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", R.drawable.ic_menu_camera, "detail"))
        teacherList.add(TeacherGrid("Sugar cubes", R.drawable.ic_menu_camera, "detail"))
        adapter = TeacherGridAdapter(this.requireContext(), teacherList)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        root.gridview.adapter = adapter
        // 先生選択
        root.gridview.setOnItemClickListener { adapterView, _, position, _ ->
            // TODO 詳細へ？
            //  すぐメッセージへ？
            Toast.makeText(this.requireContext(), "先生詳細へ", Toast.LENGTH_SHORT).show()
        }
        return root
    }
}