package com.example.przemek3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        var message = intent.getStringExtra("message2second")
        textView.text=message

        button2.setOnClickListener() {
            val intent2 = Intent(this, MainActivity::class.java)
            intent2.putExtra("message2first", editText2.text.toString())
            startActivity(intent2)

        }
    }
}
