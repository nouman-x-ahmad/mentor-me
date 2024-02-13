package com.NoumanAhmad.i210727

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView


class register : AppCompatActivity() {

    private val countries = arrayOf("Pakistan", "Bangladesh", "Kashmir") // Replace with your list of countries
    private val City = arrayOf("wah cantt", "officer colony", "lalarukh") // Replace with your list of countries
    lateinit var sign: TextView
    lateinit var reg: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, countries)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, City)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val countrySpinner = findViewById<Spinner>(R.id.country) // Correct reference to Spinner
        val cityspinner=findViewById<Spinner>(R.id.city)

        countrySpinner.adapter = adapter

        countrySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                val selectedCountry = countries[position]

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
        cityspinner.adapter=adapter2
        cityspinner.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
               // TODO("Not yet implemented")
                val selectedCity = City[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
               // TODO("Not yet implemented")
            }

        }

        //send to login page
        sign = findViewById(R.id.signin)

        // Set click listener for the TextView
        sign.setOnClickListener {
            // Start the register activity
            val intent = Intent(this, second_screen::class.java)
            startActivity(intent)
        }



        //send to Otp page
        reg=findViewById(R.id.rugister2)

        reg.setOnClickListener {
            val intent=Intent(this,OTP::class.java)
            startActivity(intent)

        }
    }
}
