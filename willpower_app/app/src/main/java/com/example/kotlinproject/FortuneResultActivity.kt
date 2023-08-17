package com.example.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.kotlinproject.api.service.Fortune
import com.example.kotlinproject.api.service.FortuneService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FortuneResultActivity : AppCompatActivity() {

    val BASE_URL = "http://10.0.2.2:8080"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fortune_result)

        val resultTextView = findViewById<TextView>(R.id.resutl_textview)
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val fortuneService = retrofit.create(FortuneService::class.java)

        val callFortuneDto = fortuneService.getFortune()
        callFortuneDto.enqueue(object : Callback<Fortune> {
            override fun onResponse(call: Call<Fortune>, response: Response<Fortune>) {
                val dto = response.body() as Fortune
                dto?.let {
                    resultTextView.text = dto.content // 포춘쿠키 결과
                }
            }

            override fun onFailure(call: Call<Fortune>, t: Throwable) {
                Log.d("mytag", t.toString())
            }

        })
    }
}