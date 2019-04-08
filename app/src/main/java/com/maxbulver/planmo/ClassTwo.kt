package com.maxbulver.planmo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
import kotlinx.android.synthetic.main.master_view.*

class ClassTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.schedule1)
        val viewTask: ImageButton = findViewById(R.id.taskView)
        viewTask.setOnClickListener {
            val intent = Intent(this, TaskView::class.java)
            startActivity(intent)
        }
    }
}