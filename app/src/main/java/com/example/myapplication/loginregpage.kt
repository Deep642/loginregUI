package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loginregpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginregpage)

        val reg=findViewById<Button>(R.id.button)
        val Login=findViewById<Button>(R.id.button2)
       reg.setOnClickListener {
           val intent=Intent(this,Register::class.java)
           startActivity(intent)
       }
        Login.setOnClickListener {
            val intent=Intent(this,login::class.java)
            startActivity(intent)
        }
    }
}