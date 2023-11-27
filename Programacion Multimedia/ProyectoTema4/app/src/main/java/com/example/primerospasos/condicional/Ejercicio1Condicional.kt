package com.example.primerospasos.condicional

fun main () {
    print("Ingrese el sueldo del empleado: ")
    val sueldo = readln().toDouble()
    if(sueldo>3000) {
        println("Debe pagar impuestos")
    } else {
        print("No debe pagar impuestos")
    }
}