package com.chandravir.customnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navView = findViewById(R.id.bottom_nav_view)

        navView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home-> Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show()
                R.id.payment-> Toast.makeText(this@MainActivity, "Payment", Toast.LENGTH_SHORT).show()
                R.id.myTask-> Toast.makeText(this@MainActivity, "My Task", Toast.LENGTH_SHORT).show()
                R.id.profile-> Toast.makeText(this@MainActivity, "Profile", Toast.LENGTH_SHORT).show()

            }
            true
        }

    }
}