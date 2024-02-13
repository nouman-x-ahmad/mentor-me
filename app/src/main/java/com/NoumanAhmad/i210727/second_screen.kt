package com.NoumanAhmad.i210727

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
class second_screen : AppCompatActivity() {

    lateinit var var6: TextView
    lateinit var forgot: TextView
    lateinit var sign: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        var6 = findViewById(R.id.rgister)

        // Set click listener for the TextView
        var6.setOnClickListener {
            // Start the register activity
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
        forgot=findViewById(R.id.yourTextViewId)

        forgot.setOnClickListener {
            val intent=Intent(this,ForgotPassword::class.java)
            startActivity(intent)

        }

        sign=findViewById(R.id.lgnbtn)

        sign.setOnClickListener {
            val intent= Intent(this,Home::class.java)
            startActivity(intent)

        }
    }
}
