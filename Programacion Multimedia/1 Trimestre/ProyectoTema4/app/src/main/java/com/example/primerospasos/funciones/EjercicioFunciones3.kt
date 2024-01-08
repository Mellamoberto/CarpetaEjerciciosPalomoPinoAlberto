package com.example.primerospasos.funciones

fun calcularPerimetro(p: Int): Int {
    var perimetro = 4 * p
    println("El perimetro mide $perimetro")
    return perimetro
}

fun calcularSuperficie(s: Int): Int {
    var superficie = s * s
    println("La superficie es $superficie")
    return superficie
}

fun main() {

    var con : Boolean = true

    while(con==true) {
        print("Ingrese los cm que mide el lado del cuadrado: ")
        var lado: Int? = readln()?.toIntOrNull()
        if (lado != null) {
            println("¿Que quieres hacer con ese dato?" +
                    "\n\t 1 - Calcular el perimetro." +
                    "\n\t 2 - Calcular la superficie.")


            var eleccion: Int? = readln()?.toIntOrNull()
            when (eleccion) {

                1 -> {
                    calcularPerimetro(lado)
                }
                2 -> {
                    calcularSuperficie(lado)
                }
                3 -> {
                    print("Saliendo del programa")
                    con = false
                }
                else -> println("Numero no valido")
            }
        }else {
            print("Numero no valido. ")
        }
    }


}

