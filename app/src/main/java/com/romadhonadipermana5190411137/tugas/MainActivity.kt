package com.romadhonadipermana5190411137.tugas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_username = findViewById<EditText>(R.id.et_username)
        var et_password = findViewById<EditText>(R.id.et_password)

        var btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            var uname = et_username.text.toString()
            var passwd = et_password.text.toString()
            if (uname.trim().isEmpty()){
                et_username.error = "Required"
                Toast.makeText(applicationContext, "Masukkan username!", Toast.LENGTH_SHORT).show()
            }else if (passwd.trim().isEmpty()){
                et_password.error = "Required"
                Toast.makeText(applicationContext, "Masukkan password!", Toast.LENGTH_SHORT).show()
            } else {
                var i = Intent(this, DashboardActivity::class.java)
                i.putExtra("username", uname.trim())
                startActivity(i)
                finish()
            }
        }
    }
}