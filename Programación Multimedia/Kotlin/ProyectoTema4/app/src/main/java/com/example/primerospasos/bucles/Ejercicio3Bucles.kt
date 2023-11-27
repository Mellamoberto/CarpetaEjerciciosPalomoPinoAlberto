package com.example.primerospasos.bucles

fun main() {
    var numTotal: Int = 1
    var suma: Int = 0
    var arrayNumeros = mutableListOf<Double>()
    var primeraSuma = true

    print("Ingresa un primer numero: ")
    var num: Double = readln()?.toDouble() ?: 0.0
    while (num == 0.0) {
        println("El numero 0 no vale. Ingresa otro distinto (no valen negativos): ")
        num = readln()?.toDouble() ?: 0.0
    }

    do {
        print("Ingresa otro numero para hacer el promedio: ")
        val num2 = readln()?.toDouble() ?: 0.0

        if (num2 != 0.0) {
            if (primeraSuma) {
                suma = (num + num2).toInt()
                arrayNumeros.add(num)
                arrayNumeros.add(num2)
                primeraSuma = false
            } else {
                suma += num2.toInt()
                arrayNumeros.add(num2)
            }

            val numerosCargados = arrayNumeros.joinToString(", ") { it.toInt().toString() }
            println("Números cargados en el programa: $numerosCargados")
            numTotal++
            println("El resultado de la suma es $suma. Se divide por $numTotal numeros " +
                    "cargados en el programa.")
            val promedio = String.format("%.2f", suma.toDouble() / numTotal)
            println("El promedio es: $promedio")
            println()
        } else {
            println("Saliendo del programa")
        }
    } while (num2 != 0.0)
}
