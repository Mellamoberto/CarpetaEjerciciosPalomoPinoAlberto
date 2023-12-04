package com.example.primerospasos.pobjetos.dado

class JuegoDeDadosCompetitivo {
    fun jugar() {
        print("Dime el nombre del jugador 1: ")
        var jugador1: String = readLine() ?: ""
        print("Dime el nombre del jugador 2: ")
        var jugador2: String = readLine() ?: ""

        println()

        val dado = Dado(1)

        val totalJugador1: Int = dado.tirar3Dados()
        print("$jugador1 obtuvo una puntuación de: $totalJugador1")

        println()
        println()

        val totalJugador2: Int = dado.tirar3Dados()
        print("$jugador2 obtuvo una puntuación de: $totalJugador2")

        println()
        println()

        if (totalJugador1 > totalJugador2) {
            println("$jugador1 ganó la partida")
        } else if (totalJugador2 > totalJugador1) {
            println("$jugador2 ganó la partida")
        } else {
            println("Empate")
        }
    }
}

fun main() {
    val juego1 = JuegoDeDadosCompetitivo()
    juego1.jugar()
}