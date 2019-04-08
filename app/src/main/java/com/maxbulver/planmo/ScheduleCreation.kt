package com.maxbulver.planmo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import kotlinx.android.synthetic.main.schedule_creation.*

enum class Reminjis {
    Storby,
    Bunnles,
    Cubilee,
    Hexapus,
    Zorb
}
enum class ScheduleType{
    Academic,
    Social,
    Volunteer
}
class ScheduleCreation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.schedule_creation)
        val Reminjispinner: Spinner = findViewById(R.id.reminjiSpinner)
        Reminjispinner.adapter = ArrayAdapter<Reminjis>(this,
            android.R.layout.simple_spinner_item, Reminjis.values())

        val spinner: Spinner = findViewById(R.id.typeSpinner)
        spinner.adapter = ArrayAdapter<ScheduleType>(this,
            android.R.layout.simple_spinner_item, ScheduleType.values())

        val completeButton: Button = findViewById(R.id.completeButton)
        completeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
