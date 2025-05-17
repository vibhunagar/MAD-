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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val registerBTN = findViewById<Button>(R.id.registerBTN);
        val r_name = findViewById<EditText>(R.id.register_name);
        val r_email = findViewById<EditText>(R.id.register_email);
        val r_pass = findViewById<EditText>(R.id.register_password);
        val r_alreadyloged = findViewById<TextView>(R.id.login_redirect_text);

        r_alreadyloged.setOnClickListener{
            val loginIntent = Intent(this,login::class.java)
            startActivity(loginIntent)
            finish()
        }

        fun ToastMaker(string: String){
            Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
        }


        registerBTN.setOnClickListener{
            if (r_name.text.length < 2){
               ToastMaker("Enter valid name")
            }else if (r_email.text.length < 7){
                ToastMaker("Enter valid email")
            }else if (r_pass.text.length < 8){
                ToastMaker("Enter valid password")
            }else {
            ToastMaker("Success")
            }
        }
    }
}