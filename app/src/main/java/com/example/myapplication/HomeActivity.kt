package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    lateinit var testHome : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var intentStarted = intent;

        testHome = findViewById(R.id.testHome)
        var extras = intentStarted.extras

        var data = extras?.getString("harmankey")

        testHome = findViewById(R.id.testHome)
        //set the text/string that you got from the previous step

        //tvHome.setText(data)
        testHome.text = data

    }




    fun clickHandler(view: View) {
        var hIntent = Intent(this, MainActivity::class.java)
        startActivity(hIntent)
    }

}