package com.example.primerospasos.arrays

fun main() {
    val arrayValores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i in 0 until arrayValores.size step 2) {
        println(arrayValores[i])
    }

    val arrayValores2 = arrayOf("A", "B", "C")
    for (i in 0 until arrayValores2.size) {
        println(arrayValores2[i])
    }

    val arrayValores3 = arrayOf("Laura", 30, "Ana", 24)
    for (i in arrayValores3.size - 1 downTo 0) {
        println(arrayValores3[i])
    }

    //Ejercicio 4
    val arrayFloat = floatArrayOf(3.5F, 2.2f)
    for (i in 0 until arrayFloat.size step 1) {
        println(arrayFloat[i])
    }

    //Ejercicio 5
    val arrayVacio = arrayOfNulls<String>(3)
    arrayVacio[0] = "Málaga"
    arrayVacio[1] = "Sevilla"
    arrayVacio[2] = "Cádiz"
    for (i in 0 until arrayVacio.size) {
        println(arrayVacio[i])
    }



    //Mostrando datos del array usando get
    println(arrayVacio.get(0))
    //usando int
    var arrayEnteroVacio = arrayOfNulls<Int>(3)
    arrayEnteroVacio[0]=1
    arrayEnteroVacio[1]=2
    arrayEnteroVacio[2]=2
    println(arrayEnteroVacio.joinToString())

/*
    //Usando Float
    var arrayFloatVacio = arrayOf<Float>(3f)
    arrayFloatVacio[0]=1.2f
    arrayFloatVacio[1]=2.2f
    arrayFloatVacio[2]=2.9f
    for(i in 0 until arrayFloatVacio.size) {
        println(arrayFloatVacio[i])
    }
*/
    //Ejercicio 6
    var array1 = arrayOfNulls<String>(3)


    //Ejercicio 7
    array1[0] = "A"
    array1[1] = "B"
    array1[2] = "C"

    //Copiamos array1 a array2 y agregamos otro valor
    var array2 = array1.copyOf(array1.size + 1)
    array2[array1.size] = "D"

    println("Array1: ${array1.joinToString(", ")}")
    println("Array2: ${array2.joinToString(", ")}")


    //Hacer lo mismo con paises
    var arrayPaises1 = arrayOfNulls<String>(3)
    arrayPaises1[0] = "Alemania"
    arrayPaises1[1] = "Francia"
    arrayPaises1[2] = "Italia"

    var arrayPaises2 = arrayPaises1.copyOf( arrayPaises1.size + 2)
    arrayPaises2[arrayPaises1.size] = "Grecia"
    arrayPaises2[arrayPaises1.size + 1] = "España"
    println("Array Paises 2: ${arrayPaises2.joinToString( ", ")}")


    //Hacer lo mismo pero con empresas
    var arrayEmpresa1 = arrayOfNulls<String>(3)
    arrayEmpresa1[0] = "Microsoft"
    arrayEmpresa1[1] = "Meta"
    arrayEmpresa1[2] = "Apple"

    var arrayEmpresa2 = arrayEmpresa1.copyOf( arrayEmpresa1.size + 5)
    arrayEmpresa2[arrayEmpresa1.size] = "SAMSUNG"
    arrayEmpresa2[arrayEmpresa1.size + 1] = "Lenovo"
    arrayEmpresa2[arrayEmpresa1.size + 2] = "Xiaomi"
    arrayEmpresa2[arrayEmpresa1.size + 3] = "Intel"
    arrayEmpresa2[arrayEmpresa1.size + 4] = "AMD"
    println("Array de Empresas 2: ${arrayEmpresa2.joinToString (", ")}")


    //Multitipo
    var arrayMultitipo1 = arrayOf(1, "table", 2, "Monitor")

    var arrayMultitipo2 = arrayMultitipo1.copyOf( arrayMultitipo1.size + 4)
    arrayMultitipo2[arrayMultitipo1.size] = 3
    arrayMultitipo2[arrayMultitipo1.size + 1] = "Portatil"
    arrayMultitipo2[arrayMultitipo1.size + 2] = 4
    arrayMultitipo2[arrayMultitipo1.size + 3] = "Movil"

    println("Array Multi-Tipo 2: ${arrayMultitipo2.joinToString(", ")}")





    //Ejercicio 1: Suma de elementos
}