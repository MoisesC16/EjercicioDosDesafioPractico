package com.example.ejerciciodosdesafiopractico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.btn_cal)

        calcular.setOnClickListener { realizarCalculo() }
    }

    private fun realizarCalculo() {

        val nombre = findViewById<EditText>(R.id.nombre)
        val sueldo = findViewById<EditText>(R.id.sueldo)

        val nom=nombre.text.toString()
        val suel:Double=sueldo.text.toString().toDouble()
        val resultado = findViewById<TextView>(R.id.res)

        var sal:Double=(((suel)-(suel*0.03)-(suel*0.04)-(suel*0.05)))



        resultado.text="Hola $nom tu salario neto es $sal"

    }
}