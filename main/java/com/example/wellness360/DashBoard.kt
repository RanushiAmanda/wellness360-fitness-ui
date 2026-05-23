package com.example.wellness360

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashBoard : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        // Set up Bottom Navigation
        bottomNavigationView = findViewById(R.id.bottomNavigation)

        // Default fragment to show when app starts
        if (savedInstanceState == null) {
            replaceFragment(Fragment1()) // Default fragment
        }

        // Set listener to handle bottom navigation item selection
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_fragment1 -> replaceFragment(Fragment1())
                R.id.navigation_fragment2 -> replaceFragment(Fragment2())
                R.id.navigation_fragment3 -> replaceFragment(Fragment3())
                R.id.navigation_fragment4 -> replaceFragment(Fragment4())
            }
            true
        }
    }

    // Function to replace the fragment
    private fun replaceFragment(fragment: Fragment) {
        // Avoid fragment replacement if the same fragment is selected
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        // Check if the fragment is already in the fragment manager to avoid multiple instances
        val existingFragment = supportFragmentManager.findFragmentByTag(fragment::class.java.simpleName)
        if (existingFragment == null) {
            fragmentTransaction.replace(R.id.nav_host_fragment, fragment, fragment::class.java.simpleName)
            fragmentTransaction.commit()
        }
    }
}
