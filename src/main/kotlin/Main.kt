package org.example

fun main() {
    try{
        val consola = GestorEntradaSalida()
        val generador = GeneradorSecuencias(consola)
        val menuPrincipal = Menu(consola, generador)
        menuPrincipal.ejecutar()
    }
    catch(e:Exception){
        println(e.message)
    }
}