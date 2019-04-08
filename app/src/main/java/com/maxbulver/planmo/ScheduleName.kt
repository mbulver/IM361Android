package com.maxbulver.planmo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class ScheduleName : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.schedule_creation2)
        val masterButton: Button = findViewById(R.id.nextButton)
        masterButton.setOnClickListener {
            val intent = Intent(this, ScheduleCreation::class.java)
            startActivity(intent)
        }
    }
}