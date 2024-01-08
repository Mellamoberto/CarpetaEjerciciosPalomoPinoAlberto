package com.example.primerospasos.pobjetos.herencia

class Product(val nombre: String, val precio: Double) {
    override fun toString(): String {
        return "Producto(nombre='$nombre', precio=$precio)"
    }
}

fun main() {
    val producto1 = Product("Laptop", 1200.0)
    val producto2 = Product("Laptop", 1200.0)
    val producto3 = Product("Telefono", 500.0)

    println("Producto 1: $producto1")
    println("Producto 2: $producto2")
    println("Producto 3: $producto3")

}