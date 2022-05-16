package com.mgt.spotifyapiretrofit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private val textAddressEmail by lazy { findViewById<EditText>(R.id.textEmailAddress) }
    private val textPassword by lazy { findViewById<EditText>(R.id.textPassword) }
    private val buttonLogin by lazy { findViewById<Button>(R.id.button) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        accessLogin()
    }

    fun accessLogin() {
        buttonLogin.setOnClickListener {
            if (textAddressEmail.text.isNullOrEmpty().not() && textPassword.text.isNullOrEmpty()
                    .not()
            ) {
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()

            }
        }
    }
}