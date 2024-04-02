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


    override fun mostrarTexto(texto :String, espacio: Boolean){
        if (espacio) println(texto)
        else print(texto)
    }
}