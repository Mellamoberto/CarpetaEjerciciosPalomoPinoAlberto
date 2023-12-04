package com.example.primerospasos.pobjetos

class PersonaDelMundo  (val nombre: String, val apellidos: String, val edad: Int) {

    constructor (nombre: String, apellidos: String) : this(nombre, apellidos, 30)

    fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Apellidos: $apellidos")
        println("Edad: $edad")
    }
}

fun main() {
    val persona1 = PersonaDelMundo("Juan", "Ortuno", 30)
    persona1.mostrarInformacion()

    println()

    val persona2 = PersonaDelMundo("Berto", "Palomo", 40)
    persona2.mostrarInformacion()

    println()

    val persona3 = PersonaDelMundo("Juan","Palomo")
    persona3.mostrarInformacion()
}