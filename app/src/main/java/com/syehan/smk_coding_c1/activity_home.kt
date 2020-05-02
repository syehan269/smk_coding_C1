package com.syehan.smk_coding_c1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*

class activity_home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        btn_submit.setOnClickListener(View.OnClickListener {

            val getName: String? = et_name.text.toString()
            val getAddress: String? = et_address.text.toString()
            val getGender: String? = spn_gender.selectedItem.toString()
            val getAge: String? = et_age.text.toString()
            val getEmail: String? = et_email.text.toString()
            val getTele: String? = et_tele.text.toString()

            val intent = Intent(this, Activity_Detail::class.java)
            intent.putExtra("getName", getName)
            intent.putExtra("getAddress", getAddress)
            intent.putExtra("getGender", getGender)
            intent.putExtra("getAge", getAge)
            intent.putExtra("getEmail", getEmail)
            intent.putExtra("getTele", getTele)
            startActivity(intent)

        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {



        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }
}
