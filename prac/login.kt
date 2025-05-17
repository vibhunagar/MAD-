package com.example.prac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val lBTN = findViewById<Button>(R.id.loginBTN);
        val lEmail = findViewById<EditText>(R.id.l_email);
        val lpass = findViewById<EditText>(R.id.l_pass);
        val lreg = findViewById<TextView>(R.id.register_redirect);

        lreg.setOnClickListener{
            val loginIntent = Intent(this,MainActivity::class.java)
            startActivity(loginIntent)
            finish()
        }


        fun ToastMaker(string: String){
            Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
        }
        lBTN.setOnClickListener {
            if (lEmail.text.length < 7) {
                ToastMaker("Enter valid email")
            } else if (lpass.text.length < 8) {
                ToastMaker("Enter valid password")
            } else {
                ToastMaker("Success" + lEmail.text.toString())
            }
        }
    }
}