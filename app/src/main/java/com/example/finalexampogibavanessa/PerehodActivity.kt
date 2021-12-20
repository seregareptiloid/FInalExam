package com.example.finalexampogibavanessa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class PerehodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perehod)

        val back = findViewById<Button>(R.id.back)

        back.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

        val animation = findViewById<Button>(R.id.animation)

        animation.setOnClickListener{
            startActivity(Intent(this,AnimationActivity::class.java))
        }

    }
}