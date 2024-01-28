package com.example.calculatorapp
//operations which are a part of the user actions and called in the "CalculatorAction class
sealed class CalculatorOperation(val symbol : String) {
   object add : CalculatorOperation("+")
    object subtract : CalculatorOperation("-")
    object multiply : CalculatorOperation("x")
    object percentage : CalculatorOperation("%")
    object divide : CalculatorOperation("/")
    object sqrt : CalculatorOperation("√")
    object reciprocal : CalculatorOperation("1/x")
 object raiseToPower2 : CalculatorOperation("^2")
 object Pi : CalculatorOperation("π")
 object exponential : CalculatorOperation("e")
 object exponent : CalculatorOperation("^")


}