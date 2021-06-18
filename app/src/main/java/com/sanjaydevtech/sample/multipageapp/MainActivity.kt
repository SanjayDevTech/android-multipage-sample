package com.sanjaydevtech.sample.multipageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sanjaydevtech.sample.multipageapp.intent.IntentDemoActivity
import com.sanjaydevtech.sample.multipageapp.nav.NavDemoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.intentBtn).setOnClickListener {
            val intent = Intent(this, IntentDemoActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.navComBtn).setOnClickListener {
            val intent = Intent(this, NavDemoActivity::class.java)
            startActivity(intent)
        }
    }
}