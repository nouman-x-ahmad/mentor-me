package com.NoumanAhmad.i210727

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OTP : AppCompatActivity() {
    lateinit var sign: TextView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        sign=findViewById(R.id.verify)

        sign.setOnClickListener {
            val intent= Intent(this,second_screen::class.java)
            startActivity(intent)

        }
    }
}