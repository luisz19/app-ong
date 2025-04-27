package com.example.mobile_tde2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityQuestions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val perguntasRespostas = listOf(
            Pair(R.id.btnPergunta1, R.id.txtResposta1),
            Pair(R.id.btnPergunta2, R.id.txtResposta2),
            Pair(R.id.btnPergunta3, R.id.txtResposta3),
            Pair(R.id.btnPergunta4, R.id.txtResposta4),
            Pair(R.id.btnPergunta5, R.id.txtResposta5),
            Pair(R.id.btnPergunta6, R.id.txtResposta6),
            Pair(R.id.btnPergunta7, R.id.txtResposta7),
            Pair(R.id.btnPergunta8, R.id.txtResposta8)
        )

        for ((btnId, txtId) in perguntasRespostas) {
            val button = findViewById<Button>(btnId)
            val textView = findViewById<TextView>(txtId)

            button.setOnClickListener {
                if (textView.visibility == View.GONE) {
                    textView.visibility = View.VISIBLE
                } else {
                    textView.visibility = View.GONE

                }
            }
        }
    }
}