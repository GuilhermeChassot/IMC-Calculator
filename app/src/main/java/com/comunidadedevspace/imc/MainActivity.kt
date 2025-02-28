package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val button = findViewById<Button>(R.id.btncalcular)

        button.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text
            println("acao do botao"  + peso)
            println("acao do botao"  + altura)



        }



    }
}