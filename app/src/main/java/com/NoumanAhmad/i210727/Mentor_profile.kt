package com.NoumanAhmad.i210727

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mentor_profile : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_profile)

        // Initialize the Button objects after setContentView() is called
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)

        button.setOnClickListener {
            val intent = Intent(this, review_page::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, Book_Mentor::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, community_chat::class.java)
            startActivity(intent)
        }
    }
}
