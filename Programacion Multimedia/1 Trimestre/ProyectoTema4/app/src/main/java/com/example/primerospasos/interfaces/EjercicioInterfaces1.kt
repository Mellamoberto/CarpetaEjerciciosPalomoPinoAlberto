package com.example.primerospasos.interfaces

// Definición de la interfaz ProductoElectronico
interface ProductoElectronico {
    // Propiedades de la interfaz
    val nombre: String
    val fabricante: String
    val precio: Double

    // Métodos de la interfaz
    fun encender()
    fun apagar()
}

// Clase que implementa la interfaz ProductoElectronico
class Televisor(
    override val nombre: String,
    override val fabricante: String,
    override val precio: Double
) : ProductoElectronico {
    // Implementación de los métodos encender() y apagar()
    override fun encender() {
        println("Encendiendo el televisor $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el televisor $nombre.")
    }
}

class Movil(
    override val nombre: String,
    override val fabricante: String,
    override val precio: Double
) : ProductoElectronico {

    override fun encender() {
        println("Encendiendo el movil $nombre fabricado por $fabricante.")
    }

    override fun apagar() {
        println("Apagando el movil $nombre.")
    }
}

fun main() {
    // Crear una instancia de la clase Televisor
    val miTelevisor = Televisor("Smart TV", "Samsung", 799.99)
    val televisor = Televisor("", "LG", 699.99)
    val movil = Movil("de gama alta", "Xiaomi", 500.00)

    // Acceder a las propiedades y métodos de la interfaz
    println("Nombre: ${miTelevisor.nombre}")
    println("Fabricante: ${miTelevisor.fabricante}")
    println("Precio: ${miTelevisor.precio} €")

    println("Nombre: ${televisor.nombre}")
    println("Fabricante: ${televisor.fabricante}")
    println("Precio: ${televisor.precio} €")

    println("Nombre: ${movil.nombre}")
    println("Fabricante: ${movil.fabricante}")
    println("Precio: ${movil.precio} €")

    // Llamar a los métodos encender() y apagar()
    miTelevisor.encender()
    miTelevisor.apagar()

    println()

    televisor.encender()
    televisor.apagar()

    println()

    movil.encender()
    movil.apagar()
}