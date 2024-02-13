package com.NoumanAhmad.i210727

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgotPassword : AppCompatActivity() {
    lateinit var log_in: TextView
    lateinit var res_pswrd: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        log_in=findViewById(R.id.log_st6)

        log_in.setOnClickListener {
            val intent= Intent(this,second_screen::class.java)
            startActivity(intent)

        }

        res_pswrd=findViewById(R.id.Send)

        res_pswrd.setOnClickListener {
            val intent= Intent(this,Reset_password::class.java)
            startActivity(intent)

        }
    }
}