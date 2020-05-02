package com.syehan.smk_coding_c1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity__detail.*

class Activity_Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__detail)

        btn_about.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity_About::class.java)
            startActivity(intent)
        })
    }
}
