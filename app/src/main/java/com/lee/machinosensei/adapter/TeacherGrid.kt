package com.lee.machinosensei.adapter

class TeacherGrid {
    var ivTeacher: Int? = null
    var tvTeacherName: String? = null
    var tvdetail1: String? = null

    constructor(name: String, image: Int, detail1: String) {
        this.ivTeacher = image
        this.tvTeacherName = name
        this.tvdetail1 = detail1

    }
}