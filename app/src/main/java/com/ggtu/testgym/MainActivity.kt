package com.ggtu.testgym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val handler = Handler()
        handler.postDelayed({start()},5000)
    }

    private fun start(){
        val intent = Intent(this, Step1Activity::class.java)
        startActivity(intent)
    }

}