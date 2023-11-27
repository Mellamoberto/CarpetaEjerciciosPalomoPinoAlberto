package com.example.primerospasos.funciones

fun calcularPerimetro(): Int {
    var p = readln().toInt()
    var suma = (p + p + p + p)
    return suma
}
fun main() {

    var con : Boolean = true
    print("Ingrese los cm que mide el lado del cuadrado: ")

    while(con==false) {
        var lado: Int? = readln()?.toIntOrNull()
        if (lado != null) {
            println("¿Que quieres hacer con ese dato?" +
                    "\n\t 1 - Calcular el perimetro." +
                    "\n\t 2 - Calcular la superficie.")
            con = true
        }else {
            print("Numero no valido. Ingresa otro: ")
            lado = readln()?.toIntOrNull()
        }
    }

    var eleccion: Int = readln()?.toIntOrNull() ?: 0
    when (eleccion) {
        1 -> calcularPerimetro()
       // 2 ->
    }
}

