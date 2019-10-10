package com.example.przemek3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = intent
        var message = intent.getStringExtra("message2first")
        textView2.text=message

        button.setOnClickListener (){
        val intent1 = Intent(this, SecondActivity::class.java)
            intent1.putExtra("message2second", editText.text.toString())
        startActivity(intent1)



        }
    }
}
