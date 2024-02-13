package com.NoumanAhmad.i210727

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Add_Mentor : AppCompatActivity() {
    private lateinit var icon1: TextView
    private lateinit var icon2: TextView
    private lateinit var icon3: TextView
    private lateinit var icon4: TextView
    private lateinit var icon5: TextView
    private lateinit var addmentor: TextView
    private lateinit var addmentor1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_mentor)

        // Initialize the TextView variables here
        icon1 = findViewById(R.id.icon1)
        icon2 = findViewById(R.id.icon2)
        icon3 = findViewById(R.id.icon3)
        icon4 = findViewById(R.id.icon4)
        icon5 = findViewById(R.id.icon5)
        addmentor = findViewById(R.id.mentor_video_text)
        addmentor1 = findViewById(R.id.mentor_image_text)

        icon1.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        icon2.setOnClickListener {
            val intent = Intent(this, Search::class.java)
            startActivity(intent)
        }
        icon3.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
        icon4.setOnClickListener {
            val intent = Intent(this, Add_Mentor::class.java)
            startActivity(intent)
        }
        icon5.setOnClickListener {
            val intent = Intent(this, Chats::class.java)
            startActivity(intent)
        }
        addmentor.setOnClickListener {
            val intent = Intent(this, video::class.java)
            startActivity(intent)
        }
        addmentor1.setOnClickListener {
            val intent = Intent(this, Camera::class.java)
            startActivity(intent)
        }
    }
}
