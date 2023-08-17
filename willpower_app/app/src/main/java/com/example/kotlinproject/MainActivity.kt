package com.example.kotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 버튼들 불러오기
        val fortuneButton = findViewById<Button>(R.id.fortune_button)

        // 버튼 누르면 각각의 화면으로 가기
        fortuneButton.setOnClickListener{
            val intent = Intent(this, FortuneCookie::class.java)
            startActivity(intent)
        }

    }

}