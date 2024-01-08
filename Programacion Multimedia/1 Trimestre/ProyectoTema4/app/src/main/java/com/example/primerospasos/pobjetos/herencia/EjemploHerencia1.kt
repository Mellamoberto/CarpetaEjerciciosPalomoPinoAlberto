package com.example.primerospasos.pobjetos.herencia

// Clase base (superclase)
open class Automovil(val modelo: String, val año: Int) {
    fun conducir() {
        println("El vehículo está en movimiento")
    }
}

// Clase derivada (subclase) que hereda de Vehiculo
class Turismo(modelo: String, año: Int, val fabricante: String) : Automovil(modelo, año) {
    fun hacerSonido() {
        println("El coche hace un sonido de motor")
    }
}

fun main() {
// Crear una instancia de la clase derivada (Coche)
    val miCoche = Turismo("Civic", 2022, "Honda")

// Acceder a las propiedades y métodos de la clase base (Vehiculo)
    println("Modelo: ${miCoche.modelo}")
    println("Año: ${miCoche.año}")

// Acceder a las propiedades y métodos de la clase derivada (Coche)
    println("Fabricante: ${miCoche.fabricante}")

// Llamar a un método de la clase base
    miCoche.conducir()

// Llamar a un método de la clase derivada
    miCoche.hacerSonido()
}