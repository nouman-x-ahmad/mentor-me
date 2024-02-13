package com.NoumanAhmad.i210727

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Reset_password : AppCompatActivity() {


    lateinit var res_log: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)





        res_log=findViewById(R.id.log_pswrd)

        res_log.setOnClickListener {
            val intent= Intent(this,second_screen::class.java)
            startActivity(intent)

        }
    }
}