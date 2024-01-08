package com.example.primerospasos.funciones

import kotlin.random.Random

/*
import kotlin.random.Random

fun main() {
    var ale = Random.nextInt(1, 3)
    println("El numero elegido es $ale")
}
 */

fun valores() {

    for (i in 0 until 10) {
        var ale = Random.nextInt(0,100)

        var mensaje = multiplos(ale)

        println("$ale $mensaje")
    }
}

fun multiplos(x:Int):String {
    var mensaje: String
    if (x%2 == 0){
        mensaje = "Es multiplo de 2"
    } else if (x%5 == 0) {
        mensaje = "Es multiplo de 5"
    } else {
        mensaje = "No es multiplo ni de 2 ni de 5"
    }
    return mensaje
}

fun main() {
    valores()
}