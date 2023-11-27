package com.example.primerospasos.condicional

fun main() {
    print("Ingresa un numero ")
    var num1 = readln().toInt()

    print("Ingresa el segundo numero ")
    var num2 = readln().toInt()

    while (num1 == num2) {
        println("Son el mismo numero. Cambia el primero: ")
        num1 = readln().toInt()
    }

    if (num1 > num2) {
        var numMayor = num1
        println("El numero mayor es $numMayor")
    } else if (num2 > num1) {
        var numMayor = num2
        println("El numero mayor es $numMayor")
    }
}