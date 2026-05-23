package com.example.wellness360

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Beginner : AppCompatActivity() {
    lateinit var btnStart3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_beginner)

        btnStart3.setOnClickListener{

            val intent = Intent(this, Pushups::class.java)
            startActivity(intent)
        }

        }
    }