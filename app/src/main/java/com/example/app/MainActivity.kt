package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buNext=findViewById<Button>(R.id.buNext)
        buNext.setOnClickListener{
            var intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }

        val message = intent.getStringExtra("note")
        val textView = findViewById<TextView>(R.id.tvNote)
        textView.text=message

    }


}
