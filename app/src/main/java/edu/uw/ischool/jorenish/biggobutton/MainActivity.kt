package edu.uw.ischool.jorenish.biggobutton

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var gobutton: Button
    private var pushCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gobutton = findViewById(R.id.gobutton)
        gobutton.setOnClickListener {
            pushCount++
            val pushText = "You have pushed me $pushCount time${if (pushCount == 1) "" else "s"}!"
            gobutton.text = pushText

            val randomBGColor = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            gobutton.setBackgroundColor(randomBGColor)

            val randomTextColor = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            gobutton.setTextColor(randomTextColor)
        }
    }
}