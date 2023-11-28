package com.example.primerospasos.funciones

import kotlin.random.Random

fun sumar(a: Int, b: Int): Int {
    var resultado = a + b
    return resultado
}

fun resta(a: Int, b: Int): Int {
    var resultado = a - b
    return resultado
}

fun multi(a: Int, b: Int): Int {
    var resultado = a * b
    return resultado
}

fun division(a: Int, b: Int): Int {
    var resultado = a / b
    return resultado
}

fun jugarPiedraPapelTijera() {
    print(
        "Vamos a jugar una partida a piedra papel tijera." +
                "\nElige: 1-Piedra / 2-Papel / 3-Tijera"
    )

    var eleccion2: Int? = readLine()?.toInt()

    if (eleccion2 in 1..3) {
        var random = Random.nextInt(1, 4)
        when (eleccion2) {
            1 -> println("Piedra")
            2 -> println("Papel")
            3 -> println("Tijera")
        }
        println("$eleccion2 VS $random")

        when {
            eleccion2 == random -> println("Empate")
            (eleccion2 == 1 && random == 3) ||
                    (eleccion2 == 3 && random == 2) ||
                    (eleccion2 == 2 && random == 1) -> println("Has ganado")
            else -> println("Has perdido")
        }
    }
}

/*
fun calcularFibonacci(): Int {
    println("Introduce un numero: ")
    var actual = readLine()?.toInt() ?: 0
    var anterior: Int = 0
    var siguiente: Int = 1

    println("Secuencia de Fibonacci:")
    for (i in 2 until actual) { // Empezamos desde el tercer término de la secuencia
        print("$anterior ")
        val suma = anterior + siguiente
        anterior = siguiente
        siguiente = suma
    }
    println()

    return actual
}
*/


fun main() {

    var continuar: Boolean = false

    print("Bienvenido al programa de operaciones.")

    while (continuar == false) {
        print("\nIndicame un numero: ")
        var numero1 = readLine()?.toIntOrNull() ?: 0
        print("Indicame otro numero: ")
        var numero2 = readLine()?.toIntOrNull() ?: 0

        println(
            "¿Qué quieres hacer con estos números?" +
                    "\n\t 0 - Salir del programa" +
                    "\n\t 1 - Sumar" +
                    "\n\t 2 - Restar" +
                    "\n\t 3 - Multiplicar" +
                    "\n\t 4 - Dividir" +
                    "\n\t 5 - Jugar: Piedra, Papel, Tijera" +
                    "\n\t 6 - Fibonacci"
        )

        var eleccion = readLine()?.toIntOrNull() ?: 0

        when {
            eleccion == 0 -> {
                println("Saliendo del programa")
                println()
                continuar = true
            }

            eleccion == 1 -> {
                var resultado = sumar(numero1, numero2)
                println("La suma es $resultado")
                println()
                continuar = false
            }

            eleccion == 2 -> {
                var resultado = resta(numero1, numero2)
                println("La resta es $resultado")
                println()
                continuar = false
            }

            eleccion == 3 -> {
                var resultado = multi(numero1, numero2)
                println("El producto es $resultado")
                println()
                continuar = false
            }

            eleccion == 4 -> {
                var resultado = division(numero1, numero2)
                println("La division es $resultado")
                println()
                continuar = false
            }

            eleccion == 5 -> jugarPiedraPapelTijera()

         //   eleccion == 6 -> calcularFibonacci()
        }
    }
}