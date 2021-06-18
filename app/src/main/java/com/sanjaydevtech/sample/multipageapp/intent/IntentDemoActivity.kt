package com.sanjaydevtech.sample.multipageapp.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sanjaydevtech.sample.multipageapp.R

class IntentDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_demo)
        findViewById<Button>(R.id.navigateBtn).setOnClickListener {
            val intent = Intent(this, IntentTargetActivity::class.java)
            startActivity(intent)
        }
    }
}