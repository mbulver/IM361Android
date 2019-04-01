package com.maxbulver.planmo

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton: Button = findViewById(R.id.myButton)
        val myText: TextView = findViewById(R.id.myText)
        val intent = Intent(this, ScheduleCreation::class.java)
        startActivity(intent)
        myButton.setOnClickListener {
            val intent = Intent(this, ScheduleCreation::class.java)
            val options = ActivityOptions.makeSceneTransitionAnimation(this, myText, "my_text_view")
            startActivity(intent, options.toBundle())
        }
    }
}
