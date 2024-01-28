package com.example.calculatorapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewmodel : ViewModel() {
    var state by mutableStateOf(CalculatorState())


    fun onAction(action: CalculatorAction) {
        when(action) {
       is CalculatorAction.decimal -> enterDecimal()
            is CalculatorAction.calculate -> calculate()
         is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.delete -> delete()
            is CalculatorAction.clear -> state = CalculatorState()
            is CalculatorAction.operation -> enterOperation(action.operation)
                }
    }


    private fun enterOperation(operation: CalculatorOperation) {
        if(state.number1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }

    private fun calculate() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if(number1 != null && number2 != null) {
            val result = when(state.operation) {
                is CalculatorOperation.add -> number1 + number2
                is CalculatorOperation.subtract -> number1 - number2
                is CalculatorOperation.multiply -> number1 * number2
                is CalculatorOperation.divide -> number1 / number2
                is CalculatorOperation.Pi -> Math.PI * number1 // Assuming multiplication with Pi
                is CalculatorOperation.reciprocal -> 1.0 / number1
                is CalculatorOperation.sqrt -> Math.sqrt(number1)
                is CalculatorOperation.raiseToPower2 -> Math.pow(number1, 2.0)
                is CalculatorOperation.exponential -> Math.exp(number1) // Handle 'e' as the base of the natural logarithm
                is CalculatorOperation.exponent -> Math.pow(number1, number2)
                null -> return
                else -> {
                    return
                }
            }
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            )
        }
    }

    private fun delete() {
        when {
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operation != null -> state = state.copy(
                operation = null
            )
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun enterDecimal() {
        if(state.operation == null && !state.number1.contains(".") && state.number1.isNotBlank()) {
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        } else if(!state.number2.contains(".") && state.number2.isNotBlank()) {
            state = state.copy(
                number2 = state.number2 + "."
            )
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operation == null) {
            if(state.number1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
        if(state.number2.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )
    }

    companion object {
        private const val MAX_NUM_LENGTH = 8
    }
}
