package com.lee.machinosensei.fragment

import android.graphics.drawable.Drawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.lee.machinosensei.R
import kotlinx.android.synthetic.main.fragment_mypage.view.*

class MyPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_mypage, container, false)

        // TODO ログインをチェックし分岐すること
        var drawable: Drawable = resources.getDrawable(R.drawable.ic_menu_camera,null)
        root.iv_user.setImageDrawable(drawable)
        root.tv_user_name.text = "GuestUser_000001"

        // ログイン済みの場合　ログインボタンを表示しない
//        root.guest_Login_Layout.visibility = View.GONE
        // 未ログインの場合　先生登録情報を表示しない
//        root.layout_teacher.visibility = View.GONE
        // 先生登録済みの場合
//        root.btn_my_page_register.visibility = View.GONE
        // 先生未登録の場合
//        root.layout_teacher_info.visibility = View.GONE

        // アカウント登録ボタン
        root.btn_my_page_registration.setOnClickListener {
            Toast.makeText(this.requireContext(), "アカウント登録へ", Toast.LENGTH_SHORT).show()
        }
        // loginボタン
        root.btn_my_page_login.setOnClickListener {
            Toast.makeText(this.requireContext(), "loginへ", Toast.LENGTH_SHORT).show()
        }
        // 登録情報修正ボタン
        root.btn_my_page_info_edit.setOnClickListener {
            Toast.makeText(this.requireContext(), "登録情報修正へ", Toast.LENGTH_SHORT).show()
        }
        // 先生に登録ボタン
        root.btn_my_page_teacher_register.setOnClickListener {
            Toast.makeText(this.requireContext(), "先生に登録へ", Toast.LENGTH_SHORT).show()
        }

        return root
    }

    class MyPageInfo {
        var iv_user: Drawable? = null
        var tv_userName: String? = null
        var teacherFlg: String? = null
        val native: String? = null
        val teaching: String? = null
        val nationality: String? = null
        val place: String? = null
        val costFlg: String? = null
        val detail: String? = null

        constructor(name: String, image: Drawable, teacherFlg: String) {
            this.iv_user = image
            this.tv_userName = name
            this.teacherFlg = teacherFlg

        }
    }
}