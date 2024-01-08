package com.example.primerospasos.condicional

fun main() {
    print("Dime un primer numero: ")
    var num1 = readln().toInt()

    print("Dime un segundo numero: ")
    var num2 = readln().toInt()

    while(num1==num2) {
        print("No pueden ser el mismo numero. Cambia el segundo: ")
        num2 = readln().toInt()
    }

    if(num1>num2) {
        print("$num1 es mayor que $num2")
    }else {
        print("$num2 es mayor que $num1")
    }

}