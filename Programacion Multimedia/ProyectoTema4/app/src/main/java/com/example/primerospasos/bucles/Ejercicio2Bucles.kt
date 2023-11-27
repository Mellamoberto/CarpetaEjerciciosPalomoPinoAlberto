package com.example.primerospasos.bucles

fun main() {
    var continuar = true

    while (continuar) {
        print("Ingrese un número entre 0 y 999 (o 0 para salir): ")
        val numero = readLine()?.toIntOrNull()

        when {
            numero == null -> println("Ingresa un número válido.")
            numero == 0 -> {
                println("Saliendo del programa.")
                continuar = false
            }
            numero in 1..9 -> println("El número tiene 1 dígito.")
            numero in 10..99 -> println("El número tiene 2 dígitos.")
            numero in 100..999 -> println("El número tiene 3 dígitos.")
            numero in 1000 .. 9999 -> println("El número tiene 4 digitos.")
            else -> println("Número fuera del rango especificado.")
        }
    }
}