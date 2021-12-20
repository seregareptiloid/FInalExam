package com.example.finalexampogibavanessa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val perehod = findViewById<LinearLayout>(R.id.linearLayout7)

        perehod.setOnClickListener{
            startActivity(Intent(this,PerehodActivity::class.java))
        }

    }
}