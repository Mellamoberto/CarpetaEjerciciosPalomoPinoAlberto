package com.example.primerospasos.pobjetos

class Salario {
    var nombre: String = ""
    var ingreso: Double = 0.00
    var complemento: Double = 0.00

    fun inicializar(nombre: String, ingreso: Double) {
        this.nombre = nombre
        this.ingreso = ingreso
        this.complemento = complemento
    }

    fun imprimir() {
        println("Nombre: $nombre" +
                "\nIngresos: $ingreso euros")
    }

    fun serRico() {
        if (ingreso > 3000) {
            println("Enhorabuena, eres rico")
        } else if (ingreso in 2000.00..3000.00) {
            println("No está mal.")
        } else {
            println("Lastima, eres pobre")
        }
    }

   fun calcularComplemento(): Double {
        complemento = when {
            ingreso in 2000.0..3000.0 -> 0.10
            ingreso > 3000.0 -> 0.20
            else -> 0.05
        }
        val total = ingreso * complemento
        val suma = ingreso + total
       var irpf = suma * 0.15
       var salarioNeto = suma - irpf
        println("Su complemento es %.2f".format(total))
        println("En total tiene $suma euros")
       println("Le quitamos el $irpf, por lo que el salario neto = $salarioNeto ")
        return total
    }
}

fun main() {
    var persona1: Salario
    persona1 = Salario()
    persona1.inicializar("Juan", 1500.00)
    persona1.imprimir()
    persona1.calcularComplemento()
    persona1.serRico()

    println()

    var persona2: Salario
    persona2 = Salario()
    persona2.inicializar("Berto", 2999.00)
    persona2.imprimir()
    persona2.calcularComplemento()
    persona2.serRico()

    println()

    var persona3: Salario
    persona3 = Salario()
    persona3.inicializar("Vicky", 3500.00)
    persona3.imprimir()
    persona3.calcularComplemento()
    persona3.serRico()
}