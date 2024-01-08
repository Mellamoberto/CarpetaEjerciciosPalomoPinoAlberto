package com.example.primerospasos.pobjetos.herencia

open class Empresa (var nombre: String, var ubicacion: String) {
    fun OperacionesGenerales (){
        println("Realizando operaciones generales de la empresa.")
    }
}

class Empleado (nombre: String, ubicacion: String, var cargo: String) : Empresa(nombre, ubicacion) {
    fun trabajar(){
        println("$nombre trabaja como $cargo.")
    }
}

class Producto (nombre: String, ubicacion: String, var categoria: String) : Empresa(nombre, ubicacion) {
    fun producir() {
        println("$nombre, producto de la categoria $categoria, en producción.")
    }
}

class Comprador (nombre: String, ubicacion: String, var tipo: String) : Empresa(nombre, ubicacion) {
    fun comprar() {
        println("$nombre, cliente de tipo $tipo, realizando una compra.")
    }
}

fun main() {
    var empleado = Empleado("Juan", "", "oficinista")
    var producto = Producto("Portatil HP", "", "electrónica")
    var cliente = Comprador("Berto", "", "empresarial")

    empleado.OperacionesGenerales()
    empleado.trabajar()

    println()

    producto.OperacionesGenerales()
    producto.producir()

    println()

    cliente.OperacionesGenerales()
    cliente.comprar()
}