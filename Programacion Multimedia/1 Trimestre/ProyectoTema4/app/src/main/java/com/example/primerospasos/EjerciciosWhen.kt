package com.example.primerospasos

fun main() {

    print("Di un numero del 0 al 10 para definir tu nota ")
    var numero: Int? = readln()?.toInt()

    when (numero) {
        0, 1, 2, 3, 4 -> println("Suspenso")
        5 -> println("Suficiente")
        6 -> println("Bien")
        7, 8 -> println("Notable")
        9 -> println("Sobresaliente")
        10 -> println("Matricula")
        else -> println("Nota no valida")
    }

    print("Di un numero del 1 al 7 para elegir un dia ")
    var numeroSemana: Int? = readln()?.toInt()

    when (numeroSemana) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("Eso no es un dia de la semana")
    }

    print("Di un numero del 1 al 12 para elegir un mes ")
    var numeroMes: Int? = readln()?.toInt()

    when (numeroMes) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Eso no es un mes")
    }

    print("Escribe Jorge para ver el nombre de su pareja ")

    var pareja: String = readln().toString()

    when (pareja) {
        "Jorge" -> println("Maria")
        else -> println("Nombre no reconocido")
    }
}