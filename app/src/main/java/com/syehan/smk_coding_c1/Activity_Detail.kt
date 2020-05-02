package com.syehan.smk_coding_c1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity__detail.*
import kotlinx.android.synthetic.main.activity_home.*

class Activity_Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__detail)

        btn_about.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Activity_About::class.java)
            startActivity(intent)
        })
    }

    override fun onStart() {
        super.onStart()
        setValue()
    }

    private fun setValue() {
        val name: String = intent.getStringExtra("getName")
        val address: String = intent.getStringExtra("getAddress")
        val gender: String = intent.getStringExtra("getGender")
        val age: String = intent.getStringExtra("getAge")
        val email: String = intent.getStringExtra("getEmail")
        val tele: String = intent.getStringExtra("getTele")

        tv_name.text = ": $name"
        tv_address.text = ": $address"
        tv_age.text = ": $age"
        tv_email.text = ": $email"
        tv_tele.text = ": $tele"
        tv_gender.text = ": $gender"
    }
}
