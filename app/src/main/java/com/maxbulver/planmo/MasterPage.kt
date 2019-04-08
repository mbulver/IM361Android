package com.maxbulver.planmo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import kotlinx.android.synthetic.main.master_view.*

class MasterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.master_view)
        val createButton: Button = findViewById(R.id.createButton)
        createButton.setOnClickListener {
            val intent = Intent(this, ScheduleName::class.java)
            startActivity(intent)
        }
    }
}