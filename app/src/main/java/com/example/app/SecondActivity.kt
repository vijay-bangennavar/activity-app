package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var buBack=findViewById<Button>(R.id.buBack)
        buBack.setOnClickListener{
            backButtonHandler()
        }
    }

    override fun onBackPressed() {
        backButtonHandler()
        //super.onBackPressed()
        return
    }

    fun backButtonHandler(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Leave Application?")
        builder.setCancelable(false)
        builder.setMessage("Are you sure you want to leave the application?")
        builder.setPositiveButton("YES"){dialog, which ->
            //Toast.makeText(applicationContext,"OK",Toast.LENGTH_SHORT).show()
            var etNote=findViewById<EditText>(R.id.etNote)
            var Note=etNote.text.toString()
            var intent= Intent(this,MainActivity::class.java)
            intent.putExtra("note",Note)
            startActivity(intent)
            finish()
        }
        builder.setNegativeButton("NO"){ dialog,which ->
            dialog.cancel()
        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}
