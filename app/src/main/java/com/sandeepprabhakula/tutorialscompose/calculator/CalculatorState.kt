package com.sandeepprabhakula.tutorialscompose.calculator

data class CalculatorState(
    val number1:String = "",
    val number2:String = "",
    val operation:CalculatorOperation?=null
)
