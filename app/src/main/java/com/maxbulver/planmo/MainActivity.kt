package com.maxbulver.planmo

import android.app.ActivityOptions
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val masterButton: Button = findViewById(R.id.masterButton)
        masterButton.setOnClickListener {
            val intent = Intent(this, MasterPage::class.java)
            startActivity(intent)
        }
        val engButton: Button = findViewById(R.id.engButton)
        engButton.setOnClickListener {
            val intent = Intent(this, EngClass::class.java)
            startActivity(intent)
        }
        val oneButton: Button = findViewById(R.id.oneButton)
        oneButton.setOnClickListener {
            val intent = Intent(this, ClassTwo::class.java)
            startActivity(intent)
        }
        val taskButton: Button = findViewById(R.id.taskButton)
        taskButton.setOnClickListener {
            val intent = Intent(this, TaskCreation::class.java)
            startActivity(intent)
        }
    }
}

