package com.maxbulver.planmo

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

enum class Times {
    There,
    Are,
    Supposed,
    To,
    Be,
    Times,
    Here,
    But,
    Numbers,
    Cant,
    Exist,
    In,
    Enums
}
enum class Dates {
    There,
    Are,
    Supposed,
    To,
    Be,
    Days,
    Here,
    But,
    Numbers,
    Cant,
    Exist,
    In,
    Enums
}

enum class TaskType {
    Mandatory,
    Voluntary,
    Social
}
enum class Day {
    AM,
    PM
}

enum class Priority {
    Low,
    Medium,
    High
}

class TaskCreation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task_creation)

        val Timespinner: Spinner = findViewById(R.id.timeSpinner)
            Timespinner.adapter = ArrayAdapter<Times>(this,
            android.R.layout.simple_spinner_item, Times.values()
        )
        val Time2spinner: Spinner = findViewById(R.id.time2Spinner)
        Time2spinner.adapter = ArrayAdapter<Times>(this,
            android.R.layout.simple_spinner_item, Times.values()
        )
        val Dayspinner: Spinner = findViewById(R.id.daySpinner)
        Dayspinner.adapter = ArrayAdapter<Day>(this,
            android.R.layout.simple_spinner_item, Day.values()
        )
        val Datespinner: Spinner = findViewById(R.id.dateSpinner)
        Datespinner.adapter = ArrayAdapter<Dates>(this,
            android.R.layout.simple_spinner_item, Dates.values()
        )
        val Date2spinner: Spinner = findViewById(R.id.date2Spinner)
        Date2spinner.adapter = ArrayAdapter<Dates>(this,
            android.R.layout.simple_spinner_item, Dates.values()
        )

        val eventspinner: Spinner = findViewById(R.id.eventSpinner)
        eventspinner.adapter = ArrayAdapter<TaskType>(this,
            android.R.layout.simple_spinner_item, TaskType.values()
        )

        val priorityspinner: Spinner = findViewById(R.id.prioritySpinner)
        priorityspinner.adapter = ArrayAdapter<Priority>(this,
            android.R.layout.simple_spinner_item, Priority.values()
        )

        val masterButton: Button = findViewById(R.id.mainButton)
        masterButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
