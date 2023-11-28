package com.example.primerospasos.pobjetos

class Alumno {
    var nombre: String = ""
    var asignatura: String = ""
    var nota: Double = 0.00


    fun inicializar(nombre: String, asignatura: String, nota: Double) {
        this.nombre = nombre
        this.asignatura = asignatura
        this.nota = nota
    }

    fun imprimir() {
        var mensaje = aprobado()
        println(
            "Nombre del alumno: $nombre" +
                    "\nEn la asignatura de $asignatura" +
                    ", su nota es $nota," +
                    " lo que equivale a un $mensaje."
        )
    }

    fun aprobado():String {
        var mensaje:String = ""
        if (nota < 5) {
            mensaje = "suspenso"
        } else if (nota >= 5 && nota < 6) {
            mensaje="suficiente"
        } else if (nota >= 6 && nota < 7) {
            mensaje="bien"
        } else if (nota >= 7 && nota < 9) {
            mensaje="notable"
        } else if (nota >= 9 && nota <= 10) {
            mensaje="sobresaliente"
        } else {
            mensaje = "Nota no válida"
        }
        return mensaje
    }
}

fun main() {
    var alumno1: Alumno
    alumno1 = Alumno()
    alumno1.inicializar("Juan", "lengua",7.0)
    alumno1.imprimir()

    println()

    var alumno2: Alumno
    alumno2 = Alumno()
    alumno2.inicializar("Berto", "matemáticas",4.9)
    alumno2.imprimir()

    println()

    var alumno3: Alumno
    alumno3 = Alumno()
    alumno3.inicializar("Vicky", "historia",-7.0)
    alumno3.imprimir()
}
