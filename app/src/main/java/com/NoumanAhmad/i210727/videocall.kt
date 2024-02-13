package com.NoumanAhmad.i210727

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class videocall : AppCompatActivity() {

    val camera: TextView = findViewById(R.id.camera)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videocall)
        camera.setOnClickListener {
            val intent = Intent(this, Voice_call::class.java)
            startActivity(intent)
        }
    }
}