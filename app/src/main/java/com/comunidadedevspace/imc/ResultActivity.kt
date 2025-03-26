package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

private operator fun String.invoke(value: Any) {

}

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)

        tvResult.text = result.toString()

        val classificacao: String? = if (result <= 18.5f){
            "magreza"

        }else if (result > 18.5f && result <= 24.9f){
            "normal"

        }else if (result >= 25f && result <= 29.9f){
            "sobrepeso"

        } else if (result >= 30f && result <= 34.9f){
            "Obesidade grau I"

        }else if (result >= 35f && result <= 39.9f){
            "Obesidade grau II"

        }else {
            "Obesidade grau III"

        }



        tvClassificacao.text = classificacao
    }
}