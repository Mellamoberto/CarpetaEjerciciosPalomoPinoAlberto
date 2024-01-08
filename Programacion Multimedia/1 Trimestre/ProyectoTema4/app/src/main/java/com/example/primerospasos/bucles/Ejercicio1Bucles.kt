package com.example.primerospasos.bucles
fun main() {

    println("Cantidad de piezas a procesar:")
    val piezas = readln().toInt()

    var piezasAptas = 0

    for (i in 1..piezas) {
        println("Ingrese la longitud de la pieza $i:")
        val longitudPieza = readln().toFloat()

        if (longitudPieza >= 1.20 && longitudPieza <= 1.30) {
            piezasAptas++
        }
    }

    println("Piezas aptas: $piezasAptas")

}
