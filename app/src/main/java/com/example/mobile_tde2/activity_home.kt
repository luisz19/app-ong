package com.example.mobile_tde2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    private lateinit var btnQueroDoar: Button
    private lateinit var btnCadastrarOng: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnQueroDoar = findViewById(R.id.btn_quero_doar)
        btnCadastrarOng = findViewById(R.id.btn_cadastrar_ong)

        btnQueroDoar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnCadastrarOng.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
