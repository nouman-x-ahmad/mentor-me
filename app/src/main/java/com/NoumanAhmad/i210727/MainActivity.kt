package com.NoumanAhmad.i210727

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var var1: TextView // Declare the TextView variable
    lateinit var var2: TextView
    lateinit var var3: TextView
    lateinit var var4: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Inflate the layout first

        var1 = findViewById<TextView>(R.id.home1)
        var2 = findViewById(R.id.home2)
        var3 = findViewById(R.id.home3)
        var4 = findViewById<TextView>(R.id.home4)

        // Set the background drawable for var1 and var2
      //  var1.setBackgroundResource(R.drawable.shape)
        var3.setBackgroundResource(R.drawable.shape)
        var4.setBackgroundResource(R.drawable.shape)

//        // Set alpha (opacity) for var1
        var3.background.alpha = 128 // Set alpha to approximately 50% (128/255)
//
//        // Set alpha (opacity) for var2
        var4.background.alpha = 92 // Set alpha to approximately 75% (192/255)

        val rootLayout = findViewById<View>(R.id.rootLayout)
        rootLayout.setOnClickListener {
            // Start the new activity here
            val intent = Intent(this, second_screen::class.java)
            startActivity(intent)
        }
        }

    }





