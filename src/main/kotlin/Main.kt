package org.example

fun main() {
    val consola = GestorEntradaSalida()
    val generador = GeneradorSecuencias(consola)
    generador.mostrarSec()
}