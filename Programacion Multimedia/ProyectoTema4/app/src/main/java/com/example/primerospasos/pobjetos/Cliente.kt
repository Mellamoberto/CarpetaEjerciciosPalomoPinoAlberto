package com.example.primerospasos.pobjetos

class Cliente constructor (nombre: String, apellidos: String, tipo: String, ingresos: Double ){
    var nombre: String = nombre
    var apellidos: String = apellidos
    var tipo: String = tipo
    var ingresos: Double = ingresos

    fun imprimir() {
        var mensaje = tipo()
        println("Nombre del cliente: $nombre" +
                "\nApellido/s: $apellidos" +
                "\nEs atendido por $mensaje y sus ingresos son de $ingresos€")
        println()
    }

    fun tipo():String {
        var mensaje: String = ""
        if (tipo == "Empresa") {
            mensaje = "la oficina central"
        } else {
            mensaje = "la oficina local"
        }
        return mensaje
    }
}

    fun main() {
        val cliente1 = Cliente("Juan","Ortuno","Empresa",1500.00)
        cliente1.imprimir()
        cliente1.tipo()

        val cliente2 = Cliente("Berto","Palomo","Local",1200.00)
        cliente2.imprimir()
        cliente2.tipo()
    }
