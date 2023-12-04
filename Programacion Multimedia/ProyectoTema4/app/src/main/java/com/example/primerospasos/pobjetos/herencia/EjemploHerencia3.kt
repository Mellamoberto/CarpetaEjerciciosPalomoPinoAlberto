package com.example.primerospasos.pobjetos.herencia

open class Personaje(val nombre: String, var nivel: Int) {
    open fun atacar() {
        println("$nombre realiza un ataque basico.")
    }

    fun subirNivel() {
        nivel++
        println("$nombre ha subido al nivel $nivel.")
    }
}


class Guerrero(nombre: String, nivel: Int, val arma: String) : Personaje(nombre, nivel) {
    override fun atacar() {
        println("$nombre ataca con su arma $arma.")
    }

    fun usarHabilidadEspecial() {
        println("$nombre utiliza una habilidad especial de guerrero.")
    }
}

class Mago(nombre: String, nivel: Int, val hechizo: String) : Personaje(nombre, nivel) {
    override fun atacar() {
        println("$nombre lanza el hechizo $hechizo.")
    }

    fun lanzarEncantamiento() {
        println("$nombre lanza un encantamiento magico.")
    }
}


fun main() {
    val guerrero = Guerrero("Conan", 10, "Espada")
    val mago = Mago("Gandalf", 12, "Bola de fogo")

    guerrero.atacar()
    guerrero.usarHabilidadEspecial()
    guerrero.subirNivel()

    println()

    mago.atacar()
    mago.lanzarEncantamiento()
    mago.subirNivel()
}
