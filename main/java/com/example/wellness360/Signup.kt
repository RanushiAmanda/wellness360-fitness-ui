package com.example.wellness360

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup) // This should be your login layout (activity_login.xml)

        // Initialize views
        val emailEditText = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val passwordEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)
        val signUpLink = findViewById<TextView>(R.id.textView12)

        // Handle Login Button click
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter both email and password", Toast.LENGTH_SHORT).show()
            } else {
                // Handle the login logic here (e.g., check credentials from a database or API)
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()

                // Redirect to the HomeActivity (or another page) after successful login
                val intent = Intent(this, DashBoard::class.java)
                startActivity(intent)
                finish() // Optionally finish this activity
            }
        }

        // Handle Sign Up link click
        signUpLink.setOnClickListener {
            // Redirect to SignUpActivity when "Sign Up" is clicked
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Optionally finish this activity
        }
    }
}
