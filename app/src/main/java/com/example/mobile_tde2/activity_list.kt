package com.example.mobile_tde2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ListActivity:AppCompatActivity() {
    private lateinit var btnFaq: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        btnFaq = findViewById(R.id.btnFAQ)


        btnFaq.setOnClickListener {
            startActivity(Intent(this, ActivityQuestions::class.java))
        }

    }
}