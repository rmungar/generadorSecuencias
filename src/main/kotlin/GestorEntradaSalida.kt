package org.example

class GestorEntradaSalida:IGestorEntradaSalida {

    override fun pedirNumeroDePalabras(): Int{

        while (true){
            mostrarTexto("Ingrese el número de palabras deseadas: ")
            val numero = readln()
            if (numero.all { it.isDigit() }) return numero.toInt()
            else mostrarTexto("Entrada no válida", true)
        }
    }

    override fun entradaMenu(): Int {
        while (true) {
            mostrarTexto("Opcion -> ")
            val entrada = readln().toIntOrNull()
            if (entrada is Int && entrada in 1..3) return entrada
        }
    }


    override fun mostrarTexto(texto :String, salto: Boolean){
        if (salto) println(texto)
        else print(texto)
    }

    override fun limpiarConsola() {
        Thread.sleep(1000)
        repeat(15){
            mostrarTexto("", true)
        }
    }
}