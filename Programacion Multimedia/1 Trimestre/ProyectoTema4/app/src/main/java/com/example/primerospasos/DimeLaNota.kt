package com.example.primerospasos

fun main() {
    print("Ingresa tu nota del examen: ")
    var nota = readln().toFloat()

    while (nota<0) {
        println("Esta nota no es valida. Pon otra")
        nota = readln().toFloat()
    }
        if(nota<0) {
        }
        else if(nota==0f) {
            println("Ultra-Indeficiente")
        } else if (nota>0f && nota<5f) {
            println("Suspenso")
        } else if (nota<=5f && nota<7f) {
            println("Aprobado")
        } else if (nota>=7f && nota<9f) {
            println("Notable")
        } else if (nota<=9f) {
            println("Sobresaliente")
        } else if (nota==10f) {
            println("Matricula")
        }


}