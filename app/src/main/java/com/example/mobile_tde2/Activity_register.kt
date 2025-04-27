package com.example.mobile_tde2


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val userTypeGroup = findViewById<RadioGroup>(R.id.userTypeGroup)
        val donorRadio = findViewById<RadioButton>(R.id.donorRadio)
        val ongRadio = findViewById<RadioButton>(R.id.ongRadio)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val cityEditText = findViewById<EditText>(R.id.cityEditText)
        val stateEditText = findViewById<EditText>(R.id.stateEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val createButton = findViewById<Button>(R.id.createButton)
        val helpText = findViewById<TextView>(R.id.helpText)

        createButton.setOnClickListener {
            val selectedUserTypeId = userTypeGroup.checkedRadioButtonId
            val userType = when (selectedUserTypeId) {
                R.id.donorRadio -> "Doador"
                R.id.ongRadio -> "ONG"
                else -> ""
            }
            val name = nameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val phone = phoneEditText.text.toString().trim()
            val city = cityEditText.text.toString().trim()
            val state = stateEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (userType.isEmpty()) {
                Toast.makeText(this, "Selecione o tipo de usuário (Doador ou ONG)", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || city.isEmpty() || state.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Cadastro realizado com sucesso!\nTipo: $userType\nNome: $name\nEmail: $email", Toast.LENGTH_LONG).show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        //
        helpText.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}