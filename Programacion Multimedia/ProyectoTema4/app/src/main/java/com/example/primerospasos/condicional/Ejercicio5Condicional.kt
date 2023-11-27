package com.example.primerospasos.condicional

fun main() {
    println("Di un numero: ")
    var num = readln().toInt()

    if (num != null) {
        val resultado: Int

        if (num % 2 == 0) {
            val mensaje: String
            mensaje = "Se calculó el cuadrado."
            val resultado: Int
            resultado = num * num
            println("$mensaje El resultado es: $resultado")
        } else {
            val mensaje: String
            mensaje = "Se calculó el cubo."
            val resultado: Int
            resultado = num * num * num
            println("$mensaje El resultado es: $resultado")

        }

    } else {
        println("Ese número no es válido.")
    }

}