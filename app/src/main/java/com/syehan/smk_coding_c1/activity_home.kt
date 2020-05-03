package com.syehan.smk_coding_c1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class activity_home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(toolbar)
        btn_submit.setOnClickListener(View.OnClickListener {

            val getName: String? = et_name.text.toString()
            val getAddress: String? = et_address.text.toString()
            val getGender: String? = spn_gender.selectedItem.toString()
            val getAge: String? = et_age.text.toString()
            val getEmail: String? = et_email.text.toString()
            val getTele: String? = et_tele.text.toString()

            if (getAge?.isEmpty()!! || getAddress?.isEmpty()!! || getAge.isEmpty() || getEmail?.isEmpty()!! || getTele?.isEmpty()!! || getGender?.isEmpty()!!){
                Toast.makeText(this, "There is empty field !", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, Activity_Detail::class.java)
                intent.putExtra("getName", getName)
                intent.putExtra("getAddress", getAddress)
                intent.putExtra("getGender", getGender)
                intent.putExtra("getAge", getAge)
                intent.putExtra("getEmail", getEmail)
                intent.putExtra("getTele", getTele)
                startActivity(intent)
            }
        })



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_home, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.about_opt -> startActivity( Intent(this, Activity_About::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}
