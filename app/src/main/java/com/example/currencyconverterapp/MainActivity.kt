package com.example.currencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainText:TextView = findViewById(R.id.maintext)
        val edt : EditText = findViewById(R.id.edt)
        val btnRupees : Button = findViewById(R.id.btn_rupees)
        val btnDollar : Button = findViewById(R.id.btn_dollar)

        btnRupees.setOnClickListener {
            val amount = edt.text.toString().toInt()
            mainText.text = "Converted Amount Into Rupees: " + (amount/80).toString()

        }
        btnDollar.setOnClickListener {
            val amount = edt.text.toString().toInt()
            mainText.text = "Converted Amount Into Dollar: " + (amount*80).toString()

        }
        }
}
