package com.syehan.smk_coding_c1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*

class activity_home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_submit.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity_Detail::class.java)
            startActivity(intent)
        })

    }
}
