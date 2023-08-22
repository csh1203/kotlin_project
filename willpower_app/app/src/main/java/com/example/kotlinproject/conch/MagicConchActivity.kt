package com.example.kotlinproject.conch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.kotlinproject.R

class MagicConchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.magic_conch_main_layout)

        val ask_button = findViewById<Button>(R.id.conch_ask_button)

        ask_button.setOnClickListener {
            val intent = Intent(this, MagicConchWaitActivity::class.java)
            startActivity(intent)
        }
    }
}