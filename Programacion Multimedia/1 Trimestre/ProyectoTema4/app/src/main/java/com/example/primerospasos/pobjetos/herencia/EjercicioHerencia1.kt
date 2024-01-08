package com.example.primerospasos.pobjetos.herencia

open class Vehiculo(val marca: String, val modelo: String) {
    fun acelerar() {
        println("Acelerando el vehiculo.")
    }

    fun frenar() {
        println("Frenando el vehiculo.")
    }

    open fun conducir() {
        println("Conduciendo el vehiculo.")
    }
}

class Coche(marca: String, modelo: String, val numeroPuertas: Int) : Vehiculo(marca, modelo) {
    override fun conducir() {
        println("Conduciendo el $modelo. !Cuidado con lar curvas!")
    }

    fun numeroPuertas() {
        println("Numero de puertas del $modelo: $numeroPuertas")
    }
}

class Motocicleta(marca: String,modelo: String, val tipo: String) : Vehiculo(marca,modelo) {
    fun hacerCaballito() {
        println("La $modelo hace un caballito increible)")
    }

    fun tipoDeMoto() {
        println("Tipo de motocicleta: $tipo")
    }
}

fun main() {
    val vehiculo1 = Coche("Audi","coche",4)
    val vehiculo2 = Motocicleta("Susuki","moto", "Deportiva")

    vehiculo1.acelerar()
    vehiculo1.frenar()
    vehiculo1.conducir()
    vehiculo1.numeroPuertas()

    println()

    vehiculo2.acelerar()
    vehiculo2.frenar()
    vehiculo2.conducir()
    vehiculo2.tipoDeMoto()

}
