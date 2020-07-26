package com.lee.machinosensei.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.lee.machinosensei.R

class SlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide)

        var btnAppStart: Button =findViewById(R.id.btn_slide_app_start)

        btnAppStart.setOnClickListener {
            val intent = Intent(this,
                HomeActivity::class.java)
            startActivity(intent)
        }
    }
}