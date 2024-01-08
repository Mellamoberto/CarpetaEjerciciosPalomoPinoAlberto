package com.example.primerospasos.bucles

fun main() {

    var numTotal : Int = 0
    var suma : Int = 0
    var programa : Boolean = true

    if (programa) {
        for (i in 1 .. 10) {
            print("Ingresa un numero: ")
            var num : Int = readln()?.toInt() ?: 0
            numTotal++
            suma += num
            val promedio = String.format("%.2f", suma.toDouble() / numTotal)
            println("Hay $numTotal numeros cargados en el programa")
            println("La suma de los numeros es: $suma")
            println("El promedio de los numeros es: $promedio")
            println("Te quedan por ingresar ${10-numTotal} numeros")
            println()
        }
    }

    println("Fin del programa. No se pueden cargar más números")

}