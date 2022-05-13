package com.example.nirlaba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignup = findViewById<Button>(R.id.btnSignUp)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnSignup.setOnClickListener{
            val i: Intent = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }

        btnLogin.setOnClickListener{
            val i: Intent = Intent(this, SignupActivity::class.java)
            startActivity(i)
        }
    }
}