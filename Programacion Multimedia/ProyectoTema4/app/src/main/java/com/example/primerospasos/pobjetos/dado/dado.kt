package com.example.primerospasos.pobjetos.dado

class Dado (var valor: Int) {
    fun tirar() {
        valor = ((Math.random()*6)+1).toInt()
        imprimir()
    }

    fun tirar3Dados(): Int {
        var valorTotal: Int = 0
        for (i in 1..3) {
            val valor = ((Math.random() * 6) + 1).toInt()
            valorTotal += valor
            println("Valor dado del dado $i = $valor")
        }
        return valorTotal
    }

    fun imprimir(){
        println("Valor del dado: $valor")
    }
}