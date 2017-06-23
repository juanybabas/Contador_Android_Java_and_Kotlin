package com.example.juan.contador_kotlin

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : Activity() {

    var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contador = 0
    }

    fun incrementacontador(vista: View) {
        contador++
        mostrarresultado()
    }

    fun restacontador(vista: View) {
        contador--
        mostrarresultado()
    }

    fun resetearcontador(vista: View) {
        contador = 0
        mostrarresultado()
    }

    fun mostrarresultado() {
        val textoresultado = findViewById(R.id.contadortexto) as TextView
        textoresultado.text = "" + contador
    }

}