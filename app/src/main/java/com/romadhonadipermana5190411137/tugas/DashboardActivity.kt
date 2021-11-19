package com.romadhonadipermana5190411137.tugas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val intent = getIntent()
        val username = intent.getStringExtra("username")

        val txtNama = findViewById<TextView>(R.id.txt_nama)
        txtNama.text = "Hai, " + username + "!"

        var btnLogout = findViewById<Button>(R.id.btn_logout)
        btnLogout.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}