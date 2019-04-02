package com.maxbulver.planmo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Spinner

enum class EventType {
    Academic,
    Social,
    Volunteer

}

class ScheduleCreation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.schedule_creation)
        val spinner: Spinner = findViewById(R.id.spinner)
        spinner.adapter = ArrayAdapter<EventType>(this,
            android.R.layout.simple_spinner_item, EventType.values())
        val type = spinner.selectedItem as EventType
    }
}