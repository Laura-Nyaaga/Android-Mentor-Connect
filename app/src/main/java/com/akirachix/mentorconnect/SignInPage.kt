package com.akirachix.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorconnect.databinding.ActivitySignInPageBinding

class SignInPage : AppCompatActivity() {
    lateinit var binding: ActivitySignInPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInPageBinding.inflate(layoutInflater)
        this.setContentView(binding.root)

        binding.textView4.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            validateLogIn()
        }

    }

    fun validateLogIn() {
        deleteErrors()
        var pageError = false
        val name = binding.etUserLogIn.text.toString()
        if (name.isBlank()) {
            pageError = true
            binding.tilUserLogIn.error = getString(R.string.username_required)
        }

        val passwordLogin = binding.etPasswordLogIn.text.toString()
        if (passwordLogin.isBlank()) {
            pageError = true
            binding.tilPasswordLogIn.error = getString(R.string.password_required)
        }

    }

    fun deleteErrors() {
        binding.tilUserLogIn.error = null
        binding.tilPasswordLogIn.error = null
    }
}