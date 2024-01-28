package com.example.calculatorapp
// creating a data class for the values that will change their state on the screen
data class CalculatorState(
    val number1 : String = "",
    val number2 : String = "",
    val operation: CalculatorOperation? = null
)
