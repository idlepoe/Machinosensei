package com.lee.machinosensei.adapter

import android.graphics.drawable.Drawable

class TeacherGrid {
    var ivTeacher: Drawable? = null
    var tvTeacherName: String? = null
    var tvdetail1: String? = null

    constructor(name: String, image: Drawable, detail1: String) {
        this.ivTeacher = image
        this.tvTeacherName = name
        this.tvdetail1 = detail1

    }
}