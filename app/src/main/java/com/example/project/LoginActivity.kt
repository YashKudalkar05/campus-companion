package com.example.project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.project.MainActivity
import com.example.project.R
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            // Handle login
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
