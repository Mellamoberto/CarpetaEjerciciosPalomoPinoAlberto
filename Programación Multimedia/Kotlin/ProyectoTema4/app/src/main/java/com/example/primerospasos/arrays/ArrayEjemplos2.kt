package com.example.primerospasos.arrays

fun main() {

    // Array Bidimensional
    val array2d = arrayOf(arrayOf(1, 2, 3), arrayOf("aaa", "ccc", -1))

    for (fila in array2d) {
        for (elemento in fila) {
            println(elemento)
        }
    }

    println()


    //Hacer otro array2D con nuevos valores

    val array2D2 = arrayOf(arrayOf("Alberto", 1, "Victor", 2), arrayOf(35, 20, 16))

    for (fila in array2D2) {
        for (elemento in fila) {
            println(elemento)
        }
    }


    println()

    //Añadir valores usando SET

    var matrizEnteros = arrayOf(intArrayOf(3,2,1), intArrayOf(4,5), intArrayOf(6))
    println( "Valor original "+matrizEnteros[0][2])
    matrizEnteros[0][2]=0
    println(" valor cambiado a "+ matrizEnteros[0][2])
    matrizEnteros[0].set(2,9);
    println( "valor cambiado con set "+matrizEnteros[0][2])

    println()


    //Repetir el ejercicio con estos datos:
    // (12,15,21,45) / (14,25,16), (23,24)
    // modifica el valor 21 por 50 y el valor 23 por 90
    // modifica con set 21 por 110 y el valor 23 por 90 con el tradicional
    // y por 110 con set, cada paso ira acompañado por un print

    var matrizNum = arrayOf(intArrayOf(12,15,21,45), intArrayOf(14,25,16), intArrayOf(23,24))
    println("Valor original "+matrizNum[0][2]+"//"+matrizNum[2][0])
    matrizNum[0][2]=50
    matrizNum[2][0]=90
    println("Valor con los cambios "+matrizNum[0][2]+"//"+matrizNum[2][0])

    println()
    println("Segundo Ejercicio")
    var matrizNum2 = arrayOf(intArrayOf(12,15,21,45), intArrayOf(14,25,16), intArrayOf(23,24))
    println("Valor original ")
    for(fila in matrizNum2){
        for (elemento in fila) {
            print("$elemento\t")
        }
        println()
    }

    matrizNum2[0].set(2, 110)
    matrizNum2[2][0]=90
    matrizNum2[2].set(0,110)

    println()
    println("Valor con los cambios")
    for(fila in matrizNum2) {
        for (elemento in fila) {
            print("$elemento\t")
        }
            println()
        }

    }





