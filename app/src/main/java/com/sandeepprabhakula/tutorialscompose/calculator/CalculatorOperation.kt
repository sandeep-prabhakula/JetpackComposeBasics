package com.sandeepprabhakula.tutorialscompose.calculator

sealed class CalculatorOperation(val Symbol:String){
    object Add :CalculatorOperation("+")
    object Subtract :CalculatorOperation("-")
    object Multiply :CalculatorOperation("X")
    object Divide :CalculatorOperation("/")
}
