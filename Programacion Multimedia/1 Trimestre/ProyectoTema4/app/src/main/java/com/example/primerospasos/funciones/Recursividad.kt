package com.example.primerospasos.funciones

fun sumaNaturales(n: Int): Int {
    return if (n <= 0) {
        0
    } else {
        n + sumaNaturales(n - 1)
    }
}

fun main() {
    print("Ingresa un numero para calcular la suma de los primeros n naturales")
    val numero = readLine()?.toIntOrNull() ?: 0

    if (numero >= 0) {
        val resultado = sumaNaturales(numero)
    }
}