package com.example.primerospasos

fun main() {
    for (a in 0..10 step 2) {
        print("$a ")
    }

    println()

    for (b in 10 downTo 0 step 2) {
        print("$b ")
    }

    println()
    println()

    println("Tabla de multiplicar del 5 usando bucle for:")
    for(i in 1 .. 10) {
        val resultado = 5 * i
        println("5 * $i = $resultado")
    }

    println()

    println("Tabla de multiplicar del 8 usando bucle hacia atras for:")
    for(i in 10 downTo 1) {
        val resultado = 8 * i
        println("8 * $i = $resultado")
    }

    println()

    println("Tabla de multiplicar del 2 usando while:")
    var j = 1
    while (j <= 10) {
        var resultado = 2 * j
        println("2 * $j = $resultado")
        j++
    }

    println()

    println("Tabla de multiplicar del 2 usando do while:")

    var i = 1
     do {

        var resultado = 2 * i
        println("2 * $i = $resultado")
        i++
    }while (i <= 10)
}
