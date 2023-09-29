package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    private var cont = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton1)
        boton.setOnClickListener {
            cont++
            when (cont) {
                1 -> {
                    boton.text = "Ha hecho click una vez!"
                }
                2 -> boton.text = "Ha hecho click dos veces!"
                in 3..4 -> {
                    "Ha hecho click $cont veces!"
                    boton.textSize = 24.0F
                }
                in 5..9 -> {
                    boton.textSize = 22.0F
                    boton.text = "Ha hecho click varias veces ($cont)!"
                }
                10 -> boton.text = "Te has pasado de clicks!"

            }
        }


    }
}


