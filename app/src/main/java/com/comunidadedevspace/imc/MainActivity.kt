package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

            val weightInput: String = userWeight.text.toString()
            val heightInput: String = userHeight.text.toString()

            //added the two of them in different forms for educational purpose, understanding that ideally should be the same way
            if (weightInput == "" || heightInput.isEmpty()) {
                //message the user that the information is missing using Snackbar from android documentation
                Snackbar
                    .make(
                        userWeight,
                        "Please provide all information needed",
                        Snackbar.LENGTH_LONG
                    ).show()

            } else {

                val weightFloat = weightInput.toFloat()
                val heightFloat = heightInput.toFloat()
                val heightx2 = heightFloat * heightFloat
                val result = weightFloat / heightx2

                println("testing " + result)

            }

        }
    }
}