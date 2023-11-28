package com.example.primerospasos.pobjetos

class Persona {
    var nombre: String = ""
    var apellidos: String = ""
    var edad: Int = 0
    var direccion: String = ""
    var provincia: String = ""


    fun inicializar(nombre: String, apellidos: String, edad: Int, direccion: String, provincia: String) {
        this.nombre = nombre
        this.apellidos = apellidos
        this.edad = edad
        this.direccion = direccion
        this.provincia = provincia
    }

    fun imprimir() {
        val mensajeEdad: String = esMayorDeEdad()
        println("Nombre y Apellidos: $nombre $apellidos" +
                "\nEdad: $edad, por lo que $mensajeEdad" +
                "\nSu direccion es $direccion, en la provincia de $provincia")
    }

    fun esMayorDeEdad():String {
        var mensajeEdad: String = ""
        if (edad>18){
            mensajeEdad = "$nombre es mayor de edad"
        }else {
            mensajeEdad = "$nombre no es mayor de edad"
        }
        return mensajeEdad
    }
}

fun main() {
    var persona1: Persona
    persona1 = Persona()
    persona1.inicializar("Juan", "Ortuno", 26, "C/Martin", "Murcia")
    persona1.imprimir()

    println()

    var persona2: Persona
    persona2 = Persona()
    persona2.inicializar("Berto", "Palomo", 27, "C/Alcalde", "Malaga")
    persona2.imprimir()

    println()

    var persona3: Persona
    persona3 = Persona()
    persona3.inicializar("Vicky", "Pino", 17, "C/Quiles", "Malaga")
    persona3.imprimir()
}