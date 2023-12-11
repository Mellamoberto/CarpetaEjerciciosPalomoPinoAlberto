package com.example.primerospasos.colecciones

fun main() {
    var col4: List<Any>
    col4 = mutableListOf(1, "Berto", 2, "Laura", 3, "Cristina")

    col4.add(4)
    col4.add(0, "pablo")

    for(element in col4){
        println(element)
    }

    println()

    col4[1]="Pedro"
    for (element in col4){
        println(element)
    }
}