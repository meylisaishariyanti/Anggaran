package com.example.nirlaba

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin2 = findViewById<Button>(R.id.btnLogin2)

        btnLogin2.setOnClickListener{
            val i: Intent = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
    }
}