package com.example.primerospasos.bucles

fun main() {

    var totalNotas = 0
    var suma = 0

    for (i in 1..3) {
        print("Ingresa la nota $i: ")
        var nota = readln().toInt()
        suma += nota
        totalNotas++
    }

    println("La suma es $suma.")
    var promedio = suma/3
    println("El promedio es $promedio")

    when {
        promedio >= 7 -> println("Promocionado")
        promedio in 4..7 -> println("Regular")
        promedio <4 -> println("Reprobado")
    }

}