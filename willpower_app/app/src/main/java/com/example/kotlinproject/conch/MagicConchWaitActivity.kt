package com.example.kotlinproject.conch

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinproject.R
import com.example.kotlinproject.fortune.FortuneResultActivity

class MagicConchWaitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.magic_conch_wait_activity)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MagicConchResultActivity::class.java)
            startActivity(intent)
        }, 2000)

    }
}