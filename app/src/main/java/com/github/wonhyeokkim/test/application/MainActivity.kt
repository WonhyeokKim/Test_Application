package com.github.wonhyeokkim.test.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread.sleep(3000)
        setContentView(R.layout.lobby)

        val button: Button = findViewById(R.id.greeting)

        button.setOnClickListener {
            finish()
        }
    }
}