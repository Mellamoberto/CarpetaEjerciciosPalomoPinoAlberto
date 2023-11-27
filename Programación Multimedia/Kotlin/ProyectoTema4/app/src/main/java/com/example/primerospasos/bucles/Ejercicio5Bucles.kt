package com.example.primerospasos.bucles

fun main() {

    var totalNotas = 0
    var menor = 0
    var mayor = 0

    while (totalNotas < 10) {
        print("Ingresa una nota: ")
        var nota = readln().toDouble()

        when {
            nota == 0.0 -> {
                println("Saliendo del programa.")
                break
            }
            nota in 0f..6.9f -> {
                println("Menor a 7")
                menor++
                totalNotas++
                println("Las notas introducidas han sido: $totalNotas")
                println(
                    "El numero de notas mayores o iguales que 7 " +
                            "es de $mayor." +
                            "\nEl numero de notas menores que 7 es de " +
                            "$menor"
                )
                println()
            }

            nota in 7f..10f -> {
                println("Mayor o igual a 7")
                mayor++
                totalNotas++
                println("Las notas introducidas han sido: $totalNotas")
                println(
                    "El numero de notas mayores o iguales que 7 " +
                            "es de $mayor." +
                            "\nEl numero de notas menores que 7 es de " +
                            "$menor"
                )
                println()
            }
        }
    }
    println("El resultado final es de:" +
            "\n\tMayores e iguales: $mayor" +
            "\n\tMenores: $menor")
}


