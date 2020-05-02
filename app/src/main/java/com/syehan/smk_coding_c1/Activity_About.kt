package com.syehan.smk_coding_c1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity__about.*

class Activity_About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__about)

        setSupportActionBar(toolbar_about)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
