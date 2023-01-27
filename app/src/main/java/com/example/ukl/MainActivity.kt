package com.example.ukl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisial atribut pada tampilan login
        val etEmail     : EditText = findViewById(R.id.et_email)
        val btnLoginSubmit : Button = findViewById(R.id.bt_login_submit)

        //menambahkan action button pada form login
        btnLoginSubmit.setOnClickListener(View.OnClickListener {
                Toast.makeText(this, "Yeeaa! Login Kamu Berhasil", Toast.LENGTH_SHORT).show()
            val textEmail = etEmail.text.toString()
                val moveIntent = Intent(this@MainActivity,Welcome::class.java)
                moveIntent.putExtra("email", textEmail)
                startActivity(moveIntent)
        })
    }
}