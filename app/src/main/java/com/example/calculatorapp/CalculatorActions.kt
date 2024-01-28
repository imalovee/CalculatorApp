package com.example.calculatorapp
//Actions/click events the user will perform on the app, to be sent to the viewModel
 sealed class CalculatorAction {
     data class Number(val number : Int) : CalculatorAction()
     object clear : CalculatorAction()
     object delete : CalculatorAction()
     object decimal : CalculatorAction()
     object calculate : CalculatorAction()
     data class operation(val operation: CalculatorOperation): CalculatorAction()
}