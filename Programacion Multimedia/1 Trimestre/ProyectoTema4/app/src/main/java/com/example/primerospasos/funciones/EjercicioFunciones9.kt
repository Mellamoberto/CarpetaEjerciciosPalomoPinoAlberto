package com.example.primerospasos.funciones

/*
Confeccionar una función que reciba un String como parámetro y en
forma opcional un segundo String con un caracter. La función debe
mostrar el String subrayado con el caracter que indica el segundo
parámetro
 */


fun subrayar(palabra: String, caracter: String = "") {

    println(palabra)

    for (i in 0 until palabra.length) {
        print(caracter)
    }
    println()
}

fun main() {
    print("Dime una palabra/texto: ")
    var palabra: String = readLine().toString()

    println("¿Quieres meter un carácter personalizado para subrayar la palabra?" +
            "\nSi" +
            "\nNo")
    var respuesta: String = readLine().toString()

    if (respuesta.equals("si", ignoreCase = true)) {
        print("Dime el carácter para subrayar la palabra/texto: ")
        var caracter: String = readLine()?.lowercase() ?: ""
        subrayar(palabra, caracter)
    } else {
        subrayar(palabra)
    }

}