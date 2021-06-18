package com.sanjaydevtech.sample.multipageapp.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sanjaydevtech.sample.multipageapp.R

class IntentTargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_target)
        findViewById<Button>(R.id.finishBtn).setOnClickListener {
            finish()
        }
    }
}