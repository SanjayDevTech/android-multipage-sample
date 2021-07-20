package com.sanjaydevtech.sample.multipageapp.intent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.sanjaydevtech.sample.multipageapp.R

class IntentTargetActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_target)

        val data = intent.extras?.get("data")
        val textView = findViewById<TextView>(R.id.textView)

        textView.text = "This is second activity ${if (data != null) "\nwith data: $data" else ""}"

        findViewById<Button>(R.id.finishBtn).setOnClickListener {
            finish()
        }
    }
}