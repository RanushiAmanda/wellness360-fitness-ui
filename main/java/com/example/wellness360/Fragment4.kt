package com.example.wellness360

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class Fragment4 : Fragment(R.layout.fragment_4) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Assuming your button ID in fragment_4.xml is "button3"
        view.findViewById<View>(R.id.button10).setOnClickListener {
            // Create an Intent to navigate to the SignInActivity
            val intent = Intent(activity, LoginActivity::class.java)

            // Start the SignInActivity
            startActivity(intent)
        }
    }
}
