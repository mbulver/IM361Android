package com.maxbulver.planmo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onMapReady(map: GoogleMap?) {
        Log.i("Planmo","It's map time baby")
    }

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton: Button = findViewById(R.id.my_button)
        myButton.setOnClickListener {
            counter++
            myText.text = resources.getQuantityString(R.plurals.I_Been_Clicked, counter, counter)
        }
        val mapFragment = supportFragmentManager.findFragmentById(R.id.my_map_view) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }
}
