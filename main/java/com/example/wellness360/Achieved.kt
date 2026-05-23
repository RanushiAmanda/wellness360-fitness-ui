package com.example.wellness360

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Achieved : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_achieved)

        // Apply window insets for edge-to-edge support
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the button by its ID
        val buttonFinish = findViewById<Button>(R.id.button9)

        // Set an OnClickListener to navigate to the next activity when the button is clicked
        buttonFinish.setOnClickListener {
            // Intent to navigate to the next activity (e.g., `NextActivity`)
            val intent = Intent(this, Nutritionguide::class.java)
            startActivity(intent)
        }
    }
}
