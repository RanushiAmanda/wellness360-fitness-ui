package com.example.wellness360

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class Fragment3 : Fragment(R.layout.fragment_3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize the button after the view is created
        val button = view.findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            // Show a Toast notification
            Toast.makeText(requireContext(), "Navigating to Pushups Activity", Toast.LENGTH_LONG).show()

            // Navigate to Pushups Activity
            val intent = Intent(requireContext(), Pushups::class.java)
            startActivity(intent)
        }
    }
}
