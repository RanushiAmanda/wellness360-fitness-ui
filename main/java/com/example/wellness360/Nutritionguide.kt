package com.example.wellness360

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Nutritionguide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nutritionguide)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Initialize the button
        val buttonGoHome = findViewById<Button>(R.id.gohome)

        // Set up the OnClickListener to navigate to another activity when clicked
        buttonGoHome.setOnClickListener {
            // Intent to navigate to another activity
            val intent = Intent(this, DashBoard::class.java)  // Replace HomeActivity with your target activity
            startActivity(intent)
        }
    }
}