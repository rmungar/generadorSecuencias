package org.example

interface IGestorEntradaSalida {
    fun mostrarTexto(texto:String, salto:Boolean = false)

    fun pedirNumeroDePalabras():Int
}