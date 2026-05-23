package com.example.wellness360

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.login)

        val btn = findViewById<Button>(R.id.btnLogin)
        btn.setOnClickListener {
            val intent = Intent(this,DashBoard::class.java)
            startActivity(intent)
        }

        val btn1 = findViewById<TextView>(R.id.textView12)
        btn1.setOnClickListener {
            val intent1 = Intent(this,Signup::class.java)
            startActivity(intent1)
        }
    }
}