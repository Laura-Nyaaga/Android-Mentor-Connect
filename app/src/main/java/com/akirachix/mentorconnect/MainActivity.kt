package com.akirachix.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView3 = findViewById<TextView>(R.id.textView3)
        textView3.setOnClickListener {
            val intent = Intent( this, SignInPage::class.java)
            startActivity(intent)
        }

    }
}