package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the inputs from EditText
        // create a variable and associate it to the user input

        val userWeight = findViewById<TextInputEditText>(R.id.edt_weight)
        val userHeight = findViewById<TextInputEditText>(R.id.edt_height)
        val btnGenerateBmi = findViewById<Button>(R.id.btn_generate_bmi)

        btnGenerateBmi.setOnClickListener {
            val weightInput = userWeight.text
            val heightInput = userHeight.text
            println("test btn" + weightInput + " " + heightInput)
        }



    }
}