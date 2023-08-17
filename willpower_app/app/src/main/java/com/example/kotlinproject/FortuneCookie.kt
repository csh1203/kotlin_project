package com.example.kotlinproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class FortuneCookie: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fortune_cookie)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, FortuneResultActivity::class.java)
            startActivity(intent)
        }, 2000)
    }
}