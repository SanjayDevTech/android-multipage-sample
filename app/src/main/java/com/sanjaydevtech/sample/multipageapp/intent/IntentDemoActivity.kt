package com.sanjaydevtech.sample.multipageapp.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sanjaydevtech.sample.multipageapp.R

/**
 * Entry point Page for intent demo
 */
class IntentDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_demo)
        findViewById<Button>(R.id.navigateBtn).setOnClickListener {
            val intent = Intent(this, IntentTargetActivity::class.java)
            putDataIntoBundle(intent, "Happy coding :)")
            startActivity(intent)
        }
    }

    /**
     * you can demonstrate many methods for inserting data into bundle
     * @param intent    Intent instance
     * @param method    an integer that represents the method specified in [Stackoverflow page](https://stackoverflow.com/questions/768969/passing-a-bundle-on-startactivity)
     */
    private fun putDataIntoBundle(intent: Intent, data: String, method: Int = 2) {
        when(method) {
            0 -> {
                intent.extras?.apply {
                    putString("data", data)
                }
            }
            1 -> {
                val bundle = Bundle()
                bundle.putString("data", data)
                intent.putExtras(bundle)
            }
            2 -> {
                // I like this method: so simple
                intent.putExtra("data", data)
            }
            else -> {
                throw IllegalArgumentException("method is not equal to [0, 1, 2]")
            }
        }

    }
}