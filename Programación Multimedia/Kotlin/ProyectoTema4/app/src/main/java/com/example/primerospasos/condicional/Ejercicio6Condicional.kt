package com.example.primerospasos.condicional

fun main() {
    var notaCurso1: Float
    var notaCurso2: Float
    var notaCurso3: Float

    do {
        print("Dime tu nota de mates: ")
        notaCurso1 = readln().toFloat()
        if (notaCurso1 > 10f) {
            println("La nota no puede ser mayor de 10")
        }
    } while (notaCurso1 > 10f)

    do {
        print("Dime tu nota de lengua: ")
        notaCurso2 = readln().toFloat()
        if (notaCurso2 > 10f) {
            println("La nota no puede ser mayor de 10")
        }
    } while (notaCurso2 > 10f)

    do {
        print("Dime tu nota de historia: ")
        notaCurso3 = readln().toFloat()
        if (notaCurso3 > 10f) {
            println("La nota no puede ser mayor de 10")
        }
    } while (notaCurso3 > 10f)


    var notaCurso = (notaCurso1 + notaCurso2 + notaCurso3) / 3

    println("Tu nota media es $notaCurso")

    if (notaCurso < 0) {
    } else if (notaCurso == 0f) {
        println("Ultra-Indeficiente")
    } else if (notaCurso > 0f && notaCurso < 5f) {
        println("Suspenso")
    } else if (notaCurso <= 5f && notaCurso < 6) {
        println("Suficiente")
    } else if (notaCurso >= 6f && notaCurso < 7f) {
        println("Bien")
    } else if (notaCurso >= 7f && notaCurso < 9f) {
        println("Notable")
    } else if (notaCurso >= 9f && notaCurso <= 10) {
        println("Sobresaliente")
    }

}