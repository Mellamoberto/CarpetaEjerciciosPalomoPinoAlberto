package com.example.primerospasos.funciones

fun numeroMayor (x: Int, y: Int): Int {
    var c: Int = 0

    if (x>y) {
        c = x
        println("El numero mayor es $c")
    } else if (y>x) {
        c = y
        println("El numero mayor es $c")
    } else {
        println("Son iguales")
    }
    return c
}

fun main() {
    print("Ingresa el valor del primer numero: ")
    var x = readln().toInt()
    print("Ingresa el valor del segundo numero: ")
    var y = readln().toInt()

    numeroMayor(x, y)
}