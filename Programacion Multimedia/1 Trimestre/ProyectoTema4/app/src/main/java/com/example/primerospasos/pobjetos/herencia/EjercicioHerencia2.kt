package com.example.primerospasos.pobjetos.herencia

open class ProductoInformatico (val nombre: String, val precio: Int) {
    open fun encender() {
        println("$nombre encendido")
    }

    open fun apagar() {
        println("$nombre apagado")
    }

    open fun ejecutar() {
        println("$nombre ejecutando operaciones generales.")
    }
}



class Portatil (nombre: String, precio: Int, val marca: String) : ProductoInformatico(nombre, precio) {
    override fun encender() {
        println("$nombre, de la marca $marca, encendido.")
    }

    override fun apagar() {
        println("$nombre, de la marca $marca, apagado.")
    }

    override fun ejecutar() {
        println("$nombre $marca ejecutando aplicaciones y tareas de computación.")
    }

    fun marca(){
        println("Marca del portatil: $marca.")
    }
}

class Impresora (nombre: String, precio: Int, val tipo: String) : ProductoInformatico(nombre, precio) {
    override fun encender() {
        println("$nombre encendida.")
    }

    override fun apagar() {
        println("$nombre apagada.")
    }

    fun imprimir() {
        println("Tipo de impresora: $tipo.")
    }
}

fun main() {
    val producto1 = Portatil("Portatil Gama Media",400,"HP")
    val producto2 = Impresora("Impresora Gama Baja", 150, "Analógica")


    producto1.encender()
    producto1.apagar()
    producto1.ejecutar()
    producto1.marca()

    println()

    producto2.encender()
    producto2.apagar()
    producto2.ejecutar()
    producto2.imprimir()

}