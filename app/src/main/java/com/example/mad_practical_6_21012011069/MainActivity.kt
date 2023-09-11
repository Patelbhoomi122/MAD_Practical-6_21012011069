package com.example.mad_practical_6_21012011069

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val start= findViewById<Button>(R.id.play_button)
        start.setOnClickListener {
            Intent(applicationContext,MyService::class.java).putExtra(MyService.playerconstant,"fhg").apply {
                startService(this)
            }
        }
        val stop=findViewById<Button>(R.id.stop_button)
        stop.setOnClickListener {
            Intent(applicationContext,MyService::class.java).putExtra(MyService.playerconstant,"fhg").apply {
                stopService(this)
            }
        }

    }
    }

