package com.example.primerospasos.funciones

/*Confeccionar una función que le enviemos como parámetro un String y nos retorne la cantidad
de caracteres que tiene. En la función main solicitar la carga de dos nombres por teclado y
llamar a la función dos veces. Imprimir en la main cual de las dos palabras tiene más caracteres.
*/


fun numCaracteres(x: String):String {
    println(x.length)
    return x.length.toString()
}

fun main() {

    print("Dime un nombre: ")
    var name1: String = readLine().toString()
    numCaracteres(name1)

    print("Dime otro nombre: ")
    var name2: String = readLine().toString()
    numCaracteres(name2)

    if (name1.length>name2.length) {
        println("El nombre $name1 tiene más caracteres que el nombre $name2")
    } else if(name1.length<name2.length){
        println("El nombre $name2 tiene más caracteres que el nombre $name1")
    } else {
        println("Ambos nombres tienen el mismo número de caracteres")
    }

}