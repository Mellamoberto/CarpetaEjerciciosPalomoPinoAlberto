package com.example.primerospasos.bucles

fun main() {

    print("Ingresa la coordenada x: ")
    var x = readln().toInt()

    print("Ingresa la coordenada y: ")
    var y = readln().toInt()


    when {
        x > 0 && y > 0 -> println("1º Cuadrante")
        x < 0 && y > 0 -> println("2º Cuadrante")
        x < 0 && y < 0 -> println("3º Cuadrante")
        x > 0 && y < 0 -> println("4º Cuadrante")
        x == 0 && y != 0 -> println("Esta en el eje y")
        x != 0 && y == 0 -> println("Esta en el eje x")
        x == 0 && y == 0 -> println("Esta en el (0,0)")
    }

}