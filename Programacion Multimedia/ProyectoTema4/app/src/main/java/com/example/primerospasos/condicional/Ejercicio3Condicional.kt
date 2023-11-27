package com.example.primerospasos.condicional

fun main() {
    print("Ingresa el primer numero: ")
    val num1: Int? = readln()?.toInt()

    print("Ingresa el segundo numero: ")
    val num2: Int? = readln()?.toInt()

    if (num1 != null && num2 != null) {
        if (num1 < num2) {
            val suma = num1 + num2
            val resta = num2 - num1
            println("Suma: $suma")
            println("Resta: $resta")
        } else {
            val multi = num1 * num2
            val division = num1 / num2
            println("Producto: $multi")
            println("División: $division")
        }
    } else {
        println("Numeros no validos.")
    }
}