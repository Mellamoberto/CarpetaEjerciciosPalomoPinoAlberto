package com.example.primerospasos.funciones

/*
Confeccionar una función reciba un entero comprendido entre 1 y 5 y nos
retorne en castellano dicho número o un String con la cadena "error" si
no está comprendido entre 1 y 5.

 */

fun numeroEscrito(num: Int): String {
    var numEscrito: String = ""
    when {
        num == 1 -> numEscrito="Uno"
        num == 2 -> numEscrito="Dos"
        num == 3 -> numEscrito="Tres"
        num == 4 -> numEscrito="Cuatro"
        num == 5 -> numEscrito="Cinco"
        else -> numEscrito="Error"
    }
    println(numEscrito)
    return numEscrito
}

fun main() {

    println("Dime un numero entre el 1 y el 5")
    var num: Int = readln().toInt()

    numeroEscrito(num)

}