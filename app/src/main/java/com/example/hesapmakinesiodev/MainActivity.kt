package com.example.hesapmakinesiodev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var dataView: EditText
    private var input: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataView = findViewById(R.id.dataView)
        dataView.showSoftInputOnFocus = false //


        val buttons = listOf(
            R.id.btn_Zero, R.id.btn_One, R.id.btn_Two,
            R.id.btn_Three,R.id.btn_Four, R.id.btn_Five, R.id.btn_Six,
            R.id.btn_Eight, R.id.btn_Seven,
            R.id.btn_Nine, R.id.btn_Sum, R.id.btn_Mul,
            R.id.btn_Div, R.id.btn_Per, R.id.btn_Equals,
            R.id.btn_Dot, R.id.btn_Com, R.id.btn_Ac,
            R.id.btn_PlusSour, R.id.btn_Sum
        )

        buttons.forEach { id ->
            findViewById<Button>(id).setOnClickListener {
                onButtonClick(it as Button)
            }
        }
    }

    private fun onButtonClick(button: Button) {
        when (val text = button.text.toString()) {
            "=" -> calculateResult()
            "AC" -> {
                input = ""
                dataView.setText("")
            }
            else -> {
                val operators = listOf("+", "-", "*", "/", "%")
                if (text in operators) {
                    input += " $text "
                } else {
                    input += text
                }
                dataView.setText(input)
            }

        }
    }

    private fun calculateResult() {
        try {
            val result = evaluateExpression(input)
            dataView.setText(result.toString())
            input = result.toString()
        } catch (e: Exception) {
            dataView.setText("HATA")
        }
    }

    private fun evaluateExpression(expression: String): Double {
        val tokens = expression.split(" ").toMutableList()
        var index = 0

        while (index < tokens.size) {
            if (tokens[index] == "*" || tokens[index] == "/") {
                val left = tokens[index - 1].toDouble()
                val right = tokens[index + 1].toDouble()
                val result = if (tokens[index] == "*") left * right else left / right
                tokens[index - 1] = result.toString()
                tokens.removeAt(index) // operator
                tokens.removeAt(index) // right operand
                index -= 1
            } else {
                index += 1
            }
        }

        index = 0
        while (index < tokens.size) {
            if (tokens[index] == "+" || tokens[index] == "-") {
                val left = tokens[index - 1].toDouble()
                val right = tokens[index + 1].toDouble()
                val result = if (tokens[index] == "+") left + right else left - right
                tokens[index - 1] = result.toString()
                tokens.removeAt(index)
                tokens.removeAt(index)
                index -= 1
            } else {
                index += 1
            }
        }

        return tokens.first().toDouble()
    }

}