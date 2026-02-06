package com.guilhermechassot.myfirstapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val edtWeight = findViewById<TextInputEditText>(R.id.edtweight)
        val edtHeight = findViewById<TextInputEditText>(R.id.edtheight)
        val BtnCalculate = findViewById<Button>(R.id.btnCalculate)

        BtnCalculate.setOnClickListener {
            val weight: Float = edtWeight.text.toString().toFloat()
            val height: Float = edtHeight.text.toString().toFloat()

            val height2 = (height * height)
            val resultado = weight / height2
            
            println("Gui acao do botao" + resultado + "gui")



        }


    }
}